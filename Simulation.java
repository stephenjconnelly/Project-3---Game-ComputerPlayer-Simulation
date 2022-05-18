/**
 * .
 * Plays a simulation to find which player has an advantage 
 * and the threshold which shows it. 
 * 
 */


public class Simulation{
    
    public static void main(String[] args){
        
        double maxMin=-10000;//iniatlizes maxMin & min to unobtainable values
        double min=10000;
        double maxMinThresh=0;
        double t1 =0;
        
        for(double t2 =0; t2<1; t2+=.02){
            for(t1 =0; t1<1; t1+=.02){
                Game g = new Game(t1,t2);
                g.play(1000);
                double token = g.getP1Score();
                if (token<min){
                    min = token;
                }
            }
            if (min>maxMin){
                maxMin=min;
                maxMinThresh=t2;//keeps track of t2 according to maxMin
            }
            min=10000; //"resets" inner for loop
        }
        System.out.println(" \n for this game, maxMin is this value " + maxMin+ 
        " and in general at threshold " + maxMinThresh);
        System.out.println(" \n Since the threshold is negative " + 
        " player 1 is at a disadvantage. \n");  
    }    
}