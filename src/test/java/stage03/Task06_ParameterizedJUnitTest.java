package stage03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class Task06_ParameterizedJUnitTest {

    public static List<Integer> removeDuplicate(List<Integer> list){
        Set<Integer> deDub = new HashSet<>(list);
        List<Integer> integers  = new ArrayList<>();
        integers.addAll(deDub);
        return integers;

    }


    public static Stream<Arguments> arrArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 2}, new Integer[]{1, 2, 3}),
                Arguments.of(new Integer[]{4, 4, 4}, new Integer[]{4}));
    }
    @ParameterizedTest
    @MethodSource("arrArguments")
    void testWithMethodSource(Integer[] arrDub, Integer[] arrDeDup) {
        List<Integer> before = Arrays.asList(arrDub);
        List<Integer> shouldDeDup = Arrays.asList(arrDeDup);
        List<Integer> newBefore = removeDuplicate(before);
        Assertions.assertEquals(shouldDeDup, newBefore);
    }



    @ParameterizedTest
    @CsvSource(value = {"1 2 3 2,1 2 3",
            "4 4 4,4"})
    public void test(String arrDub, String arrDeDub){
        System.out.println(arrDub);
        System.out.println(arrDeDub);
        List<Integer> listWithDuplicates = toListParseString(arrDub);
        List<Integer> resultShouldDeDup = toListParseString(arrDeDub);
        List<Integer> afterRemoveDup = removeDuplicate(listWithDuplicates);

        System.out.println(listWithDuplicates);
        System.out.println(resultShouldDeDup);
        System.out.println(afterRemoveDup);

        Assertions.assertEquals(resultShouldDeDup, afterRemoveDup);
    }

    public List<Integer> toListParseString(String arr){
        String[] words = arr.split(" ");
        List<Integer> arrInteger = new ArrayList<>();
        for (String word : words) {
            arrInteger.add(toInt(word));
        }
        return arrInteger;
    }
    public int toInt(String number){
        try{
            return Integer.parseInt(number);
        } catch (Exception e) {
            System.out.println("Ошибка при преобразовании числа");
        }
        return -999999999;
    }




}
