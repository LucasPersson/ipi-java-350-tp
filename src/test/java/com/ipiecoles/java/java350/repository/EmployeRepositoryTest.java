package com.ipiecoles.java.java350.repository;

import com.ipiecoles.java.java350.model.Employe;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class EmployeRepositoryTest {

    @Autowired
    private EmployeRepository employeRepository;

    @BeforeEach
    @AfterEach
    public void setup(){
        employeRepository.deleteAll();
    }

    @Test
    void findLastMatricule() {
        Employe employe = new Employe("doe","joe","C12345", LocalDate.now(),1500.0,1,1.0);
        employeRepository.save(employe);

        String last = employeRepository.findLastMatricule();

        Assertions.assertThat(last).isEqualTo("12345");
    }

    @Test
    void findLastMatriculezEmploye() {
        //Given

        //When
        String last = employeRepository.findLastMatricule();

        Assertions.assertThat(last).isNull();
    }

    @Test
    void findByMatricule() {


    }

    @Test
    void avgPerformanceWhereMatriculeStartsWith() {
    }
}