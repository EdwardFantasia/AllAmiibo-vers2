/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.allamiibo;
import java.util.ArrayList;
import java.net.*;

/**
 *
 * @author Edwar
 */
public class Amiibo {
    private String amiiboSeries;
    private String character;
    private String gameSeries;
    private String image;
    private String name;
    private String type;
    
    public Amiibo (String amiiboSeries, String character, String gameSeries, String image, String name, String type){
        this.amiiboSeries = amiiboSeries;
        this.character = character;
        this.gameSeries = gameSeries;
        this.image = image;
        this.name = name;
        this.type = type;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAmiiboSeries(){
        return this.amiiboSeries;
    }
    
    public String getGameSeries(){
        return this.gameSeries;
    }
    
    public String getImage(){
        return this.image;
    }
    
    public String getType(){
        return this.type;
    }
    
    public String getCharacter(){
        return this.character;
    }
    
    public String getInfo(){
        return getName() + ": This amiibo is from the " + getGameSeries() + " series of games, released as part of the " + getAmiiboSeries() + " amiibo series as a " + getType() + " amiibo. This amiibo is a variation of the " + getCharacter() + " amiibo(s).";
    }
    
    public static void main(String[] args) {
        
    }
}
