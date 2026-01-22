package com.IoC.coupling;

public class NewDataBaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "New DataBase Resource in action";
    }
}
