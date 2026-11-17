package questao2.src;
public class Participante implements Interessado {
 private String nome;
 public Participante(String nome){this.nome=nome;}
 public String getNome(){return nome;}
 public void atualizar(Lote lote,double valor){System.out.println("["+nome+"] Notificação: O lote '"+lote.getNome()+"' recebeu um novo lance de R$ "+valor);}
}