import java.io.IOException;

public class TestSchoolRecords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Person myPeople[] = new Person[6]; 
		Database db= new Database();
		Person m = new Person();
		//m.setName("Braeden");
		db.writePerson(m);
		db.readDatabase();
	}

	
}
