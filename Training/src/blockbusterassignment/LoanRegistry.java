package blockbusterassignment;

import java.time.LocalDate;
import java.util.Date;

public class LoanRegistry {

	private Film film;
	private LocalDate dateOfissued;
	private Customer customer;
	public LoanRegistry(Film film, LocalDate dateOfissued, Customer customer) {
		this.film = film;
		this.dateOfissued = dateOfissued;
		this.customer = customer;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public LocalDate getDateOfissued() {
		return dateOfissued;
	}
	public void setDateOfissued(LocalDate dateOfissued) {
		this.dateOfissued = dateOfissued;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "LoanRegistry [film=" + film + ", dateOfissued=" + dateOfissued + ", customer=" + customer + "]";
	}
	
	
	
	
}
