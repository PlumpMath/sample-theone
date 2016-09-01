package net.mypola.thetwo;

import io.mulberry.theone.ITheOne;
import io.mulberry.theone.TheOne;

public class TheTwo implements ITheOne {

    private final TheOne theOne;

    public TheTwo() {
        this.theOne = new TheOne();
    }

    @Override
    public boolean isAvailable() {
        return this.theOne.isAvailable();
    }

    @Override
    public String getToken() {
        return this.theOne.getToken();
    }

    public static void main(String[] args){
        TheTwo theTwo = new TheTwo();

        String actual = theTwo.getToken();

        System.out.println(">> actual:"+ actual);
    }
}
