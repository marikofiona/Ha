package datastructures;

import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private int points;
 

    Contact() {
    };

    Contact(String name, int points) {
        this.name = name;
        this.points = points;
       
    }

    @Override
    public String toString() {
        return "Name:" + name + "\tPoints: " + points;
        
      
    }
}


   




	