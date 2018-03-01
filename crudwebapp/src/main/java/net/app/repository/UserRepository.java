package net.app.repository;

import org.springframework.stereotype.Repository;

import net.app.entity.User;


import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
//    List<User> findByUserNameOrderDesc(String lastName);
}
