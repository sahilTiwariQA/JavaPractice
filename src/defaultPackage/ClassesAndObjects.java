package defaultPackage;

//Class name starts with capital letter
// can't put 2 public classes in one file
// But it can contain multiple classes as long as it's not public
// if you put 2 or more public classes in a single file it will give compilation time error

public class ClassesAndObjects {

    public final String TOMBSTONE = "Here lies a Dead monster";

//    class variable or Fields

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    public  int getAttack()
    {
        return attack;
    }

    public int getMovement()
    {
        return movement;
    }
    public int getHealth()
    {
        return health;
    }
    public void setHealth(int decreaseHealth)
    {
        health = health-decreaseHealth;
        if (health<0)
        {
            alive = false;
        }
    }
    public void setHealth(double decreaseHealth)
    {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health<0)
        {
            alive = false;
        }
    }

//    constructor can be executed only once per object
//    construtor cannot have a return type

    public ClassesAndObjects(int newHealth, int newAttack, int newMovement)
    {
        health=newHealth;
        attack = newAttack;
        movement = newMovement;

    }

//    Default constructor
    public ClassesAndObjects()
    {

    }




}
