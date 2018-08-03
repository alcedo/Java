package questionbank;

import java.util.List;

public class Questions {

	private String ques;
	private List<Options> options;

	public Questions(String ques) {
		super();
		this.ques = ques;
	}

	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<Options> getOptions() {
		return options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	}

}
