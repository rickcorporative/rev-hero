package com.demo.actions;

public class Actions {
    /**
     * Page actions
     */
    private static MainActions mainActions;
    private static LoginActions loginActions;

    /**
     * This function returns an instance of `LoginActions`
     */


    /**
     * This function returns an instance of `MainActions`
     */
    public static MainActions mainActions() {
        if (mainActions == null) {
            mainActions = new MainActions();
        }
        return mainActions;
    }

    public static LoginActions loginActions() {
        if (loginActions == null) {
            loginActions = new LoginActions();
        }
        return loginActions;
    }
}