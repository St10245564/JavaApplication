/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.x;

/**
 *
 * @author lab_services_student
 */
public class RegisterClass {
 private String userName;
    private String password;
    public RegisterClass(String firstName, String lastName) {
    }
    public boolean LOGINUser(String logUser, String logPassword) {
        return userName.equals(logUser) && password.equals(logPassword);
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
