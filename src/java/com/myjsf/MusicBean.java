/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjsf;

import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 佐藤孝史
 */
@Named(value = "musicBean")
@RequestScoped
public class MusicBean {

    ArrayList type;
    ArrayList musician;
    ArrayList hall;
    
    public MusicBean() {
        type = new ArrayList();
        musician = new ArrayList();
        hall = new ArrayList();
    }

    public ArrayList getType() {
        return type;
    }

    public void setType(ArrayList type) {
        this.type = type;
    }

    public ArrayList getMusician() {
        return musician;
    }

    public void setMusician(ArrayList musician) {
        this.musician = musician;
    }

    public ArrayList getHall() {
        return hall;
    }

    public void setHall(ArrayList hall) {
        this.hall = hall;
    }
    
}
