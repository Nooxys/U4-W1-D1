import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println("Exercise 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your name here then press enter");
        String name = scanner.nextLine();
        System.out.println("Put your lastName here then press enter");
        String lastName = scanner.nextLine();
        System.out.println("Put your nickName here then press enter");
        String nickName = scanner.nextLine();
        System.out.println(name + lastName + nickName);
        System.out.println(nickName +  lastName + name);
    }

}
