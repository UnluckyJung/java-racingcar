package study;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;


public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @Test
    void checkSizeOfSet() {
        assertThat(numbers.size()).isEqualTo(4);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains1(int i) {
        assertThat(numbers.contains(i)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "5:false"}, delimiter = ':')
    void contains3(int i, boolean expected) {
        assertThat(expected).isEqualTo(numbers.contains(i));
    }
}