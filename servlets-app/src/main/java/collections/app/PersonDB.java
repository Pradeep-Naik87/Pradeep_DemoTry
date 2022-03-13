package collections.app;

import java.util.HashMap;
import java.util.Map;

public class PersonDB {

	static Map<Integer, Person> db;
	static {
		db = new HashMap<Integer, Person>();
		db.put(100, new Person(100, "Shantanu", "Hyderabad"));
		db.put(101, new Person(101, "John", "Hyderabad"));
		db.put(102, new Person(102, "Kalluram", "Bangalore"));
		db.put(103, new Person(103, "Pavan", "Pune"));
		db.put(104, new Person(104, "Pretham", "Noida"));
		db.put(105, new Person(105, "Tushar", "Bangalore"));
		db.put(106, new Person(106, "Varsha", "Pune"));
		db.put(107, new Person(107, "Tirumala", "Noida"));
		db.put(108, new Person(108, "Ranga", "Hyderabad"));
		db.put(109, new Person(1009, "Venkat", "Noida"));
	}
}