// Sten Sax Påse

import java.util.Scanner;
import java.util.Random;

public class Sten
{
    public static void main(String[] args)
{
    String personPlay; //Spelarens tur -- "R" "P" "S"
    String computerPlay = ""; //Datorns tur -- "R" "P" "S"
    int computerInt; // RGN om vilket nummer datorn använder
    
    String response;
    
    
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    
    System.out.println("Hej nu kan vi spela sten sax papper!" + "Skriv ditt val./n" + "Sten = R, Papper = P, Och Sax = S,");
    
    System.out.println();
    
    computerInt = generator.nextInt(3)+1;
    
    
    if (computerInt == 1)
        computerPlay = "R";
    else if (computerInt == 2)
        computerPlay = "P";
    else if (computerInt == 3)
        computerPlay = "S";
        
    
    System.out.println("Ditt val ");
    personPlay = scan.next();
    
    personPlay = personPlay.toUpperCase();
    
    System.out.println("Datorns val: " + computerPlay);
    
    
    // Vem van?
    
    if (personPlay.equals(computerPlay)){
        System.out.println("Det vart lika!");
}
else if (personPlay.equals("R")) {
   if (computerPlay.equals("S")) 
      System.out.println("Sten krosar saxen. Du van!");
   else if (computerPlay.equals("P")) 
        System.out.println("Papper tar sten. Du vann Inte!");
}
else if (personPlay.equals("P")) {
   if (computerPlay.equals("S")) 
       System.out.println("Sax tar papper. du van Inte!"); 
   else if (computerPlay.equals("R")) 
        System.out.println("Papper tar sten. du van!");
} 
else if (personPlay.equals("S")) {
     if (computerPlay.equals("P")) 
         System.out.println("Sax tar papper. du van!"); 
     else if (computerPlay.equals("R")) 
        System.out.println("Sten krosar saxen. Du van Inte!");
}
else 
     System.out.println("Invalid user input.");
}
}