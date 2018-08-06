package blockbusterassignment;

import java.sql.Date;
import java.time.LocalDate;

public class Customer {

	private String name;
	private LocalDate dateOfBirth;
	private String Address;
	private MembershipCard idCard;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
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
		Customer other = (Customer) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public Customer(String name, LocalDate dateOfBirth, String address) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		Address = address;
	}


	public MembershipCard getIdCard() {
		return idCard;
	}


	public void setIdCard(MembershipCard idCard) {
		this.idCard = idCard;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", dateOfBirth=" + dateOfBirth + ", Address=" + Address + ", idCard=" + idCard
				+ "]";
	}


	
}
