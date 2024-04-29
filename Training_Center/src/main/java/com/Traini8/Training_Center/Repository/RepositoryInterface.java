package com.Traini8.Training_Center.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Traini8.Training_Center.Models.Center;
@Repository
public interface RepositoryInterface extends JpaRepository<Center,String>{

}
