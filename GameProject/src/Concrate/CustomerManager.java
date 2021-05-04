package Concrate;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerCheckService customerCheckService;
	
	public CustomerManager (CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	

	@Override
	public void add(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" Kayd�n�z olu�turuldu.");
			
		}else {
			System.out.println("Malesef kayd�n�z olu�turulamad�.");
		}
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+customer.getLastName()+" Kayd�n�z silinmi�tir fakat bizden iyisini de bulamazs�n�z.");
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+customer.getLastName()+" bilgileriniz g�ncellendi.");
		
		
	}

}
