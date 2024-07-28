package batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.adapter.ItemProcessorAdapter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import model.Employee;

@Component
public class Processor extends ItemProcessorAdapter<Employee, Employee> {

	private static final Logger logger = LoggerFactory.getLogger(Processor.class);

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

		logger.info("Converted deptCode {} to dept {}", deptCode, dept);
		return employee;
	}
}
