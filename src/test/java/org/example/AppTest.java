package org.example;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;

import static org.example.Main.parseXML;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class AppTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Тестирование начинается!\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Тестирование завершено!");
    }

    @Test
    public void parseCSV_Positive() {
        // given:
        String fileName = "data.xml";
        String expected = "[Employee{id=1, firstName='John', lastName='Smith', country='USA', age=25}, " +
                "Employee{id=2, firstName='Ivan', lastName='Petrov', country='RU', age=23}]";
        // when:
        String result = String.valueOf(parseXML(fileName));
        // then:
        assertThat(expected, equalTo(result));
    }

    @Test
    public void parseXML_Positive() {
        // given:
        String document = "data.xml";
        String expected = "[Employee{id=1, firstName='John', lastName='Smith', country='USA', age=25}, " +
                "Employee{id=2, firstName='Ivan', lastName='Petrov', country='RU', age=23}]";
        // when:
        String result = String.valueOf(parseXML(document));
        // then:
        assertThat(expected, equalTo(result));

    }

    @Test
    @DisplayName("Проверка четных чисел")
    public void getEvenNumbers() {
        // given:
        List<Integer> intNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 15, 8, 23, 4);
        List<Integer> expected = Arrays.asList(2, 16, 32, 8, 4);
        // when:
        List<Integer> result = StreamNumbers.getEvenNumbers(intNumbers);
        // then:
        assertThat(expected, Matchers.is(result));
    }

    @Test
    @DisplayName("Проверка положительных чисел")
    public void getPositiveNumbers() {
        // given:
        List<Integer> intNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 15, 8, 23, 4);
        List<Integer> expected = Arrays.asList(1, 2, 5, 16, 32, 3, 15, 8, 23, 4);
        // when:
        List<Integer> result = StreamNumbers.getPositiveNumbers(intNumbers);
        // then:
        assertThat(expected, equalTo(result));

    }
}