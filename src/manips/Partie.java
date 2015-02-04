/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manips;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author PaulPark
 */
public class Partie extends Observable implements Serializable{
    private Coup coup;
    private ArrayList<Coup> choix;
    
    //constructeur
    public Partie(){
        choix = new ArrayList<Coup>();
    }
    
    /**
     * Ajoute un coup a la partie.
     * <br/>
     * Assure getNbCoups( augmente de ! ; )
     * @param aCoorpereA
     * @param bCoorpereB 
     */
    public void cooperer(boolean  aCoorpereA, boolean bCoorpereB){
        coup = new Coup(aCoorpereA, bCoorpereB);
        choix.add(coup);
        reDraw();;
    }
    
    public void reDraw(){
        setChanged();
        notifyObservers(this);
    }
    
    /**
     * renvoie le nombre de coup
     * @return 
     */
    public int getNbCoups(){
        return choix.size();
    }
    
    /**
     * renvoie le score de A
     * @return 
     */
    public double getScoreA(){
        int scoreA = 0;
        for (int i = 0; i < choix.size(); i++) {
            scoreA += choix.get(i).getGainA();
        }
        return scoreA;
    }
    
    /**
     * renvoie le score de B
     * @return 
     */
    public double getScoreB(){
        int scoreB = 0;
        for (int i = 0; i < choix.size(); i++) {
            scoreB += choix.get(i).getGainB();
        }
        return scoreB;
    }
    
    public Coup getCoup(){
        return coup;
    }
    
    /**
     * renvoie la liste de coup
     * @return choix
     */
    public ArrayList<Coup> getList(){
        return choix;
    }
}
