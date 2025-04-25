package org.example.battleship.model;

public record Coordinate(int column, int row) {
    Coordinate plus(final int length, final Direction direction){
        return switch(direction){
            case NORTH -> plusRow(length);
            case SOUTH -> plusRow(-length);
            case EAST -> plusColumn(length);
            case WEST -> plusColumn(-length);
        };
    }

    Coordinate plusColumn(final int column){
        return new Coordinate(this.column + column, this.row);
    }

    Coordinate plusRow(final int row){
        return new Coordinate(this.column, this.row + row);
    }
}
