package PartOne;

import java.util.*;

public class Enclosures
{
    private List<Animal> animals = new ArrayList();
    private Set<String> foods = new HashSet<>();
    private FoodStore foodStore;
    private int waste;
    private int EnclosureSize;
    private Object e = null;

    public <animals> void addAnimal()
    {
        if (EnclosureSize <= 20)
        {
            this.animals.add((Animal) e);
            EnclosureSize++;
        }
        else System.out.println("In enclosure doesn't have place! ");
    }

    public <animals> void removeAnimal()
    {
        this.animals.remove(animals);
    }

    public int addWaste(int wasteSize)
    {
        this.waste += wasteSize;
        return waste;
    }

    public int removeWaste(int wasteSize)
    {
        this.waste -= wasteSize;
        if (this.waste < 0)
            this.waste = 0;
        return waste;
    }

    public int getWasteSize()
    {
        return this.waste;
    }

    public FoodStore getFoodStore()
    {
        return this.foodStore;
    }

    public int EncSize()
    {
        return EnclosureSize;
    }

    void aMonthPasses() {

    }
}
