package org.example;

/**
 * 6510450917 Lerdphipat Kanjanarungroj
 */

public class Main {
    public static void main(String[] args) {

        Machine machine = new Machine();
        for(int i = 0;i<6;i++){
            machine.addCoin();
            if(i == 2)machine.ejectCoin();
            machine.crank();
        }
    }
}