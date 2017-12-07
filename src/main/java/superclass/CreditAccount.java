package superclass;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity(name = "CreditAccount")
@DiscriminatorValue( "Credit" )

public class CreditAccount extends Account {
	private BigDecimal creditLimit;

    public CreditAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }
}
