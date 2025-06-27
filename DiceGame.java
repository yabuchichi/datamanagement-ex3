import java.util.Random;
import java.util.Scanner;

public class DiceGame{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("What is your name? ");
    String name = scanner.nextLine();
    
    System.out.println("Hello, " + name + "!");
    
    Random rand = new Random();

    System.out.println("Rolling dice...");
    int dice1 = rand.nextInt(6) + 1;
    int dice2 = rand.nextInt(6) + 1;
    int total = dice1 + dice2;

    System.out.println("Die 1: " + dice1);
    System.out.println("Die 2: " + dice2);
    System.out.println("Total value: " + total);

    
    if(total >= 8){
      System.out.println(name + " won !");
    }else{
      System.out.println(name + " lost !");
    }
    scanner.close();
  }
}
