package com.company;

import javax.swing.*;
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

        jFc.showDialog(this,"Please choose a file!");
        //if(jFc.isValid()) {

            File f = jFc.getSelectedFile();
            JOptionPane jOptionPane = new JOptionPane();


            JOptionPane.showMessageDialog(this,f.listFiles());



       // }
    }
}
