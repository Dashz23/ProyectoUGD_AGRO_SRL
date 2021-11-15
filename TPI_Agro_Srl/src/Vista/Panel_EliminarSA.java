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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_EliminarSA extends JPanel {
	private JTextField textField_id_situacion;
	Controlador controlA;
	Situacion_Anormal SA;
	
	public Panel_EliminarSA(Controlador control) {
		controlA = control;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{93, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{43, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Ingrese ID de la Situacion Anormal a borrar");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 2;
		add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		textField_id_situacion = new JTextField();
		textField_id_situacion.setColumns(10);
		GridBagConstraints gbc_textField_id_situacion = new GridBagConstraints();
		gbc_textField_id_situacion.anchor = GridBagConstraints.WEST;
		gbc_textField_id_situacion.insets = new Insets(0, 0, 5, 5);
		gbc_textField_id_situacion.gridx = 1;
		gbc_textField_id_situacion.gridy = 2;
		add(textField_id_situacion, gbc_textField_id_situacion);
		
		JLabel lbl_Aviso = new JLabel("Esperando...");
		GridBagConstraints gbc_lbl_Aviso = new GridBagConstraints();
		gbc_lbl_Aviso.gridwidth = 4;
		gbc_lbl_Aviso.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_Aviso.gridx = 0;
		gbc_lbl_Aviso.gridy = 3;
		add(lbl_Aviso, gbc_lbl_Aviso);
		
		JButton btnNewButton = new JButton("BORRAR S.A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id_situacion = Integer.parseInt(textField_id_situacion.getText().trim());
				controlA.eliminar_situacion_anormal(id_situacion);
				lbl_Aviso.setText("Eliminado con Exito");
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 4;
		add(btnNewButton, gbc_btnNewButton);

	}
}
