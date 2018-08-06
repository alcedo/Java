package blockbusterassignment;

public class Film {

	private String name;
	private int acceptedAge;
	
	
	public Film(String name, int acceptedAge) {

		this.name = name;
		this.acceptedAge = acceptedAge;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAcceptedAge() {
		return acceptedAge;
	}


	public void setAcceptedAge(int acceptedAge) {
		this.acceptedAge = acceptedAge;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acceptedAge;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (acceptedAge != other.acceptedAge)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Film [name=" + name + ", acceptedAge=" + acceptedAge + "]";
	}
	
}
