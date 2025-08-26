package exercises;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HrExercisesTest {

    @Test
    public void testGradingStudents() {
        List<Integer> grades = List.of(73, 67, 38, 33);
        List<Integer> expected = List.of(75, 67, 40, 33);
        assertEquals(expected, HrExercises.gradingStudents(grades));
    }

    @Test
    public void testCountApplesAndOranges() {
        List<Integer> apples = List.of(2,3,-4);
        List<Integer> oranges = List.of(3,-2,-4);
        HrExercises.countApplesAndOranges(7, 10, 4, 12, apples, oranges);
        assertEquals("1 2", HrExercises.countApplesAndOranges(7, 10, 4, 12, apples, oranges));
    }
}
