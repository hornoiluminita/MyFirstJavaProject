public class Dog {


    private String culoare;
    private int varsta;
    private float greutate ;
    private String rasa ;
    private String nume ;

//    Dog(String color, int varsta, float greutate, String rasa, String nume){
//        System.out.println("Initializat!");
//        culoare = color;
//        this.varsta = varsta;
//        this.greutate = greutate;
//        this.rasa = rasa;
//        this.nume = nume;
//    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public String getNume(){
        return this.nume;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    public int getVarsta(){
        return this.varsta;
    }

    public  void alearga(){
        System.out.println("Catelul alearga. Pazea!");
    }

    public  void mananca(){
        System.out.println("Momentan, mananca niste Purina");
    }

    public  void latra(){
        System.out.println("Ham!");
    }
}












//1. Given two numbers,
// see which one is the greatest
// and print it
//2. Given a text input, if it is
// “FastTrack”, then print
// “Learning text comparison”.
// If not, print
// “Got to try some more”
// 3. Given a number, if it’s equal
// to or higher than 2 and equal
// to or lower than 8, print the
// number
// 4.Given a text input and a number
// input, if the text is equal to
// “FastTrack” AND the number
// is equal to or lower than 3,
// print the text and the number.
// If the text is not “FastTrack”
// AND the number is equal to or
// higher than 4, print the number
// and the text, in this order.

//Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
//Given a number input, if the number is greater than 3 but not equal to 4, print “The number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print ”The number is equal to 4”. Else if the number is lower than 3 print “The number is lower than 3”