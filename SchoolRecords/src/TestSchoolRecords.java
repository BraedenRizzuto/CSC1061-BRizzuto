import java.io.IOException;

public class TestSchoolRecords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Database db= new Database();
		Person m = new Person();
		//m.setName("Braeden");
		db.writePerson(m);
		db.readDatabase();
	}

	
}
