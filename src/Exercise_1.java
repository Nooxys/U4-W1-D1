import java.util.Arrays;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int mulResults = multiplication(3,3);
        System.out.println("il numero moltiplicato è: " + mulResults);
        String myConc = concatenation("FirstTry", 10);
        System.out.println("concatenation try " + myConc);
        String[] arrayOfStrings = {"Uno", "Due", "Tre", "Quattro", "Cinque",};
        String arrayPrinted = Arrays.toString(pushToArray(arrayOfStrings, "Rope"));
        System.out.println(arrayPrinted);
    }
    public static int
    multiplication(int num1 , int num2){
     return num1  * num2; }
    public static String concatenation(String query, int num)
    {return query + num;}

    public static String[] pushToArray(String[] array, String word){

        String[] newArray = new String[6];
        for (int i = 0; i < array.length + 1; i++) {
            if (i < 3) {
                newArray[i] = array[i];
            }
            if (i == 3) {
                newArray[i] = word;
            }
            if (i > 3) {
                newArray[i] = array[i-1];
            }
        }
        return newArray;
    }

}
