        
package dc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class DC {
    
    JFrame window;
    Container con;
    JPanel titleNamePanel, subtitleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, subtitleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Birch Std", Font.PLAIN, 80);
    Font startButtonFont = new Font("Birch Std", Font.PLAIN, 30);
    Font subtitleFont = new Font("SimSum", Font.PLAIN, 50);
    Font normalFont = new Font("Microsoft Yi Baiti", Font.PLAIN, 25);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHP;
    String weapon, position;
    
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    
    
    public static void main(String[] args) {
        
       new DC();
       
    }
    
    public DC(){
      
      
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        
       
                
        con = window.getContentPane();
        
        titleNamePanel = new JPanel(); 
        titleNamePanel.setBounds(100,100,600,75);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("SHIN MEGAMI TENSEI ");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);
        
        subtitleNamePanel = new JPanel(); 
        subtitleNamePanel.setBounds(100,180,600,75);
        subtitleNamePanel.setBackground(Color.black);
        subtitleNameLabel = new JLabel("真・女神転生");
        subtitleNameLabel.setForeground(Color.red);
        subtitleNameLabel.setFont(subtitleFont);
        
       
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);
        

        
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(startButtonFont);
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.addActionListener(tsHandler);
        
        subtitleNamePanel.add(subtitleNameLabel);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        
        con.add(titleNamePanel); 
        con.add(subtitleNamePanel);
        con.add(startButtonPanel);
        
        
        window.setVisible(true);
        
        playerSetUp();
     
    }
   
    public void createGameScreen(){
        
        
        titleNamePanel.setVisible(false);
        subtitleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);
        
        mainTextArea = new JTextArea("   Adentrate en la Mazmorra...");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
        
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);
        
        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);
        choice1.setBorderPainted(false);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        
        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        choice2.setBorderPainted(false);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        
        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);
        choice3.setBorderPainted(false);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
       
        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);
        choice4.setBorderPainted(false);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);
        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel(); 
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);
        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);
        
   
    }
    
    public void playerSetUp(){
        
        playerHP = (int)(Math.random()*100+1);
        hpLabelNumber.setText("" + playerHP);
        weapon = "Daga Oxidada";
        weaponLabelName.setText(weapon);
        
        townGate();
    }
    
    public void townGate() {
        
        position = "townGate";
        
        mainTextArea.setText("Estas en la entrada de la ciudad. \nHay un policia cerca. \n\nQue haces?");
        
        choice1.setText("Hablar con el policia");
        choice2.setText("Atacar al policia");
        choice3.setText("Irte");
        choice4.setText("");
        
    }
    
    public void talkGuard() {
        
        position = "talkGuard";
        
        mainTextArea.setText("Policia: Puedo ayudarte en algo? Nunca te habia visto por aqui. \nCreo que lo mejor sera que te retires");
        
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public void attackGuard() {
        
        position = "attackGuard";
        
        mainTextArea.setText("Policia: Hey, que estas intentando??\n\nEl policia te esquiva y te dispara con su pistola Teaser.\nRecibes 3 de daño");
        playerHP = playerHP - 3;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public class TitleScreenHandler implements  ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            createGameScreen();
            
        }
        
    }
    
    public class ChoiceHandler implements  ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            String yourChoice = event.getActionCommand();
            
            switch(position){
            case "townGate" :
                switch(yourChoice){
                    case "c1": talkGuard(); break;
                    case "c2": attackGuard(); break;
                    case "c3": break;
                }
                break;
                case "talkGuard" :
                    switch(yourChoice){
                        case "c1": townGate(); break;
                        case "c2": break;
                        case "c3": break;
                    }
                    break;
                case "attackGuard" :
                    switch(yourChoice){
                        case "c1": townGate(); break;
                        case "c2": break;
                        case "c3": break;
                    }
                    break;
            }   
            
            
        }
        
            
    }
}

    
   
    
    
        


