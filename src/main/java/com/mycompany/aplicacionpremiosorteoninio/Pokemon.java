/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacionpremiosorteoninio;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Pokemon {
    private ArrayList<Abilities> abilities;
    private int base_experience;
    private ArrayList<Form> forms;
    private Sprites sprites;
    private ArrayList<Types> types;
    private int weight;

    public Pokemon(ArrayList<Abilities> abilities, int base_experience, ArrayList<Form> forms, Sprites sprites, ArrayList<Types> types, int weight) {
        this.abilities = abilities;
        this.base_experience = base_experience;
        this.forms = forms;
        this.sprites = sprites;
        this.types = types;
        this.weight = weight;
    }

    public ArrayList<Abilities> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Abilities> abilities) {
        this.abilities = abilities;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public ArrayList<Form> getForms() {
        return forms;
    }

    public void setForms(ArrayList<Form> forms) {
        this.forms = forms;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public ArrayList<Types> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Types> types) {
        this.types = types;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static Pokemon fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Pokemon.class);
    }
}
