package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import Atmecs.xlsread.read;

public class Main_menu {
	public static void main(String[]args) throws SQLException {

		
		System.out.println("Please select below Option \n "
				+ "1: execute selection query \n "
				+ "2: execute insertion query \n "
				+ "3: execute deletion query \n "
				+ "4: Read xlsx files\n "
				);
		Scanner scanner= new Scanner(System.in);
		int choose=scanner.nextInt();
		switch(choose)
		{
		case 1: new Fetch().fetchData();
		break;
		
		case 2: new Insert().insert();
		break;
		
		case 3: new Delete().deleteData();
		break;
		
		case 4: new read().reading();
		         
		
		
		}
	}

	}


