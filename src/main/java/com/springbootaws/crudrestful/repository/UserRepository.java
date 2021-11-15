package com.springbootaws.crudrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootaws.crudrestful.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}
