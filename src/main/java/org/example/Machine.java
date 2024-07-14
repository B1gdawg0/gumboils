package org.example;

/**
 * 6510450917 Lerdphipat Kanjanarungroj
 */


public class Machine {
    boolean hasQuarter = false;
    boolean hasGumball = true;
    int gumBallNumber = 3;

    void crank(){
        if(hasGumball && hasQuarter){
            gumBallNumber--;
            if (gumBallNumber > 0) setHasQuarter(false);
            else setHasGumball(false);
            System.out.println("Gumball sold! this machine has "+gumBallNumber+" gumball"+((gumBallNumber > 1)?"s":""));
        }else if(hasQuarter){
            System.out.println("Out of gumballs");
        }else if(hasGumball){
            System.out.println("Please insert quarter before crank");
        }
    }

    void addCoin(){
        setHasQuarter(true);
    }

    void ejectCoin(){
        setHasQuarter(false);
    }

    private void setHasQuarter(boolean status){
        hasQuarter = status;
    }

    private void setHasGumball(boolean status){
        hasGumball = status;
    }
}
