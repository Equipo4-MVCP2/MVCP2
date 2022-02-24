/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Stevia
 */
import pkgModelo.MDB;
import Vista.FrmSeguimientoClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ControladorSeguimientoClientes implements ActionListener{
  private FrmSeguimientoClientes _view; //el formulario 
  private MDB _model;//el manejador de bases de datos
  
    public ControladorSeguimientoClientes(FrmSeguimientoClientes view, MDB model){
       this._model=model;
       this._view=view;
       this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
       this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
            
        leyenda=_model.registrarAlta("TbUsuarios"," null, ' " +_view.jTextField1.getText()+" ',' " +_view.jTextField10.getText() +" ', "+_view.jTextField11.getText()+" ', "+_view.jTextField12.getText()+" ', "+_view.jTextField13.getText()+" ', "+_view.jTextField14.getText()+" ', "+_view.jTextField15.getText()+" ', "+_view.jTextField16.getText()+" ', "+_view.jTextField17.getText()+" ', "+_view.jTextField2.getText()+" ', "+_view.jTextField3.getText()+" ', "+_view.jTextField4.getText()+" ', "+_view.jTextField5.getText()+" ', "+_view.jTextField6.getText()+" ', "+_view.jTextField7.getText()+" ', "+_view.jTextField8.getText()+" ', "+_view.jTextField9.getText()+" ', "+_view.txtAcuerdoNum4.getText()+" ', "+_view.txtDiasMora.getText()+" ', "+_view.txtFechAcuerdo4.getText()+" ', "+_view.txtFechaMora.getText()+" ', "+_view.txtInteresMora.getText()+" ', "+_view.txtNumFactura.getText()+" ', "+_view.txtTelResidencia.getText()+" ', "+_view.txtTelTrabajo.getText()+" ', "+_view.txtTipoCartera.getText()+" ', "+_view.txtValorMora.getText()+" ', "+_view.txtValorSeguro.getText()+" ', ");
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
        JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){

      _view.jTextField1.setText(null);
_view.jTextField2.setText(null);
_view.jTextField3.setText(null);
_view.jTextField4.setText(null);
_view.jTextField5.setText(null);
_view.jTextField6.setText(null);
_view.jTextField7.setText(null);
_view.jTextField8.setText(null);
_view.jTextField8.setText(null);
_view.jTextField9.setText(null);
_view.jTextField10.setText(null);
_view.jTextField11.setText(null);
_view.jTextField12.setText(null);
_view.jTextField13.setText(null);
_view.jTextField14.setText(null);
_view.jTextField15.setText(null);
_view.jTextField16.setText(null);
_view.jTextField17.setText(null);
_view.txtAcuerdoNum4.setText(null);
_view.txtDiasMora.setText(null);
_view.txtFechAcuerdo4.setText(null);
_view.txtFechaMora.setText(null);
_view.txtInteresMora.setText(null);
_view.txtNumFactura.setText(null);
_view.txtTelResidencia.setText(null);
_view.txtTelTrabajo.setText(null);
_view.txtTipoCartera.setText(null);
_view.txtValorMora.setText(null);
_view.txtValorSeguro.setText(null);  
}
}