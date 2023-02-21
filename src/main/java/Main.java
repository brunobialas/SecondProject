import model.heroes.Angel;
import model.Equipment;
import model.heroes.Hero;
import model.heroes.Knight;
import model.heroes.Demon;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
//        MainMenu mainMenu = new MainMenu();
//        mainMenu.showMainMenu();

        Equipment sword = new Equipment("First Sword", 100.0,5);
        Knight andrzej = new Knight("Andrzej", 100);
        Knight mateusz = new Knight("Mateusz", 100);
        Angel dagmara = new Angel("Dagmara", 500);
        Demon mariusz = new Demon("Mariusz", 10000);
        Demon mariusz2 = new Demon("Mariusz2", 55);


        ArrayList<Hero> heroesList = new ArrayList<>();
        heroesList.add(andrzej);
        heroesList.add(dagmara);
        heroesList.add(mariusz);

        for(int i = 0; i < 3; i++){
            heroesList.get(i).show();

        }












    }

}
