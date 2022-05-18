/**
 * This class represents the Odd-Even game
 * 
 * 
 */

import java.util.Scanner; 

public class Game{
    
    private ComputerPlayer p1;
    private ComputerPlayer p2;
    private Scanner scanner;
    private int again;
    private int tokenBalance1;
    private int tokenBalance2;

    //contructor for part 1, takes no parameters
    public Game(){
        p1=new ComputerPlayer(1);
        p2=new ComputerPlayer(0);
        again = 1;
        tokenBalance1 = 0;
        tokenBalance2 = 0;
        scanner = new Scanner(System.in);
    }

    //constructor for part 2, takes parameters
   public Game (double t1, double t2){
        p1=new ComputerPlayer(-1,t1,t2);
        p2=new ComputerPlayer(2,t1,t2);
        tokenBalance1 = 0;
        tokenBalance2 = 0;
   }

    //play method for part 2, takes parameters
    public void play(int games){
        for (int i =0; i<games; i++){
            p1.play();  
            p2.play();
        
            if ((p2.getTurn() + p1.getTurn()) % 2 == 0){
                tokenBalance1=tokenBalance1 - ((p1.getTurn()+p2.getTurn()));
                tokenBalance2=tokenBalance2 + ((p1.getTurn()+p2.getTurn()));
			}else{
                tokenBalance1=tokenBalance1 + ((p1.getTurn()+p2.getTurn()));
                tokenBalance2 =tokenBalance2 - ((p1.getTurn()+p2.getTurn()));
			}
        }
    }
    
    //play method for part 1, takes no parameters
    public void play(){
        while (again ==1){
        p1.play();
        p2.play();
        System.out.println("Computer played " + p1.getTurn());
            if ((p2.getTurn() + p1.getTurn()) % 2 == 0){
                System.out.println("Player 2 Wins!");
                tokenBalance1=tokenBalance1 - ((p1.getTurn() + p2.getTurn()));
                tokenBalance2=tokenBalance2 + ((p1.getTurn() + p2.getTurn()));
                System.out.println("Player 1 Token Balance is "+tokenBalance1);
                System.out.println("Player 2 Token Balance is "+tokenBalance2);
            }else{
                System.out.println("PLayer 1 Wins");
                tokenBalance1=tokenBalance1+((p1.getTurn()+p2.getTurn())); 
                tokenBalance2=tokenBalance2-((p1.getTurn()+p2.getTurn()));
                System.out.println("Player 1 Token Balance is "+tokenBalance1);
                System.out.println("Player 2 Token Balance is "+tokenBalance2);
            }  
        System.out.println("Would you like to play again? 0=No, 1=Yes");
        again = scanner.nextInt();  
        }
    }   
    
    //returns score (tokenBalance) for player 1
    public int getP1Score(){
        return tokenBalance1;
    } 
    //returns score (tokenBalance) for player 2
    public int getP2Score(){
        return tokenBalance2;     
   }  
}
    