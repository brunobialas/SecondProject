package heroes;

public class Hero {
    public String name;

    public Integer level;

    public String type;
        public Hero() {
        }

        public void show() {
            System.out.println("Nazwa: " + this.name);
            System.out.println("Level: " + this.level);
            System.out.println("Typ: " + this.type);
            System.out.println("");
        }
}
