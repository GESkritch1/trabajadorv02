package ui;

import trabajador.Trabajador;

import javax.swing.*;
import java.awt.*;

public class VentanaTrabajador implements GUI {
    private Trabajador trabajador;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField rutField;
    private JTextField isapreField;
    private JTextField afpField;

    public VentanaTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public void mostrar() {
        JFrame frame = new JFrame();
        frame.setTitle("Ventana Trabajador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        nombreField = new JTextField();
        apellidoField = new JTextField();
        rutField = new JTextField();
        isapreField = new JTextField();
        afpField = new JTextField();

        frame.add(new JLabel("Nombre:"));
        frame.add(nombreField);
        frame.add(new JLabel("Apellido:"));
        frame.add(apellidoField);
        frame.add(new JLabel("RUT:"));
        frame.add(rutField);
        frame.add(new JLabel("ISAPRE:"));
        frame.add(isapreField);
        frame.add(new JLabel("AFP:"));
        frame.add(afpField);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void interactuar() {
        nombreField.setText(trabajador.getNombre());
        apellidoField.setText(trabajador.getApellido());
        rutField.setText(trabajador.getRut());
        isapreField.setText(trabajador.getIsapre());
        afpField.setText(trabajador.getAfp());
    }
}