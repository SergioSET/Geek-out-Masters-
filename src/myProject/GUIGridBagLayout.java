package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIGridBagLayout extends JFrame {

    private Header headerProject;
    public JButton dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private ImageIcon imageDado, imageAyuda, imagen42;
    public JPanel dadosActivos, puntaje, dadosInactivos, dadosUtilizados;
    public JButton ayuda, lanzar, repetir;
    private Escucha escucha;
    private JSeparator c;
    private JPanel d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
    private JLabel puntaje1, puntaje2, puntaje3, puntaje4, puntaje5, puntaje6, puntaje7, puntaje8, puntaje9, puntaje10;
    private JLabel rondaActual, puntuacionJuego;
    private int flag, cara;
    private int contadorDragones = 0, contador42 = 0, contadorOtrosDados = 0, contador42Juego = 0;
    private JButton dadoAccion, dadoAccionar;
    private ModelGeekOutMaster objetoModelGeekOutMaster;
    private Dado objetoDado;
    private JButton[] vectorDadosInactivos;
    private JButton[] vectorDadosActivos;
    private JLabel[] vectorPuntajes;
    private int asistente = -1;
    private boolean puedeFinalizarRonda = false;
    private int ronda = 1, puntosRonda = 0, puntosJuego = 0;

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
        vectorDadosActivos = new JButton[7];
        vectorPuntajes = new JLabel[10];

        headerProject = new Header("Geek Out! Masters", Color.BLACK);

        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;

        this.add(headerProject, constraints);

        imagen42 = new ImageIcon(getClass().getResource("/resources/6.png"));

        puntaje1 = new JLabel("");
        vectorPuntajes[0] = puntaje1;
        d1 = new JPanel();
        d1.setPreferredSize(new Dimension(71, 90));
        d1.setBorder(BorderFactory.createTitledBorder("1"));
        d1.add(puntaje1);

        puntaje2 = new JLabel("");
        vectorPuntajes[1] = puntaje2;
        d2 = new JPanel();
        d2.setPreferredSize(new Dimension(71, 90));
        d2.setBorder(BorderFactory.createTitledBorder("3"));
        d2.add(puntaje2);

        puntaje3 = new JLabel("");
        vectorPuntajes[2] = puntaje3;
        d3 = new JPanel();
        d3.setPreferredSize(new Dimension(71, 90));
        d3.setBorder(BorderFactory.createTitledBorder("6"));
        d3.add(puntaje3);

        puntaje4 = new JLabel("");
        vectorPuntajes[3] = puntaje4;
        d4 = new JPanel();
        d4.setPreferredSize(new Dimension(71, 90));
        d4.setBorder(BorderFactory.createTitledBorder("10"));
        d4.add(puntaje4);

        puntaje5 = new JLabel("");
        vectorPuntajes[4] = puntaje5;
        d5 = new JPanel();
        d5.setPreferredSize(new Dimension(71, 90));
        d5.setBorder(BorderFactory.createTitledBorder("15"));
        d5.add(puntaje5);

        puntaje6 = new JLabel("");
        vectorPuntajes[5] = puntaje6;
        d6 = new JPanel();
        d6.setPreferredSize(new Dimension(71, 90));
        d6.setBorder(BorderFactory.createTitledBorder("21"));
        d6.add(puntaje6);

        puntaje7 = new JLabel("");
        vectorPuntajes[6] = puntaje7;
        d7 = new JPanel();
        d7.setPreferredSize(new Dimension(71, 90));
        d7.setBorder(BorderFactory.createTitledBorder("28"));
        d7.add(puntaje7);

        puntaje8 = new JLabel("");
        vectorPuntajes[7] = puntaje8;
        d8 = new JPanel();
        d8.setPreferredSize(new Dimension(71, 90));
        d8.setBorder(BorderFactory.createTitledBorder("36"));
        d8.add(puntaje8);

        puntaje9 = new JLabel("");
        vectorPuntajes[8] = puntaje9;
        d9 = new JPanel();
        d9.setPreferredSize(new Dimension(71, 90));
        d9.setBorder(BorderFactory.createTitledBorder("45"));
        d9.add(puntaje9);

        puntaje10 = new JLabel("");
        vectorPuntajes[9] = puntaje10;
        d10 = new JPanel();
        d10.setPreferredSize(new Dimension(71, 90));
        d10.setBorder(BorderFactory.createTitledBorder("55"));
        d10.add(puntaje10);

        puntaje = new JPanel();
        puntaje.setPreferredSize(new Dimension(460, 100));
        puntaje.setBorder(BorderFactory.createTitledBorder("PUNTAJE"));

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.anchor = GridBagConstraints.NORTH;

        rondaActual = new JLabel("Ronda actual: " + ronda);

        puntuacionJuego = new JLabel("Puntuación total: " + puntosJuego);

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
        puntaje.add(rondaActual);
        puntaje.add(puntuacionJuego);

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

        repetir = new JButton("Reiniciar juego");
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

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GUIGridBagLayout miProjectGUI = new GUIGridBagLayout();
        });
    }

    /**
     * Método que retorna si solo hay un dado en el vector brindado
     *
     * @return boolean
     */

    public boolean unicoDadoEnVector (JButton[] vectorAVerificar){
        int contadorDados = 0;
        for(int i = 0;i<7;i++){
            if(vectorAVerificar[i]!=null){
                contadorDados = contadorDados + 1;
            }
        }

        if(contadorDados == 1){
            //JOptionPane.showMessageDialog(null, "Solo hay un dado en activos");
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que retorna si un vector está vacío o no
     *
     * @return boolean
     */

    public boolean vectorVacio (JButton[] vectorAVerificar){
        int contadorDados = 0;
        for(int i = 0;i<7;i++){
            if(vectorAVerificar[i]!=null){
                contadorDados = contadorDados + 1;
            }
        }

        if(contadorDados == 0){
            //JOptionPane.showMessageDialog(null, "No hay dados en activos");
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que realiza las acciones de los dados
     *
     * @return void
     */

    public void efectos(int efecto, JButton dadoConAccion, JButton dadoAAccionar){

        //System.out.println(efecto + " - " + dadoConAccion.getName()+ " - " + dadoAAccionar.getName());

        int[] caras = objetoModelGeekOutMaster.getCaras();
        //System.out.println(caras[0] + " " + caras[1] + " " + caras[2] + " " + caras[3] + " " + caras[4] + " " + caras[5] + " " + caras[6] + " " + caras[7] + " " + caras[8] + " " + caras[9]);

        int nuevoValorDado = 0;

        switch (efecto){
            //Meeple
            case 1:
                dadoAccion.setEnabled(false);
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);

                for(int i = 0;i<7;i++){
                    if(vectorDadosActivos[i]==dadoConAccion){
                        vectorDadosActivos[i]=null;
                        i = 8;
                    }
                }

                nuevoValorDado = objetoDado.calculateCara();
                //System.out.println("El nuevo valor del dado es: "+ nuevoValorDado);
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
                //System.out.println(caras[0] + " " + caras[1] + " " + caras[2] + " " + caras[3] + " " + caras[4] + " " + caras[5] + " " + caras[6] + " " + caras[7] + " " + caras[8] + " " + caras[9]);

                break;
            case 3:
                //"Corazon"
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);
                dadoConAccion.setEnabled(false);

                for(int i = 0;i<7;i++){
                    if(vectorDadosActivos[i]==dadoConAccion){
                        vectorDadosActivos[i]=null;
                        i = 8;
                    }
                }

                nuevoValorDado = objetoDado.calculateCara();

                //System.out.println("El nuevo valor del dado es: "+ nuevoValorDado);
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

                dadosInactivos.remove(dadoAAccionar);
                dadosActivos.add(dadoAAccionar);
                dadoAAccionar.setEnabled(true);

                dadoAAccionar.setIcon(imageDado);

                for(int i = 0; i<7;i++){
                    if(vectorDadosActivos[i] == null){
                        vectorDadosActivos[i] = dadoAAccionar;
                        i = 8;
                    }
                }

                for(int i = 0; i<7;i++){
                    if(vectorDadosInactivos[i] == dadoAAccionar){
                        vectorDadosInactivos[i] = null;
                        i = 8;
                    }
                }

                break;
            case 4:
                //"Cohete"
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);
                dadoAccion.setEnabled(false);

                for(int i = 0;i<7;i++){
                    if(vectorDadosActivos[i]==dadoConAccion){
                        vectorDadosActivos[i]=null;
                        i = 8;
                    }
                }

                dadosActivos.remove(dadoAAccionar);
                dadosInactivos.add(dadoAAccionar);
                dadoAAccionar.setEnabled(false);

                for(int i = 0;i<7;i++){
                    if(vectorDadosActivos[i] == dadoAAccionar){
                        vectorDadosActivos[i] = null;
                        i = 8;
                    }
                }

                for(int i = 0; i<7;i++){
                    if(vectorDadosInactivos[i] == null){
                        vectorDadosInactivos[i] = dadoAAccionar;
                        i = 8;
                    }
                }

                break;
            case 5:
                //"Superheroe"
                dadosActivos.remove(dadoConAccion);
                dadosUtilizados.add(dadoConAccion);
                dadoAccion.setEnabled(false);

                for(int i = 0;i<7;i++){
                    if(vectorDadosActivos[i]==dadoConAccion){
                        vectorDadosActivos[i]=null;
                        i = 8;
                    }
                }

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
            default:
                break;
        }

        for(int i = 0;i<7;i++){
            if(vectorDadosInactivos[i]!=null){
                System.out.println("inactivos: " + vectorDadosInactivos[i].getName());
            }
        }
        for(int i = 0;i<7;i++){
            if(vectorDadosActivos[i]!=null){
                System.out.println("activos: " + vectorDadosActivos[i].getName());
            }
        }
    }

    /**
     * Método que retorna el juego a sus valores iniciales
     *
     * @return void
     */

    public void reiniciarJuego() {
        lanzar.setEnabled(true);

        imageDado = new ImageIcon(getClass().getResource("/resources/neutro.png"));
        puntaje1.setIcon(null);
        puntaje2.setIcon(null);
        puntaje3.setIcon(null);
        puntaje4.setIcon(null);
        puntaje5.setIcon(null);
        puntaje6.setIcon(null);
        puntaje7.setIcon(null);
        puntaje8.setIcon(null);
        puntaje9.setIcon(null);
        puntaje10.setIcon(null);
        puntaje1.setIcon(null);

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
        contadorDragones = 0;
        contador42Juego = 0;
        contador42 = 0;
        contadorOtrosDados = 0;
        ronda = 1;
        puntosJuego = 0;
        puntosRonda = 0;

        rondaActual.setText("Ronda actual: " + ronda);
        puntuacionJuego.setText("Puntuación total: " + puntosJuego);
    }

    /**
     * Método que retorna los valores necesarios para pasar a la siguiente ronda
     *
     * @return void
     */

    public void pasarRonda() {

        if(ronda <= 5 && puntosJuego < 30){

            lanzar.setEnabled(true);

            imageDado = new ImageIcon(getClass().getResource("/resources/neutro.png"));

            for(int i = 0;i<=9;i++){
                if(vectorPuntajes[i].getIcon() == null){
                    if(i>=contador42Juego){
                        i = 11;
                    }else{
                        vectorPuntajes[i].setIcon(imagen42);
                    }
                }
            }

            if(contador42Juego == 0) {
                for(int i = 0;  i<=9;i++){
                    vectorPuntajes[i].setIcon(null);
                }
            }

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
            contadorDragones = 0;
            contador42 = 0;
            contadorOtrosDados = 0;

        }else if(ronda > 5 && puntosJuego > 30){
            JOptionPane.showMessageDialog(null, "Ganaste el juego, ¡Felicidades!, ahora se reiniciará el juego, por si quieres empezar otra vez");
            reiniciarJuego();
        }else if(ronda > 5 && puntosJuego < 30){
            JOptionPane.showMessageDialog(null, "Perdiste el juego, ahora se reiniciará el juego, por si quieres empezar otra vez");
            reiniciarJuego();
        }

    }

    /**
     * Método que determina si se puede acabar la ronda o no
     *
     * @return void
     */

    public void terminarRonda(){

        puedeFinalizarRonda = calcularEstadoRonda();

        if(puedeFinalizarRonda == true){

            switch (contador42Juego){
                case 0:
                    puntosJuego = 0;
                    break;
                case 1:
                    puntosJuego = 1;
                    break;
                case 2:
                    puntosJuego = 3;
                    break;
                case 3:
                    puntosJuego = 6;
                    break;
                case 4:
                    puntosJuego = 10;
                    break;
                case 5:
                    puntosJuego = 15;
                    break;
                case 6:
                    puntosJuego = 21;
                    break;
                case 7:
                    puntosJuego = 28;
                    break;
                case 8:
                    puntosJuego = 36;
                    break;
                case 9:
                    puntosJuego = 45;
                    break;
                case 10:
                    puntosJuego = 55;
                    break;
                default:
                    break;
            }

            ronda = ronda + 1;
            rondaActual.setText("Ronda actual: " + ronda);
            puntuacionJuego.setText("Puntuación total: " + puntosJuego);
            pasarRonda();

        }else{
            JOptionPane.showMessageDialog(null, "Aún puedes realizar movimientos.");
        }
    }

    /**
     * Método que determina la cantidad de dados activos y las condiciones para acabar la ronda
     *
     * @return boolean
     */

    public boolean calcularEstadoRonda(){

        int valorAyuda = 0;

        for(int i = 0;i<vectorDadosActivos.length;i++){
            if(vectorDadosActivos[i] != null){
                valorAyuda = objetoModelGeekOutMaster.getCara(vectorDadosActivos[i]);
                if(valorAyuda==6){
                    contador42 = contador42 + 1;
                    //System.out.println("Se registró un 42");
                }else if(valorAyuda==2){
                    contadorDragones = contadorDragones + 1;
                    //System.out.println("Se registró un dragon");
                }else{
                    contadorOtrosDados = contadorOtrosDados + 1;
                    //System.out.println("Se registró otra cosa");
                }
            }
        }

        contador42Juego = contador42Juego + contador42;

        if(contador42 >= 1 && contadorDragones == 0 && contadorOtrosDados == 0){
            JOptionPane.showMessageDialog(null, "Dados con valor 42 en esta ronda: " + contador42);
            return true;
        }else if(contador42 >= 0 && contadorDragones >= 1 && contadorOtrosDados == 0){
            contador42Juego = 0;
            JOptionPane.showMessageDialog(null, "Quedaste con dragones como últimos dados, has pérdido todos tus puntos");
            return true;
        }else if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
            JOptionPane.showMessageDialog(null, "No obtuviste ningún 42 en esta ronda, conservas tus puntos");
            return true;
        }
        return false;
    }

    /**
     * Método que retorna el dado a sacar de inactivo, causado por un dado corazón
     *
     * @return void
     */

    public void sacarInactivo(JButton dadoAccionado){
        int caraAsistente = 0;

        for(int i = 0;i<7;i++){
            if(vectorDadosInactivos[i] != null){
                asistente = i;
            }
        }

        if(vectorDadosInactivos[asistente]==null){
            dadosActivos.remove(dadoAccionado);
            dadosUtilizados.add(dadoAccionado);
            dadoAccionado.setEnabled(false);

            for(int i = 0;i<7;i++){
                if(vectorDadosActivos[i]==dadoAccionado){
                    vectorDadosActivos[i]=null;
                    i = 8;
                }
            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado1)== 3){
                            dadoAccion = dado1;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado1;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado2)== 3){
                            dadoAccion = dado2;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado2;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado3)== 3){
                            dadoAccion = dado3;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado3;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado4)== 3){
                            dadoAccion = dado4;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado4;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado5)== 3){
                            dadoAccion = dado5;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado5;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado6)== 3){
                            dadoAccion = dado6;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado6;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado7)== 3){
                            dadoAccion = dado7;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado7;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado8)== 3){
                            dadoAccion = dado8;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado8;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado9)== 3){
                            dadoAccion = dado9;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado9;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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
                            terminarRonda();
                        }else if (objetoModelGeekOutMaster.getCara(dado10)== 3){
                            dadoAccion = dado10;
                            dadoAccion.setEnabled(false);
                            sacarInactivo(dadoAccion);
                        }else{
                            if(unicoDadoEnVector(vectorDadosActivos) || vectorVacio(vectorDadosActivos)){
                                terminarRonda();
                            }else{
                                dadoAccion = dado10;
                                dadoAccion.setEnabled(false);
                                flag = 1;
                            }
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

                vectorDadosActivos[0] = dado1;
                vectorDadosActivos[1] = dado2;
                vectorDadosActivos[2] = dado3;
                vectorDadosActivos[3] = dado4;
                vectorDadosActivos[4] = dado5;
                vectorDadosActivos[5] = dado6;
                vectorDadosActivos[6] = dado7;

                objetoModelGeekOutMaster.calcularDados();
                int[] caras = objetoModelGeekOutMaster.getCaras();
                //System.out.println(caras[0] + " " + caras[1] + " " + caras[2] + " " + caras[3] + " " + caras[4] + " " + caras[5] + " " + caras[6] + " " + caras[7] + " " + caras[8] + " " + caras[9]);
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

                if (objetoModelGeekOutMaster.estado == 0) {
                    lanzar.setEnabled(false);
                    objetoModelGeekOutMaster.estado = 1;
                } else {
                    lanzar.setEnabled(true);
                    objetoModelGeekOutMaster.estado = 0;
                }

/*                for(int i = 0;i<7;i++){
                    if(vectorDadosInactivos[i]!=null){
                        System.out.println("inactivos: " + vectorDadosInactivos[i].getName());
                    }
                }

                for(int i = 0;i<7;i++){
                    if(vectorDadosActivos[i]!=null){
                        System.out.println("activos: " + vectorDadosActivos[i].getName());
                    }
                }*/

            } else if (e.getSource() == ayuda) {
                imageAyuda = new ImageIcon(getClass().getResource("/resources/hojaAyuda.png"));
                JOptionPane.showMessageDialog(rootPane, " ", "Hoja de ayuda", JOptionPane.PLAIN_MESSAGE, imageAyuda);
            } else if (e.getSource() == repetir) {
                reiniciarJuego();
                //for (int i = 0; i < 50; ++i) System.out.println();
            }

            repaint();
            revalidate();
        }
    }
}