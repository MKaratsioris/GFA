package Minecraft;

public class Lava extends Block {

    private boolean mudToBrick;
    private boolean iceToAir;

    public Lava() {
        this.type = ElementType.LAVA.toString().toLowerCase();
        this.color = "yellow";
        this.lightTransmission = 170;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"mud", "brick", "glass", "ice", "air", "glowstone"};
    }

    @Override
    public void transformBlock(Block block) {
        if (block.type.equals("mud")) {
            block.type = ElementType.BRICK.toString().toLowerCase();
            block.color = "rgb: (144, 76, 42)";
            block.lightTransmission = 0;
            block.canBeCrossed = false;
            block.blocksPermitted = new String[]{"mud", "glass", "air", "door", "window"};
            mudToBrick = true;
        } else if (block.type.equals("ice")) {
            block.type = ElementType.AIR.toString().toLowerCase();
            block.color = "transparent";
            block.lightTransmission = 100;
            block.canBeCrossed = true;
            block.blocksPermitted = new String[]{"mud", "brick", "glass", "door", "window", "gold"};
            iceToAir = true;
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
        } else if (mudToBrick) {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + this.lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Has transformed a block of type mud to brick";
        } else if (iceToAir) {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + this.lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Has transformed a block of type ice to air";
        } else {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Made no transformation.";
        }
        System.out.println(print);
    }


}
