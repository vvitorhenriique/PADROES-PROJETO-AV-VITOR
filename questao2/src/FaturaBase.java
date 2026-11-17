package questao2.src;
public class FaturaBase implements Fatura {
 private String nomeLote; private double valorVenda;
 public FaturaBase(String nomeLote,double valorVenda){this.nomeLote=nomeLote;this.valorVenda=valorVenda;}
 public String getDescricao(){return "Fatura do Lote: "+nomeLote+" | Valor de Venda: R$ "+valorVenda;}
 public double getCusto(){return valorVenda;}
}