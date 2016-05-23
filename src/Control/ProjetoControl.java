package Control;





public class ProjetoControl {

private static ProjetoControl ControladorProjeto = null;

public static ProjetoControl getInstance(){
	
if(ControladorProjeto == null){
ControladorProjeto = new ProjetoControl();
return ControladorProjeto;
}
return ControladorProjeto;
}
public void cadastrarProjeto(){
}
public void deletarProjeto(){
}
public void editarProjeto(){
}

public void listarProjeto(){
}
}



