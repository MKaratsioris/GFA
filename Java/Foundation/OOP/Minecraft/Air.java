package Minecraft;

public class Air extends Block {

    public Air() {
        this.type = ElementType.AIR.toString().toLowerCase();
        this.color = "transparent";
        this.lightTransmission = 100;
        this.canBeCrossed = true;
        this.blocksPermitted = new String[]{"mud", "brick", "glass", "door", "window", "gold"};
    }
}
