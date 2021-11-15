package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Situacion_Anormal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Panel_RegistarSA extends JPanel {
	private JTextField textField_descripcion;
	private JTextField textField_nivel_dano;
	
	
	Controlador controlA;
	Situacion_Anormal SA;
	
	
	public Panel_RegistarSA(Controlador control) {
		controlA = control;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{93, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{17, 0, 0, 0, 23, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Complete el Registro de Situacion Anormal");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("DESCRIPCION:");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 2;
		add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		textField_descripcion = new JTextField();
		textField_descripcion.setColumns(10);
		GridBagConstraints gbc_textField_descripcion = new GridBagConstraints();
		gbc_textField_descripcion.anchor = GridBagConstraints.WEST;
		gbc_textField_descripcion.insets = new Insets(0, 0, 5, 5);
		gbc_textField_descripcion.gridx = 1;
		gbc_textField_descripcion.gridy = 2;
		add(textField_descripcion, gbc_textField_descripcion);
		
		JLabel lblNewLabel_1_2 = new JLabel("NIVEL DE DA\u00D1O:");
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 0;
		gbc_lblNewLabel_1_2.gridy = 3;
		add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		textField_nivel_dano = new JTextField();
		textField_nivel_dano.setColumns(10);
		GridBagConstraints gbc_textField_nivel_dano = new GridBagConstraints();
		gbc_textField_nivel_dano.anchor = GridBagConstraints.WEST;
		gbc_textField_nivel_dano.insets = new Insets(0, 0, 5, 5);
		gbc_textField_nivel_dano.gridx = 1;
		gbc_textField_nivel_dano.gridy = 3;
		add(textField_nivel_dano, gbc_textField_nivel_dano);
		
		JLabel lbl_Aviso = new JLabel("Esperando...");
		GridBagConstraints gbc_lbl_Aviso = new GridBagConstraints();
		gbc_lbl_Aviso.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_Aviso.gridwidth = 4;
		gbc_lbl_Aviso.gridx = 0;
		gbc_lbl_Aviso.gridy = 4;
		add(lbl_Aviso, gbc_lbl_Aviso);
		
		JButton btnNewButton = new JButton("AGREGAR S.A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String descripcion = textField_descripcion.getText().trim();
				String nivel = textField_nivel_dano.getText().trim();
				controlA.agregar_situacion_anormal(descripcion, nivel);
				lbl_Aviso.setText("Agregado con Exito");
				
				/*
				List<Situacion_Anormal> lista;
				
				lista = controlA.obtener_situaciones_anormales();
				DefaultTableModel dtm = new  DefaultTableModel();
				dtm.setRowCount(0);
				for (Situacion_Anormal s : lista) {
					String idsit = String.valueOf(s.getId_situacion());
					String desc = s.getDescripcion();
					String nv = s.getNivel_dano();
					String[] tblData = {idsit, desc, nv};
					dtm.addRow(tblData);
				}
				*/
			}
		});
		
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 5;
		add(btnNewButton, gbc_btnNewButton);
		
		

	}
}
