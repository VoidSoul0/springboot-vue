package com.example.demo.dao;

import com.example.demo.entoty.Person;

import java.util.List;

public interface PersonDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> selectAll();
}
