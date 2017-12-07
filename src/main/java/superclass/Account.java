package superclass;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
@Entity(name = "Account")
@Inheritance(strategy = InheritanceType.JOINED)


public class Account {
		@GenericGenerator(name = "generator", strategy = "increment")
		@Id
		@GeneratedValue(generator = "generator")
	    private Long id;

	    private String owner;

	    private BigDecimal balance;

	    private BigDecimal interestRate;

	    
	    
	    
	    
	    public Account() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getOwner() {
	        return owner;
	    }

	    public void setOwner(String owner) {
	        this.owner = owner;
	    }

	    public BigDecimal getBalance() {
	        return balance;
	    }

	    public void setBalance(BigDecimal balance) {
	        this.balance = balance;
	    }

	    public BigDecimal getInterestRate() {
	        return interestRate;
	    }

	    public void setInterestRate(BigDecimal interestRate) {
	        this.interestRate = interestRate;
	    }
}
