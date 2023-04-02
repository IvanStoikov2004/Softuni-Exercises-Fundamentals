package com.company;
import java.util.Random;
public class zad3 {
    Random generator=new Random();
    public void Random(){
        String name[]={"Диана", "Петя", "Стела", "Елена", "Катя"};
        String seconName[]={"Иванова", "Петрова", "Кирова"};
        String Sluchki[]={"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.", "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
        String fraza[]= {"Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория."};
        String gradowe[]={"София", "Пловдив", "Варна", "Русе", "Бургас"};

        System.out.println(fraza[generator.nextInt(2)]+" "+Sluchki[generator.nextInt(5)]+" "+name[generator.nextInt(4)]+" "+seconName[generator.nextInt(3)]+" "+gradowe[generator.nextInt(4)]);

    }


}
