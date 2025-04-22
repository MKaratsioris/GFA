package Minecraft;

public class Gold extends Block {

    public Gold() {
    }

    public Gold(int lightTransmission) {
        this.type = ElementType.GOLD.toString().toLowerCase();
        this.color = "RGB: (255, 215, 0)";
        this.lightTransmission = lightTransmission;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"glowstone", "glass"};
    }
}
