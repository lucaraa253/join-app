package com.training.spring;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        employee.setEmployeeName("Alex");
        System.out.println(employee.getEmployeeName());
        
        Employee employee2 = new Employee();
        employee2.setEmployeeName("Joel");
        System.out.println(employee2.getEmployeeName());
    }
}
