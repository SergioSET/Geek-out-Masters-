package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

/**
 * This class is used for ...
 * @autor Paola-J Rodriguez-C paola.rodriguez@correounivalle.edu.co
 * @version v.1.0.0 date:21/11/2021
 */
public class GUI extends JFrame {

    private Header headerProject;
    private JPanel juego;
    public JButton dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private ImageIcon imageDado;
    private ImageIcon imageAyuda;
    public JPanel dadosActivos;
    private JPanel puntaje;
    public JPanel dadosInactivos;
    public JPanel dadosUtilizados;
    public JButton ayuda,lanzar;
    private Escucha escucha;
    private JSeparator c;
    private JPanel d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
    private int flag, cara = 0 ;
    private String accionado, cartaAplicar;
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
        dado1.setName("dado1");
        imageDado = new ImageIcon(getClass().getResource("/resources/neutro.png"));
        dado1.setIcon(imageDado);
        dado1.addActionListener(escucha);

        dado2 = new JButton("");
        dado2.setName("dado2");
        dado2.setIcon(imageDado);
        dado2.addActionListener(escucha);

        dado3 = new JButton("");
        dado3.setName("dado3");
        dado3.setIcon(imageDado);
        dado3.addActionListener(escucha);

        dado4 = new JButton("");
        dado4.setName("dado4");
        dado4.setIcon(imageDado);
        dado4.addActionListener(escucha);

        dado5 = new JButton("");
        dado5.setName("dado5");
        dado5.setIcon(imageDado);
        dado5.addActionListener(escucha);

        dado6 = new JButton("");
        dado6.setName("dado6");
        dado6.setIcon(imageDado);
        dado6.addActionListener(escucha);

        dado7 = new JButton("");
        dado7.setName("dado7");
        dado7.setIcon(imageDado);
        dado7.addActionListener(escucha);

        dado8 = new JButton("");
        dado8.setName("dado8");
        dado8.setIcon(imageDado);
        dado8.setEnabled(false);
        dado8.addActionListener(escucha);

        dado9 = new JButton("");
        dado9.setName("dado9");
        dado9.setIcon(imageDado);
        dado9.setEnabled(false);
        dado9.addActionListener(escucha);

        dado10 = new JButton("");
        dado10.setName("dado10");
        dado10.setIcon(imageDado);
        dado10.setEnabled(false);
        dado10.addActionListener(escucha);

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
        flag = 0;
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

    public void ejecutarAccion(int accion, String botonPresionado, String botonAplicar){

        System.out.println("Estas realizando la siguiente acción " + accion + " el botón que tiene esta acción es " + botonPresionado + " y la carta que se aplicará es: " + botonAplicar);

        switch (accion){
            case 1:
                //"Meeple"

                break;
            case 2:
                //"Dragon"
                break;
            case 3:
                //"Corazon"
                break;
            case 4:
                //"Cohete"
                if(botonPresionado == dado1.getName()){
                    dadosActivos.remove(dado1);
                    dadosUtilizados.add(dado1);
                    dado1.setEnabled(false);
                }else if(botonPresionado == dado2.getName()){
                    dadosActivos.remove(dado2);
                    dadosUtilizados.add(dado2);
                    dado2.setEnabled(false);
                }else if(botonPresionado == dado3.getName()){
                    dadosActivos.remove(dado3);
                    dadosUtilizados.add(dado3);
                    dado3.setEnabled(false);
                }else if(botonPresionado == dado4.getName()){
                    dadosActivos.remove(dado4);
                    dadosUtilizados.add(dado4);
                    dado4.setEnabled(false);
                }else if(botonPresionado == dado5.getName()){
                    dadosActivos.remove(dado5);
                    dadosUtilizados.add(dado5);
                    dado5.setEnabled(false);
                }else if(botonPresionado == dado6.getName()) {
                    dadosActivos.remove(dado6);
                    dadosUtilizados.add(dado6);
                    dado6.setEnabled(false);
                }else if(botonPresionado == dado7.getName()){
                    dadosActivos.remove(dado7);
                    dadosUtilizados.add(dado7);
                    dado7.setEnabled(false);
                }else if(botonPresionado == dado8.getName()){
                    dadosActivos.remove(dado8);
                    dadosUtilizados.add(dado8);
                    dado8.setEnabled(false);
                }else if (botonPresionado == dado9.getName()){
                    dadosActivos.remove(dado9);
                    dadosUtilizados.add(dado9);
                    dado9.setEnabled(false);
                }else if (botonPresionado == dado10.getName()){
                    dadosActivos.remove(dado10);
                    dadosUtilizados.add(dado10);
                    dado10.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Error del sistema, por favor comunicarse con el desarrollador");
                }


                if(botonAplicar == dado1.getName()){
                    dadosActivos.remove(dado1);
                    dadosInactivos.add(dado1);
                    dado1.setEnabled(false);
                }else if(botonAplicar == dado2.getName()){
                    dadosActivos.remove(dado2);
                    dadosInactivos.add(dado2);
                    dado2.setEnabled(false);
                }else if(botonAplicar == dado3.getName()){
                    dadosActivos.remove(dado3);
                    dadosInactivos.add(dado3);
                    dado3.setEnabled(false);
                }else if(botonAplicar == dado4.getName()){
                    dadosActivos.remove(dado4);
                    dadosInactivos.add(dado4);
                    dado4.setEnabled(false);
                }else if(botonAplicar == dado5.getName()){
                    dadosActivos.remove(dado5);
                    dadosInactivos.add(dado5);
                    dado5.setEnabled(false);
                }else if(botonAplicar == dado6.getName()) {
                    dadosActivos.remove(dado6);
                    dadosInactivos.add(dado6);
                    dado6.setEnabled(false);
                }else if(botonAplicar == dado7.getName()){
                    dadosActivos.remove(dado7);
                    dadosInactivos.add(dado7);
                    dado7.setEnabled(false);
                }else if(botonAplicar == dado8.getName()){
                    dadosActivos.remove(dado8);
                    dadosInactivos.add(dado8);
                    dado8.setEnabled(false);
                }else if (botonAplicar == dado9.getName()){
                    dadosActivos.remove(dado9);
                    dadosInactivos.add(dado9);
                    dado9.setEnabled(false);
                }else if (botonAplicar == dado10.getName()){
                    dadosActivos.remove(dado10);
                    dadosInactivos.add(dado10);
                    dado10.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Error del sistema, por favor comunicarse con el desarrollador");
                }

                break;
            case 5:
                //"Superheroe"
                break;
            case 6:
                //"42"
                break;
            default:
                break;
        }
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

            if(e.getSource()==dado1){
                if(flag == 0){
                    cara = modelGeekOutMaster.dado1.getCara();
                    System.out.println("Has puesto el botón uno como accionador");
                    accionado = dado1.getName();
                    dado1.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón uno como botón a accionar");
                    cartaAplicar = dado1.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado1.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado2){
                if(flag == 0){
                    cara = modelGeekOutMaster.dado2.getCara();
                    System.out.println("Has puesto el botón dos como accionador");
                    accionado = dado2.getName();
                    dado2.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón dos como botón a accionar");
                    cartaAplicar = dado2.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado2.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado3){

                if(flag == 0){
                    cara = modelGeekOutMaster.dado3.getCara();
                    System.out.println("Has puesto el botón tres como accionador");
                    accionado = dado3.getName();
                    dado3.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón tres como botón a accionar");
                    cartaAplicar = dado3.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado3.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado4){
                if(flag == 0){
                    cara = modelGeekOutMaster.dado4.getCara();
                    System.out.println("Has puesto el botón cuatro como accionador");
                    accionado = dado4.getName();
                    dado4.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón cuatro como botón a accionar");
                    cartaAplicar = dado4.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado4.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado5){

                if(flag == 0){
                    cara = modelGeekOutMaster.dado5.getCara();
                    System.out.println("Has puesto el botón cinco como accionador");
                    accionado = dado5.getName();
                    dado5.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón cinco como botón a accionar");
                    cartaAplicar = dado5.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado5.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado6){

                if(flag == 0){
                    cara = modelGeekOutMaster.dado1.getCara();
                    System.out.println("Has puesto el botón seis como accionador");
                    accionado = dado6.getName();
                    dado6.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón seis como botón a accionar");
                    cartaAplicar = dado6.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado6.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado7){

                if(flag == 0){
                    cara = modelGeekOutMaster.dado7.getCara();
                    System.out.println("Has puesto el botón siete como accionador");
                    accionado = dado7.getName();
                    dado7.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón siete como botón a accionar");
                    cartaAplicar = dado7.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado7.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado8){

                if(flag == 0){
                    cara = modelGeekOutMaster.dado8.getCara();
                    System.out.println("Has puesto el botón ocho como accionador");
                    accionado = dado8.getName();
                    dado8.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón ocho como botón a accionar");
                    cartaAplicar = dado8.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado8.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado9){
                if(flag == 0){
                    cara = modelGeekOutMaster.dado9.getCara();
                    System.out.println("Has puesto el botón nueve como accionador");
                    accionado = dado9.getName();
                    dado9.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón nueve como botón a accionar");
                    cartaAplicar = dado9.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado9.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }else if(e.getSource()==dado10){

                if(flag == 0){
                    cara = modelGeekOutMaster.dado10.getCara();
                    System.out.println("Has puesto el botón diez como accionador");
                    accionado = dado10.getName();
                    dado10.setBackground(Color.blue);
                    flag = 1;
                }else if(flag == 1){
                    System.out.println("Has puesto el botón diez como botón a accionar");
                    cartaAplicar = dado10.getName();
                    System.out.println("accionador: " + accionado + " accionado: " + cartaAplicar);
                    dado10.setBackground(ayuda.getBackground());
                    ejecutarAccion(cara, accionado,cartaAplicar);
                    flag = 0;
                }
            }

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

            }else if(e.getSource()==ayuda){
                imageAyuda = new ImageIcon(getClass().getResource("/resources/hojaAyuda.png"));
                JOptionPane.showMessageDialog(rootPane," ","Hoja de ayuda", JOptionPane.PLAIN_MESSAGE, imageAyuda);
            }

            repaint();
            revalidate();

        }
    }
}
