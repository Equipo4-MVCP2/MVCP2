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
import Vista.FrmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorClientes implements ActionListener{
  private FrmClientes _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public ControladorClientes(FrmClientes view, MDB model){
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
            
        leyenda=_model.registrarAlta("TbUsuarios"," null, ' " +_view.txtDepartamento.getText()+" ',' " +_view.txtExpedicion.getText() +" ', "+_view.txtCedula.getText() + " ',' " + _view.txtCiudad.getText()+ " ',' " + _view.txtNombre.getText()+ " ',' " + _view.txtProfesion.getText()+ " ',' " + _view.txtResidencial.getText()+ " ',' " + _view.txtEmail.getText()+ " ',' " + _view.txtFechCredit.getText()+ " ',' " + _view.txtNumCuotas.getText()+ " ',' " + _view.txtNumFactura.getText()+ " ',' " + _view.txtTipoCartera.getText()+ " ',' " + _view.txtTrabajo.getText()+ " ',' " + _view.txtValorCredito.getText()+ " ',' " + _view.txtEmail.getText()+ " ',' " + _view.txtResidencia.getText()+" ',' ");
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
        JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
      System.out.println("holiiiis");//michel
      System.out.println("Probando");//fernando
      System.out.println("Luis Antonio");//luis
      System.out.println("Emma");//emanuel
      System.out.println("jose Luis");//yo
      System.out.println("Jesus Zahid Luna");//Zahid
}
public void iniciar(){
_view.setTitle("MVC_Visual");


}
public void limpiar(){
_view.txtCedula.setText(null);
_view.txtCiudad.setText(null);
_view.txtDepartamento.setText(null);
_view.txtEmail.setText(null);
_view.txtExpedicion.setText(null);
_view.txtFechCredit.setText(null);
_view.txtNombre.setText(null);
_view.txtNumCuotas.setText(null);
_view.txtNumFactura.setText(null);
_view.txtProfesion.setText(null);
_view.txtResidencia.setText(null);
_view.txtResidencial.setText(null);
_view.txtTipoCartera.setText(null);
_view.txtTrabajo.setText(null);
_view.txtDepartamento.setText(null);

}
}
