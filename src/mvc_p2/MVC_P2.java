/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_p2;

import Controlador.ControladorMDB;
import Controlador.ControladorClientes;
import Controlador.ControladorSeguimientoClientes;
import Vista.FrmClientes;
import Vista.FrmSeguimientoClientes;
import Vista.FrmUsuarios;
import pkgModelo.MDB;

/**
 *
 * @author lpzlu
 */
public class MVC_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        
        FrmUsuarios objVista=new FrmUsuarios();
        ControladorMDB objController;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
      
        FrmClientes objVist=new FrmClientes();
        ControladorClientes objControlle;
        objControlle = new ControladorClientes(objVist,objModelo);
        objControlle.iniciar();
        objVist.setVisible(true);

        FrmSeguimientoClientes objVis=new FrmSeguimientoClientes();
        ControladorSeguimientoClientes objControll;
        objControll = new ControladorSeguimientoClientes(objVis,objModelo);
        objControll.iniciar();
        objVis.setVisible(true);
        
    }
    
}
