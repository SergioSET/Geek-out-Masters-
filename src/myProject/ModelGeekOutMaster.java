package myProject;

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.util.Random;

public class ModelGeekOutMaster {
    public Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    public int estado;
    private int[] caras;
    private GUI gui;

    public ModelGeekOutMaster(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
        dado4 = new Dado();
        dado5 = new Dado();
        dado6 = new Dado();
        dado7 = new Dado();
        dado8 = new Dado();
        dado9 = new Dado();
        dado10 = new Dado();
        caras = new int[10];
        estado = 0;
    }

    public void calcularDados(){
        caras[0] = dado1.calculateCara();
        caras[1] = dado2.calculateCara();
        caras[2] = dado3.calculateCara();
        caras[3] = dado4.calculateCara();
        caras[4] = dado5.calculateCara();
        caras[5] = dado6.calculateCara();
        caras[6] = dado7.calculateCara();
        caras[7] = dado8.calculateCara();
        caras[8] = dado9.calculateCara();
        caras[9] = dado10.calculateCara();
    }

    public void ejecutarAccion(int cara, JButton accionRealizar, JButton cartaAplicar){
        gui = new GUI();

        System.out.println("Estas realizando la siguiente acción" + cara + "el botón que tiene esta acción es" + accionRealizar.getName() + "y la carta que se aplicará es: " + cartaAplicar.getName());
            gui.dadosActivos.remove(cartaAplicar);
            gui.dadosInactivos.add(cartaAplicar);
            gui.dadosActivos.remove(accionRealizar);
            gui.dadosUtilizados.add(accionRealizar);

    }


    public void determinarJuego(){
        if(estado == 0){

        }else{

        }

    }

    public int[] getCaras() {
        return caras;
    }

}
