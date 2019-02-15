import java.util.Scanner;

public class Main {


    public static float myFloat = 3.2f;

    public static void main(String[] args) {
        Scanner scanez = new Scanner(System.in);
//        Dog rex = new Dog();
//        int y = 4;
//        String nume = "Cosmin";
//        int x = 3;
//
//        double adunare = x + 2.3f;
//
//        System.out.println("prima adunare = " + (x + 2.3f));
//
//        adunare++;     // adunare = adunare + 1;
//        adunare += 3;  // adunare = adunare + 3;
//
//        System.out.println("A doua adunare = " + adunare);
//        int scadere = x - y;
//
//        System.out.println("Rezultatul scaderii dintre " + x + " si " + y + " este: " + scadere);
//
//        System.out.println(" 1+2 ");
//        System.out.println("Hello world!");
//
//
//        System.out.println(1 + 2);
//

//        System.out.print("Intrudu un int: ");
//        System.out.print("Intrudu un String: ");
//        System.out.print("Intrudu un float: ");
//        int z = scanez.nextInt();
//
//        float mySecondFloat = 3.3f;
//        System.out.println(afisareHelloNume());
//        int res = adunare(x,z);
//        System.out.println(res);
//        System.out.println(adunare(123,5123));


        Dog rex = new Dog();
        System.out.print("Introdu numele catelului: ");
        rex.nume = scanez.next();
        System.out.print("Introdu culoarea catelului: ");
        rex.culoare = scanez.next();
        rex.greutate = 3.4f;
        rex.rasa = "Bichon";
        rex.varsta = 3;

        System.out.println("Numele este: " + rex.nume);
        System.out.println(rex.culoare);

        Dog dingo = new Dog();
        dingo.nume = "Dingo";
        dingo.greutate = 35;
        dingo.rasa = "Ciobanesc";
        dingo.varsta = 1;
        dingo.alearga();
        Dog gigi = new Dog();


    }

    public static int adunare(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar + alDoileaNumar;
        return resultat;
    }

    public static String afisareHelloNume() {
        return "Hello \n Cosmin";
    }


}

