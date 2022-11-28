package mvc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
	private Subject model;
	private controllerInterface controller;
	private String relatorio = "0";
	private String relatorioDobro = "0";
	private String relatorioTriplo = "0";
	
	JFrame frame;
	JPanel panelBotoes;
	JPanel panelDados;
	JPanel panelRel;
	JPanel panelRel2;
	JPanel panelRel3;
	JLabel labelRel;
	JLabel labelRel2;
	JLabel labelRel3;
	JLabel relText;
	JLabel rel2Text;
	JLabel rel3Text;
	JButton registrar;
	JButton cancelar;
	
	public View(Subject mo, controllerInterface co) {
		this.model = mo;
		this.controller = co;
	}
	
	
	public void createView(){
		
		frame = new JFrame("Sistema de Relatórios");
		panelBotoes = new JPanel();
		panelDados = new JPanel();
		panelRel = new JPanel();
		panelRel2 = new JPanel();
		panelRel3 = new JPanel();
		registrar = new JButton("Registrar Relatório");
		cancelar = new JButton("Cancelar Registro");
		labelRel = new JLabel();
		labelRel2 = new JLabel();
		labelRel3 = new JLabel();
		relText = new JLabel("Padrão");
		rel2Text = new JLabel("Dobro");
		rel3Text = new JLabel("Triplo");
		
		registrar.addActionListener(this);
		cancelar.addActionListener(this);
		
		panelBotoes.add(registrar);
		panelBotoes.add(cancelar);
		panelRel.add(relText);
		panelRel.add(labelRel);
		panelRel2.add(rel2Text);
		panelRel2.add(labelRel2);
		panelRel3.add(rel3Text);
		panelRel3.add(labelRel3);
		panelDados.add(panelRel);
		panelDados.add(panelRel2);
		panelDados.add(panelRel3);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelDados);
		
		labelRel.setText(relatorio);
		labelRel2.setText(relatorioDobro);
		labelRel3.setText(relatorioTriplo);
		
		
		frame.setSize(350, 150);
		frame.setVisible(true);
		
	}

	public void update(String rel, String rel2, String rel3) {
        relatorio = rel;
        relatorioDobro = rel2;
		relatorioTriplo = rel3;
        
		display();
	}

	public void display() {
		
		labelRel.setText(relatorio);
		labelRel2.setText(relatorioDobro);
		labelRel3.setText(relatorioTriplo);
		
	}
	
	public void habilitarBotaoRegistrar(){
		
		registrar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoRegistrar(){
		
		registrar.setEnabled(false);
		
	}
	
	
	public void habilitarBotaoCancelar(){
		
		cancelar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoCancelar(){
		
		cancelar.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == registrar){
				controller.registrar();
		}
		if (event.getSource() == cancelar){
				controller.cancelar();
		}
	}
}