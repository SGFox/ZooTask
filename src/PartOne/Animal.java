package PartOne;

public abstract class Animal
{
    public int age;
    public char gender;
    public String[] eats;
    public int Health;
    public int lifeExpectancy;

    public int getAge(int aAge)
    {
        return age;
    }

    public char getGender(char gendr)
    {
        char f = 'f', m = 'm';
        switch (gender)
        {
            case 'f':
                gender = f;
                break;
            case 'm':
                gender = m;
                break;
        }
        return gender;
    }

    public int getLifeExpectancy(int le)
    {
        return lifeExpectancy;
    }

    public String[] canEats()
    {
        return eats;
    }

    public boolean eat()
    {
        return false;
    }

    public int decreaseHealth()
    {
        return Health;
    }

    public boolean treat()
    {
        return false;
    }

    public boolean aMonthPasses()
    {
        return false;
    }
}
