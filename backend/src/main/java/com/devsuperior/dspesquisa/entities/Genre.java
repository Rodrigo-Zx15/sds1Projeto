package com.devsuperior.dspesquisa.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//mapeando coisas pro DB
@Entity
@Table(name = "tb_genre")
public class Genre implements Serializable {

	private static final long serialVersionUID = 1L;
	//mapeando pontos-chave pro BD
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	//na SDS eh usada o objeto ArrayList do proprio java
	//comentarei o ArrayList usado na SDS e usarei minha própria estrutura de lista	
	
	//associacao
	@OneToMany(mappedBy = "genre")
	//ListaGames games = new ListaGames();
	List <Game> games = new ArrayList<>();
	  
	
	public Genre() {
	
	}
	public Genre(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/*public ListaGames getLista(ListaGames lista) {
		return lista;
	}*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
