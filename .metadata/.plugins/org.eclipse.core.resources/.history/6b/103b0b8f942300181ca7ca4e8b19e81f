package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	public void insert(Employee e)
	{
		template.update("insert into employee values(?,?,?)", new Object[]{e.getEmpId(),e.getEmpName(),e.getDesignation(),e.getSalary()});
	}
	public void delete(int Id)
	{
		
		template.update("delete * from employee where id=EmpId ",Id);	
	}
	public void Update(int Id)
	{
		template.update("insert into employee values(?,?,?)where id=EmpId",Id);
	}
	public List<Employee> display()
	{
		List<Employee>list=template.query("select * from Employee",new EmployeeRowMapper() );
		return list;
	}
}
