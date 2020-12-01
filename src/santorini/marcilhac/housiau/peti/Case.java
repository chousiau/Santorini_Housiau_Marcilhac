/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini.marcilhac.housiau.peti;

/**
 *
 * @author marci
 */
public class Case {
    
    int nbEtage;
    boolean presenceBatiment;
    boolean presenceBatisseur;
    
    public boolean ajouterEtage(){
        if (nbEtage<3){
            nbEtage ++;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean batimentComplet (){
        return nbEtage == 3;
        
    }
    
}
