package com.shubham.basic;

import java.lang.reflect.Array;


public class Display_Assignment {

	public static void main(String[] args) {
		String[][] data= {
				{"P101","Nokia Handset","Some Description","2000.0"},
				{"P102","Samsung Handset","Description","20000.0"},
				{"P103","Sony Ericsson Handset","Some Description","1500.0"},
				{"P104","LG Handset","Some Description","1000.0"}
				};
		String[] colNames= {"ID","Name","Description","Price"};
		int [ ]max= new int [colNames.length];
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				if(max[j]<data[i][j].length())
				{
					max[j]=data[i][j].length();
				}
			}
		}
		
		
		for(int i=0;i<colNames.length;i++)
		{
			System.out.print(" + ");
			for(int j=0;j<max[i];j++)
				System.out.print("-");
			
		}
		System.out.print(" +\n");
		for(int i=0;i<colNames.length;i++)
		{
			System.out.print(" | ");
			System.out.print(colNames[i]);
			int difflen=max[i]-colNames[i].length();
			for(int j=0;j<difflen;j++)
				System.out.print(" ");
			
		}
		System.out.print(" |\n");
		for(int i=0;i<colNames.length;i++)
		{
			System.out.print(" + ");
			for(int j=0;j<max[i];j++)
				System.out.print("-");
			
		}
		System.out.print(" +\n");
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(" | ");
				System.out.print(data[i][j]);
				int difflen=max[j]-data[i][j].length();
				for(int k=0;k<difflen;k++)
					System.out.print(" ");
			}
			System.out.print(" |\n");			
		}
		for(int i=0;i<colNames.length;i++)
		{
			System.out.print(" + ");
			for(int j=0;j<max[i];j++)
				System.out.print("-");
			
		}
		System.out.print(" +\n");
		
		
		
		///String temp= "--------";
		//for (int i=0;i<colNames.length;i++)
		//{
		//System.out.println("");
		//System.out.printf("+%-5s+%-30s+%20s+%-10s+",temp,temp,temp,temp);
		//System.out.println("");
			//System.out.printf("| %-5s | %-30s | %-20s |%-10s ",colNames[0],colNames[1],colNames[2],colNames[3]);
		//
		//System.out.println(" |");
		//System.out.printf("+%-5s+%-30s+%20s+%-10s+",temp,temp,temp,temp);
		//for(int i=0;i<data.length;i++)
		//{
		//	System.out.printf("| %-5s | %-30s | %-20s |%-10s ",data[i][0],data[i][1],data[i][2],data[i][3]);
		//	System.out.println(" |");
		//}
		//System.out.println("");
		//System.out.printf("+%-5s+%-30s+%20s+%-10s+",temp,temp,temp,temp);
		//System.out.println("");
	}
	
}
