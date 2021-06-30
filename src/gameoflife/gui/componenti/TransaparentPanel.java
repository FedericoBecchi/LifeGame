package gameoflife.gui.componenti;

import java.awt.*;

import javax.swing.*;

// Panel with a circle drawn on it.
public class TransaparentPanel extends JPanel {

    // This is Swing, so override paint*Component* - not paint
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        Rectangle r = g.getClipBounds();
        g.fillRect(r.x, r.y, r.width, r.height);
        super.paintComponent(g);
        this.setOpaque(false);
        this.setBackground(new Color(52, 152, 219,0));

    }
}