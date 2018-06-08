package busca;

import java.util.ArrayList;
import java.util.List;

import estrutura.Fila;
import mapa.Adjacente;
import mapa.Cidade;
import mapa.Mapa;

public class Amplitude {
	
	private Fila fronteira;
	private Cidade inicio;
	private Cidade objetivo;
	private boolean achou;	
	
	public Amplitude(Cidade inicio, Cidade objetivo) {
		this.inicio = inicio;
		this.inicio.setVisitado(true);
		this.objetivo = objetivo;
		this.fronteira = new Fila(20);
		this.fronteira.enfileirar(inicio);
		this.achou = false;
	}
	
	public void buscar() {
		Cidade primeiro = fronteira.getPrimeiro();
		
		System.out.println("primeiro: " + primeiro.getNome());
		if (primeiro == objetivo) {
			this.achou = true;
			System.out.println("ACHEI O OBJETIVO:"+primeiro.getNome());
		} else {
			System.out.println("desenfileirou: " + this.fronteira.desenfileirar().getNome());
			for (Adjacente adjacente : primeiro.getAdjacentes()) {
				System.out.println("verificando se já visitado: " + adjacente.getCidade().getNome());

				if (!adjacente.getCidade().isVisitado()) {
					adjacente.getCidade().setVisitado(true);
					adjacente.getCidade().setPai(primeiro);
					fronteira.enfileirar(adjacente.getCidade());
				}

			}
			if (this.fronteira.getNumeroElementos() > 0) {
				this.buscar();
			}
		}
	}

	public static void main(String args[]) {
		Mapa mapa = new Mapa();
		Amplitude amp = new Amplitude(mapa.getPortoUniao(), mapa.getCuritiba());
		amp.buscar();
		System.out.print(amp.imprimirCaminho(amp.fronteira.getPrimeiro()));
		System.out.print(" ---- FIM");
	}
	
	private String imprimirCaminho(Cidade cidade) {
		if (cidade.getPai() != null) {
			return imprimirCaminho(cidade.getPai()) + "--->" + cidade.getNome();
		}
		System.out.print("----- INICIO: ");
		return cidade.getNome();

	}
}
