package nl.tudelft.jpacman;

import nl.tudelft.jpacman.sprite.ImageSprite;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class StudentTest5 {

    private ImageSprite sprite;

    @Before
    public void createSprite() {
        sprite = new ImageSprite(new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        });
    }

    @Test
    public void test1() {

    }
}
