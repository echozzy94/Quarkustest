package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped //Betekent dat die bruikbaar is door de hele applicatie
public class ArrayService {

    public ArrayList<String> fruit;

    public ArrayService(){
        fruit = new ArrayList<String>();
    }

    public String addFruit(String name){
            if (fruit.isEmpty()){
                fruit.add(name);
            } else {
                fruit.add(name);
                return fruit.toString();
            }
            return null;
    }

    public String removeFruit(String name){
        for (int i = 0; i < fruit.size(); i++){
            if (fruit.get(i).toString().equals(name)){
                fruit.remove(i);
                return name+ " verwijderd";
            } else {
                return name + " niet gevonden";
            }
        }
        return null;
    }

    public String getAllFruits(){
        return fruit.toString();
    }

}
