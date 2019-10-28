package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int jumps = 0;
        if (flagHeight >= jumpHeight) {
            jumps = (flagHeight / jumpHeight) + (flagHeight % jumpHeight);
        } else if (flagHeight < jumpHeight) {
            jumps = flagHeight;
        }
        return jumps;
    }
}
