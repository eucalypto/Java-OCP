package de.papara.sudoku;

public class SudokuField {
    private NumberField[][] numberFields = new NumberField[9][9];

    public SudokuField() {
        for (NumberField[] row : numberFields) {
            for (NumberField numberField : row) {
                numberField = new NumberField();
            }
        }
    }
}
