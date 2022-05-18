/**
 * 
 *
 * 
 */
import java.util.Scanner;

public class ComputerPlayer{
    private Boolean isComputer;
    private Boolean isComputerSim;
    private Boolean isComputerSim2;
    private Scanner scanner;
    private int turn;
    private double th1;
    private double th2;
    
    //constructor for part 1
    public ComputerPlayer(int computer){
        isComputer = computer>0;
        isComputerSim = computer<0;
        isComputerSim2 = computer>1;
        scanner = new Scanner(System.in);
        turn = 0;
    }

    //overloading constructor for part 2
    public ComputerPlayer(int computer, double t1, double t2){
        isComputerSim=computer<0;
        isComputerSim2=computer>1;
        isComputer = computer>0;
        scanner = new Scanner(System.in);
        th1 = t1;
        th2 = t2;
    }
 
    //play method (which method to play given player instantiation in game())
    public void play(){
        if (isComputer || isComputerSim || isComputerSim2){
            if (isComputerSim || isComputerSim2){
                if (isComputerSim){
                    playComputerSim();
                }else{
                    playComputerSim2();
                }
            }else{
                playComp();
            }
        }else{
            playHuman();
        }
    }

    //randomizes turn
   public void playComp(){
        if (Math.random() < .5){
            turn = 1;
        }else{
            turn = 2;
        }
    }

    //randomizes turn given th1
    public void playComputerSim(){
        if (Math.random() < th1){
            turn = 1;
        }else{
            turn = 2;
        } 
    }

    //randomizes turn given th2 
    public void playComputerSim2(){
        if (Math.random() < th2){
            turn=1;
        }else{
            turn=2;
        }
    }

    //asks user for turn
    public void playHuman(){
        System.out.println("Would you like to play a 1 or 2?");
        turn = scanner.nextInt();
    }

    //returns turn values from play methods
    public int getTurn(){
        return turn; 
    }
}
         
