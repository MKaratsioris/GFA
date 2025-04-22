package views;

import models.Area;
import models.Direction;
import models.Hero;
import models.areaelements.Floor;
import models.areaelements.Tile;

import javax.swing.*;
import java.awt.*;

public class Board extends JComponent {

    private Hero hero;

    private Area area;

    private final int tileSize;

    public Board() {
        tileSize = 72;
        setPreferredSize(new Dimension(tileSize * 10, tileSize * 10 + 40));
        setVisible(true);
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        drawTiles(graphics);
        drawHero(graphics);
        drawStatistics(graphics);
    }

    private void drawTiles(Graphics graphics) {
        Tile[][] tiles = area.getTiles(1);
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                String image = tiles[j][i] instanceof Floor ? "img/floor.png" : "img/wall.png";
                /*
                Ternary operator (condition ? doIfTrue : else)  is the same as:
                if (tiles[j][i] instanceof Floor) {
                    image = "img/floor.png";
                } else {
                    image = "img/wall.png";
                }
                 */
                new PositionedImage(image, i * tileSize, j * tileSize).draw(graphics);
            }
        }
    }

    private void drawHero(Graphics graphics) {
        String heroImagePath = "";
        if (hero.getDirection() == Direction.UP) {
            heroImagePath = "img/hero-up.png";
        } else if (hero.getDirection() == Direction.DOWN) {
            heroImagePath = "img/hero-down.png";
        } else if (hero.getDirection() == Direction.LEFT) {
            heroImagePath = "img/hero-left.png";
        } else if (hero.getDirection() == Direction.RIGHT) {
            heroImagePath = "img/hero-right.png";
        }

        PositionedImage heroImage = new PositionedImage(heroImagePath, hero.getX() * tileSize, hero.getY() * tileSize);
        heroImage.draw(graphics);
    }

    private void drawStatistics(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 720, 720, 40);
        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font("Arial", Font.BOLD, 16));
        graphics.drawString("HP: 250", 20, 740);
    }
}