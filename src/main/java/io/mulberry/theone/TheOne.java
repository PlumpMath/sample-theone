package io.mulberry.theone;

import java.util.Properties;

public class TheOne implements ITheOne {

    private static final String DEFAULT_KEY = "lewis.kim";

    private String token;

    private boolean isAvailable;

    public TheOne() {
        this.isAvailable = true;
        Properties config = new Properties();
        try {
            config.load(TheOne.class.getResourceAsStream("sample.properties"));
            this.token = config.getProperty("sample.test.token");
            if (this.token.equals(DEFAULT_KEY))
                this.isAvailable = false;
        } catch (Exception e) {
            e.printStackTrace();
            isAvailable = false;
        }
    }

    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }

    @Override
    public String getToken() {
        return this.token;
    }

}
