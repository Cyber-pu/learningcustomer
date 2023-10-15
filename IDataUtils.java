package utils;

import java.io.FileNotFoundException;
import java.io.IOException;


import Customer.Customer;

public interface IDataUtils {
	
	/**
	 * <h1>Its for CRUD operation (create,read,update,delete)</h1>
	 * 
	 * @author sagar
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 * 
	 */
	  
	
//	This is for creating customer data 
	public Customer createCustomer(Customer c) throws FileNotFoundException, IOException;
		
	
//	This is for read customer data by id
	public Customer readCustomer(String Id) throws FileNotFoundException, IOException, ClassNotFoundException;
	
	
	//This is update customer data by id
	public Customer updateCustomer(String Id);
	
	
//	This is delete customer data by id
	public Customer deleteCustomer(String Id);
	
	
		
		
	
}
