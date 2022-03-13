package collections.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonApp {

	public PersonApp() {
	}

	public String findPerson(int personId) {

		if (PersonDB.db.containsKey(personId)) {
			return PersonDB.db.get(personId).getDetails();
		} else {
			return "No Person found";
		}
	}

	public List<String> listPersonByCity(String cityName) {

		List<String> persons = new ArrayList<String>();
		
		Set<Integer> keys = PersonDB.db.keySet();
		
		for (Integer key : keys) {
			Person p = PersonDB.db.get(key);
			if (p.getCity().equals(cityName))
				persons.add(p.getDetails());
		}

		return persons;
	}
	
	public String addPerson(Person p)
	{
		if(PersonDB.db.containsKey(p.getId()))
		{
			return "Person Already Exists";
		}
		else
		{
			PersonDB.db.put(p.getId(), p);
			return "Person Added";
		}
	}
}
