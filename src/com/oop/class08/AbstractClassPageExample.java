package com.oop.class08;

abstract class Page{

    public abstract void openPage();

    public abstract void waitForPageToLoad();

    public void scrollDown(){

    }
}

class LoginPage extends Page{

    @Override
    public void openPage(){
        // code to open login page
    }

    @Override
    public void waitForPageToLoad() {
        // code to check login page loaded successfully
    }
}

class HomePage extends Page{

    @Override
    public void openPage() {
        // code to home page
    }

    @Override
    public void waitForPageToLoad() {
        // code to check home page loaded successfully
    }
}


public class AbstractClassPageExample {

}
