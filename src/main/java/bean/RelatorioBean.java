package bean;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.RelatorioDao;
import entidades.Relatorio;
import static util.MessageUtil.*;

@ManagedBean
public class RelatorioBean {
	private Relatorio relatorio = new Relatorio();
	private List<Relatorio> lista;
	
	public static Date dataCadastro(int dia, int mês, int ano)
	{
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.DAY_OF_MONTH, dia);
	    calendar.set(Calendar.MONTH, mês-1); // Janeiro é 0
	    calendar.set(Calendar.YEAR, ano);

	    return calendar.getTime();
	}

	
	public String salvar() {
		try {
			RelatorioDao.salvar(relatorio);
			sucesso("Sucesso","seu Relatorio foi salvo");
			relatorio = new Relatorio();
		} catch (Exception e) {
			erro("Erro", "seu Relatorio não foi salvo");
		}
		return null;
	}
	
	public String excluir() {
		try {
			RelatorioDao.excluir(relatorio);
			sucesso("Sucesso","seu Relatorio foi apagado");
			relatorio = new Relatorio();
		} catch (Exception e) {
			erro("Erro", "seu Relatorio não foi apagado");
		}
		return null;
		
	}
	
	public String editar() {
		try {
			RelatorioDao.excluir(relatorio);
			sucesso("Sucesso","seu Relatorio foi editada");
			relatorio = new Relatorio();
		} catch (Exception e) {
			erro("Erro", "seu Relatorio não foi editada");
		}
		return null;
		
	}
	
	public Relatorio getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}
	public List<Relatorio> getLista() {
		if (lista == null) {
			lista = RelatorioDao.listarTodos();
		}
		return lista;
	}
	public void setLista(List<Relatorio> lista) {
		this.lista = lista;
	}

}
