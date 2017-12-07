package superclass;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity(name = "DebitAccount")
@DiscriminatorValue( "Debit" )

public class DebitAccount extends Account{
	private BigDecimal overdraftFee;

    public DebitAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(BigDecimal overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
}
