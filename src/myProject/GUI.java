package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used for ...
 * @autor Paola-J Rodriguez-C paola.rodriguez@correounivalle.edu.co
 * @version v.1.0.0 date:21/11/2021
 */
public class GUI extends JFrame {

    private Header headerProject;
    private JPanel juego;
    private JButton dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private ImageIcon imageDado;
    private ImageIcon imageAyuda;
    private JPanel dadosActivos;
    private JPanel puntaje;
    private JPanel dadosInactivos;
    private JPanel dadosUtilizados;
    public JButton ayuda,lanzar;
    private Escucha escucha;
    private JSeparator c;
    private JPanel d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
    private ModelGeekOutMaster modelGeekOutMaster;

    /**
     * Constructor of GUI class
     */
    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Geek Out! Masters");
        //this.setSize(200,100);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        //Create Listener Object and Control Object
        escucha = new Escucha();
        modelGeekOutMaster = new ModelGeekOutMaster();
        //Set up JComponents
        headerProject = new Header("Geek Out! Masters", Color.BLACK);

        dado1 = new JButton("");
        imageDado = new ImageIcon(getClass().getResource("/resources/neutro.png"));
        dado1.setIcon(imageDado);

        dado2 = new JButton("");
        dado2.setIcon(imageDado);

        dado3 = new JButton("");
        dado3.setIcon(imageDado);

        dado4 = new JButton("");
        dado4.setIcon(imageDado);

        dado5 = new JButton("");
        dado5.setIcon(imageDado);

        dado6 = new JButton("");
        dado6.setIcon(imageDado);

        dado7 = new JButton("");
        dado7.setIcon(imageDado);

        dado8 = new JButton("");
        dado8.setIcon(imageDado);
        dado8.setEnabled(false);

        dado9 = new JButton("");
        dado9.setIcon(imageDado);
        dado9.setEnabled(false);

        dado10 = new JButton("");
        dado10.setIcon(imageDado);
        dado10.setEnabled(false);

        juego = new JPanel();
        juego.setPreferredSize(new Dimension(1000, 800));
        juego.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        this.add(juego, BorderLayout.CENTER);

        this.add(headerProject,BorderLayout.NORTH); //Change this line if you change JFrame Container's Layout

        dadosActivos = new JPanel();
        dadosActivos.setPreferredSize(new Dimension(540,250));

        dadosActivos.setBorder(BorderFactory.createTitledBorder("DADOS ACTIVOS"));
        dadosActivos.add(dado1);
        dadosActivos.add(dado2);
        dadosActivos.add(dado3);
        dadosActivos.add(dado4);
        dadosActivos.add(dado5);
        dadosActivos.add(dado6);
        dadosActivos.add(dado7);
       //

        d1 = new JPanel();
        d1.setPreferredSize(new Dimension(71, 62));
        d1.setBorder(BorderFactory.createTitledBorder("1"));

        d2 = new JPanel();
        d2.setPreferredSize(new Dimension(71, 62));
        d2.setBorder(BorderFactory.createTitledBorder("3"));

        d3 = new JPanel();
        d3.setPreferredSize(new Dimension(71, 62));
        d3.setBorder(BorderFactory.createTitledBorder("6"));

        d4 = new JPanel();
        d4.setPreferredSize(new Dimension(71, 62));
        d4.setBorder(BorderFactory.createTitledBorder("10"));

        d5 = new JPanel();
        d5.setPreferredSize(new Dimension(71, 62));
        d5.setBorder(BorderFactory.createTitledBorder("15"));

        d6 = new JPanel();
        d6.setPreferredSize(new Dimension(71, 62));
        d6.setBorder(BorderFactory.createTitledBorder("21"));

        d7 = new JPanel();
        d7.setPreferredSize(new Dimension(71, 62));
        d7.setBorder(BorderFactory.createTitledBorder("28"));

        d8 = new JPanel();
        d8.setPreferredSize(new Dimension(71, 62));
        d8.setBorder(BorderFactory.createTitledBorder("36"));

        d9 = new JPanel();
        d9.setPreferredSize(new Dimension(71, 62));
        d9.setBorder(BorderFactory.createTitledBorder("45"));

        d10 = new JPanel();
        d10.setPreferredSize(new Dimension(71, 62));
        d10.setBorder(BorderFactory.createTitledBorder("55"));

        puntaje = new JPanel();
        puntaje.setPreferredSize(new Dimension(460, 295));
        puntaje.setBorder(BorderFactory.createTitledBorder("PUNTAJE"));
        puntaje.add(d1);
        puntaje.add(d2);
        puntaje.add(d3);
        puntaje.add(d4);
        puntaje.add(d5);
        puntaje.add(d6);
        puntaje.add(d7);
        puntaje.add(d8);
        puntaje.add(d9);
        puntaje.add(d10);

        dadosInactivos = new JPanel();
        dadosInactivos.setPreferredSize(new Dimension(300, 220));
        dadosInactivos.setBorder(BorderFactory.createTitledBorder("DADOS INACTIVOS"));
        dadosInactivos.add(dado8);
        dadosInactivos.add(dado9);
        dadosInactivos.add(dado10);

        dadosUtilizados = new JPanel();
        dadosUtilizados.setPreferredSize(new Dimension(300, 680));
        dadosUtilizados.setBorder(BorderFactory.createTitledBorder("DADOS UTILIZADOS"));

        this.add(dadosUtilizados,BorderLayout.WEST);

        ayuda = new JButton("?");
        ayuda.addActionListener(escucha);
        lanzar= new JButton("Lanzar");
        lanzar.addActionListener(escucha);

        c = new JSeparator();
        c.setPreferredSize(new Dimension(100,100));

        juego.add(dadosActivos, BorderLayout.SOUTH);
        juego.add(dadosInactivos, BorderLayout.SOUTH);
        juego.add(puntaje);
        juego.add(dadosUtilizados);
        juego.add(ayuda);
        juego.add(lanzar);
        juego.add(c);
    }
    private void switchLanzar(){
        lanzar.setEnabled(false);
    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            /*
            Meeple = 1.png
            Dragon = 2.png
            Corazon = 3.png
            Cohete = 4.png
            Superheroe = 5.png
            42 = 6.png
            */

            if(e.getSource()==lanzar){
                modelGeekOutMaster.calcularDados();
                int[] caras = modelGeekOutMaster.getCaras();
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[0]+".png"));
                dado1.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[1]+".png"));
                dado2.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[2]+".png"));
                dado3.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[3]+".png"));
                dado4.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[4]+".png"));
                dado5.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[5]+".png"));
                dado6.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[6]+".png"));
                dado7.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[7]+".png"));
                dado8.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[8]+".png"));
                dado9.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/"+caras[9]+".png"));
                dado10.setIcon(imageDado);

                if(modelGeekOutMaster.estado==0){
                    lanzar.setEnabled(false);
                    modelGeekOutMaster.estado=1;
                }else{
                    lanzar.setEnabled(true);
                    modelGeekOutMaster.estado=0;
                }

                revalidate();
                repaint();
            }else if(e.getSource()==ayuda){
                imageAyuda = new ImageIcon(getClass().getResource("/resources/hojaAyuda.png"));
                JOptionPane.showMessageDialog(rootPane," ","Hoja de ayuda", JOptionPane.PLAIN_MESSAGE, imageAyuda);

            }
        }
    }
}
