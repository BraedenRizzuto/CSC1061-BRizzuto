import java.io.*;
import java.util.ArrayList;

public class Database {

	private File document;
	private FileWriter output;
	private BufferedReader br;

	Database() throws IOException {
		
		document = new File("PersonDatabase.txt");
		document.createNewFile();
		output = new FileWriter(document);
		output.close();
	}

	public void writePerson(Person myPerson) throws IOException {
		output = new FileWriter(document, true);

		output.write(myPerson.toString() + "\n");
		output.close();
	}

	public ArrayList<Person> readDatabase() throws IOException {
		String className;
		
		ArrayList<Person> aList = new ArrayList<Person>();
		String temp;

		br = new BufferedReader(new FileReader(document));
		
		
		// System.out.println(className);

		
		 while ((temp=br.readLine())!= null){
			 
			 className = temp.substring(0, temp.indexOf(' '));
				System.out.println(temp);
				temp = temp.substring(temp.indexOf('=') + 1);
				String name = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String adress = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String phoneNumber = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String emailAdress = temp.substring(0,temp.indexOf(']'));
				
			switch (className) {
			case "Person":
				aList.add(new Person( name, adress, phoneNumber, emailAdress));
				break;

			case "Student":
				temp = temp.substring(temp.indexOf('=') + 1);
				String status  = temp.substring(0);
				aList.add( new Student(name, adress, phoneNumber, emailAdress,status));
				
				break;

			case "Employee":
				temp = temp.substring(temp.indexOf('=') + 1);
				String office  = temp.substring(0,temp.indexOf(','));	
				temp = temp.substring(temp.indexOf('=') + 1);
				String salaryString = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String dateHired = temp.substring(0);
				double salary=Double.parseDouble(salaryString);
				
				aList.add(new Employee(name, adress, phoneNumber, emailAdress,office,salary,dateHired));
				break;
				
				
				
			case "Faculty":
				
				temp = temp.substring(temp.indexOf('=') + 1);
				String office1  = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String salaryString1 = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String dateHired1 = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String officeHrs  = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String rank = temp.substring(0);
				double salary1=Double.parseDouble(salaryString1);
				aList.add(new Faculty( name, adress,phoneNumber, emailAdress,office1, salary1,
						dateHired1, officeHrs, rank));
				break;
				

			case "Staff":
				temp = temp.substring(temp.indexOf('=') + 1);
				String office2  = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String salaryString2 = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String dateHired2 = temp.substring(0,temp.indexOf(','));
				temp = temp.substring(temp.indexOf('=') + 1);
				String title = temp.substring(0);	
				double salary2=Double.parseDouble(salaryString2);
				aList.add(new Staff( name, adress, phoneNumber, emailAdress, office2, salary2,
				 dateHired2, title));
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
