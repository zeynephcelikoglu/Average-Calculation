import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int math, physics, chemistry, music, english;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Maths grade: ");
        math = input.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("You entered an invalid grade, please try again.");
            return;
        }

        System.out.print("Enter your Physics grade: ");
        physics = input.nextInt();
        if (physics < 0 || physics > 100) {
            System.out.println("You entered an invalid grade, please try again.");
            return;
        }

        System.out.print("Enter your Chemistry grade: ");
        chemistry = input.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            System.out.println("You entered an invalid grade, please try again.");
            return;
        }

        System.out.print("Enter your Music grade: ");
        music = input.nextInt();
        if (music < 0 || music > 100) {
            System.out.println("You entered an invalid grade, please try again.");
            return;
        }

        System.out.print("Enter your English grade: ");
        english = input.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("You entered an invalid grade, please try again.");
            return;
        }


        double average = (math + physics + chemistry + music + english) / 5.0;

        if (average >= 55 && average <= 100) {
            System.out.println("Your average: " + average);
            System.out.println("Congratulations, you passed.");
        } else if (average >= 0 && average < 55) {
            System.out.println("Your average: " + average);
            System.out.println("You failed!");
        }
    } }