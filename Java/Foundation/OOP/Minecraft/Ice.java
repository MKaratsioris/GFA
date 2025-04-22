package Minecraft;

public class Ice extends Block {

    boolean lavaToGlass;

    public Ice() {
        this.type = ElementType.ICE.toString().toLowerCase();
        this.color = "transparent";
        this.lightTransmission = 97;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"mud", "brick", "glass", "lava", "air", "glowstone"};
    }

    @Override
    public void transformBlock(Block block) {
        if (block.type.equals("lava")) {
            block.type = ElementType.GLASS.toString().toLowerCase();
            block.color = "transparent";
            block.lightTransmission = 99;
            block.canBeCrossed = false;
            block.blocksPermitted = new String[]{"mud", "brick", "ice", "air", "glowstone", "door"};
            lavaToGlass = true;
            block.isTransformed = true;
        }
    }

    @Override
    public void printStatus() {
        String print = "";
        if (isTransformed) {
            if (canBeCrossed) {
                print = "Block of type: " + type + "\n" +
                        "Has light transmission: " + this.lightTransmission + "\n" +
                        "Can be crossed.";
            } else {
                print = "Block of type: " + type + "\n" +
                        "Has light transmission: " + lightTransmission + "\n" +
                        "Can not be crossed.";
            }
        } else if (lavaToGlass) {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + this.lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Has transformed a block of type lava to glass";
        } else {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Made no transformation.";
        }
        System.out.println(print);
    }

}
