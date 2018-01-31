package com.project.snipetutorial;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmpController {
	 
	    @Autowired  
	    private EmpService EmpService;   
	    @RequestMapping("/")  
	    public List<EmpBean> getAllUser(){  
	        return EmpService.getAllUsers();  
	    }     
	    @RequestMapping(value="/addUser", method=RequestMethod.POST)  
	    public void addUser(@RequestBody EmpBean EmpRecord){
	    	
	        EmpService.addUser(EmpRecord);  
	    }  
	    
	    
	    @RequestMapping(value="/user/{name}", method=RequestMethod.GET )	      
	    public EmpBean getUser(@PathVariable("name") String name){  
	        return EmpService.getUser(name);  
	        
	       
	    }  
	    @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)  
	    public void delete(@PathVariable("name") String name){  
	        EmpService.delete(name);

	    }
	    
	    @RequestMapping(value="/update/{name}", method=RequestMethod.PUT)  
	    public void update(@RequestBody EmpBean empRecord, @PathVariable String name){  
	        EmpService.update(empRecord, name);
}
}
