package mapa;

import java.util.ArrayList;
import java.util.List;

public class Cidade {

	private String nome; 
	private boolean visitado; /* informa se a cidade ja foi visitada ou nao*/
	private List<Adjacente> adjacentes; /* lista de interligações entre a cidade e as outras cidades diretamente*/
	private Cidade pai;
	
	public Cidade(String nome) {
		this.nome = nome;
		this.visitado = false;
		this.adjacentes = new ArrayList<Adjacente>();
	}
	
	public void addCidadeAdjacente(Adjacente cidade) {
		this.adjacentes.add(cidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public List<Adjacente> getAdjacentes() {
		return adjacentes;
	}

	public Cidade getPai() {
		return pai;
	}

	public void setPai(Cidade pai) {
		this.pai = pai;
	}
	
	
}
