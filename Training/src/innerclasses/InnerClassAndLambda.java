package innerclasses;

import javax.swing.text.Document;
public class InnerClassAndLambda {

	public static void main(String[] args) {
		class InkjetPrinter implements Printer //more pupular when inner class is declared inside the function
		{

			@Override
			public void print(String document) {
				// TODO Auto-generated method stub
				System.out.println("Code to print the "+document);
			}
			
		}
		
		InkjetPrinter ip=new InkjetPrinter();
		ip.print("abc.txt");
		
		//Anonymous inner class
		Printer p=new Printer() {
			
			@Override
			public void print(String document) {
				// TODO Auto-generated method stub
				System.out.println("Code to print the "+document);
			}
		};
		p.print("shubham.txt");
		
		//Lambda Style -Anonymous functions/methods
		//datatype is optional
		Printer pr= (document)-> {
			System.out.println("Code to print "+document);
		};
		pr.print("ai.txt");
		//we can also write like this
		//Printer pr= d ->System.out.println("Code to print "+d);
		Printer p2= d ->System.out.println("Code to print "+d);
		p2.print("ai.txt");
	
		System.out.println("remove data in ");
		list.removeIf(str -> str.startsWith("J"));
		list.forEach(str -> System.out.println(str));
	}
}
