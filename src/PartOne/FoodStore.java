package PartOne;

import java.util.Hashtable;

public class FoodStore
{
    public static void main(String[] args)
    {
        Hashtable<String, Integer> foodStore = new Hashtable<String, Integer>();
        String foodName;
        Integer quantityFood;

        foodStore.put("Hay", 10);
        foodStore.put("Steak", 20);
        foodStore.put("Fruit", 40);
        foodStore.put("Celery", 50);
        foodStore.put("Fish", 70);
        foodStore.put("Ice Cream", 30);
    }
}