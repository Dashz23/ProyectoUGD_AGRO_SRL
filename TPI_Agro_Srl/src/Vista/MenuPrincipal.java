package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	
	public MenuPrincipal(Controlador control) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("MENU PRINCIPAL AGRO SRL");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("LABOREOS");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CULTIVOS");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOTES");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CAMPOS");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("PROYECTO DE CULTIVO");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("SITUACION ANORMAL");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuSituacionesA menu_SA = new MenuSituacionesA(control);
				menu_SA.setVisible(true);
			}
		});
		panel_1.add(btnNewButton_5);
	}

}
