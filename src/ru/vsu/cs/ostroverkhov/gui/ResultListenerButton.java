package ru.vsu.cs.ostroverkhov.gui;

import ru.vsu.cs.ostroverkhov.logic.FindingNotNullElementsBetweenNullElements;
import ru.vsu.cs.ostroverkhov.utils.ArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultListenerButton implements ActionListener {

    JTextField inputField;
    JTextField outputField;

    public ResultListenerButton(JTextField inputField, JTextField outputField) {
        this.inputField = inputField;
        this.outputField = outputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int[] arr = ArrayUtils.toIntArray(inputField.getText());
        int result = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(arr);
        outputField.setText(String.valueOf(result));

    }
}
