package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIGridBagLayout extends JFrame {

    private Header headerProject;
    public JButton dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private ImageIcon imageDado, imageAyuda;
    public JPanel dadosActivos, puntaje, dadosInactivos, dadosUtilizados;
    public JButton ayuda, lanzar, repetir;
    private Escucha escucha;
    private JSeparator c;
    private JPanel d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
    private int flag, cara;
    private JButton dadoAccion, dadoAccionar;
    private ModelGeekOutMaster objetoModelGeekOutMaster;
    private Dado objetoDado;
    private JButton[] vectorDadosInactivos;
    private int asistente = 0;

    public GUIGridBagLayout() {
        initGUI();

        //Default JFrame configuration
        this.setTitle("Geek Out! Masters");
        //this.setSize(200,100);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void initGUI() {
        //Set up JFrame Container's Layout
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        //Create Listener Object or Control Object
        escucha = new Escucha();
        objetoModelGeekOutMaster = new ModelGeekOutMaster();
        objetoDado = new Dado();
        vectorDadosInactivos = new JButton[7];

        headerProject = new Header("Geek Out! Masters", Color.BLACK);

        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;

        this.add(headerProject, constraints);

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
        puntaje.setPreferredSize(new Dimension(460, 100));
        puntaje.setBorder(BorderFactory.createTitledBorder("PUNTAJE"));

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.anchor = GridBagConstraints.NORTH;

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

        this.add(puntaje, constraints);

        dadosUtilizados = new JPanel();
        dadosUtilizados.setPreferredSize(new Dimension(250, 250));
        dadosUtilizados.setBorder(BorderFactory.createTitledBorder("DADOS UTILIZADOS"));

        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;

        this.add(dadosUtilizados, constraints);

        ayuda = new JButton("?");
        ayuda.addActionListener(escucha);

        constraints.gridx = 5;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_START;

        this.add(ayuda, constraints);

        c = new JSeparator();
        c.setPreferredSize(new Dimension(50, 100));

        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(c, constraints);

        dado1 = new JButton("1");
        dado1.setName("dado1");
        imageDado = new ImageIcon(getClass().getResource("/resources/neutro.png"));
        dado1.setIcon(imageDado);
        dado1.addActionListener(escucha);

        dado2 = new JButton("2");
        dado2.setName("dado2");
        dado2.setIcon(imageDado);
        dado2.addActionListener(escucha);

        dado3 = new JButton("3");
        dado3.setName("dado3");
        dado3.setIcon(imageDado);
        dado3.addActionListener(escucha);

        dado4 = new JButton("4");
        dado4.setName("dado4");
        dado4.setIcon(imageDado);
        dado4.addActionListener(escucha);

        dado5 = new JButton("5");
        dado5.setName("dado5");
        dado5.setIcon(imageDado);
        dado5.addActionListener(escucha);

        dado6 = new JButton("6");
        dado6.setName("dado6");
        dado6.setIcon(imageDado);
        dado6.addActionListener(escucha);

        dado7 = new JButton("7");
        dado7.setName("dado7");
        dado7.setIcon(imageDado);
        dado7.addActionListener(escucha);

        dado8 = new JButton("8");
        dado8.setName("dado8");
        dado8.setIcon(imageDado);
        dado8.setEnabled(false);
        dado8.addActionListener(escucha);

        dado9 = new JButton("9");
        dado9.setName("dado9");
        dado9.setIcon(imageDado);
        dado9.setEnabled(false);
        dado9.addActionListener(escucha);

        dado10 = new JButton("10");
        dado10.setName("dado10");
        dado10.setIcon(imageDado);
        dado10.setEnabled(false);
        dado10.addActionListener(escucha);

        dadosActivos = new JPanel();
        dadosActivos.setPreferredSize(new Dimension(420, 250));

        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.WEST;

        this.add(dadosActivos, constraints);

        dadosActivos.setBorder(BorderFactory.createTitledBorder("DADOS ACTIVOS"));
        dadosActivos.add(dado1);
        dadosActivos.add(dado2);
        dadosActivos.add(dado3);
        dadosActivos.add(dado4);
        dadosActivos.add(dado5);
        dadosActivos.add(dado6);
        dadosActivos.add(dado7);

        dadosInactivos = new JPanel();
        dadosInactivos.setPreferredSize(new Dimension(300, 50));
        dadosInactivos.setBorder(BorderFactory.createTitledBorder("DADOS INACTIVOS"));

        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.EAST;

        this.add(dadosInactivos, constraints);

        dadosInactivos.add(dado8);
        dadosInactivos.add(dado9);
        dadosInactivos.add(dado10);

        lanzar = new JButton("Lanzar");
        lanzar.addActionListener(escucha);

        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.SOUTH;

        this.add(lanzar, constraints);

        repetir = new JButton("Volver");
        repetir.addActionListener(escucha);

        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.SOUTH;

        this.add(repetir, constraints);

        dadoAccion = null;
        dadoAccionar = null;
        cara = 0;

        flag = 0;
        objetoModelGeekOutMaster.estado = 0;
    }

    public void ejecutarAccion(int accion, String botonPresionado, String botonAplicar) {

        System.out.println("Estas realizando la siguiente acción " + accion + " el botón que tiene esta acción es " + botonPresionado + " y la carta que se aplicará es: " + botonAplicar);

    }

    public void establecerDefecto() {

        imageDado = new ImageIcon(getClass().getResource("/resources/neutro.png"));
        dado1.setIcon(imageDado);
        dado2.setIcon(imageDado);
        dado3.setIcon(imageDado);
        dado4.setIcon(imageDado);
        dado5.setIcon(imageDado);
        dado6.setIcon(imageDado);
        dado7.setIcon(imageDado);
        dado8.setIcon(imageDado);
        dado9.setIcon(imageDado);
        dado10.setIcon(imageDado);

        dadosActivos.add(dado1);
        dadosActivos.add(dado2);
        dadosActivos.add(dado3);
        dadosActivos.add(dado4);
        dadosActivos.add(dado5);
        dadosActivos.add(dado6);
        dadosActivos.add(dado7);
        dadosInactivos.add(dado8);
        dadosInactivos.add(dado9);
        dadosInactivos.add(dado10);

        dado1.setEnabled(true);
        dado2.setEnabled(true);
        dado3.setEnabled(true);
        dado4.setEnabled(true);
        dado5.setEnabled(true);
        dado6.setEnabled(true);
        dado7.setEnabled(true);
        dado8.setEnabled(false);
        dado9.setEnabled(false);
        dado10.setEnabled(false);

        dadoAccion = null;
        dadoAccionar = null;
        cara = 0;

        flag = 0;
        objetoModelGeekOutMaster.estado = 0;

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GUIGridBagLayout miProjectGUI = new GUIGridBagLayout();
        });
    }

    public void efectos(int efecto, JButton dadoConAccion, JButton dadoAAccionar){
        System.out.println(efecto + " - " + dadoConAccion.getName()+ " - " + dadoAAccionar.getName());

        int[] caras = objetoModelGeekOutMaster.getCaras();
        System.out.println(caras[0] + " " + caras[1] + " " + caras[2] + " " + caras[3] + " " + caras[4] + " " + caras[5] + " " + caras[6] + " " + caras[7] + " " + caras[8] + " " + caras[9]);

        int nuevoValorDado = 0;

        switch (efecto){
            //Meeple
            case 1:
                dadoAccion.setEnabled(false);
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);

                nuevoValorDado = objetoDado.calculateCara();
                System.out.println("El nuevo valor del dado es: "+ nuevoValorDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + nuevoValorDado +".png"));
                dadoAAccionar.setIcon(imageDado);

                switch (dadoAAccionar.getName()){
                    case "dado1":
                        objetoModelGeekOutMaster.caras[0] = nuevoValorDado;
                        break;
                    case "dado2":
                        objetoModelGeekOutMaster.caras[1] = nuevoValorDado;
                        break;
                    case "dado3":
                        objetoModelGeekOutMaster.caras[2] = nuevoValorDado;
                        break;
                    case "dado4":
                        objetoModelGeekOutMaster.caras[3] = nuevoValorDado;
                        break;
                    case "dado5":
                        objetoModelGeekOutMaster.caras[4] = nuevoValorDado;
                        break;
                    case "dado6":
                        objetoModelGeekOutMaster.caras[5] = nuevoValorDado;
                        break;
                    case "dado7":
                        objetoModelGeekOutMaster.caras[6] = nuevoValorDado;
                        break;
                    case "dado8":
                        objetoModelGeekOutMaster.caras[7] = nuevoValorDado;
                        break;
                    case "dado9":
                        objetoModelGeekOutMaster.caras[8] = nuevoValorDado;
                        break;
                    case "dado10":
                        objetoModelGeekOutMaster.caras[9] = nuevoValorDado;
                        break;
                    default:
                        break;
                }
                System.out.println(caras[0] + " " + caras[1] + " " + caras[2] + " " + caras[3] + " " + caras[4] + " " + caras[5] + " " + caras[6] + " " + caras[7] + " " + caras[8] + " " + caras[9]);

                break;
            case 2:
                //"Dragon"
                break;
            case 3:
                //"Corazon"
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);
                dadoConAccion.setEnabled(false);

                switch (dadoAAccionar.getName()) {
                    case "dado1":
                        dadoAAccionar = dado1;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[0] + ".png"));
                        break;
                    case "dado2":
                        dadoAAccionar = dado2;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[1] + ".png"));
                        break;
                    case "dado3":
                        dadoAAccionar = dado3;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[2] + ".png"));
                        break;
                    case "dado4":
                        dadoAAccionar = dado4;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[3] + ".png"));
                        break;
                    case "dado5":
                        dadoAAccionar = dado5;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[4] + ".png"));
                        break;
                    case "dado6":
                        dadoAAccionar = dado6;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[5] + ".png"));
                        break;
                    case "dado7":
                        dadoAAccionar = dado7;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[6] + ".png"));
                        break;
                    case "dado8":
                        dadoAAccionar = dado8;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[7] + ".png"));
                        break;
                    case "dado9":
                        dadoAAccionar = dado9;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[8] + ".png"));
                        break;
                    case "dado10":
                        dadoAAccionar = dado10;
                        imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[9] + ".png"));
                        break;
                    default:
                        break;
                }
                dadosInactivos.remove(dadoAAccionar);
                dadosActivos.add(dadoAAccionar);
                dadoAAccionar.setEnabled(true);

                dadoAAccionar.setIcon(imageDado);

                vectorDadosInactivos[asistente] = null;
                break;
            case 4:
                //"Cohete"
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);
                dadoAccion.setEnabled(false);

                dadosActivos.remove(dadoAAccionar);
                dadoAAccionar.setEnabled(false);
                dadosInactivos.add(dadoAAccionar);
                break;
            case 5:
                //"Superheroe"
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);
                dadoAccion.setEnabled(false);

                int ayuda = objetoModelGeekOutMaster.getCara(dadoAAccionar);

                switch(ayuda){
                    case 1:
                        nuevoValorDado = 4;
                        break;
                    case 2:
                        nuevoValorDado = 5;
                        break;
                    case 3:
                        nuevoValorDado = 6;
                        break;
                    case 4:
                        nuevoValorDado = 1;
                        break;
                    case 5:
                        nuevoValorDado = 2;
                        break;
                    case 6:
                        nuevoValorDado = 3;
                        break;
                    default:
                        break;
                }
                imageDado = new ImageIcon(getClass().getResource("/resources/" + nuevoValorDado +".png"));
                dadoAAccionar.setIcon(imageDado);

                switch (dadoAAccionar.getName()) {
                    case "dado1":
                        objetoModelGeekOutMaster.caras[0] = nuevoValorDado;
                        break;
                    case "dado2":
                        objetoModelGeekOutMaster.caras[1] = nuevoValorDado;
                        break;
                    case "dado3":
                        objetoModelGeekOutMaster.caras[2] = nuevoValorDado;
                        break;
                    case "dado4":
                        objetoModelGeekOutMaster.caras[3] = nuevoValorDado;
                        break;
                    case "dado5":
                        objetoModelGeekOutMaster.caras[4] = nuevoValorDado;
                        break;
                    case "dado6":
                        objetoModelGeekOutMaster.caras[5] = nuevoValorDado;
                        break;
                    case "dado7":
                        objetoModelGeekOutMaster.caras[6] = nuevoValorDado;
                        break;
                    case "dado8":
                        objetoModelGeekOutMaster.caras[7] = nuevoValorDado;
                        break;
                    case "dado9":
                        objetoModelGeekOutMaster.caras[8] = nuevoValorDado;
                        break;
                    case "dado10":
                        objetoModelGeekOutMaster.caras[9] = nuevoValorDado;
                        break;
                    default:
                        break;
                }

                break;
            case 6:
                //"42"
                break;
            default:
                break;
        }
    }

    public void sacarInactivo(JButton dadoAccionado){
        dadosActivos.remove(dadoAccionado);
        dadosUtilizados.add(dadoAccionado);
        dadoAccionado.setEnabled(false);

        int caraAsistente = 0;

        for(int i = 0;i<vectorDadosInactivos.length;i++){
            if(vectorDadosInactivos[i] != null){
                asistente = i;
            }
        }

        if(asistente==0){
            JOptionPane.showMessageDialog(null, "No hay ningún dado en inactivos");
        }else {
            caraAsistente = objetoModelGeekOutMaster.getCara(dadoAccionado);
            efectos(caraAsistente, dadoAccionado, vectorDadosInactivos[asistente]);
        }
    }

    private class Escucha implements ActionListener {

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

            if(flag == 0){
                dadoAccion = null;
                dadoAccionar = null;
                cara = 0;
            }

            if (objetoModelGeekOutMaster.estado == 1) {
                if(e.getSource()==dado1){
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado1);
                        if(objetoModelGeekOutMaster.getCara(dado1) == 6 || objetoModelGeekOutMaster.getCara(dado1) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una acción");
                        }else if (objetoModelGeekOutMaster.getCara(dado1)== 3){
                            dadoAccion = dado1;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado1;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado1;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado2) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado2);
                        if(objetoModelGeekOutMaster.getCara(dado2) == 6 || objetoModelGeekOutMaster.getCara(dado2) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado2)== 3){
                            dadoAccion = dado2;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado2;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado2;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado3) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado3);
                        if(objetoModelGeekOutMaster.getCara(dado3) == 6 || objetoModelGeekOutMaster.getCara(dado3) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado3)== 3){
                            dadoAccion = dado3;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado3;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado3;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado4) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado4);
                        if(objetoModelGeekOutMaster.getCara(dado4) == 6 || objetoModelGeekOutMaster.getCara(dado4) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado4)== 3){
                            dadoAccion = dado4;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado4;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado4;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado5) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado5);
                        if(objetoModelGeekOutMaster.getCara(dado5) == 6 || objetoModelGeekOutMaster.getCara(dado5) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado5)== 3){
                            dadoAccion = dado5;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado5;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado5;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado6) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado6);
                        if(objetoModelGeekOutMaster.getCara(dado6) == 6 || objetoModelGeekOutMaster.getCara(dado6) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado6)== 3){
                            dadoAccion = dado6;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado6;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado6;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado7) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado7);
                        if(objetoModelGeekOutMaster.getCara(dado7) == 6 || objetoModelGeekOutMaster.getCara(dado7) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado7)== 3){
                            dadoAccion = dado7;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado7;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado7;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado8) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado8);
                        if(objetoModelGeekOutMaster.getCara(dado8) == 6 || objetoModelGeekOutMaster.getCara(dado8) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado8)== 3){
                            dadoAccion = dado8;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado8;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado8;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado9) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado9);
                        if(objetoModelGeekOutMaster.getCara(dado9) == 6 || objetoModelGeekOutMaster.getCara(dado9) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado9)== 3){
                            dadoAccion = dado9;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado9;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado9;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }else if (e.getSource() == dado10) {
                    if(flag == 0){
                        cara = objetoModelGeekOutMaster.getCara(dado10);
                        if(objetoModelGeekOutMaster.getCara(dado10) == 6 || objetoModelGeekOutMaster.getCara(dado10) ==2){
                            JOptionPane.showMessageDialog(null,"Este dado no tiene una accióm");
                        }else if (objetoModelGeekOutMaster.getCara(dado10)== 3){
                            dadoAccion = dado10;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            dadoAccion = dado10;
                            dadoAccion.setEnabled(false);
                            flag = 1;
                        }
                    }else if (flag == 1){
                        dadoAccionar = dado10;
                        dadoAccion.setEnabled(true);
                        efectos(cara, dadoAccion, dadoAccionar);
                        flag = 0;
                    }
                }
            }


            if (e.getSource() == lanzar) {

                vectorDadosInactivos[0] = dado8;
                vectorDadosInactivos[1] = dado9;
                vectorDadosInactivos[2] = dado10;
                vectorDadosInactivos[3] = null;
                vectorDadosInactivos[4] = null;
                vectorDadosInactivos[5] = null;
                vectorDadosInactivos[6] = null;

                objetoModelGeekOutMaster.calcularDados();
                int[] caras = objetoModelGeekOutMaster.getCaras();
                System.out.println(caras[0] + " " + caras[1] + " " + caras[2] + " " + caras[3] + " " + caras[4] + " " + caras[5] + " " + caras[6] + " " + caras[7] + " " + caras[8] + " " + caras[9]);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[0] + ".png"));
                dado1.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[1] + ".png"));
                dado2.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[2] + ".png"));
                dado3.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[3] + ".png"));
                dado4.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[4] + ".png"));
                dado5.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[5] + ".png"));
                dado6.setIcon(imageDado);
                imageDado = new ImageIcon(getClass().getResource("/resources/" + caras[6] + ".png"));
                dado7.setIcon(imageDado);

                for(int i = 0;i<3;i++){
                    System.out.println(vectorDadosInactivos[i].getName());
                }

                if (objetoModelGeekOutMaster.estado == 0) {
                    lanzar.setEnabled(false);
                    objetoModelGeekOutMaster.estado = 1;
                } else {
                    lanzar.setEnabled(true);
                    objetoModelGeekOutMaster.estado = 0;
                }

            } else if (e.getSource() == ayuda) {
                imageAyuda = new ImageIcon(getClass().getResource("/resources/hojaAyuda.png"));
                JOptionPane.showMessageDialog(rootPane, " ", "Hoja de ayuda", JOptionPane.PLAIN_MESSAGE, imageAyuda);
            } else if (e.getSource() == repetir) {
                lanzar.setEnabled(true);
                objetoModelGeekOutMaster.estado = 0;
                establecerDefecto();
                for (int i = 0; i < 50; ++i) System.out.println();
            }

            repaint();
            revalidate();
        }
    }
}