package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
public interface StudentData extends CrudRepository<Student, Integer> {
	
	List<Student> findByBranch(String branch);
	
	List<Student> findByidGreaterThan(int id);
	
	@Query("from Student where name=?1 order by branch")
	List<Student> findByBranchSorted(String branch);
}
