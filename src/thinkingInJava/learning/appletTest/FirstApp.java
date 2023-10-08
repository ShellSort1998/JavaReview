package thinkingInJava.learning.appletTest;

import java.applet.*;
import java.awt.*;

public class FirstApp extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawString("Hello World", 25, 50);
    }
}
