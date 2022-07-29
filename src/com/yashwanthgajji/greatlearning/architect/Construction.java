package com.yashwanthgajji.greatlearning.architect;

import java.util.ArrayList;

public class Construction {
    //Total number of floors
    private final int numberOfFloors;
    //Floors that are ready from factory
    private final boolean[] floorsReady;
    //Floors that are already constructed
    private final boolean[] floorsConstructed;

    public Construction(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
        floorsReady = new boolean[numberOfFloors+1];
        floorsConstructed = new boolean[numberOfFloors+1];
    }

    //Add a floor from factory and mark it as ready
    public void addFloor(int floor) {
        floorsReady[floor] = true;
    }

    ArrayList<Integer> getConstructedFloorsToday() {
        ArrayList<Integer> floorsConstructedToday = new ArrayList<>();
        //Loop through all floors from large to small and check its status
        for(int i=numberOfFloors;i>0;i--) {
            //If floor is already constructed, leave it
            if(floorsConstructed[i]) {
                continue;
            }
            /*If floor is ready and loop came here means,
                All floors larger than this floor are already constructed.
                We can construct this floor now.
             */
            if(floorsReady[i]) {
                floorsConstructedToday.add(i);
                //Move the floor state from ready to constructed
                floorsReady[i] = false;
                floorsConstructed[i] = true;
            }
            //If floor is not ready, we can break here as we cannot construct smaller floors than this
            else {
                break;
            }
        }
        return floorsConstructedToday;
    }
}
