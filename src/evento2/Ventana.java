package evento2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana {
    
    JFrame marco;
    JPanel panel;
    JButton bazul, bamarelo, bvermello, nFiestra, bVerde, bGris, bBlack;
    
    public void amosar() {
        marco = new JFrame();
        panel = new JPanel();
        bazul = new JButton("BLUE");
        bazul.setBackground(Color.BLUE);
        bamarelo = new JButton("Yellow");
        bamarelo.setBackground(Color.YELLOW);
        bvermello = new JButton("RED");
        bvermello.setBackground(Color.RED);
        nFiestra = new JButton("Fiestra Nova");
        bVerde = new JButton("GREEN");
        bVerde.setBackground(Color.GREEN);
        bGris = new JButton("GRIS");
        bGris.setBackground(Color.GRAY);
        bBlack = new JButton("BLACK");
        bBlack.setBackground(Color.BLACK);
        //panel.setLayout(null);
        panel.add(bazul);
        panel.add(bamarelo);
        panel.add(bvermello);
        panel.add(nFiestra);
        panel.add(bVerde);
        panel.add(bGris);
        panel.add(bBlack);
        bazul.addActionListener(new Azul());
        bamarelo.addActionListener(new Amarelo());
        bvermello.addActionListener(new Vermello());
        nFiestra.addActionListener(new Fiestra());
        bVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });
        bGris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GRAY);
            }
        });
        bBlack.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLACK);
            }
        });
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(300, 300);
        marco.setLocationRelativeTo(null);
    }
    
    private class Fiestra implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(nFiestra)) {
                marco.dispose();
                JOptionPane.showMessageDialog(null, "Nova Fiestra");
                marco.setVisible(true);
            }
            
        }
        
    }
    
    private class Azul implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (bazul == e.getSource()) {
                panel.setBackground(Color.BLUE);
            }
        }
    }
    
    private class Amarelo implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (bamarelo == e.getSource()) {
                panel.setBackground(Color.YELLOW);
            }
            
        }
    }
    
    private class Vermello implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (bvermello == e.getSource()) {
                panel.setBackground(Color.red);
            }
            
        }
    }
}
