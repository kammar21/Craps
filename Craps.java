import java.util.Scanner;
 public class Craps
{
    public static void main(String[] args)
    {
        Die d = new Die();
        int die1;
        int die2;

        boolean gameover = false;
        String playagain = "y";
        System.out.println("LET'S PLAY CRAPS!");
        Scanner res = new Scanner(System.in);
        System.out.println("Do you need instructions (Y/n)? ");
        String r = res.nextLine();
        if(r.equalsIgnoreCase("Y"))
        {
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");
            System.out.println();
        }
        System.out.println("Good luck!");
        System.out.println();
        while(playagain.equalsIgnoreCase("Y"))
        {  
                System.out.println("Press <Enter> to roll the dice...");
                String playgame = res.nextLine();
                d.roll();
                int count=1;
                System.out.println("Your first roll is: " + d.getRoll());
                if(d.getRoll() == 7 || d.getRoll() == 11)
                 {
                    System.out.println("You rolled a " + d.getRoll() + " on first try. You won.");
                    System.out.println("Would you like to play again: (y/n)");
                    playagain = res.nextLine();
                 }
                else if(d.getRoll() == 2 || d.getRoll() == 3 || d.getRoll() == 12)
                { 
                    System.out.println("You rolled a "+ d.getRoll()+ " on first try. You lost.");
                    System.out.println("Would you like to play again: (y/n)");
                    playagain = res.nextLine();
                }
                else
                {
                    while (gameover == false)
                    {
                        System.out.println("Press <Enter> to roll again...");
                        playgame = res.nextLine();
                        int point = d.getRoll();
                        d.roll();
                        count++;
                        
                        if(point == d.getRoll() && count > 1)
                         {
                            System.out.println("You rolled your point. You won.");
                            gameover = true;
                         }
                         else if (d.getRoll() == 7 && count > 1)
                         {
                            System.out.println("You rolled a 7. You lost.");
                            gameover = true;
                         }
                         else
                         {
                             System.out.println("You rolled a "+ d.getRoll()+ ". Roll again");
                         }
                    }
                }
         }    
      }
    }
