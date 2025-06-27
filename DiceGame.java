import java.util.Random;

public class DiceGame{
  public static void main(String[] args){
    Random rand = new Random();

    System.out.println("Rolling dice...");
    int dice1 = rand.nextInt(6) + 1;
    int dice2 = rand.nextInt(6) + 1;
    int total = dice1 + dice2;

    System.out.println("Die 1: " + dice1);
    System.out.println("Die 2: " + dice2);
    System.out.println("Total value: " + total);

    if(total >= 8){
      System.out.println("You won !");
    }else{
      System.out.println("You lost !");
    }
  }
}
