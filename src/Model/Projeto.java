
package Model;

import java.util.ArrayList;
import java.util.Calendar;




public class Projeto {
private long id;
private String descricaoGeral;
private Calendar dataDeCriacao;
private Calendar dataDeFinalizacao;
private Backlog backlog;

public Projeto(long id, String descricaoGeral) {
this.id = id;
this.descricaoGeral = descricaoGeral;
dataDeCriacao = Calendar.getInstance();
}

public boolean finalizar(){
dataDeFinalizacao = Calendar.getInstance();
return true;
}

public long getId() {
return id;
}

public void setId(long id) {
this.id = id;
}

public String getDescricaoGeral() {
return descricaoGeral;
}

public void setDescricaoGeral(String descricaoGeral) {
this.descricaoGeral = descricaoGeral;
}

public Backlog getBacklog() {
return backlog;
}

public void setBacklog(Backlog backlog) {
this.backlog = backlog;
}
}

