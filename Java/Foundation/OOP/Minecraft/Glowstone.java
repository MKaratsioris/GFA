package Minecraft;

public class Glowstone extends Block {

    private boolean glassToGold;

    public Glowstone() {
        this.type = ElementType.GLOWSTONE.toString().toLowerCase();
        this.color = "white";
        this.lightTransmission = 300;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"glass", "ice", "air", "lava"};
    }

    @Override
    public void transformBlock(Block block) {
       if (block.type.equals("glass")) {
           block.type = "gold";
           block.lightTransmission = 160;
           glassToGold = true;
       }
    }

    @Override
    public void printStatus() {
        String print = "";
        if (glassToGold) {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + this.lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Has transformed a block of type glass to gold";
        } else {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Made no transformation.";
        }
        System.out.println(print);
    }
}