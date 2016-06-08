import java.util.Scanner;

public class Employee {
	private String name;
	private double salary;
	private String SSN;
	static int numberEmployee;
	static double averageSalary;
	
	
	public Employee () {
		name = "no name yet";
		salary = 0;
		SSN = "no social security number yet";
	}
	
	public Employee (String name, double salary, String SSN) {
		this.name = name;
		this.salary = salary;
		this.SSN = SSN;
	}
	
	public boolean checkSSNLengthException(String strSSN) {
		if (strSSN.length() != 9) return false;
		for (int i = 0; i < strSSN.length(); i++) {
			if (strSSN.charAt(i) == ' ' || strSSN.charAt(i) == '_') return false;
		}
		return true;
	}
	
	public boolean checkSSNCharacterException(String strSSN) {
		for (int i = 0; i < strSSN.length(); i++) {
			if (!(strSSN.charAt(i) >= '0' && strSSN.charAt(i) <= '9')) return false;
		}
		return true;
	}
	
	public void readInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		setName(input.nextLine());
		System.out.print("Enter employee's salary: ");
		setSalary(input.nextDouble());
		
	
		boolean isContinue = true;
	
			try {
				System.out.print("Enter employee's SSN: ");
				String strSSN = input.nextLine();
				if (!checkSSNLengthException(strSSN)) 
					throw new SSNLengthException();
				
				else if (!checkSSNCharacterException(strSSN))
					throw new SSNCharacterException();
				
				else isContinue = false;
			}
			
			catch (SSNLengthException e) {
				System.out.println(e.getMessage());
				
			}
			
			catch (SSNCharacterException e) {
				System.out.println(e.getMessage());
			}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public static int getNumberEmployee() {
		return numberEmployee;
	}

	public static void setNumberEmployee(int numberEmployee) {
		Employee.numberEmployee = numberEmployee;
	}

	public static double getAverageSalary() {
		return averageSalary;
	}

	public static void setAverageSalary(double averageSalary) {
		Employee.averageSalary = averageSalary;
	}
	
	
}