package blockbusterassignment;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop  {

	private int shopId;
	private Map<Film,Integer> stockFilms;
	//private Map<Film,Integer> loanFilm;
	private List<LoanRegistry> loanedFilms;
	
	public Shop(int shopId) {

		this.shopId = shopId;
		stockFilms =new HashMap<Film,Integer>();
		loanedFilms =new ArrayList<LoanRegistry>();
		
	}

	public void Borrow(Film film,Customer customer)
	{
		LoanRegistry borrow=new LoanRegistry(film, LocalDate.now(), customer);
		if(stockFilms.containsKey(film))
		{
			int copiesOfFilms=stockFilms.get(film);
			if(copiesOfFilms>0)
			{
				copiesOfFilms--;
				stockFilms.put(film, copiesOfFilms);
				loanedFilms.add(borrow);
				customer.getIdCard().addIssuedFilms(film);
			}
			else
			{
				System.out.println("Invalid Copies");
			}
		}
		else
			System.out.println("Invalid Film");
	}
	
	public void Return(Film film,Customer customer)
	{
	
		LocalDate currdate=LocalDate.now();
		LocalDate issuedate= customer.getIdCard().getDate(film);
		System.out.println(" Charges : "+(currdate.getDayOfMonth()-issuedate.getDayOfMonth()));
		customer.getIdCard().removeIssuedFilms(film);
		for(LoanRegistry registry:loanedFilms)
		{
			if(registry.getCustomer().equals(customer) && registry.getFilm().equals(film))
			{
				loanedFilms.remove(registry);
				break;
			}
		}
		int copiesOfFilms=stockFilms.get(film);
		stockFilms.put(film, ++copiesOfFilms);
		
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", stockFilms=" + stockFilms + ", loanedFilms=" + loanedFilms + "]";
	}



	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	public void addStocks(Film film,Integer noOfCopies)
	{
		stockFilms.put(film, noOfCopies);
	}
	
}
