package com.Traini8.Training_Center.Controllers;

import java.sql.SQLSyntaxErrorException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Traini8.Training_Center.Models.Center;
import com.Traini8.Training_Center.Services.CenterService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/Api")
public class CenterController {
	private CenterService centerService;
	
	public CenterController(CenterService centerService) {
		this.centerService=centerService;
	}
    @RequestMapping(value = "/Add",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    //post mapping to add the new centers info 
	public ResponseEntity<Center> createCenterHandler(@RequestBody @Valid Center center){
		
		Center centerUpdated = centerService.AddCenterDetails(center);
		return new ResponseEntity<>(centerUpdated,HttpStatus.OK);
		
	}
    
    // this method will show us all the present centers info
    @GetMapping("/GetAllCenters")
	public ResponseEntity< List<Center>> GetAllcenters(){
    	List<Center> centres ;
    	try {
    		// if centers info is present this will print all the centers information 
    		centres = centerService.GetCenterDetails();
    	}
    	catch(Exception ex) {
    		// if there no center information empty  list will be printed 
    		centres = new ArrayList<Center>();
    	}
    	
		return new ResponseEntity<>(centres,HttpStatus.ACCEPTED);
	}
    
   

}
