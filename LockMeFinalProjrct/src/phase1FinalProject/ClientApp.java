package phase1FinalProject;

import java.io.IOException;
import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) throws IOException
	
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		LockMe.display();
		do 
		{
			//call displayMenu 
			LockMe.displayMenu();
			
			//Read input form user
			System.out.println("  \nEnter your choice : ");
			ch=Integer.parseInt(sc.nextLine());
					switch(ch)
					{
					case 1:LockMe.getAllfile();
					       break;
					case 2:LockMe.creatFile();
					       break;
					case 3:LockMe.deleteFile();
					       break;
					case 4:LockMe.searchFile();
					      break;
					case 5:System.exit(0);
					     break;
					default:System.out.println("Invalid option");
					       break;
					}
					
				
		}while(ch>0);
		
		
		
		sc.next();
		sc.close();
	}

}
