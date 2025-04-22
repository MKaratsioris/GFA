package Minecraft;

public class Door extends Block {
    private int quality;
    private String producerName;

    public Door() {
    }

    public Door(String color, int lightTransmission, int quality, String producerName) {
        this.type = ElementType.DOOR.toString().toLowerCase();
        this.color = color;
        this.lightTransmission = lightTransmission;
        this.canBeCrossed = true;
        this.quality = quality;
        this.producerName = producerName;
        this.blocksPermitted = new String[]{"mud", "brick", "air", "window"};
    }

    @Override
    public void printStatus() {
        String print = "";
        if (canBeCrossed) {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + this.lightTransmission + "\n" +
                    "Can be crossed." + "\n" +
                    "Manufactured by " + producerName + " on quality level " + quality;

        }
        System.out.println(print);
    }

}

