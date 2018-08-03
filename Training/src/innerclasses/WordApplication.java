package innerclasses;

public class WordApplication//we don't want any other object to use print from word application we just want only print only for word appliation documents
{

		class InbuiltPrinter implements Printer{

			@Override
			public void print(String document) {
				// TODO Auto-generated method stub
				System.out.println("Code to print the "+document);
			}
			
		}
}
