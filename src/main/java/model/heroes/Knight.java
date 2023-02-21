package model.heroes;

public class Knight extends Hero {

    public String giermek;
    public Knight(String name, Integer level) {
        this.name = name;
        this.level = level;
        this.type = "Knight";
        this.giermek = "stefan";
    }

    @Override
    public void show(){
        System.out.println(this.name);
        System.out.println(this.level);
        System.out.println(this.type);
        System.out.println(this.giermek);
    }
}
