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
public class Grille {

    Case cases[][] = new Case[5][5];

    public Grille() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cases[i][j] = new Case(0, null, false);
            }
        }
    }

    public boolean deplacementAutorise(Batisseur unBatisseur, String direction) {
        int x = unBatisseur.x;
        int y = unBatisseur.y;
        if (direction == "H") {
            if (x == 0) {
                return false;
            }
            if (cases[x - 1][y].batisseurCourant != null) {
                return false;
            }
            if (cases[x - 1][y].nbEtage - cases[x][y].batisseurCourant.numEtage >= 2) {
                return false;
            }
            if (cases[x - 1][y].presenceDome) {
                return false;
            }

        }

        if (direction == "D") {
            if (y == 4) {
                return false;
            }
            if (cases[x][y + 1].batisseurCourant != null) {
                return false;
            }
            if (cases[x][y + 1].nbEtage - cases[x][y].batisseurCourant.numEtage >= 2) {
                return false;
            }
            if (cases[x][y + 1].presenceDome) {
                return false;
            }

        }
        if (direction == "G") {
            if (y == 0) {
                return false;
            }
            if (cases[x][y - 1].batisseurCourant != null) {
                return false;
            }
            if (cases[x][y - 1].nbEtage - cases[x][y].batisseurCourant.numEtage >= 2) {
                return false;
            }
            if (cases[x][y - 1].presenceDome) {
                return false;
            }

        }
        if (direction == "B") {
            if (x == 4) {
                return false;
            }
            if (cases[x + 1][y].batisseurCourant != null) {
                return false;
            }
            if (cases[x + 1][y].nbEtage - cases[x][y].batisseurCourant.numEtage >= 2) {
                return false;
            }
            if (cases[x + 1][y].presenceDome) {
                return false;
            }

        }
        return true;
    }

    public void deplacerBatisseur(Batisseur unBatisseur,String Direction) {
        
        if (deplacementAutorise(unBatisseur, Direction)){
            if (Direction == "H"){
                unBatisseur.x--;
            }
            if (Direction == "B"){
                unBatisseur.x++;
            }
            if (Direction == "D"){
                unBatisseur.y++;
            }
            if (Direction == "G"){
                unBatisseur.y--;
            }
        }

    }
}
