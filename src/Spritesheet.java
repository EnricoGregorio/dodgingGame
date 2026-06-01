import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
    protected static BufferedImage spritesheet;

    protected static BufferedImage[] player;
    protected static BufferedImage[] obstacle;

    protected Spritesheet() {
        try {
            spritesheet = ImageIO.read(getClass().getResource("res/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        player = new BufferedImage[2];
        obstacle = new BufferedImage[3];

        player[0] = Spritesheet.getSprite(8, 6, 222, 186);
        player[1] = Spritesheet.getSprite(260, 6, 223, 186);

        obstacle[0] = Spritesheet.getSprite(20, 584, 225, 87);
        obstacle[1] = Spritesheet.getSprite(274, 584, 222, 87);
        obstacle[2] = Spritesheet.getSprite(20, 753, 225, 87);
    }

    private static BufferedImage getSprite(int x, int y, int width, int height) {
        return spritesheet.getSubimage(x, y, width, height);
    }
}
