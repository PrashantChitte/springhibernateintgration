/**
 * 
 */
package demo.utility;
import javax.persistence.*;

/**
 * @author PrashantChitte
 *
 */
@Entity
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int personId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="place")
	private String place;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String name, String place) {
		super();
		this.personId = personId;
		this.name = name;
		this.place = place;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
}
