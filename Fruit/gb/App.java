package Fruit.gb;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.add(new Apple(77));
        fruitBox.add(new GoldenApple(88));
        orangeBox.add(new Orange(5));
        appleBox.add(new Apple(3));// +
        System.out.println(" \n Коробка с яблоками (проверка весов) - " + appleBox.getWeight() + " кг.\n");
        goldenAppleBox.add(new GoldenApple(3));// +

        goldenAppleBox.add(new GoldenApple(44));
        appleBox.add(new GoldenApple(66));// +
        appleBox.add(new Apple(10));

        System.out.println(" Коробка с золотыми яблоками до пересыпания- " + goldenAppleBox.getWeight() + " кг.");
        System.out.println(" Коробка с яблоками до пересыпания - " + appleBox.getWeight() + " кг.");
        System.out.println(" Коробка с апельсинами - " + orangeBox.getWeight() + " кг.\n");

        for (GoldenApple fruit : goldenAppleBox) {
            appleBox.add(fruit);
        }
    }
}