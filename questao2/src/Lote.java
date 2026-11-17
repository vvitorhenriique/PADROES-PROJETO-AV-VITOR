package questao2.src;
import java.util.*;
public class Lote {
 private String nome; private double precoInicial,precoReserva,lanceAtual; private boolean aberto;
 private RegraComissao regraComissao; private List<Interessado> interessados=new ArrayList<>(); private List<Lance> historicoLances=new ArrayList<>();
 public Lote(String nome,double inicial,double reserva,RegraComissao regra){this.nome=nome;precoInicial=inicial;precoReserva=reserva;lanceAtual=inicial;aberto=true;regraComissao=regra;}
 public void darLance(Participante p,double valor){
  if(!aberto){System.out.println("Lote "+nome+" está encerrado. Lance recusado.");return;}
  if(valor<lanceAtual*1.05){System.out.println("Lance de R$ "+valor+" recusado. Deve ser no mínimo 5% maior que o atual (R$ "+lanceAtual+").");return;}
  lanceAtual=valor;historicoLances.add(new Lance(p,valor));System.out.println("Lance aceito: R$ "+valor+" por "+p.getNome()+" no lote "+nome+".");notificarInteressados(p,valor);
 }
 private void notificarInteressados(Participante autor,double valor){for(Interessado i:interessados)if(i!=autor)i.atualizar(this,valor);}
 public void acompanhar(Interessado i){interessados.add(i);}
 public void removerAcompanhamento(Interessado i){interessados.remove(i);}
 public void trocarRegraComissao(RegraComissao r){regraComissao=r;System.out.println(">> Regra de comissão do lote "+nome+" alterada.");}
 public void encerrar(){aberto=false;if(lanceAtual>=precoReserva)System.out.println("LOTE ENCERRADO: "+nome+" VENDIDO por R$ "+lanceAtual);else System.out.println("LOTE ENCERRADO: "+nome+" NÃO VENDIDO (reserva não atingida).");}
 public void imprimirAcertoVendedor(){if(!aberto&&lanceAtual>=precoReserva){double c=regraComissao.calcular(lanceAtual);System.out.println("--- Acerto do Vendedor ("+nome+") ---");System.out.println("Valor de Venda: R$ "+lanceAtual);System.out.println("Comissão Cobrada: R$ "+c);System.out.println("Valor Líquido a Repassar: R$ "+(lanceAtual-c));}}
 public String getNome(){return nome;} public double getLanceAtual(){return lanceAtual;} public boolean isVendido(){return !aberto&&lanceAtual>=precoReserva;}
}