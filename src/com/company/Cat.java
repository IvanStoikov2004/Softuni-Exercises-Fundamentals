package com.company;
//zad 1
public class Cat {
    //syzdavame promenlivi
    public String name;
    public String color;
//syzdavame set i get metodi na tezi promenlivi
    //set dava stoinost get q wryshta
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//syzdavame metod mqu
    public  void Mqu(){
        System.out.println("Mquu:");
    }
//kosntruktor Cat koito po podrazbirane zadava stoinost na promenlivite
    Cat(){
        this.name="Riki";
        this.color="Zelen";
    }
    //metod cat v koito nie davame stoinosti na promenlivite
    public void Cat(String name, String color){
        this.name=name;
        this.color=color;
    }

//kogato zadadem stoinost na dadenata promenliva tq si sedi takawo dokato ne q promenim ili iztriem


}
