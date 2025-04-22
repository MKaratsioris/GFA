package Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Wall {

    List<Block> wall;

    public Wall(){
        wall = new ArrayList<>();
    }

    public void placeBlock(Block block) {
        if (wall.size() == 0) {
            wall.add(block);
        } else {
            for (int i = 0; i < block.blocksPermitted.length; i++) {
                if(wall.get(wall.size()-1).type.equals(block.blocksPermitted[i])) {
                    wall.add(block);
                    if (block.type.equals("glowstone") || block.type.equals("lava") || block.type.equals("ice")) {
                        wall.get(wall.size()-1).transformBlock(wall.get(wall.size()-2));
                    }
                }
            }
        }
    }

    public void printStatus() {
        for (Block block : wall) {
            block.printStatus();
            System.out.println();
        }
    }

    public int calculateLightTransmission() {
        int total = 0;
        for (Block block : wall) {
            total += block.lightTransmission;
        }
        total /= wall.size();
        return total;
    }

    public static void main(String[] args) {

        Wall wallOfBlocks = new Wall();

        wallOfBlocks.placeBlock(new Air());
        wallOfBlocks.placeBlock(new Brick("dark gray"));
        wallOfBlocks.placeBlock(new Door("black", 60, 2, "Mordor"));
        wallOfBlocks.placeBlock(new Glass(80));
        wallOfBlocks.placeBlock(new Glowstone());
        wallOfBlocks.placeBlock(new Window("white", 70, true, 1, "Liliput"));
        wallOfBlocks.placeBlock(new Window("light-gray", 90, true, 2, "Asgard"));
        wallOfBlocks.placeBlock(new Mud());
        wallOfBlocks.placeBlock(new Gold(50));
        wallOfBlocks.placeBlock(new Lava());
        wallOfBlocks.placeBlock(new Glowstone());
        wallOfBlocks.placeBlock(new Ice());
        wallOfBlocks.placeBlock(new Lava());
        wallOfBlocks.placeBlock(new Gold(50));
        wallOfBlocks.placeBlock(new Ice());

        System.out.print("Light transmitted: ");
        System.out.println(wallOfBlocks.calculateLightTransmission());
        System.out.println();
        wallOfBlocks.printStatus();

    }

}
