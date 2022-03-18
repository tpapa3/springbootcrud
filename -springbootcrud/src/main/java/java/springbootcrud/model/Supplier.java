package java.springbootcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static java.springbootcrud.model.Constants.SIZE_M;


@Entity
public class Supplier {
     
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
     private long id;
	 
         @NotBlank(message="companyName is madatory")
		 @Size(max=SIZE_M)
		 @Column(nullable=false)
		 private String companyName;
         
         @Size(max=SIZE_M)
		 private String firstName;
		 
         @Size(max=SIZE_M)
		 private String  lastName;
		 
		 @NotBlank(message="vatNumber is mandatory")
		 @Size(max=SIZE_M)
		 @Column(nullable=false)
		 private String vatNumber;
		 
		 @Size(max=SIZE_M)
		 private String irsOffice;
		 
		 @Size(max=SIZE_M)
		 private String zipCode;
		 
		 @Size(max=SIZE_M)
		 private String city;
		 
		 @Size(max=SIZE_M)
		 private String country;
		 
       public Supplier() {
    	   
       }
	 
	 public Supplier(long id, String companyName, String firstName, String lastName, String vatNumber,
				String irsOffice, String zipCode, String city, String country) {
			super();
			this.id = id;
			this.companyName = companyName;
			this.firstName = firstName;
			this.lastName = lastName;
			this.vatNumber = vatNumber;
			this.irsOffice = irsOffice;
			this.zipCode = zipCode;
			this.city = city;
			this.country = country;
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getIrsOffice() {
		return irsOffice;
	}

	public void setIrsOffice(String irsOffice) {
		this.irsOffice = irsOffice;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
