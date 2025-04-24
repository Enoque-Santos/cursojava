package ExercicioAula36.labs;

public class Agenda {

	private String nomeAgenda;
	private Contato[] contatos;

	public Agenda() {
		// TODO Auto-generated constructor stub
	}
	public Agenda(String nomeAgenda, Contato[] contatos) {
		
		this.nomeAgenda = nomeAgenda;
		
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	@Override
    public String toString(){
    	StringBuffer sb = new StringBuffer();
        sb.append("Nome = " + nomeAgenda + "\n");
        sb.append("\n");
        if (contatos != null){
            for (Contato c : contatos){
            	  sb.append(c.obterInfo() + "\n");
            }
        }
        
        return sb.toString();
    }
	
}
