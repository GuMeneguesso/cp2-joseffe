package ex33;

public class produto {
	public int id;
	public String nome;
	public double pre�o;
	public int quantidade;
	public Categoria cat;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public void setCategoria(Categoria cat) {
		this.cat = cat;
	}
	
	
	public int getId(int id) {
		return this.id;
	}
	
    public String getNome(String nome) {
		return this.nome;
	}
    
    public double getPre�o(double pre�o) {
		return this.pre�o;
    }
    
    public int getQuantidade(int quantidade) {
		return this.quantidade;
    }
    
    
    public Categoria getCategoria(Categoria cat) {
    	return this.cat; 
    }
	
	produto(){
		
	}
	
	produto(int id, String nome, double pre�o, int quantidade, Categoria cat) {
		this.id = id;
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
		this.cat = cat; 
		}
	
	
	public String exibirProdutos() {
		return "Nome: " + this.nome + "\nPre�o: " + this.pre�o + "\nQuantidade: " + this.quantidade + "\nCategoria: " + this.cat.nome;
	}
	
	
}