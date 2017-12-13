package uuid;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable

public class Change {

    private String path;

    private String diff;

    public Change() {}
    
    
    
    public Change(String path, String diff) {
		super();
		this.path = path;
		this.diff = diff;
	}



	@Column(name = "path", nullable = false)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(name = "diff", nullable = false)
    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }
}
