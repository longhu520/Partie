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
    
    
    public Coup(boolean b1, boolean b2){
        this.choixA = b1;
        this.choixB = b2;
    }
    
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
    
    public boolean getACoopere() {
        return choixA;
    }

    public boolean getBCoopere() {
        return choixB;
    }
    
    public String getAString(){
        String res;
        if (getACoopere()) {
            res = "C";
        }else{
            res = "D";
        }
        return  res;
    }
    
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
