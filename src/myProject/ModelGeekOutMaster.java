package myProject;

import javax.swing.*;

/**
 * Constructor
 * */
public class ModelGeekOutMaster {
    public Dado dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    public int estado;
    public int[] caras;

    /** constructor*/

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

    /**
     * Método que calcula la cara de todos los dados
     *
     * @return void
     */

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

    /**
     * Método que identifica que cara tiene un dado según su nombre
     *
     * @return int
     */

    public int getCara(JButton dadoauxiliar){
        if(dadoauxiliar.getName()=="dado1"){
            return caras[0];
        }else if(dadoauxiliar.getName()=="dado2"){
            return caras[1];
        }else if(dadoauxiliar.getName()=="dado3"){
            return caras[2];
        }else if(dadoauxiliar.getName()=="dado4"){
            return caras[3];
        }else if(dadoauxiliar.getName()=="dado5"){
            return caras[4];
        }else if(dadoauxiliar.getName()=="dado6"){
            return caras[5];
        }else if(dadoauxiliar.getName()=="dado7"){
            return caras[6];
        }else if(dadoauxiliar.getName()=="dado8"){
            return caras[7];
        }else if(dadoauxiliar.getName()=="dado9"){
            return caras[8];
        }else if(dadoauxiliar.getName()=="dado10"){
            return caras[9];
        }
        return 0;
    }

    /**
     * Método que retorna el vector de los valores de las caras de los dados
     *
     * @return int[]
     */

    public int[] getCaras() {
        return caras;
    }
}