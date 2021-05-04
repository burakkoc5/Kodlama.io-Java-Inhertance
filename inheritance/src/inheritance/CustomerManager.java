package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " numaralý müþteri kaydedildi.");
		
	}
	
	//bulk insert
	public void addMutiple(Customer[] customers) {
		
		for(Customer customer : customers) {
			
			add(customer);
		}
		
	}

}
