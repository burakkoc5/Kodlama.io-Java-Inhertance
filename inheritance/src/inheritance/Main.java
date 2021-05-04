package inheritance;

public class Main {

	public static void main(String[] args) {


		IndividualCustomer burak = new IndividualCustomer();
		burak.customerNumber="12345";
		
		CorporateCustomer kodlamaio = new CorporateCustomer();
		kodlamaio.customerNumber="91234";
		
		UnionCustomer turkis = new UnionCustomer();
		turkis.customerNumber="52648";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {burak,kodlamaio,turkis};
		
		customerManager.addMutiple(customers);

	}

}
