package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Zahlenraten;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Gui extends JFrame{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Zahlenraten.createRandomNumber();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(338, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGibEineZahl = new JLabel("Gib eine Zahl ein zwischen 0 und 1000 ein:");
		lblGibEineZahl.setBounds(10, 14, 318, 14);
		contentPane.add(lblGibEineZahl);
		
		JButton btnOk = new JButton("Ok!");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Zahlenraten.checkNumber();
			}
		});
		btnOk.setBounds(338, 42, 86, 20);
		contentPane.add(btnOk);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(10);
		textArea.setBounds(10, 142, 414, 108);
		contentPane.add(textArea);
	}
}
