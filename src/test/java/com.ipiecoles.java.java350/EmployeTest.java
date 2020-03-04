package com.ipiecoles.java.java350;

import com.ipiecoles.java.java350.model.Employe;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

public class EmployeTest {

    @Test
    public void testCheckEmployNow() {
        LocalDate now = LocalDate.now();
        Employe employe = new Employe();
        employe.setDateEmbauche(now);

        int nb = employe.getNombreAnneeAnciennete();

        Assertions.assertThat(nb).isEqualTo(0);
    }

    @Test
    public void testCheckEmployMinus1r() {
        LocalDate now = LocalDate.ofYearDay(2019,1);
        Employe employe = new Employe();
        employe.setDateEmbauche(now);

        int nb = employe.getNombreAnneeAnciennete();

        Assertions.assertThat(nb).isEqualTo(1);
    }

    @Test
    public void testCheckEmployNull() {
        LocalDate now = null;
        Employe employe = new Employe();
        employe.setDateEmbauche(now);

        int nb = employe.getNombreAnneeAnciennete();

        Assertions.assertThat(nb).isEqualTo(0);
    }

}