import java.io.*;
import java.util.ArrayList;

public class Database {

	private File document;
	private FileWriter output;
	private BufferedReader br;

	Database() throws IOException {
		document = new File("PersonDatabase.txt");
		document.createNewFile();

	}

	public void writePerson(Person myPerson) throws IOException {
		output = new FileWriter(document);

		output.write(myPerson.toString() + "\n");
		output.close();
	}

	public ArrayList<Person> readDatabase() throws IOException {
		String className;
		
		ArrayList<Person> aList = new ArrayList<Person>();
		String temp;

		br = new BufferedReader(new FileReader(document));
		temp = br.readLine();
		className = temp.substring(0, temp.indexOf(' '));
		System.out.println(temp);

		// System.out.println(className);

		temp = temp.substring(temp.indexOf('=') + 1);
		for (int i = 0; i < aList.size(); i++) {
			switch (className) {
			case "Person":
				aList.indexOf(i) = ArrayList<Person> aList ;
				break;

			case "Student":

				break;

			case "Employee":

				break;

			case "Faculty":

				break;

			case "Staff":

				break;

			default:
				System.out.println("error");
				break;
			}
		}
		br.close();

		return aList;
	}

	// } else if (myPerson instanceof Employee) {
	// System.out.println(((Employee) myPerson).getFirstName());
	// System.out.println(((Employee) myPerson).getLastName());
	// System.out.println(((Employee) myPerson).getSsn());
	// System.out.println(((Employee) myPerson).getPaymentAmount());

//		}

	// }
}
