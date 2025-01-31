import java.util.Scanner;

public class Input{
    public static void main(String[] stringy){
        Scanner fetch = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = fetch.nextLine();

        System.out.println("Please enter your age: ");
        int age = fetch.nextInt();

        System.out.println("Please enter your weight: ");
        double weight = fetch.nextDouble();

        System.out.println("Have you ever smoked? Please enter true or false: ");
        boolean smoker = fetch.nextBoolean();

        System.out.println("Name: " + name + "   Age: " + age + "   Weight: " + weight + "   Smoker: " + smoker);
    }
}
