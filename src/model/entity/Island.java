package model.entity;

public class Island {
    int rowsCount;
    int columnsCount;

    Location[][] locations =  new Location[rowsCount][columnsCount];

    public Island(int x, int y) {
        this.rowsCount = x;
        this.columnsCount = y;
    }
}
