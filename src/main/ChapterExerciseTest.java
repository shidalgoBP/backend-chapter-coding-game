package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChapterExerciseTest {

    int nRobbersOne = 1;
    int nVaultsOne = 1;
    int[][] codesOne = new int[][]{
            {3, 1},
    };

    int nRobbersTwo = 4;
    int nVaultsTwo = 4;
    int[][] codesTwo = new int[][]{
            {3, 2},
            {4, 1},
            {7, 6},
            {7, 1},
    };

    int nRobbersThree = 2;
    int nVaultsThree = 4;
    int[][] codesThree = new int[][]{
            {3, 1},
            {3, 2},
            {4, 0},
            {4, 0},
    };

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

    @Test
    void resultOne() {
        assertEquals(250, ChapterExercise.result(nRobbersOne, nVaultsOne, codesOne));
    }

    @Test
    void resultTwo() {
        assertEquals(5000000, ChapterExercise.result(nRobbersTwo, nVaultsTwo, codesTwo));
    }

    @Test
    void resultThree() {
        assertEquals(1125, ChapterExercise.result(nRobbersThree, nVaultsThree, codesThree));
    }

    @Test
    void resultFour() {
        assertEquals(6515625, ChapterExercise.result(nRobbersFour, nVaultsFour, codesFour));
    }
}
