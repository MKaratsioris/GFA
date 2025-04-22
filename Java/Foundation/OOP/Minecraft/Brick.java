package Minecraft;

public class Brick extends Block {

    public Brick() {
        this.type = ElementType.BRICK.toString().toLowerCase();
        this.color = "rgb: (144, 76, 42)";
        this.lightTransmission = 0;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"mud", "glass", "air", "door", "window"};
    }


    public Brick(String color) {
        this.type = ElementType.BRICK.toString().toLowerCase();
        this.color = color;
        this.lightTransmission = 0;
        this.canBeCrossed = false;
        this.blocksPermitted = new String[]{"mud", "glass", "air", "door", "window"};
    }
}

