package com.lab11;
import java.util.ArrayList;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Manager manager1 = null;
		Employee employee1 = null;
		Employee employee2 = null;
		BufferedReader read = null;
		try {
			read = new BufferedReader(new FileReader("E:\\SumDU\\JavaL\\Lab11\\Manager.txt"));
			manager1 = new Manager(Integer.parseInt(read.readLine()), read.readLine(),
					read.readLine(), Double.parseDouble(read.readLine()));
			read = new BufferedReader(new FileReader(
					"E:\\SumDU\\JavaL\\Lab11\\Employee.txt"));

			employee1 = new Employee(Integer.parseInt(read.readLine()), read.readLine(),
					read.readLine(), Double.parseDouble(read.readLine()), manager1);

			employee2 = new Employee(Integer.parseInt(read.readLine()), read.readLine(),
					read.readLine(), Double.parseDouble(read.readLine()), manager1);

		} finally {
			if (read != null)
				read.close();
		}

		FileOutputStream fos = null;

		ObjectOutputStream out;

		FileInputStream fis = null;

		ObjectInputStream in;

		try {
			fos = new FileOutputStream("ManagerS");
			out = new ObjectOutputStream(fos);
			out.writeObject(manager1);

			fos = new FileOutputStream("EmployeeS");
			out = new ObjectOutputStream(fos);

			out.writeObject(employee1);
			out.writeObject(employee2);



			fis = new FileInputStream("EmployeeS");
			in = new ObjectInputStream(fis);
			Employee EmployeeS1 = (Employee) in.readObject();
			Employee EmployeeS2 = (Employee) in.readObject();

			fis = new FileInputStream("ManagerS");
			in = new ObjectInputStream(fis);
			Manager ManagerS1 = (Manager) in.readObject();

			System.out.println(EmployeeS1);
			System.out.println(EmployeeS2);
			System.out.println(ManagerS1);

		} finally {

			fis.close();
			fos.close();
		}
	}
}

