package questao2.src;
public abstract class ServicoAdicional implements Fatura {
 protected Fatura fatura;
 public ServicoAdicional(Fatura fatura){this.fatura=fatura;}
 public String getDescricao(){return fatura.getDescricao()+"\n + "+getServicoDescricao()+": R$ "+getServicoCusto();}
 public double getCusto(){return fatura.getCusto()+getServicoCusto();}
 protected abstract String getServicoDescricao();
 protected abstract double getServicoCusto();
}