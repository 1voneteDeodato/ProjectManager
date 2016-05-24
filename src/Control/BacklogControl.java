

package Control;


public class BacklogControl {

private static BacklogControl controladorBacklog;

public static BacklogControl getInstance(){
if(controladorBacklog == null){
controladorBacklog = new BacklogControl();
return controladorBacklog;
}
return controladorBacklog;
}
public void cadastrarBacklog(){
}
public void deletarBacklog(){
}
public void editarBacklog(){
}
public void listarBacklog(){
}
//Criação da camada control.
}

