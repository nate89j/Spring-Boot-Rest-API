/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.model.Person;
import static com.sun.tools.javac.tree.TreeInfo.name;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import static org.apache.tomcat.jni.Lock.name;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nat;
 */
@Repository("postgres")
public class PersonDataAccessService implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "From Postgres DB"));

    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonBYId(UUID id, Person person) {
        return 0;
    }

}
