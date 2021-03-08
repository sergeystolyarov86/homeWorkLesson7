package com.company;

public class Main {

    public static void main(String[] args) {
       // сделал домашку после разбора на вебинаре,не хватило времени самостоятельно дописать код,обязательно со временем
       // разберусь полностью с кодом
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 6);
        cats[1] = new Cat("Тяпа", 5);
        cats[2] = new Cat("Лиза", 10);

        Plate plate = new Plate(5);

        for (int cat = 0; cat < cats.length; cat++)
        {
            cats[cat].eat(plate);
        }

        appendFoodTo(plate, 40);

        for (int cat = 0; cat < cats.length; cat++)
        {
            cats[cat].eat(plate);
        }
    }

    static void appendFoodTo(Plate plate, int food)
    {
        plate.increaseFood(food);
    }
}


