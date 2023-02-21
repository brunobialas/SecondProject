package model.heroes;

public class Hero {
    public String name;
    public Integer level;

    public String type;

    public Hero() {
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.level);
        System.out.println(this.type);
    }

    public void addLevels(Integer levels) {
        this.level = this.level + levels;
    }

}
