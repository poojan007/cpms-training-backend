package bt.gov.rbp.test.dto;

public class UserRequest {

	private int id;
	private String name;
	private int age;
	private String gender;
	private int villageId;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public int getVillageId() {
		return villageId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setVillageId(int villageId) {
		this.villageId = villageId;
	}
}
