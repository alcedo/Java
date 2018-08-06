package blockbusterassignment;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MembershipCard {
	private static int cardNumber=0;
	private Map<Film, LocalDate> issuedFilms;


	public MembershipCard(int cardNumber) {
		this.cardNumber=cardNumber;
		issuedFilms=new HashMap<>();
	}


	public int getCardNumber() {
		return cardNumber;
	}

	public void addIssuedFilms( Film issueFilm) {
		this.issuedFilms.put(issueFilm, LocalDate.now());
	}

	public void removeIssuedFilms( Film issueFilm) {
		this.issuedFilms.remove(issueFilm);
	}
	public LocalDate getDate(Film issueFilm) {
	     if(issuedFilms.containsKey(issueFilm))
	     {
	    	 return issuedFilms.get(issueFilm);
	     }
	     else
	     {
	    	 System.out.println("Invalid Film");
	    	 return null;
	     }
	}
	@Override
	public String toString() {
		return "MembershipCard [cardNumber=" + cardNumber + ", issuedFilms=" + issuedFilms + "]";
	}

}
