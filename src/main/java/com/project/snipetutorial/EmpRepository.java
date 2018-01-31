package com.project.snipetutorial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepository extends CrudRepository<EmpBean, String> {


	} 


