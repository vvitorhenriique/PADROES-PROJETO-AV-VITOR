package questao2.src;
public class EntregaExpressa extends ServicoAdicional {
 public EntregaExpressa(Fatura f){super(f);}
 protected String getServicoDescricao(){return "Entrega Expressa";}
 protected double getServicoCusto(){return 450.0;}
}