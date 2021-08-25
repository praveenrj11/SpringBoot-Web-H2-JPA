package com.example.demo.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Tech;

import java.util.List;

public interface TechDAO extends CrudRepository<Tech, Integer>
{

	List<Tech> findBySub(String sub);
	
	List<Tech> findByIdGreaterThan(int id);
	
	@Query("from Tech where sub=?1 order by name")
	List<Tech> findBySubSorted(String sub);

}
