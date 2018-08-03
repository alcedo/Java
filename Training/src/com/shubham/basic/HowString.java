package com.shubham.basic;

public class HowString {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		String s3=new String("Java");//java uses string pool so that s1 and s2 are point at same location in heap
		String s4=new String("Java");// Here s3 and s4 is pointing to different location
		System.out.println(s1 == s2);
		System.out.println( s3 == s4);

		String s5 =s1.toUpperCase();
		String s6= "JAVA";
		System.out.println(s5==s6);

		String s7= "Java";
		String s8="World";
		String s10="JavaWorld";
		String s9=s7+s8;
		System.out.println(s9==s10);

		s9=(s7+s8).intern();
		System.out.println(s9==s10);


		String str="abcdefghasdfshgdhgfxgfxgfxbgxgxxafdgsagfdsasdfgsgdsfgdsgfdsfgdsfggfdsg3511184131368431350351fdsfgsdgfsgfddsgsdfgijklmnopqrstuvwxghmnfcgnsdgfsdxfsbfdsbfdsbdbdfgbbgdfgsfedgbskjhgfbsk,shgfsgns,bguegdsfbnvsdfvsghyz";

		//First version using String concatenation (String)

		String newstr=" ";
		long ms1=System.currentTimeMillis();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				newstr=newstr+str.charAt(j);
			}
		}

		long ms2=System.currentTimeMillis();
		System.out.println(newstr);
		System.out.println("Time taken is "+(ms2-ms1)+" ms");

		//Second Version (String Buffer)
		StringBuffer newbstr=new StringBuffer();
		ms1=System.currentTimeMillis();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				newbstr.append(str.charAt(j));
			}
		}

		ms2=System.currentTimeMillis();
		System.out.println(newbstr);
		System.out.println("Time taken is "+(ms2-ms1)+" ms");
		
		//Third Version (String Builder
				StringBuilder builstr=new StringBuilder();
				ms1=System.currentTimeMillis();
				for(int i=0;i<str.length();i++)
				{
					for(int j=0;j<=i;j++)
					{
						newbstr.append(str.charAt(j));
					}
				}

				ms2=System.currentTimeMillis();
				System.out.println(newbstr);
				System.out.println("Time taken is "+(ms2-ms1)+" ms");

	}
}
