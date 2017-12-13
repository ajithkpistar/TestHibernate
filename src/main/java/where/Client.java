package where;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.GenericGenerator;
@Entity
public class Client {
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	private Long id;

	private String name;

	@OneToMany(mappedBy = "client")
    @Filter(name="activeAccount", condition="active = :active")

	private List<ClientAccount> debitAccounts = new ArrayList<>();

/*	uncoment this to check @where annotation test
 * @OneToMany(mappedBy = "client")
	private List<ClientAccount> creditAccounts = new ArrayList<>();*/

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ClientAccount> getDebitAccounts() {
		return debitAccounts;
	}

	public void setDebitAccounts(List<ClientAccount> debitAccounts) {
		this.debitAccounts = debitAccounts;
	}

	/*public List<ClientAccount> getCreditAccounts() {
		return creditAccounts;
	}

	public void setCreditAccounts(List<ClientAccount> creditAccounts) {
		this.creditAccounts = creditAccounts;
	}
*/
}
