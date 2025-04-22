package Minecraft;

public class Window extends Block {

    private int quality;
    private String producerName;

    public Window() {
    }

    public Window(String color, int lightTransmission, boolean canBeCrossed, int quality, String producerName) {
        super();
        this.type = ElementType.WINDOW.toString().toLowerCase();
        this.color = color;
        this.lightTransmission = lightTransmission;
        this.canBeCrossed = false;
        this.quality = quality;
        this.producerName = producerName;
        this.blocksPermitted = new String[]{"mud", "brick", "air", "door", "glowstone"};
    }

    @Override
    public void printStatus() {
        String print = "";
        if (canBeCrossed) {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + this.lightTransmission + "\n" +
                    "Can not be crossed." + "\n" +
                    "Manufactured by " + producerName + " on quality level " + quality + "\n";

        } else {
            print = "Block of type: " + type + "\n" +
                    "Has light transmission: " + lightTransmission + "\n" +
                    "Can be crossed." + "\n" +
                    "Manufactured by " + producerName + " on quality level " + quality;
        }
        System.out.println(print);
    }
}
