/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Translation extends JFrame implements ActionListener {

	private static final int WIDTH = 900;
	private static final int HEIGHT = 200;
	public static final int NUMBER_OF_LINES = 10;
	public static final int NUMBER_OF_CHAR = 20;
	private JTextArea inputArea;
	private JTextArea outputArea;
	
	
	public Translation() {
		
        setTitle("Translation app:");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        inputArea = new JTextArea(NUMBER_OF_LINES, NUMBER_OF_CHAR);
        leftPanel.add(inputArea, BorderLayout.CENTER );
	JLabel leftLabel = new JLabel("Please enter words - English:");
	leftPanel.add(leftLabel, BorderLayout.NORTH);
	leftPanel.setBackground(Color.LIGHT_GRAY);
	add(leftPanel);
		
	JPanel middlePanel = new JPanel();
	middlePanel.setLayout(new BorderLayout());
	JButton translateButton = new JButton("Please click to translate");
	translateButton.addActionListener(this);
	middlePanel.add(translateButton, BorderLayout.CENTER);
	add(middlePanel);
		
	JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        outputArea = new JTextArea(NUMBER_OF_LINES, NUMBER_OF_CHAR);
	rightPanel.add(outputArea, BorderLayout.CENTER );
	JLabel rightLabel = new JLabel("Translated words - Pig Latin:");
	rightPanel.add(rightLabel, BorderLayout.NORTH);
	rightPanel.setBackground(Color.LIGHT_GRAY);
	add(rightPanel);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		String text = inputArea.getText();
		String actionCommand = e.getActionCommand();
		if(actionCommand.equals("Please click to translate")){
		   {
			Scanner scan = new Scanner(text); 
			
			while(scan.hasNext()) {
				String word = scan.next();				
				char firstL = word.charAt(0);
				String second = word.substring(1);
				
				if(firstL=='a' || firstL=='e' || firstL=='i' || firstL=='o' || firstL=='u') {
					outputArea.append(word+"way\n");
				}
				else {
					outputArea.append(second+firstL+"ay\n");
				}
			}
			
		   }
		}
		else {
			outputArea.setText("Error");
		}
		
	}

}
