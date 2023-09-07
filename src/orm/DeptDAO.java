package orm;

import java.util.List;

public interface DeptDAO {
	void save(Dept dept); //add department
	void update(Dept dept); //update department 
	void delete(Integer deptno); //delete department
	
	Dept findByDeptno(Integer deptno); //find department by DEPTNO
	List<Dept> getAll(); //get all department by DEPTNO
	
}
