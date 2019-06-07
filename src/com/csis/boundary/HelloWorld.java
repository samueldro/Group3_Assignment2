package com.csis.boundary;
//Samuel
//Victor
//Chhavi

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.AbstractListModel;

public class HelloWorld {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld window = new HelloWorld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGroupName = new JLabel("Group Name");
		lblGroupName.setBounds(36, 33, 78, 14);
		frame.getContentPane().add(lblGroupName);
	
		
		textField = new JTextField();
		textField.setBounds(189, 65, 196, 106);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Victor", "Samuel", "Chhavi"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
			
				return values[index];
			}
		});
		list.setBounds(36, 65, 119, 106);
		
		 list.addListSelectionListener(new ListSelectionListener() {

				@Override
				public void valueChanged(ListSelectionEvent arg0) {
					// TODO Auto-generated method stub
			
					 if (!arg0.getValueIsAdjusting()) {
						 switch (list.getSelectedValue().toString()) {
						 	case "Samuel" :
						 		 textField.setText("I am the Team Leader");
						 		break;
						 	case "Victor" :
						 		 textField.setText("I'm working on the database");
						 		break;
						 	case "Chhavi" :
						 		 textField.setText("I'm working with entities");
						 		break;
						 }
		                  
					 }
				}
	        });
		 
		frame.getContentPane().add(list);
		
		
	}
}
