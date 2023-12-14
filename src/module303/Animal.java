package module303;

public class Animal {
    //attributes (fields) - variables that describes the animal
    String name;
    String type;
    int level;
    String color;
    boolean alive;


    //Behavior - methods that describes or show behavior of an animal

    public void setName(String name){
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getAlive() {
        return alive;
    }
}
