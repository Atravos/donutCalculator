import java.util.Scanner;

class Main {

  public static void main(String[] args)
   {

      Scanner keyboard = new Scanner(System.in);
      Scanner user_input = new Scanner(System.in);

    
    System.out.println("I see this is your third time in the clinic this week.. How many donuts this time?");
    double ageOldness = keyboard.nextDouble();

    
    double calculation =  (ageOldness / 2) * 300;

    
    System.out.println("Dear Goodness.. You've consumed " + calculation + " calories today. O.o ");
    
  }
}