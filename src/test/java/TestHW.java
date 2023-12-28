import org.example.Homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestHW {
    private Homework wh;

    @Test
    void testHomeworkContains(){
        //Given
        List<String> testList = Arrays.asList(new String[]{"11", "22", "33", "44", "55"});
        wh = new Homework();

        //When
        boolean test1 = wh.contains(testList, "11");
        boolean test2 = wh.contains(testList, "12");
        boolean test3 = wh.contains(testList, "22");
        boolean test4 = wh.contains(testList, "33");
        boolean test5 = wh.contains(testList, "44");
        boolean test6 = wh.contains(testList, "55");
        boolean test7 = wh.contains(testList, "56");

        //Then
        Assertions.assertEquals(test1, true);
        Assertions.assertEquals(test2, false);
        Assertions.assertEquals(test3, true);
        Assertions.assertEquals(test4, true);
        Assertions.assertEquals(test5, true);
        Assertions.assertEquals(test6, true);
        Assertions.assertEquals(test7, false);
        //Assertions.assertEquals(test1, true);
    }

    @Test
    void testHomeworkHasExactly(){
        wh = new Homework();
        //-------------------------------------------------------------------------
        //Given
        List<String> testList = Arrays.asList(new String[]{"November Rain"});

        //When
        boolean test1 = wh.hasExactly(testList, "November Rain");
        boolean test2 = wh.hasExactly(testList, "Civil War");

        //Then
        Assertions.assertEquals(test1, true);
        Assertions.assertEquals(test2, false);
        //-------------------------------------------------------------------------

        //-------------------------------------------------------------------------
        //Given 2
        testList = Arrays.asList(new String[]{"Civil War"});

        //When 2
        test1 = wh.hasExactly(testList, "November Rain");
        test2 = wh.hasExactly(testList, "Civil War");

        //Then 2
        Assertions.assertEquals(test1, false);
        Assertions.assertEquals(test2, true);
        //-------------------------------------------------------------------------

        //-------------------------------------------------------------------------
        //Given 3
        testList = Arrays.asList(new String[]{"November Rain", "November Rain"});

        //When 3
        boolean test3 = wh.hasExactly(testList, "November Rain");

        //Then 3
        Assertions.assertEquals(test3, false);
        //-------------------------------------------------------------------------

        //-------------------------------------------------------------------------
        //Given 4
        testList = Arrays.asList(new String[]{"Civil War", "Civil War"});

        //When 4
        test3 = wh.hasExactly(testList, "Civil War");

        //Then 4
        Assertions.assertEquals(test3, false);
        //-------------------------------------------------------------------------
    }

    @Test
    void testHomeworkUnique(){
        wh = new Homework();
        //-------------------------------------------------------------------------
        //Given
        List<String> testList = Arrays.asList(new String[]{"Rikilly", "Mirkhilly", "Hol'ka", "Arha", "Arha", "Mirkhilly"});
        List<String> trueUniqueList = Arrays.asList(new String[]{"Rikilly", "Mirkhilly", "Hol'ka", "Arha"}); // должно быть

        //When
        List<String> pullUniqueList = wh.unique(testList); // получили

        //Then
        for (String item : pullUniqueList) {
            Assertions.assertTrue(trueUniqueList.indexOf(item) > -1);
        }

        Assertions.assertFalse(testList.equals(trueUniqueList));
        //-------------------------------------------------------------------------

        //-------------------------------------------------------------------------
        //Given 2
        testList = Arrays.asList(new String[]{"1", "2", "3", "4", "4", "2"});
        trueUniqueList = Arrays.asList(new String[]{"1", "2", "3", "4"}); // должно быть

        //When 2
        pullUniqueList = wh.unique(testList); // получили

        //Then 2
        for (String item : pullUniqueList) {
            Assertions.assertTrue(trueUniqueList.indexOf(item) > -1);
        }

        Assertions.assertFalse(testList.equals(trueUniqueList));
        //-------------------------------------------------------------------------

        //-------------------------------------------------------------------------
        //Given 3
        testList = Arrays.asList(new String[]{"1", "2", "3", "4"});
        trueUniqueList = Arrays.asList(new String[]{"1", "2", "3", "4"}); // должно быть

        //When 3
        pullUniqueList = wh.unique(testList); // получили

        //Then 3
        for (String item : pullUniqueList) {
            Assertions.assertTrue(trueUniqueList.indexOf(item) > -1);
        }

        Assertions.assertTrue(testList.equals(trueUniqueList));
        //-------------------------------------------------------------------------

        //-------------------------------------------------------------------------
        //Given 4
        testList = Arrays.asList(new String[]{"Rikilly", "Mirkhilly", "Hol'ka", "Arha"});
        trueUniqueList = Arrays.asList(new String[]{"Rikilly", "Mirkhilly", "Hol'ka", "Arha"}); // должно быть

        //When 4
        pullUniqueList = wh.unique(testList); // получили

        //Then 4
        for (String item : pullUniqueList) {
            Assertions.assertTrue(trueUniqueList.indexOf(item) > -1);
        }

        Assertions.assertTrue(testList.equals(trueUniqueList));
        //-------------------------------------------------------------------------

    }
}


