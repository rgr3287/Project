package project1;

import java.util.*;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	
	static ideal id1 = new ideal();
	static likely lk1 = new likely();
	static defect df1 = new defect(); 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		int choice = 0;
		
		while(true) {
			print();
		
		try {
		System.out.println();
		System.out.print("Choose One : ");
		choice = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		if(choice == 1){
				select1();
		}
		else if (choice == 2) {
				select2();
		}
		else if (choice == 3) {
				System.out.println();
			
				System.out.println("ideal : " + id1);
				System.out.println("likely : " + lk1);
				System.out.println("defect : " + df1);
			
		}
		else if (choice == 4) {
				break;
		}
	}
	
			
}
	public static void print() {
		System.out.println("=====================");
		System.out.println("1. Set Customer parameter");
		System.out.println("2. Enter Customer Data");
		System.out.println("3. Summary");
		System.out.println("4. Quit");
		System.out.println("=====================");
	}
	public static void print1() {
		
		System.out.println("===================");
		System.out.println("1. Set Parameter");
		System.out.println("2. View Customer");
		System.out.println("3. Edit Customer");
		System.out.println("4. back");
		System.out.println("==================");
	
	}
	public static void print2() {
		System.out.println("===================");
		System.out.println("1. Age");
		System.out.println("2. Gender");
		System.out.println("3. Location");				
		System.out.println("4. Online spent time");
		System.out.println("5. Back");
		System.out.println("===================");
	}
	
	
	public static void select1() throws InputMismatchException{
		while(true) {
			print1();
			int choice2 = 0;
			String Custom = "";
			try {
				System.out.println();
				System.out.print("choose one: ");
				choice2 = sc.nextInt();
				}
				catch(InputMismatchException e){
					System.out.println(e);
				}
		
		if (choice2 == 1) {
			System.out.println("** Press 'end', if you want to exit ! **");
			System.out.println("ideal? likely? defect? end...");
			
			System.out.println();
			System.out.print("choose Custom: ");
			Custom = sc.next();
			
			switch(Custom) {  
			case "ideal":
				idealif();
				break;
			case "likely":
				likelyif();
				break;
			case "defect": 
				defectif();
				break;
			case "end":
				break;
			default:
				break;
			}
		}
				
		
		
		if (choice2 == 2) {
			System.out.println("** Press 'end', if you want to exit ! **");
			System.out.println("ideal? likely? defect? end..");
			
			System.out.println();
			System.out.print("choose one: ");
			Custom = sc.next();
		
			switch(Custom) {  
			case "ideal":
				System.out.println(id1);
				break;
			case "likely":
				System.out.println(lk1);
				break;
			case "defect": 
				System.out.println(df1);
				break;
			case "end":
				break;
			default:
				break;
			}
		}
		
		
		if(choice2 == 3) {
			System.out.println("** Press 'end', if you want to exit ! **");
			System.out.println("ideal? likely? defect?... or end..?");
			
			try {
			System.out.println();
			System.out.print("choose Custom: ");
			Custom = sc.next();
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}	
		
			switch(Custom) {  
			case "ideal":
				idealif();
				break;
			case "likely":
				likelyif();
				break;
			case "defect": 
				defectif();
				break;
			case "end":
				break;
			default:
				break;
			}
		
		}
		if(choice2 == 4) {
			break;
		}
	break;
	}
}
	public static void select2() {
		System.out.println("**Press -1, if you want to exit!**");
		System.out.println("How many do you have Customer for segmentation ?");
		int choice2;
		int i;
		choice2 = sc.nextInt();
		Customer ct[] = new Customer[choice2];
		
		for(i = 0; i < ct.length; i++) {
			ct[i] = new Customer();
		
			while(i <choice2) {
				System.out.println("Customer "+ (i + 1) + " info.");
				print2();
				
				int choice = 0;
				System.out.print("choose one: ");
				choice = sc.nextInt();
				if (choice == 1) {
					
					System.out.print("input Minimum Age : ");
					ct[i].minage = sc.nextInt();
					System.out.print("input Maximum Age : ");
					ct[i].maxage = sc.nextInt();
					continue;
				}
				else if (choice == 2) {
					System.out.print("input Gender : ");
					ct[i].gender = sc.next();
					continue;
				}
				else if (choice == 3) {
					System.out.print("input location : ");
					ct[i].location = sc.next();
					continue;
				}
				else if (choice == 4) {
					System.out.print("Online spent time :");
					ct[i].time = sc.nextInt();
				}
				else if(choice == -1){
					break;
				}
				else {
					break;
				}
			}
		
		}
		while(true) {
			print1();
			System.out.println();
			System.out.println("choose one : ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				select2();
				break;
			}
			else if (choice == 2) {
				for(i = 0; i < ct.length; i++) {
					System.out.println(i + 1 + "¹øÂ° °í°´ :  " + ct[i]);
				}
				continue;
			}
			else if (choice == 3) {
				select2();
				break;
			}
			else if (choice == 4) {
				break;
			}
		}
		
	}
	
	
	public static void idealif() throws InputMismatchException{
		while(true) {
			int choice2 = 0;
			print2();
				
			System.out.println();
			System.out.print("choose one: ");
			choice2 = sc.nextInt();
			try {	
			if(choice2 == 1) {
				System.out.print("input Minimum Age : ");
				id1.minage = sc.nextInt();
				System.out.print("input Maximum Age : ");
				id1.maxage = sc.nextInt();
				continue;
				
			}
			else if(choice2 == 2) {
				System.out.print("input Gender : ");
				id1.gender = sc.next();
				continue;
				
			}
			else if(choice2 == 3) {
				System.out.print("input location : ");
				id1.location = sc.next();
				continue;
				
			}
			else if(choice2 == 4) {
				System.out.print("Online spent time : ");
				id1.time = sc.nextInt();
				continue;
				
			}
			else if(choice2 == 5) {
				select1();
				break;
			}
			break;
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
		
		}
		
			
	}


	
	public static void likelyif() {
		while(true) {
			int choice2 = 0;
			print2();
				
			try {
			System.out.println();
			System.out.print("choose one: ");
			choice2 = sc.nextInt();
					
			if(choice2 == 1) {
				System.out.print("input Minimum Age : ");
				lk1.minage = sc.nextInt();
				System.out.print("input Maximum Age : ");
				lk1.maxage = sc.nextInt();
				continue;
			}
			else if(choice2 == 2) {
				System.out.print("input Gender : ");
				lk1.gender = sc.next();
				continue;
				
			}
			else if(choice2 == 3) {
				System.out.print("input location : ");
				lk1.location = sc.next();
				continue;
				
			}
			else if(choice2 == 4) {
				System.out.print("Online spent time : ");
				lk1.time = sc.nextInt();
				continue;
				
			}
			else if(choice2 == 5) {
				select1();
				break;
			}
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
		
		}
	}
	
	
	
	public static void defectif() throws InputMismatchException{
		while(true) {
		int choice2 = 0;
			print2();
		
			try {
			System.out.println();
			System.out.print("choose one: ");
			choice2 = sc.nextInt();
				
			if(choice2 == 1) {
				System.out.print("input Minimum Age : ");
				df1.minage = sc.nextInt();
				System.out.print("input Maximum Age : ");
				df1.maxage = sc.nextInt();
				continue;
				
			}
			else if(choice2 == 2) {
				System.out.print("input Gender : ");
				df1.gender = sc.next();
				continue;
			}
			else if (choice2 == 3) {
				System.out.print("input location : ");
				df1.location = sc.next();
				continue;
			}
			else if (choice2 == 4) {
				System.out.print("Online spent time : ");
				df1.time = sc.nextInt();
				continue;
			}
			else if (choice2 == 5) {
				select1();
				break;
			}
		
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
		
		}
	}
									
}
		
		
			
		
	
	
	

	


