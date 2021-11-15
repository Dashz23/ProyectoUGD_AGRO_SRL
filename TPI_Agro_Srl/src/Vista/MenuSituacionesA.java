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

public class MenuSituacionesA extends JFrame {
	
	Panel_RegistarSA p_r_s_a ;
	Panel_EliminarSA p_eliminar_s_a;
	Panel_ListarSA p_listar_s_a;
	Panel_ModificarSA p_modif_s_a;
	
	private JPanel contentPane;

	
	public MenuSituacionesA(Controlador control) {
		p_r_s_a = new Panel_RegistarSA(control);
		
		p_r_s_a.setEnabled(false);
		p_r_s_a.setVisible(false);
		
		p_eliminar_s_a = new Panel_EliminarSA(control);
		p_eliminar_s_a.setEnabled(false);
		p_eliminar_s_a.setVisible(false);
		
		p_listar_s_a = new Panel_ListarSA(control);
		p_listar_s_a.setEnabled(false);
		p_listar_s_a.setVisible(false);
		
		p_modif_s_a = new Panel_ModificarSA(control);
		p_modif_s_a.setEnabled(false);
		p_modif_s_a.setVisible(false);
		
		setTitle("MENU PRINCIPAL AGRO SRL/SITUACIONES ANORMALES");
		setBounds(100, 100, 895, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("MENU SITUACIONES ANORMALES");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_botones = new JPanel();
		contentPane.add(panel_botones, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("REGISTAR NUEVA S.A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().remove(panel_botones);
				getContentPane().add(p_r_s_a, BorderLayout.CENTER);
				p_r_s_a.setVisible(true);
				p_r_s_a.setEnabled(true);
			}
		});
		panel_botones.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MODIFICAR S.A");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().remove(panel_botones);
				getContentPane().add(p_modif_s_a, BorderLayout.CENTER);
				p_modif_s_a.setVisible(true);
				p_modif_s_a.setEnabled(true);
			}
		});
		panel_botones.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ELIMINAR S.A");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().remove(panel_botones);
				getContentPane().add(p_eliminar_s_a, BorderLayout.CENTER);
				p_eliminar_s_a.setVisible(true);
				p_eliminar_s_a.setEnabled(true);
			}
		});
		panel_botones.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LISTAR S.A");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().remove(panel_botones);
				getContentPane().add(p_listar_s_a, BorderLayout.CENTER);
				p_listar_s_a.setVisible(true);
				p_listar_s_a.setEnabled(true);
			}
		});
		panel_botones.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("VOLVER MENU");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_r_s_a.setEnabled(false);
				p_r_s_a.setVisible(false);
				getContentPane().remove(p_r_s_a);
				
				
				p_eliminar_s_a.setEnabled(false);
				p_eliminar_s_a.setVisible(false);
				getContentPane().remove(p_eliminar_s_a);
				
				
				p_listar_s_a.setEnabled(false);
				p_listar_s_a.setVisible(false);
				getContentPane().remove(p_listar_s_a);
				
				p_modif_s_a.setEnabled(false);
				p_modif_s_a.setVisible(false);
				getContentPane().remove(p_modif_s_a);
				
				getContentPane().add(panel_botones, BorderLayout.CENTER);
				panel_botones.setEnabled(true);
				panel_botones.setVisible(true);
			}
		});
		panel_1.add(btnNewButton_4);
	}

}
