package com.example.Mains.Repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.Mains.entities.users;
import java.util.List;
@Repository
public interface Repo extends JpaRepository<users,Integer>{
  @Query(value="select * from user",nativeQuery=true)
  List<users> fetchAll();
  @Query(value="select * from user where Name=:n",nativeQuery=true)
  public List<users> findByName(@Param("n") String name);
}