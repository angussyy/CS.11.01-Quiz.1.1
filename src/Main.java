import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        System.out.println("Please enter your first name:");
        firstName = scanner.nextLine();
        System.out.println("Please enter your favorite food:");
        favoriteFood = scanner.nextLine();
        System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavorite food: " + favoriteFood);
    }
}