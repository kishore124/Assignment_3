import java.util.*;
class NumberGusserbySystem
{
	int gussedNumber;
	int gussNumber()
	{
		gussedNumber=(int)(Math.random()*10)+1;
		return gussedNumber;
		
	}
}
class Player
{
	int playerNumber;
	int playerNumber()
	{	
		  Scanner scan=new Scanner(System.in);
		  playerNumber=scan.nextInt(); 
		  return playerNumber;	
	}
	
}

class Umpire
{
	int gussedNumber;
	int []arr;
	void getGussedNumber()
	{
	NumberGusserbySystem g=new NumberGusserbySystem();
	gussedNumber=g.gussNumber();
	}
	void getPlayerNumber(int numberOfPlayers)
	{
		Player[]obj=new Player[numberOfPlayers];
		arr=new int[numberOfPlayers];
		for(int i=0;i<numberOfPlayers;i++)
		{
			System.out.println("Player "+(i+1)+" Guess the number between '1' to '10'");
			obj[i]=new Player();
			arr[i]=obj[i].playerNumber();
		}
		
	}
	
	void compare()
	{
		int[]playerWon=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(gussedNumber==arr[i])
			{
				playerWon[j]=i+1;
				j++;
			}
		}
		if(j==0)
		{
			System.out.println("The Rigth Guess should be  "+gussedNumber);
			System.out.println("______GAME LOST______");
		}
		else
		{
			for(int i=0;i<j;i++)
			{
				System.out.println("_____Player "+playerWon[i]+" Won the Game______");
			}
		}
		
	}
	
}

public class GusserGame {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		while(true)
		{
			System.out.println("_____________________Welcome To Gusser Game____________________________");
			System.out.println("How many players want to play the game");
			int numberOfPlayers=sc.nextInt();
			if(numberOfPlayers<=0)
			{
				System.out.println("The Number Of Players should be always a Positive integer");
				System.out.println("____________________________________________________________________________");
			    System.out.println("Enter '1' to play the Game Again else enter any number");
			    int playAgain=sc.nextInt();
			    if(playAgain==1)
			    {
			    	continue;
			    }
			    else
			    {
			    	System.out.println("________________GAME ENDED____________________________");
			    	break;
			    }
			}
			else
			{
				Umpire obj=new Umpire();
				obj.getGussedNumber();
				obj.getPlayerNumber(numberOfPlayers);
				obj.compare();
				System.out.println("_______________________________________________________________________");
				System.out.println("Enter '1' to play the Game else enter any number");
				int toPlay=sc.nextInt();
				if(toPlay==1)
				{
					continue;
				}
				else
				{
					System.out.println("_______________GAME ENDED___________________");
					break;
				}
			}
		}
		
		

	}

}
