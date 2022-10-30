package org.generation;

import java.util.Scanner;

public class ChecarCodigo4 {

	public static void main(String[] args) {
		
		   	Scanner s = new Scanner(System.in);
		    Scanner s2 = new Scanner(System.in);
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = s.nextLine();
		    
		    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		    String j2 = s2.nextLine();
		    
		    
		    if (j1 == j2) System.out.println("Empate");
		     
		    else {
		    	
		    	int g = 1;
		      switch(j1) {
		      
		        case "piedra":
		          if (j2 == "tijeras") {
		            g = 1;
		          }
		          else if(j2 == "papel"){
		        	  g = 2;
		          }
		            break;
		          

		        case "papel":
		          if (j2 == "piedra") {
		            g = 1;
		          }
		          else if(j2 == "tijeras"){
		        	  g = 2;
		          }
		            break;
		            
		          
		        case "tijera":
		          if (j2.equals("papel")) {
		            g = 1;
		          }
		          else if(j2 == "piedra"){
		        	  g = 2;
		          }
		            break;
		      }
		        System.out.println("Gana el jugador " + g);
		    
		        
		    }
		      
		    }
		  
		  
		    }

	


