package mapa;

public class Mapa {

	private Cidade portoUniao;
	private Cidade pauloFrontin;
	private Cidade canoinhas;
	private Cidade irati;
	private Cidade palmeira;
	private Cidade campoLargo;
	private Cidade curitiba;
	private Cidade balsaNova;
	private Cidade araucaria;
	private Cidade saoJose;
	private Cidade contenda;
	private Cidade mafra;
	private Cidade tijucas;
	private Cidade lapa;
	private Cidade saoMateus;
	private Cidade tresBarras;
	
	
	public Mapa() {
		/* carregando cidades*/
		this.portoUniao = new Cidade("Porto União");
		this.pauloFrontin = new Cidade("Paulo Frontin");
		this.canoinhas = new Cidade("Canoinhas");
		this.irati = new Cidade("Irati");
		this.palmeira = new Cidade("Palmeira");
		this.campoLargo = new Cidade("Campo Largo");
		this.curitiba = new Cidade("Curitiba");
		this.balsaNova = new Cidade("Balsa Nova");
		this.araucaria = new Cidade("Araucária");
		this.saoJose = new Cidade("São José");
		this.contenda = new Cidade("Contenda");
		this.mafra = new Cidade("Mafra");
		this.tijucas = new Cidade("Tijucas");
		this.lapa = new Cidade("Lapa");
		this.saoMateus = new Cidade("São Mateus");
		this.tresBarras = new Cidade("Três Barras");
		
		/*carregando as aretas (caminhos) adjacentes*/
		
		this.portoUniao.addCidadeAdjacente(new Adjacente(pauloFrontin));
		this.portoUniao.addCidadeAdjacente(new Adjacente(canoinhas));
		this.portoUniao.addCidadeAdjacente(new Adjacente(saoMateus));
		
		this.pauloFrontin.addCidadeAdjacente(new Adjacente(portoUniao));
		this.pauloFrontin.addCidadeAdjacente(new Adjacente(irati));
		
		this.canoinhas.addCidadeAdjacente(new Adjacente(portoUniao));
		this.canoinhas.addCidadeAdjacente(new Adjacente(tresBarras));
		this.canoinhas.addCidadeAdjacente(new Adjacente(mafra));
		
		this.irati.addCidadeAdjacente(new Adjacente(pauloFrontin));
		this.irati.addCidadeAdjacente(new Adjacente(palmeira));
		this.irati.addCidadeAdjacente(new Adjacente(saoMateus));
		
		this.palmeira.addCidadeAdjacente(new Adjacente(irati));
		this.palmeira.addCidadeAdjacente(new Adjacente(saoMateus));
		this.palmeira.addCidadeAdjacente(new Adjacente(campoLargo));
		
		this.campoLargo.addCidadeAdjacente(new Adjacente(palmeira));
		this.campoLargo.addCidadeAdjacente(new Adjacente(balsaNova));
		this.campoLargo.addCidadeAdjacente(new Adjacente(curitiba));
		
		this.curitiba.addCidadeAdjacente(new Adjacente(campoLargo));
		this.curitiba.addCidadeAdjacente(new Adjacente(balsaNova));
		this.curitiba.addCidadeAdjacente(new Adjacente(araucaria));
		this.curitiba.addCidadeAdjacente(new Adjacente(saoJose));
		
		this.balsaNova.addCidadeAdjacente(new Adjacente(curitiba));
		this.balsaNova.addCidadeAdjacente(new Adjacente(campoLargo));
		this.balsaNova.addCidadeAdjacente(new Adjacente(contenda));
		
		this.araucaria.addCidadeAdjacente(new Adjacente(curitiba));
		this.araucaria.addCidadeAdjacente(new Adjacente(contenda));
		
		this.saoJose.addCidadeAdjacente(new Adjacente(curitiba));		
		this.saoJose.addCidadeAdjacente(new Adjacente(tijucas));
		
		this.contenda.addCidadeAdjacente(new Adjacente(balsaNova));		
		this.contenda.addCidadeAdjacente(new Adjacente(araucaria));
		this.contenda.addCidadeAdjacente(new Adjacente(lapa));
		
		this.mafra.addCidadeAdjacente(new Adjacente(tijucas));		
		this.mafra.addCidadeAdjacente(new Adjacente(lapa));
		this.mafra.addCidadeAdjacente(new Adjacente(canoinhas));
		
		this.tijucas.addCidadeAdjacente(new Adjacente(mafra));
		this.tijucas.addCidadeAdjacente(new Adjacente(saoJose));
		
		this.lapa.addCidadeAdjacente(new Adjacente(contenda));
		this.lapa.addCidadeAdjacente(new Adjacente(saoMateus));
		this.lapa.addCidadeAdjacente(new Adjacente(mafra));
		
		this.saoMateus.addCidadeAdjacente(new Adjacente(palmeira));
		this.saoMateus.addCidadeAdjacente(new Adjacente(irati));
		this.saoMateus.addCidadeAdjacente(new Adjacente(lapa));
		this.saoMateus.addCidadeAdjacente(new Adjacente(tresBarras));
		this.saoMateus.addCidadeAdjacente(new Adjacente(portoUniao));
        
		this.tresBarras.addCidadeAdjacente(new Adjacente(saoMateus));
		this.tresBarras.addCidadeAdjacente(new Adjacente(canoinhas));
		
	}


	public Cidade getPortoUniao() {
		return portoUniao;
	}


	public void setPortoUniao(Cidade portoUniao) {
		this.portoUniao = portoUniao;
	}


	public Cidade getPauloFrontin() {
		return pauloFrontin;
	}


	public void setPauloFrontin(Cidade pauloFrontin) {
		this.pauloFrontin = pauloFrontin;
	}


	public Cidade getCanoinhas() {
		return canoinhas;
	}


	public void setCanoinhas(Cidade canoinhas) {
		this.canoinhas = canoinhas;
	}


	public Cidade getIrati() {
		return irati;
	}


	public void setIrati(Cidade irati) {
		this.irati = irati;
	}


	public Cidade getPalmeira() {
		return palmeira;
	}


	public void setPalmeira(Cidade palmeira) {
		this.palmeira = palmeira;
	}


	public Cidade getCampoLargo() {
		return campoLargo;
	}


	public void setCampoLargo(Cidade campoLargo) {
		this.campoLargo = campoLargo;
	}


	public Cidade getCuritiba() {
		return curitiba;
	}


	public void setCuritiba(Cidade curitiba) {
		this.curitiba = curitiba;
	}


	public Cidade getBalsaNova() {
		return balsaNova;
	}


	public void setBalsaNova(Cidade balsaNova) {
		this.balsaNova = balsaNova;
	}


	public Cidade getAraucaria() {
		return araucaria;
	}


	public void setAraucaria(Cidade araucaria) {
		this.araucaria = araucaria;
	}


	public Cidade getSaoJose() {
		return saoJose;
	}


	public void setSaoJose(Cidade saoJose) {
		this.saoJose = saoJose;
	}


	public Cidade getContenda() {
		return contenda;
	}


	public void setContenda(Cidade contenda) {
		this.contenda = contenda;
	}


	public Cidade getMafra() {
		return mafra;
	}


	public void setMafra(Cidade mafra) {
		this.mafra = mafra;
	}


	public Cidade getTijucas() {
		return tijucas;
	}


	public void setTijucas(Cidade tijucas) {
		this.tijucas = tijucas;
	}


	public Cidade getLapa() {
		return lapa;
	}


	public void setLapa(Cidade lapa) {
		this.lapa = lapa;
	}


	public Cidade getSaoMateus() {
		return saoMateus;
	}


	public void setSaoMateus(Cidade saoMateus) {
		this.saoMateus = saoMateus;
	}


	public Cidade getTresBarras() {
		return tresBarras;
	}


	public void setTresBarras(Cidade tresBarras) {
		this.tresBarras = tresBarras;
	}
	
	
	
}
