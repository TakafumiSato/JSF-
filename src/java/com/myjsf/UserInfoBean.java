/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author 佐藤孝史
 */
@Named(value = "userInfoBean")
@SessionScoped
public class UserInfoBean implements Serializable {

    String userName;
    String birthDay;

    public String getUserName() {
        return userName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    
    public UserInfoBean() {
    }
    
}
