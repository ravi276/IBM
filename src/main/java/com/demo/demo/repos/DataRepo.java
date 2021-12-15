package com.demo.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo.model.employee;
@Repository
public interface DataRepo extends JpaRepository<employee, Integer> {

}
