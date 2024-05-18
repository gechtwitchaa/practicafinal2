package ui;

import javax.swing.*;
import logic.Experiment;
import data.ExperimentLoader;
import data.ExperimentSaver;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ExperimentUI {
    private JFrame frame;
    private Experiment currentExperiment;

    public void display() {
        frame = new JFrame("Bacteria Experiment Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton newExperimentButton = new JButton("Nuevo Experimento");
        newExperimentButton.setBounds(10, 20, 160, 25);
        newExperimentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentExperiment = new Experiment();
                JOptionPane.showMessageDialog(null, "Nuevo experimento creado.");
            }
        });
        panel.add(newExperimentButton);

        JButton openFileButton = new JButton("Abrir Archivo");
        openFileButton.setBounds(10, 60, 160, 25);
        openFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fileName = JOptionPane.showInputDialog("Ingrese el nombre del archivo:");
                currentExperiment = ExperimentLoader.load(fileName);
                JOptionPane.showMessageDialog(null, "Experimento cargado desde archivo.");
            }
        });
        panel.add(openFileButton);

    }

}
