
package Model;


public class Usuario {
private long id;
private String login;
private String senha;
private String email;
private String nomeCompleto;

public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getLogin() {
return login;
}
public void setLogin(String login) {
this.login = login;
}
public String getSenha() {
return senha;
}
public void setSenha(String senha) {
this.senha = senha;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getNomeCompleto() {
return nomeCompleto;
}
public void setNomeCompleto(String nomeCompleto) {
this.nomeCompleto = nomeCompleto;
}
}

