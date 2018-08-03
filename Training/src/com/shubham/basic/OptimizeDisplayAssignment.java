package com.shubham.basic;

public class OptimizeDisplayAssignment {

	public static int [] max;
	public static String[][] data;
	public static String[] colNames;
	
	public static void maxLength()
	{
		max= new int [colNames.length];
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
	}
	
	public static void displayLine(char sep1,char sep2)
	{
		System.out.print(" ");
		for(int i=0;i<colNames.length;i++)
		{
			System.out.print(sep1+"-");
			for(int j=0;j<max[i];j++)
				System.out.print(sep2);
			System.out.print("-");
		}
		System.out.print(sep1+"\n");
	}
	public static void displayData(char sep1,char sep2,String []dataset)
	{
		for(int i=0;i<dataset.length;i++)
		{
			System.out.print(" "+sep1+" ");
			System.out.print(dataset[i]);
			int difflen=max[i]-dataset[i].length();
			for(int j=0;j<difflen;j++)
				System.out.print(sep2);
			
		}
		System.out.print(" "+sep1+"\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptimizeDisplayAssignment.data= new String [][]{
				{"P101","Nokia Handset","Some Description","2000.0"},
				{"P102","Samsung Handset","Description","20000.0"},
				{"P103","Sony Ericsson Handset","Some Description","1500.0"},
				{"P104","LG Handset","Some Description","1000.0"}
				};
		OptimizeDisplayAssignment.colNames= new String []{"ID","Name","Description","Price"};
		maxLength();
		displayLine('+','-');
		displayData('|',' ',colNames);
		displayLine('+','-');
		for(int i=0;i<data.length;i++)
		{
			displayData('|', ' ', data[i]);
		}
		displayLine('+','-');	
	}

}
