package com.demo.pages;

import com.demo.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    /**
     * Pages
     */
    private static LoginPage loginPage;
    private static NavigationPage navigationPage;

    /**
     * This function return an instance of `NavigationPage`
     */

    public static LoginPage loginPage(){
        if(loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


    public static NavigationPage navigationPage(){
        if(navigationPage == null) {
            navigationPage = new NavigationPage();
        }
        return navigationPage;
    }
}