package org.lessons.java.springlamiapizzeriacrud.repository;

import org.lessons.java.springlamiapizzeriacrud.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
    List<Pizza> findByNameContainingIgnoreCase(String myName);

    // metodo per cercare una pizza che ha un name esistente sul DB
    Optional<Pizza> findByName(String name);


    //Iterable<Pizza> findAll(boolean isDeleted);
}
