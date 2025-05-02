package entity.map;

import util.Direction;

public class Island {
    int rowsCount;
    int columnsCount;

    Location[][] locations;

    public Island(int x, int y) {
        this.rowsCount = x;
        this.columnsCount = y;
        locations = new Location[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                locations[i][j] = new Location(i, j, this);
            }
        }
    }

    private boolean havingLocation(int currentX, int currentY, int directionX, int directionY) {
        int resultX = currentX + directionX;
        int resultY = currentY + directionY;
        return resultX >= 0 && resultX < rowsCount && resultY >= 0 && resultY < columnsCount;
    }

    public Location searchLocationToMove(Location location, Direction direction, int distance) {
        int startX = location.getX();
        int startY = location.getY();
        int[] directionMovement = directionCoordinate(direction);
        for (int i = 0; i < distance; i++) {
            if (havingLocation(startX, startY, directionMovement[0], directionMovement[1])) {
                startX += directionMovement[0];
                startY += directionMovement[1];
            } else {
                return locations[startX][startY];
            }
        }
        return locations[startX][startY];
    }

    private int[] directionCoordinate(Direction direction) {
        switch (direction) {
            case UP -> {
                return new int[]{0, 1};
            }
            case UP_LEFT -> {
                return new int[]{-1, 1};
            }
            case LEFT -> {
                return new int[]{-1, 0};
            }
            case DOWN_LEFT -> {
                return new int[]{-1, -1};
            }
            case DOWN -> {
                return new int[]{0, -1};
            }
            case DOWN_RIGHT -> {
                return new int[]{1, -1};
            }
            case RIGHT -> {
                return new int[]{1, 0};
            }
            case UP_RIGHT -> {
                return new int[]{1, 1};
            }
        }
        return new int[]{0, 0};
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public int getColumnsCount() {
        return columnsCount;
    }

    public Location[][] getLocations() {
        return locations;
    }
}
