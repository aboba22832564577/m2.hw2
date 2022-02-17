package com.company;

public class Main {



    public static void main(String[] args) {
        createObjects("Honda").print();
        createObjects("Toyota").print();
        createObjects("Subaru").print();



    }

    public static Cars createObjects(String className){
        switch (className){
            case "Honda":
                return new Honda("Accord", "Japanese");
            case "Toyota":
                return new Toyota("Camry", "Japanese");
            case "Subaru":
                return new Subaru("BaracaObama", "Japanese");
            default:
                return null;
        }

        }






}

