package models;

import models.areaelements.Floor;
import models.areaelements.Tile;
import models.areaelements.Wall;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private List<Tile[][]> tiles;

    public Area() {
        tiles = new ArrayList<>();
        generateTiles();
    }

    private void generateTiles() {
        int[][] firstTiles =
                {
                        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0, 1, 1, 1, 1},
                        {0, 1, 1, 1, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 1, 1, 0, 1},
                        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1, 0, 1, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                        {0, 0, 1, 1, 1, 0, 0, 0, 1, 0}};

        tiles.add(generateTileMap(firstTiles));

        int[][] secondTiles =
                {
                        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0, 1, 1, 1, 1},
                        {0, 1, 1, 1, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 1, 1, 0, 1},
                        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1, 0, 1, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                        {0, 0, 1, 1, 1, 0, 0, 0, 1, 0}};
        tiles.add(generateTileMap(secondTiles));
    }

    @NotNull
    private static Tile[][] generateTileMap(int[][] firstTiles) {
        Tile[][] firstTileMap = new Tile[firstTiles.length][firstTiles.length];
        for (int i = 0; i < firstTiles.length; i++) {
            for (int j = 0; j < firstTiles[i].length; j++) {
                firstTileMap[i][j] = firstTiles[i][j] == 0 ? new Floor() : new Wall();
            }
        }
        return firstTileMap;
    }

    public Tile[][] getTiles(int index) {
        return tiles.get(index);
    }
}
