package Swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

class ScrollBarCustom extends JScrollBar{
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(180, 180, 180));
        setBackground(Color.WHITE);
        setUnitIncrement(20);
    }
}
