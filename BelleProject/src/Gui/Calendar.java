package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.AppointmentController;
import Model.Appointment;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Calendar extends JFrame {
JFrame jframe5;
JLabel jlabel5;
JPanel jpanel5;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_2;
	private final Action action = new SwingAction();
	private JButton btnNewButton_3;
	private JTable table;
	private JLabel lblNewLabel;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar frame = new Calendar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(170, 202, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 202, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(444, 202, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Create");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AppointmentController ap = new AppointmentController();
			       
		        
		           int aid= Integer.parseInt(textField.getText());
		        String date =textField_1.getText();
		        String name = textField_2.getText();
		    Appointment appointment = new Appointment(aid,date,name);
		     ap.createAppointment(appointment);

		     




			}
		});
		btnNewButton.setBounds(184, 289, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AppointmentController a = new AppointmentController();
				int aid= Integer.parseInt(textField.getText());
		        String date =textField_1.getText();
		        String name = textField_2.getText();
		        
		      
		        Appointment appointment = new Appointment(aid,date,name);
                      a.deleteAppointment(appointment);
				
			}
		});
		btnNewButton_2.setBounds(319, 289, 85, 21);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Read");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AppointmentController a = new AppointmentController();
				int aid= Integer.parseInt(textField.getText());
		        String date =textField_1.getText();
		        String name = textField_2.getText();
		        Appointment appointment = new Appointment(aid,date,name);
                a.readAppointment(appointment);
              
				
			}
		});
		btnNewButton_3.setBounds(455, 289, 85, 21);
		contentPane.add(btnNewButton_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"aid", "name", "date"
			}
		));
		table.setBounds(10, 441, 742, 144);
		contentPane.add(table);
		
		lblNewLabel = new JLabel("Appointment");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(267, 86, 137, 36);
		contentPane.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(150, 10, 10, 93);
		contentPane.add(panel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
