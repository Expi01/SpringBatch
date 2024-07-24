package batch;

import org.springframework.batch.item.adapter.ItemProcessorAdapter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import model.Employee;

@Component
public class Processor extends ItemProcessorAdapter<Employee, Employee> {

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();
	
	public Processor() {
		DEPT_NAMES.put("001", "Technology");
		DEPT_NAMES.put("002", "Operations");
		DEPT_NAMES.put("003", "Accounts");
	}
	
	@Override
	public Employee process(Employee employee) throws Exception {
		
		String deptCode = employee.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		employee.setDept(dept);

		System.out.println(String.format(deptCode, dept));
//		System.out.println(employee);
		
		return employee;
	}

}
