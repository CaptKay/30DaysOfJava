import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter your name");

    Scanner in = new Scanner(System.in);
    String s = in.nextLine();

    if(s.equals("Kanu")){
      System.out.println("Hey Kanu!");
    }else if(s.equals("Suge")){
      System.out.println("Hey Suge!");
      
    }else{
      System.out.println("You are not welcome here");
    }

    in.close();
  }
}