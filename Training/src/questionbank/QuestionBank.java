package questionbank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {

	private Map<String, List<Questions>> qbank;
	public QuestionBank() {
		qbank=new HashMap<>();
		qbank.put("Java", new ArrayList<>());
		qbank.put(".NET", new ArrayList<>());
	}
	public Questions createNewQuestionsOptions( String question,int rightAnswer, String... options )
	{
		Questions q=new Questions(question);
		List< Options> l=new ArrayList<>();
		
		
		for(int i=0;i<options.length;i++)
		{
			boolean isRightAnswer= false;
			if(i==rightAnswer-1)
				isRightAnswer=true;
			Options o=new Options(options[i], isRightAnswer);
			l.add(o);
		}
		q.setOptions(l);
		return q;
		
	}

	public void addQuestion(String  subject,Questions question)
	{
		if(qbank.containsKey(subject))
		{
			List<Questions> q=qbank.get(subject);
			q.add(question);
		}
		else
		{
			qbank.put(subject, new ArrayList<>());
			List<Questions> q=qbank.get(subject);
			q.add(question);
		}

	}
	public List<Questions> getQuestionsFor(String subject)
	{
		if(qbank.containsKey(subject))
		{
			return qbank.get(subject);
		}
		else
		{
			return null;
		}
	}
	
}
