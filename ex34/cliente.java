package ex34;

public class cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setContaBancaria(ContaBancaria conta) {
		this.conta = conta;
	}
	
	public int getId(int id) {
		return this.id;
	}
	
    public String getNome(String nome) {
		return this.nome;
	}
    
    public int getIdade(int idade) {
		return this.idade;
    }
    
    public String getEmail(String email) {
		return this.email;
    }
    
    public ContaBancaria getContaBancaria(ContaBancaria conta) {
    	return this.conta; 
    }
	
	cliente(){
		
	}
	
	cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta; 
		}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		return this.nome + "-" + this.idade;
	}
	
	public String exibirDadosConta() {
		if (this.conta != null) 
		    return "Ag: " + this.conta.agencia + "-" + this.conta.numero;
		else
	    	return "Nao tem conta!";
	}
	
}