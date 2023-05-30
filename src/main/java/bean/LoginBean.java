package bean;

import java.util.List;

import javax.faces.application.FacesMessage;import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.LoginDao;
import entidades.Login;
import static util.MessageUtil.*;

@ManagedBean
public class LoginBean {
	private Login login = new Login();
	private List<Login> lista;
	
	public String salvar() {
		try {
			LoginDao.salvar(login);
			sucesso("Sucesso","seu Login foi salvo");
			login = new Login();
		} catch (Exception e) {
			erro("Erro", "seu Login não foi salvo");
		}
		return null;
	}
	
	public String logar() {
		try {	
			LoginDao.logar(login);
			sucesso("Sucesso","seu Login foi aprovado");
			login = new Login();
			return "listagem_incidente.index";
		} catch (Exception e) {
			erro("Erro", "seu Login não foi aprovado");
		}
		return null;
		
	}
	
	public String excluir() {
		try {
			LoginDao.excluir(login);
			sucesso("Sucesso","seu Login foi apagado");
			login = new Login();
		} catch (Exception e) {
			erro("Erro", "seu Login não foi apagado");
		}
		return null;
		
	}
	
	public String editar() {
		try {
			LoginDao.editar(login);
			sucesso("Sucesso","seu Login foi editada");
			login = new Login();
		} catch (Exception e) {
			erro("Erro", "seu Login não foi editada");
		}
		return null;
		
	}
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public List<Login> getLista() {
		if (lista == null) {
			lista = LoginDao.listarTodos();
		}
		return lista;
	}
	public void setListaLogin(List<Login> lista) {
		this.lista = lista;
	}

}
