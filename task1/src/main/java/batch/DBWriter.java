package batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.Employee;
import repository.EmployeeRepository;

@Component
public class DBWriter implements ItemWriter<Employee> {

    private static final Logger logger = LoggerFactory.getLogger(DBWriter.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(Chunk<? extends Employee> employees) throws Exception {
        logger.info("Data Saved for Employees: {}", employees);
        employeeRepository.saveAll(employees);
    }

	
}
