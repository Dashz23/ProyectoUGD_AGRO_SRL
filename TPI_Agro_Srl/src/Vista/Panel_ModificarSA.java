package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.Controlador;
import Modelo.Situacion_Anormal;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_ModificarSA extends JPanel {
	private JTextField textField_descrip;
	private JTextField textField_nivel_dano;
	private JTextField textField_id;

	Controlador controlA;
	Situacion_Anormal SA;
	
	public Panel_ModificarSA(Controlador control) {
		controlA = control;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{93, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{43, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Ingrese el ID de la Situacion Anormal a Modificar");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_id = new JTextField();
		textField_id.setColumns(10);
		GridBagConstraints gbc_textField_id = new GridBagConstraints();
		gbc_textField_id.anchor = GridBagConstraints.WEST;
		gbc_textField_id.insets = new Insets(0, 0, 5, 5);
		gbc_textField_id.gridx = 1;
		gbc_textField_id.gridy = 2;
		add(textField_id, gbc_textField_id);
		
		JLabel lblIngreseLosNuevos = new JLabel("Ingrese los Nuevos datos (Actualizados) para dicha Situacion");
		GridBagConstraints gbc_lblIngreseLosNuevos = new GridBagConstraints();
		gbc_lblIngreseLosNuevos.insets = new Insets(0, 0, 5, 0);
		gbc_lblIngreseLosNuevos.gridwidth = 4;
		gbc_lblIngreseLosNuevos.gridx = 0;
		gbc_lblIngreseLosNuevos.gridy = 3;
		add(lblIngreseLosNuevos, gbc_lblIngreseLosNuevos);
		
		JLabel lblNewLabel_1_1 = new JLabel("DESCRIPCION:");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 4;
		add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		textField_descrip = new JTextField();
		textField_descrip.setColumns(10);
		GridBagConstraints gbc_textField_descrip = new GridBagConstraints();
		gbc_textField_descrip.anchor = GridBagConstraints.WEST;
		gbc_textField_descrip.insets = new Insets(0, 0, 5, 5);
		gbc_textField_descrip.gridx = 1;
		gbc_textField_descrip.gridy = 4;
		add(textField_descrip, gbc_textField_descrip);
		
		JLabel lblNewLabel_1_2 = new JLabel("NIVEL DE DA\u00D1O:");
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 0;
		gbc_lblNewLabel_1_2.gridy = 5;
		add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		textField_nivel_dano = new JTextField();
		textField_nivel_dano.setColumns(10);
		GridBagConstraints gbc_textField_nivel_dano = new GridBagConstraints();
		gbc_textField_nivel_dano.anchor = GridBagConstraints.WEST;
		gbc_textField_nivel_dano.insets = new Insets(0, 0, 5, 5);
		gbc_textField_nivel_dano.gridx = 1;
		gbc_textField_nivel_dano.gridy = 5;
		add(textField_nivel_dano, gbc_textField_nivel_dano);
		
		JLabel lbl_Aviso = new JLabel("Esperando...");
		GridBagConstraints gbc_lbl_Aviso = new GridBagConstraints();
		gbc_lbl_Aviso.gridwidth = 4;
		gbc_lbl_Aviso.gridx = 0;
		gbc_lbl_Aviso.gridy = 7;
		add(lbl_Aviso, gbc_lbl_Aviso);
		
		JButton btnNewButton = new JButton("MODIFICAR S.A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String descripcion = textField_descrip.getText().trim();
				String nivel = textField_nivel_dano.getText().trim();
				int id_situacion = Integer.parseInt(textField_id.getText().trim());
				controlA.actualizar_situacion_anormal(id_situacion, descripcion, nivel);
				lbl_Aviso.setText("Modificado con Exito");
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 6;
		add(btnNewButton, gbc_btnNewButton);
		
		

	}
}
