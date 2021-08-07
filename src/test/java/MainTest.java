import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static Stream<Arguments> params() {
        List<Arguments> arrrays = new ArrayList<>();
        arrrays.add(Arguments.arguments(new int[] {1,2,3,4,5,6,7,8}, new int[] {5,6,7,8}));
        arrrays.add(Arguments.arguments(new int[] {1,1,1,4,1,1,1,1}, new int[] {1,1,1,1}));
        arrrays.add(Arguments.arguments(new int[] {3,3,3,6,6,7,8}, new int[] {}));

        return arrrays.stream();

    }

    @ParameterizedTest
    @MethodSource("params")
    void massTestArrayExample(int[] input, int[] output) {
        Assertions.assertArrayEquals(output, Main.arrayExample(input));
    }

    static Stream<Arguments> paramsForOneAndFour() {
        List<Arguments> arrays = new ArrayList<>();
        arrays.add(Arguments.arguments(new int[] {1,1,1,1,4,4,4,4}));
        arrays.add(Arguments.arguments(new int[] {1,1,1,3,4,4,4,4}));
        arrays.add(Arguments.arguments(new int[] {2,2,2,6,6,7,7,7,8,6}));
        return arrays.stream();
    }

    @ParameterizedTest
    @MethodSource("paramsForOneAndFour")
    void oneAndFour(int[] input) {
        Assertions.assertTrue(Main.oneAndFour(input));
    }
}