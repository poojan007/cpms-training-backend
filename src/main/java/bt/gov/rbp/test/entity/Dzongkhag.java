package bt.gov.rbp.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dzongkhag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String dzongkhagName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDzongkhagName() {
		return dzongkhagName;
	}
	public void setDzongkhagName(String dzongkhagName) {
		this.dzongkhagName = dzongkhagName;
	}
}
