/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 佐藤孝史
 */
@Named(value = "answerBean")
@RequestScoped
public class AnswerBean {

    /**
     * Creates a new instance of AnswerBean
     */
    public AnswerBean() {
    }
    
}
