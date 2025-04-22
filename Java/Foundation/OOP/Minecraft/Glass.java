package Minecraft;

public class Glass extends Block {

    public Glass() {
        this.type = ElementType.GLASS.toString().toLowerCase();
        this.color = "transparent";
        this.lightTransmission = 99;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"mud", "brick", "ice", "air", "glowstone", "door"};
    }

    public Glass(int lightTransmission) {
        this.type = ElementType.GLASS.toString().toLowerCase();
        this.color = "transparent";
        this.lightTransmission = lightTransmission;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"mud", "brick", "ice", "air", "glowstone", "door"};
    }
}
