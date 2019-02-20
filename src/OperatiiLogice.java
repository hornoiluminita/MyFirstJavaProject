import java.util.Scanner;

public class OperatiiLogice {
    public  void checkNumber(){
        int x = 5;
        int y = 5;

        if (x < y) {
            System.out.println("x e mai mic");
        } else if (x == y) {
            System.out.println("x este egal cu y");
        } else if (x > y) {
            System.out.println("x este mai mare");
        }
    }

    public  void checkString(){
        String aa = "asdasd ";
        String bb = "asdasd";

        if (!aa.equals("asd")){
            System.out.println("is egale");
        }


    }

    public  void switchCaseMethod(){
        System.out.println("Introdu un numar");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
        }
    }
}
