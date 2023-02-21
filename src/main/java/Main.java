import heroes.Angel;
import heroes.Demon;
import heroes.Hero;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

//    ShowMainMenu mainMenu = new ShowMainMenu();
//    mainMenu.showMainMenu();

        Angel matras = new Angel("Matras", 1);
        Demon ganter = new Demon("Ganter", 1);


        ArrayList<Hero> heroesList = new ArrayList<>();
        heroesList.add(matras);
        heroesList.add(ganter);

       for(int i = 0; i < 2; i++ ) {
           heroesList.get(i).show();

        }



    }
}
