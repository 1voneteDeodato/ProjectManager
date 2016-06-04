package Facade;


import Control.UsuarioControl;
import java.util.ArrayList;
import Model.Usuario;

//Foi criada a classe Facade.
public class Facade {



public static boolean CadastrarUsuario(Usuario usuario){
return UsuarioControl.CadastrarUsuario(usuario);
}
public static boolean DeletarUsuario(Usuario usuario){
return UsuarioControl.DeletarUsuario(usuario);
}
public static boolean EditarUsuario(Usuario usuario){
return UsuarioControl.EditarUsuario(usuario);
}
public static ArrayList<Usuario> listarUsuarios(){
return UsuarioControl.listarUsuario();
}



}
