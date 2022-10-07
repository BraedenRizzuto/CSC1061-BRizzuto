import java.io.IOException;
import java.util.ArrayList;

public class TestSchoolRecords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Person> aList;
		Person myPeople[] = new Person[6]; 
		Database db= new Database();
		Person m = new Person();
		//m.setName("Braeden");
		db.writePerson(m);
		db.writePerson(new Staff());
		aList= db.readDatabase();
		for (Person myP:aList)
		{
			System.out.println( myP.toString());
		}
		
	}

	
}
