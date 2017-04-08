/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;

/**
 *
 * @author HOUDA
 */
public class InitDb {
    public static void main(String[] args) {
        CompteFacade compteFacade=  new CompteFacade();
        for (int i = 0; i < 10; i++) {
            compteFacade.create(new Compte((i+1)+"", (i+1)*100.0));
        }
    }
 
}
