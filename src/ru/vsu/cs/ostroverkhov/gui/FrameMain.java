package ru.vsu.cs.ostroverkhov.gui;

import javax.swing.*;


public class FrameMain extends JFrame {
    private JPanel mainPanel;
    private JTextField inputField;
    private JTextField outputField;
    private JButton outputTheResultButton;

    public FrameMain() {
        setContentPane(mainPanel);
        setVisible(true);
        setBounds(750, 300, 500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);

        outputTheResultButton.addActionListener(new ResultListenerButton(inputField, outputField));
    }
}
