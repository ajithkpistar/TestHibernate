package uuid;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.JoinColumn;


@Entity
public class Takla {

    @Id
    @GeneratedValue
    public UUID id;
	private String name;
	public Takla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

    @ElementCollection
    @CollectionTable(
        name="patch_change",
        joinColumns=@JoinColumn(name="patch_id")
    )
    @OrderColumn(name = "index_id")
    private List<Change> changes = new ArrayList<>();
    
    
    
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Change> getChanges() {
		return changes;
	}
	public void setChanges(List<Change> changes) {
		this.changes = changes;
	}
	
}
