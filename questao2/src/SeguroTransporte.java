package questao2.src;
public class SeguroTransporte extends ServicoAdicional {
 public SeguroTransporte(Fatura f){super(f);}
 protected String getServicoDescricao(){return "Seguro de Transporte (1.5%)";}
 protected double getServicoCusto(){return fatura.getCusto()*0.015;}
}