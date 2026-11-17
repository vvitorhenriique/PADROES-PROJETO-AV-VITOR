package questao2.src;
public class EmbalagemEspecial extends ServicoAdicional {
 public EmbalagemEspecial(Fatura f){super(f);}
 protected String getServicoDescricao(){return "Embalagem Especial";}
 protected double getServicoCusto(){return 180.0;}
}