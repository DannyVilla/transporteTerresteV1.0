/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import Controlador.CtrlCamion2;
import Modelo.camion;
import Modelo.consultasTransporte;
import Vista.transporteTerreste;

/**
 *
 * @author Danny
 */
public class MainTransporte {
    
    
    public static void main(String[] args){
        camion cami = new camion();
        consultasTransporte modC = new consultasTransporte();
        transporteTerreste frm = new transporteTerreste();
        CtrlCamion2 control;
        control = new CtrlCamion2(modC, frm, mod);
        control.iniciar();
        frm.setVisible(true);
    }
}
