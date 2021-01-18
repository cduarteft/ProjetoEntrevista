package com.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.interview.model.Cliente;

@Repository
public interface ClienteEmprestimoRepository extends JpaRepository<Cliente, Long>{

	

	
}
