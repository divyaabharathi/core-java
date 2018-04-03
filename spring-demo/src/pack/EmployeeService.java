package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	public EmployeeDAO dao;
	public void insert(Employee e)
	{
	dao.insert(e);	
	}
	public void DeletebyId(int EmpId)
	{
		dao.delete(EmpId);
		
	}
	public void UpdatebyId(int EmpId)
	{
		dao.Update(EmpId);
	}
	public List<Employee> DisplayAll()
	{
		return dao.display();
	}
	

}
