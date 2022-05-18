************************************
Stephen Connelly 
sjc2235 
Programming Project 3
*************************************

The game's premise: 

Consider the following game between two players: Both players simultaneously declare “one” or "two". Player 1 wins if the sum of the two declared numbers is odd and Player 2 wins if the sum is even. In either case the loser is obliged to pay the winner (in tokens) the sum of the two declared numbers. So Player 1 may have to pay 2 or 4 tokens or may win 3 tokens.

The simulation: 

Separate test class called Simulation that allows you to run some simulations (play many games of computer versus computer) using various combinations of the threshold variable t for each player. Determines if either player has an advantage and if so which player it is and determine a threshold value t* that demonstrates the advantage.


ComputerPlayer 

ComputerPlayer serves to provide the game class with the values 
of both the human player (p2) and the computer player (p1). The 
game class calls upon Play() and using the parameters given by the 
game class, provides the game class either with a randomly generated move
or a system.in move from the user. I also overloaded the COmputerPlayer 
constructor to be able to take explicit parameters t1, t1 along with the 
computer explicit parameter for part 2. The play class is still called upon
except with new players and new methods (ComputerSim and ComputerSim2). A 
get.Turn accessor method is also employed to send the respective moves to 
the game class. 

Game 

Most of the function of the game class has already been stated but in general, 
game class instatiates player 1 and player 2 (for both Part 1 and Part 2)
and calls upon the getTurn method to modify the tokenBalance variable. 

Simulation 

For Simulation I used a double nested for loop and intialize minMax and min 
to values that the tokenBalances for the games will never be and so the first
value for the games will always be the first min and therfore first maxmin. To 
keep track of the t2 threshold value I made a new variable that is minMaxThresh. 
Also, I set min = 10000 again after each of the innter for loops because if not, 
the min will always be the min of the first for loop when t2 = 0. 

