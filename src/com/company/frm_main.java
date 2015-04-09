package com.company;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Daniel Schroeder on 08.04.2015.
 *
 *
 *
 */
public class frm_main extends JFrame implements ActionListener{

    private JPanel jPanelMain;
    private JTextField tfA;
    private JTextField tfB;
    private JTextField tfResult;
    private JButton btnCalc;
    private JButton btnFileOpen;

    public frm_main()
    {
        super("frm_main");
        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(jPanelMain);
        setVisible(true);

        btnCalc.addActionListener(this);
        btnFileOpen.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnCalc)
        {
            calc();
        }
        if(e.getSource() == btnFileOpen)
        {
            openFile();
        }
    }

    private void calc()
    {
        tfResult.setText(String.valueOf(add(Integer.parseInt(tfB.getText()), Integer.parseInt(tfA.getText()))));

    }

    private int add(int a, int b)
    {
        return a+b;

    }

    private void openFile()
    {
        JFileChooser jFc = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*","*"); // to define file filters
        jFc.setFileFilter(filter); // applies the filter

        int retVal = jFc.showOpenDialog(getParent()); // modale: waits till the Dialog gets closed

        if(retVal == JFileChooser.APPROVE_OPTION) {

            File f = jFc.getSelectedFile(); // instances a new File f from the selected filepath

            JOptionPane.showMessageDialog(this,f.getAbsolutePath()); // reads the absolute filepath out of the previously selected file






        }
    }
}
