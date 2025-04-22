package Minecraft;

public class Block {

    protected String type;
    protected String color;
    protected int lightTransmission;
    protected boolean canBeCrossed;
    protected String[] blocksPermitted;
    protected boolean isTransformed;

    public Block() {
    }

    public Block(String type) {
        switch (type) {
            case "mud": new Mud(); break;
            case "glowstone": new Glowstone(); break;
            case "glass": new Glass(); break;
            case "lava": new Lava(); break;
            case "air": new Air(); break;
            case "window": new Window(); break;
            case "gold": new Gold(); break;
            case "ice": new Ice(); break;
            case "door": new Door(); break;
            case "brick": new Brick(); break;
            default: break;
        }
    }

    public void transformBlock(Block block) {
    }

    public boolean canPlaceAfter(Block block) {
        boolean can = false;
        for (String blockType : this.blocksPermitted) {
            if (block.type.equals(blockType)) {
                can = true;
                break;
            }
        }
        return can;
    }

    public void getTransmission() {
        System.out.println("Has light transmission: " + lightTransmission);
    }

    public void printStatus() {
        String print = "";
        if (canBeCrossed) {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + this.lightTransmission + "\n" +
                    "Can be crossed.";
        } else {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + lightTransmission + "\n" +
                    "Can not be crossed.";
        }
        System.out.println(print);
    }
}
