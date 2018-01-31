package com.project.snipetutorial;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpService {
	@Autowired
	 private EmpRepository EmpRepository;  
	
	    public List<EmpBean> getAllUsers()
	    {  
	        List<EmpBean>EmpRecord = new ArrayList<>();  
	        EmpRepository.findAll().forEach(EmpRecord::add);  
	        return EmpRecord;  
	    }  
	    public EmpBean getUser(String name){  
	        return EmpRepository.findOne(name); 
	    }  
	    public void addUser(EmpBean EmpRecord){  
	        EmpRepository.save(EmpRecord);  
	    }  
	    public void delete(String name){  
	        EmpRepository.delete(name);  
	    }
		public void update(EmpBean empRecord, String name) {
					EmpRepository.save(empRecord);
		}  
	}  

