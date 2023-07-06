
package adventure;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Screen extends JPanel implements ActionListener {

    Timer alphaTimer = new Timer(20,this);
    BufferedImage buffImage = new BufferedImage(800,600,BufferedImage.TYPE_BYTE_GRAY);
   
    float alphaValue = 1f;
    float opacityValue = 1f;
    
    public Screen() {
       
        alphaTimer.start();
    }
    
    
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alphaValue));
        
        g2d.drawImage(buffImage, 0, 0, null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        alphaValue = alphaValue -0.01f;
        opacityValue = opacityValue -0.01f;
        
        if(alphaValue < 0){
            alphaValue = 0;
            alphaTimer.stop();
        }
        if(opacityValue < 0){
            opacityValue = 0;
            alphaTimer.stop();
        }
        
        repaint();
    }
}
