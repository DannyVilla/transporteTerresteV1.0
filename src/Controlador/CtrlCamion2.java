/*on de
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.consultasTransporte;
import Vista.transporteTerreste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.camion;


public class CtrlCamion2 implements ActionListener {
    
    private camion mod;
    private consultasTransporte modC;
    private transporteTerreste frm;
    
    public CtrlCamion2( consultasTransporte modC, transporteTerreste frm, camion mod){
        
        
        this.mod=mod;
        this.modC=modC;
        this.frm=frm;
        
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
        
    }
    
    public void iniciar(){
        
        frm.setTitle("Transporte Terrestre");
        frm.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == frm.btnGuardar){
            mod.setId(frm.txtId.getText());
            mod.setOrigen(frm.txtOrigen.getText());
            mod.setDestino(frm.txtDestino.getText());
            mod.setFecha(frm.txtFecha.getText());
            mod.setHora(frm.txtHora.getText());
            mod.setNum_asientos(Integer.parseInt(frm.txtNum_Asi.getText()));
            
            
            if(modC.registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
                
                
            }else{
               JOptionPane.showMessageDialog(null, "Error al guardar"); 
               limpiar();
            }
            
        }
        
        
        //_________________
        if (e.getSource() == frm.btnModificar){
            mod.setId(frm.txtId.getText());
            mod.setOrigen(frm.txtOrigen.getText());
            mod.setDestino(frm.txtDestino.getText());
            mod.setFecha(frm.txtFecha.getText());
            mod.setHora(frm.txtHora.getText());
            mod.setNum_asientos(Integer.parseInt(frm.txtNum_Asi.getText()));
            
            
            if(modC.modificar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
                
                
            }else{
               JOptionPane.showMessageDialog(null, "Error al Modificar"); 
               limpiar();
            }
            
        }
        
        //___________________
        if (e.getSource() == frm.btnEliminar){
            mod.setId(frm.txtId.getText());
           
            
            
            if(modC.eliminar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
                
                
            }else{
               JOptionPane.showMessageDialog(null, "Error al Eliminar"); 
               limpiar();
            }
            
        }
        
        if (e.getSource() == frm.btnBuscar){
            mod.setId(frm.txtId.getText());
            
            
            if(modC.eliminar(mod)){
                
                frm.txtId.setText(mod.getId());
                frm.txtOrigen.setText(mod.getOrigen());
                frm.txtDestino.setText(mod.getDestino());
                frm.txtFecha.setText(mod.getFecha());
                frm.txtHora.setText(mod.getHora());
                frm.txtNum_Asi.setText(String.valueOf(mod.getId()));
                
                
             
                
            }else{
               JOptionPane.showMessageDialog(null, "No se encontro el resultado"); 
               limpiar();
            }
            
        }
        
        if (e.getSource() == frm.btnBuscar){
            limpiar();
        }
        
        
    }
    
    public void limpiar(){
        frm.txtId.setText(null);
           frm.txtOrigen.setText(null);
              frm.txtDestino.setText(null);
                 frm.txtFecha.setText(null);
                    frm.txtHora.setText(null);
                       frm.txtNum_Asi.setText(null);
    }
    
}
