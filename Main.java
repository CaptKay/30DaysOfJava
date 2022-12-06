import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int size = 5;

    int[] grades = new int[size];

    System.out.println("Enter 5 numbers");
    for(int i = 0; i < size; i++){
      grades[i] = in.nextInt();
    }
    for(int i = 0; i < size; i++){
      System.out.println(grades[i]);
    }

    in.close();

    
    
  }
}