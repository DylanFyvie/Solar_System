/**

 *

 * Name: Dylan Fyvie

 * Teacher: Mr.Hardman

 * Assignment #4, Program #1

 * Date Last Modified:11/14/2016 

 *

 */

import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.fyvie
 *
 */
public class Markus_Naslund {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userWeight;
		String userCelestBody;
		
		
		System.out.println("What is your weight?");
		userWeight = userInput.nextInt();
		 
	
		System.out.println("What Celestial Body are you wanting to travel to");
		userCelestBody = userInput.next();
		
		if(userCelestBody.equalsIgnoreCase("Mercury")){
			System.out.println("Your Mass on Mercury is " + userWeight*0.38);
		}
		
		if(userCelestBody.equalsIgnoreCase("Venus")){
			System.out.println("Your mass on Venus is " + userWeight*0.91);
		}
		
		if(userCelestBody.equalsIgnoreCase("Earth")){
			System.out.println("Your weight on earth is " + userWeight*1);
		}
		
		if(userCelestBody.equalsIgnoreCase("Moon")){
			System.out.println("Your weight on the Moon is " + userWeight*0.165);
		}
		
		if(userCelestBody.equalsIgnoreCase("Mars")){
			System.out.println("Your weight on Mars is " + userWeight*0.38);
		}
		
		if(userCelestBody.equalsIgnoreCase("Jupiter")){
			System.out.println("Your weight on Jupiter is " + userWeight*2.34);
		}
		
		if(userCelestBody.equalsIgnoreCase("Saturn")){
			System.out.println("Your weight on Saturn is " + userWeight*1.06);
		}
		
		if(userCelestBody.equalsIgnoreCase("Uranus")){
			System.out.println("Your weight on Uranus is " + userWeight*0.92);
		}
		
		if(userCelestBody.equalsIgnoreCase("Neptune")){
			System.out.println("Your weight on Neptune is " + userWeight*1.19);
		}
		
		if(userCelestBody.equalsIgnoreCase("Pluto")){
			System.out.println("Your weight on Pluto is " + userWeight*0.06);
		}
		
		
	
	  
		
		
		
		
		
		
		
		userInput.close();
	}

}
