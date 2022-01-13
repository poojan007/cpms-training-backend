package bt.gov.rbp.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Village {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String villageName;
	@OneToOne
	private Gewog gewog;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public Gewog getGewog() {
		return gewog;
	}
	public void setGewog(Gewog gewog) {
		this.gewog = gewog;
	}
}
