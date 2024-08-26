package com.vv.autowired_setter_injection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<String, String> {
}
