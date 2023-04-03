package com.bondarenko.hw6;

public class Task1 {

    private static void main(String[] args) {

        Phone phone1 = new Phone("0559494441", 'A', 0.200);
        Phone phone2 = new Phone("06778782121", 'F', 0.100);
        Phone phone3 = new Phone("0217874545", 'X', 0.150);

        System.out.println("");
        phone1.receiveCall("Бодя");
        System.out.print(phone1.getNumber());

        System.out.println("");
        phone2.receiveCall("Сергей");
        System.out.print(phone2.getNumber());

        System.out.println("");
        phone3.receiveCall("Саня");
        System.out.print(phone3.getNumber());

    }

}

class Phone {

    String number;
     char model;
     double weight;
     String name;

    Phone(String number, char model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

        System.out.println(number + " - " + model + " - " + weight);
    }

    Phone(String number, char model) {
    }

    Phone() {
    }

    public void receiveCall(String name) {
        this.name = name;
        System.out.print("Звонит " + name + " Номер - ");
    }

    public String getNumber() {
        return number;
    }

}

