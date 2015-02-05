/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manips;

import java.io.Serializable;

/**
 *
 * @author PaulPark
 */
public class Coup implements Serializable{
    private boolean choixA;
    private boolean choixB;
    
    /**
     * Constructeur d'un Coup
     * @param b1 choix de A, si A coopere, doit être true. sinon false
     * @param b2 choix de B, si B coopere, doit être true. sinon false
     */
    public Coup(boolean b1, boolean b2){
        this.choixA = b1;
        this.choixB = b2;
    }
    
    /**
     * renvoie le resultat de A
     * A coopere, B coopere, A et B = 3
     * A coopere, B pas coopere, A = 0
     * A pas coopere, B coopere, A = 5
     * A pas coopere, B pas coopere A et B = 1
     * 
     * Assure le score de A(augmente + resultat)
     * @return 
     */
    public int getGainA(){
        int result;
        if (getACoopere() && getBCoopere()) {
            result = 3;
        }else if(getACoopere() && !getBCoopere()){
            result = 0;
        }else if(!getACoopere() && getBCoopere()){
            result = 5;
        }else{
            result = 1;
        }
        return result;
    }
    
    /**
     * renvoie le resultat de B
     * A coopere, B coopere, A et B = 3
     * A coopere, B pas coopere, B = 5
     * A pas coopere, B coopere, B = 0
     * A pas coopere, B pas coopere A et B = 1
     * 
     * Assure le score de B(augmente + resultat)
     * @return 
     */
    public int getGainB(){
        if (getACoopere() && getBCoopere()) {
            return 3;
        }else if(getACoopere() && !getBCoopere()){
            return 5;
        }else if(!getACoopere() && getBCoopere()){
            return 0;
        }else{
            return 1;
        }
    }
    
    /**
     * revoie le choix de A
     * @return 
     */
    public boolean getACoopere() {
        return choixA;
    }

    /**
     * renvoie le choix de B
     * @return 
     */
    public boolean getBCoopere() {
        return choixB;
    }
    
    /**
     * renvoie un caractère
     * si A coopere "C", sinon "D"
     * @return 
     */
    public String getAString(){
        String res;
        if (getACoopere()) {
            res = "C";
        }else{
            res = "D";
        }
        return  res;
    }
    
    /**
     * renvoie un caractère
     * si B coopere "C", sinon "D"
     * @return 
     */
    public String getBString(){
        String res;
        if (getBCoopere()) {
            res = "C";
        }else{
            res = "D";
        }
        return  res;
    }
}
