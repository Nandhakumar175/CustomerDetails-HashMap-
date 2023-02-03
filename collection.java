package project;

//"Nandha,mnandhakumar@gmail.com,6997,9025810374,savings"
//orathanadu,thanjavur,Tamilnadu,India
//ashok nagar,Thanjavur,Tamilnadu,India
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class collection {

	public static void main(String[] args) {
		collection aaa = new collection();
		aaa.mydetails();
	}

	public void mydetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer details(Name,mail,pin,number,save):");

		String c1 = scan.nextLine();

		String[] details = c1.split(",");

		System.out.println(Arrays.toString(details));
		if (details.length != 5) {
			System.out.println("Details is missing");
			mydetails();
		}

		else {
			System.out.println("continue");

		}
		System.out.println("Enter the address 1(Taluk,District,State,India):");

		String add1 = scan.nextLine();
		String[] address = add1.split(",");

		System.out.println(Arrays.toString(address));
		if (address.length != 4) {
			System.out.println("Address is missing");
			mydetails();

		} else {
			System.out.println("continue");

		}

		System.out.println("Enter the address 2");

		String add2 = scan.nextLine();
		String[] address2 = add2.split(",");

		System.out.println(Arrays.toString(address2));
		if (address2.equals("No")) {

			System.out.println(c1);
			HashMap<String, String> customer = new HashMap<String, String>();
			customer.put(add1, add2);
			HashMap<String, HashMap<String, String>> cus = new HashMap<String, HashMap<String, String>>();
			cus.put(c1, customer);

			System.out.println("hashmap" + cus);

		} else {

			if (address2.length != 4) {

				System.out.println("Address is missing");
				mydetails();

			} else {

				System.out.println("continue");

			}
			HashMap<String, String> customer = new HashMap<String, String>();
			customer.put(add1, add2);
			HashMap<String, HashMap<String, String>> cus = new HashMap<String, HashMap<String, String>>();
			cus.put(c1, customer);

			System.out.println("hashmap" + cus);

		}
	}

}