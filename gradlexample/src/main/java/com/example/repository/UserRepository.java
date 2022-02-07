


package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Users;
@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
