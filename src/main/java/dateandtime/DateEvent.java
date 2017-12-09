package dateandtime;

import java.time.Period;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class DateEvent {

	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
    private Long id;

    @Column(name = "`timestamp`")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    
    @Convert(converter = PeriodStringConverter.class)
    @Column(columnDefinition = "")
    private Period span;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Period getSpan() {
		return span;
	}

	public void setSpan(Period span) {
		this.span = span;
	}
    
    
    
    
    

}
