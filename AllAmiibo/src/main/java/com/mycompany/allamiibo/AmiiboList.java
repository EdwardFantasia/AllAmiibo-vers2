/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.allamiibo;
import java.util.ArrayList;

/**
 *
 * @author Edwar
 */
public class AmiiboList {
    private ArrayList<Amiibo> amiibo;
    public AmiiboList(ArrayList<Amiibo> list){
        this.amiibo = list;
    }
    
    public ArrayList<Amiibo> getAmiiboList(){
        return amiibo;
    } 
}
