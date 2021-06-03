package test;

import main.ChapterExercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChapterExerciseTest {

    @Test
    void resultOne() {
        int nRobbersOne = 1;
        int nVaultsOne = 1;
        int[][] codesOne = new int[][]{
                {3, 1},
        };

        int actual = ChapterExercise.result(nRobbersOne, nVaultsOne, codesOne);
        int expected = 250;

        assertEquals(expected, actual);
    }

    @Test
    void resultTwo() {
        int nRobbersTwo = 4;
        int nVaultsTwo = 4;
        int[][] codesTwo = new int[][]{
                {3, 2},
                {4, 1},
                {7, 6},
                {7, 1},
        };

        int actual = ChapterExercise.result(nRobbersTwo, nVaultsTwo, codesTwo);
        int expected = 5000000;

        assertEquals(expected, actual);
    }

    @Test
    void resultThree() {
        int nRobbersThree = 2;
        int nVaultsThree = 4;
        int[][] codesThree = new int[][]{
                {3, 1},
                {3, 2},
                {4, 0},
                {4, 0},
        };

        int actual = ChapterExercise.result(nRobbersThree, nVaultsThree, codesThree);
        int expected = 1125;

        assertEquals(expected, actual);
    }

    @Test
    void resultFour() {
        int nRobbersFour = 5;
        int nVaultsFour = 20;
        int[][] codesFour = new int[][]{
                {6, 3},
                {7, 1},
                {4, 4},
                {8, 4},
                {3, 0},
                {4, 3},
                {8, 1},
                {3, 3},
                {5, 5},
                {7, 6},
                {6, 2},
                {5, 3},
                {5, 4},
                {7, 0},
                {7, 0},
                {8, 4},
                {6, 0},
                {6, 5},
                {3, 2},
                {4, 2},
        };

        int actual = ChapterExercise.result(nRobbersFour, nVaultsFour, codesFour);
        int expected = 6515625;

        assertEquals(expected, actual);
    }
}
