package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    Aluguel [] aluguel = new Aluguel[10];
	    
	    System.out.print("How many rooms will be rented? ");
	    int quantityRooms = sc.nextInt();
	    
	    for(int i = 1; i <= quantityRooms; i++) {
	    	System.out.println("\nRent #" + i + ":");
		    System.out.print("Name: ");
		    sc.nextLine();
		    String name = sc.nextLine();
		    System.out.print("Email: ");
		    String email = sc.nextLine();
		    System.out.print("Room: ");
		    int room = sc.nextInt();
		    aluguel[room] = new Aluguel(name, email);
	    }
	    
	    System.out.println("\nBusy rooms: ");
	    for(int i = 0; i < aluguel.length; i++) {
	    	if(aluguel[i] != null) {
	    		System.out.println(i + ": " + aluguel[i]);    		
	    	}
	    }
	    
	    sc.close();
	}
}


