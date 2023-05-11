
package adventure;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Adventure {

    JFrame window;
    Container con;
    JPanel fadeIn,titleNamePanel, subtitleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel fadeInLabel,titleNameLabel, subtitleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Birch Std", Font.PLAIN, 80);
    
    public static void main(String[] args) {
       
        new Adventure();
        
    }
    
    public Adventure(){
     
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.blue);
        con = window.getContentPane();
       
        
        
        fadeIn = new JPanel();
        fadeIn.setBounds(0, 0, 800, 600);
        fadeIn.setBackground(Color.black);
        fadeInLabel = new JLabel(" SHIN MEGAMI TENSEI ");
        fadeInLabel.setForeground(Color.white);
        
        Screen screen = new Screen();
        
        Timer timer = new Timer(3500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    screen.setVisible(false);
                    
                }
            
            });
            timer.start();
        
        
        fadeIn.add(fadeInLabel);    
        con.add(fadeIn);
        con.add(screen);
        window.setVisible(true);
        fadeIn.setVisible(true);
        
        
        
        
    }
   
}
