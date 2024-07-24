package batch;


import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import model.Employee;
import repository.EmployeeRepository;

@Component
public class DBWriter implements ItemWriter<Employee> {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public void write(Chunk<? extends Employee> employee) throws Exception {
		
		System.out.println("Data Saved for Employees: " + employee);
		employeeRepository.saveAll(employee);
		
	}

}
