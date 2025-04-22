package Minecraft;

public class Mud extends Block {

    public Mud() {
        this.type = ElementType.MUD.toString().toLowerCase();
        this.color = "dark grey";
        this.lightTransmission = 0;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"brick", "air", "lava", "door", "window", "gold"};
    }
}
