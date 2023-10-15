package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Customer.Address;
import Customer.Customer;
import Customer.Preference;

public class DataUtils implements IDataUtils{

	@Override
	public Customer createCustomer(Customer c1) throws IOException {
		Customer c=new Customer();
		// TODO Auto-generated method stub
		c.setCid(UUID.randomUUID().toString());
		c.setName("Sagar");
		c.setEmail("sagar@gmail.com");
		c.setPhoneno("909086775");
		Address a=new Address();
		a.setRoomno("900");
		a.setLocality("Vishram Nagar");
		a.setCity("Surat");
		a.setState("Gujrat");
		a.setPin("755005");
		c.setAddress(a);
		Preference p=new Preference();
		p.setCustomerprfer("Travelling");
		p.setCustomeroutingprefer("Touring");
		List<Preference> prf =new ArrayList<>() ;
		prf.add(p);
		
		c.setPreference(prf);
		File file=new File("customer.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fro=new FileOutputStream(file);
		ObjectOutputStream oos =new ObjectOutputStream(fro);
		oos.writeObject(c);
		
		
		return c;
	}

	@Override
	public Customer readCustomer(String Id) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		File file=new File("customer.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Customer c=(Customer) ois.readObject();
		return c;
	}

	@Override
	public Customer updateCustomer(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DataUtils dt=new DataUtils();
		dt.createCustomer(null);
		
		Customer cust=dt.readCustomer("");
		System.out.println(cust.getName());
		System.out.println(cust.getEmail());
		
		
	}
}
