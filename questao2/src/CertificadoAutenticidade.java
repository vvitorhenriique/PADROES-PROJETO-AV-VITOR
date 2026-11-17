package questao2.src;
public class CertificadoAutenticidade extends ServicoAdicional {
 public CertificadoAutenticidade(Fatura f){super(f);}
 protected String getServicoDescricao(){return "Certificado de Autenticidade";}
 protected double getServicoCusto(){return 300.0;}
}