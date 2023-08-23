package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	private int stid;
	private String stname;
	private String address;

	public Student() {
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int stid, String stname, String address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}

	public String toString() {
		return stid + " " + stname + " " + address;
	}

}

class SerializationMain {
	public static void main(String[] args) throws Exception {
		Student sourabh = new Student(45, "Sourabh", "Indore");
		Student nagesh=new Student(18,"Abhisekh","Indore");

		
//		Serialization
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		oos.writeObject(nagesh);
		oos.writeObject(sourabh);
		

		System.out.println("serialization process has done");

		oos.close();
		
		
		
//		DeSerialization
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		Student student = (Student)ois.readObject();
		
		System.out.println(student);

	}
}