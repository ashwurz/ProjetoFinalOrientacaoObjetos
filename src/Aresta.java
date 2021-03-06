/**
 / Classe Arestas.
 **/

public class Aresta
{
    /// Construtor para criação de Arestas com os Vertices de Origem e Destino, peso e quadrante.
    public Aresta(Vertice origem, Vertice destino, int peso, int quadrante)
    {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
        this.quadrante = quadrante;
    }

    public int getPeso()
    {
        return peso;
    }

    public Vertice getDestino()
    {
        return destino;
    }

    public Vertice getOrigem()
    {
        return origem;
    }

    public void setCoordenadas(int[][] coordenadas)
    {
        this.coordenadas = coordenadas;
    }

    public int[][] getCoordenadas() {
        return coordenadas;
    }

    public void setDirecao(String direcao)
    {
        this.direcao = direcao;
    }

    public String getDirecao() {
        return direcao;
    }

    public int getQuadrante() {
        return quadrante;
    }

    protected Vertice origem, destino;
    protected int peso, quadrante;
    /// matriz que indica as coordenadas das "ruas" no mundo
    /// {{coordenada inicial X, coordenada final X},{coordenada inicial Y, coordenada final Y}}
    protected int [][] coordenadas = {{0,0},{0,0}};
    protected String direcao;



}
