package com.android.ippd.cameraapp;

/**
 * Created by Nicole K. on 11/13/15.
 */
public class DataStorage {

    static String[] partsArray = new String[50];

    //initialize array used for partsSpinner
    protected void partsArray_init(){
        //initialize partsArray
        for(int i = 0; i<partsArray.length; i++){
            partsArray[i] = "";
        }
    }

    // adds new part to partsArray
    protected String[] addNewPart(String part){
        for(int i = 0; i<partsArray.length; i++){
            if (partsArray[i] == "") {
                partsArray[i] = part;
                return partsArray;
            }
        }
        // if return occurs here, then max of 50 parts has been reached for inspection
        return partsArray;
    }
    protected String[] getPartsArray(){
        return partsArray;
    }

}
