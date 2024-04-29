package com.Traini8.Training_Center.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Traini8.Training_Center.Models.Center;
import com.Traini8.Training_Center.Repository.RepositoryInterface;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CenterService {
	
	private RepositoryInterface repositoryinterface;
	
	public CenterService(RepositoryInterface repositoryinterface) {
		super();
		this.repositoryinterface = repositoryinterface;
	}
	 
	public Center AddCenterDetails(Center center){
		center.setCreatedOn(LocalDateTime.now());
		return repositoryinterface.save(center);
	} 
	public List<Center> GetCenterDetails(){
		return repositoryinterface.findAll();
	}
	
}
