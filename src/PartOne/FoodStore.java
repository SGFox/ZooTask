package PartOne;

import java.util.Hashtable;

public class FoodStore
{
        private Hashtable<String, Integer> foodStore;

        public FoodStore()
        {
                this.foodStore = new Hashtable<>();
                foodStore.put("Hay", 10);
                foodStore.put("Steak", 20);
                foodStore.put("Fruit", 40);
                foodStore.put("Celery", 50);
                foodStore.put("Fish", 70);
                foodStore.put("Ice Cream", 30);
        }
}