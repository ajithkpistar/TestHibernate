package any;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Column;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.AnyMetaDefs;
import org.hibernate.annotations.MetaValue;

@Entity
@Table(name = "property_holder")
public class PropertyHolder {

	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	private Long id;
	/* @Any(
		        metaDef = "PropertyMetaDef",
		        metaColumn = @Column( name = "property_type" )
		    )*/
	@Any(metaColumn = @Column(name = "ITEM_TYPE"))
    @AnyMetaDef(idType = "long", metaType = "string", 
            metaValues = { 
            		  @MetaValue(value = "S", targetEntity = StringProperty.class),
                      @MetaValue(value = "I", targetEntity = IntegerProperty.class)
       })
	@JoinColumn(name = "property_id")
	private Property property;

	public PropertyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	// Getters and setters are omitted for brevity

}