package com.javaconcept.java7.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {

		String fileName = "employee.ser";
		serializeObject(fileName);
		// convert object into byte stream,this stream can be tranferred from once jvm
		// to another,can be saved in file,Db,or transfered to other device.
		deserializeObject(fileName);// convert byte stream to object

	}

	private static void deserializeObject(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
			Object object = ois.readObject();
			Employee employee = (Employee) object;
			System.out.println("Employee Object is deserialized..");
			System.out.println("ID:" + employee.getId());
			System.out.println("Name:" + employee.getName());
			System.out.println("Email:" + employee.getEmail());
			System.out.println("Password:" + employee.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void serializeObject(String fileName) {
		Employee employee = new Employee();
		employee.setId(1001);
		employee.setName("KK");
		employee.setEmail("kishan.javatrainer@gmail.com");
		employee.setPassword("password");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
			oos.writeObject(employee);
			System.out.println("Employee Object is serialized..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
