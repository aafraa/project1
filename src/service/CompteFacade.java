/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import service.AbstractFacade;

/**
 *
 * @author HOUDA
 */
public class CompteFacade extends AbstractFacade<Compte> {

    public CompteFacade() {
        super(Compte.class);
    }

    public int debiter(String rib, double montant, boolean exec) {
        Compte compte = find(rib);
        if (compte == null) {
            return -1;
        } else if (compte.getSolde() < montant) {
            return -2;
        } else {
            if (exec) {
                compte.setSolde(compte.getSolde() - montant);
                edit(compte);
            }
            return 1;
        }

    }

    public int crediter(String rib, double montant, boolean exec) {
        Compte compte = find(rib);
        if (compte == null) {
            return -1;
        }
        if (exec) {
            compte.setSolde(compte.getSolde() + montant);
            edit(compte);
        }
        return 1;
    }

    public int transferer(String source, String destination, double montant) {
        int resDebit = debiter(source, montant, false);
        if (resDebit > 0) {
            int resCredit = crediter(destination, montant, false);
            if (resCredit > 0) {
                debiter(source, montant, true);
                crediter(destination, montant, true);
            }
            return resCredit;
        }
        return resDebit;

    }
    public int findBySolde (double montant){
        Compte compte = find(montant);
        
        
    }
}
