package questionbank;

import java.util.List;
import java.util.Scanner;

public class ExamMain {
	public static void main(String[] args) {
		QuestionBank qbBank=new QuestionBank();
		Questions q1=qbBank.createNewQuestionsOptions("What is java", 2, "Java is a scripting language","Java is a programming language","Java is a Fruit","Java is a database");
		qbBank.addQuestion("Java", q1);
		
		Questions q2=qbBank.createNewQuestionsOptions("Which year java was founded", 3, "1993","1994","1995","1996");
		qbBank.addQuestion("Java", q2);
		
		Questions q3=qbBank.createNewQuestionsOptions("Which year .NET was founded", 4, "1999","2000","2001","2002");
		qbBank.addQuestion(".NET", q3);
		
		//Starting the exam
		List<Questions> q= qbBank.getQuestionsFor("Java");
		Scanner scanner=new Scanner(System.in);
		int score=0;
		int qno =0;
		for(Questions que:q)
		{
			System.out.println("Q No. "+(++qno)+". "+que.getQues());
			int ono=0;
			for(Options option: que.getOptions())
			{
				System.out.println(++ono+". "+option.getOption());
			}
			System.out.println("Enter the choise (1/2/3/4) : ");
			int choice=scanner.nextInt();
			if(que.getOptions().get(choice-1).isRightAnswer())
			{
				score++;
				System.out.println("Right Answer");
			}
			else
			{
				System.out.println("Wrong Answer");
			}
			System.out.println("Score :"+score);
		}
	}
}
