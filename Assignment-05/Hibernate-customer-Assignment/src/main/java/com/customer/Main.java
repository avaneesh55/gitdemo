package com.customer;

public class Main {
    public static void main(String[] args) {
        CustomerDAO dao = new CustomerDAO();

        
        Customer customer = new Customer("AvaneeshSingh", "avaneesh@596.com", "456123756");
        
        dao.saveOrUpdate(customer);
        System.out.println("Customer created: " + customer);

        
        Customer retrievedCustomer = dao.getById(customer.getId());
        System.out.println("Retrieved customer: " + retrievedCustomer);

       
        retrievedCustomer.setName("thanujach");
        dao.saveOrUpdate(retrievedCustomer);
        System.out.println("Updated customer: " + retrievedCustomer);

       
        dao.delete(retrievedCustomer.getId());
        System.out.println("Customer deleted");

      
        Customer deletedCustomer = dao.getById(retrievedCustomer.getId());
        System.out.println("Deleted customer: " + deletedCustomer);
    }
}
