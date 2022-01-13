package bt.gov.rbp.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gewog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String gewogName;

	@OneToOne
	private Dzongkhag dzongkhag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGewogName() {
		return gewogName;
	}

	public void setGewogName(String gewogName) {
		this.gewogName = gewogName;
	}

	public Dzongkhag getDzongkhag() {
		return dzongkhag;
	}

	public void setDzongkhag(Dzongkhag dzongkhag) {
		this.dzongkhag = dzongkhag;
	}
}
