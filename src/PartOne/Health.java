package PartOne;

public class Health
{
    private int health;

    public Health(int health)
    {
        if (!(health < 0 && health >= 10))
        {
            throw new RuntimeException(health + " Exceeds Range (must be: 0 < health <= 10)! ");
        }
        this.health = health;
    }

    public int getHealth()
    {
        return this.health;
    }

    public void decreaseHealth()
    {

    }
}
