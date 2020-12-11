/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini.marcilhac.housiau.peti;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author marci
 */
public class SantoriniMARCILHACHOUSIAUPETI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Grille uneGrille=new Grille();
        Batisseur unBatisseur=new Batisseur();
        unBatisseur.x=3;
        unBatisseur.y=3;
        int xBat;
        int yBat;
        uneGrille.cases[unBatisseur.x][unBatisseur.y].batisseurCourant=unBatisseur;
        
        
        boolean running=true;
        Scanner SC=new Scanner( System.in);
       
        
        while(running){
            String ok=SC.nextLine();
            if("Q".equals(ok)){
                running=false;
            }
          if(uneGrille.deplacementAutorise(unBatisseur,ok )){
              uneGrille.deplacerBatisseur(unBatisseur, ok);
              uneGrille.afficherGrilleSurConsole();
              System.out.println(unBatisseur.x+" " +unBatisseur.y);
          }
          
        if ("C".equals(ok)){
            System.out.println(" x= ");
            
            xBat=SC.nextInt();
            
            System.out.println(" y= ");
            yBat=SC.nextInt();
            
        uneGrille.construireEtage(xBat, yBat);
            //if ((abs(unBatisseur.x-xBat)==1 || abs(unBatisseur.y-yBat)==1) && (!(unBatisseur.x-xBat==0) && !(unBatisseur.y-yBat==0))) {
               // System.out.println("ok");
                //System.out.println(uneGrille.construireEtage(xBat, yBat));
                
            }
        }
            
        }
            
        
    }
    

