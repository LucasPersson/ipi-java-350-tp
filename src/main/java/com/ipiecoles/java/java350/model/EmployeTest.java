package com.ipiecoles.java.java350.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EmployeTest {

    @Test
    public void testCheckEmployOfOneYear() {
        LocalDate now = LocalDate.now();
        Employe employe = new Employe();
        employe.setDateEmbauche(now);

        int nb = employe.getNombreAnneeAnciennete();

        Assertions.assertThat(nb).isEqualTo(0);
    }

}