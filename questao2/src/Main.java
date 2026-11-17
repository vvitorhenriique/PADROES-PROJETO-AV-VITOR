package questao2.src;
public class Main {
 public static void main(String[] args){
  Lote loteArte=new Lote("Quadro de Picasso",1000.0,2000.0,new ComissaoArte());
  Lote loteEletro=new Lote("Notebook Gamer",3000.0,4000.0,new ComissaoEletronicos());
  Participante joao=new Participante("João"),maria=new Participante("Maria"),carlos=new Participante("Carlos");
  PainelLeiloeiro painel=new PainelLeiloeiro(); Auditor auditor=new Auditor();
  loteArte.acompanhar(joao);loteArte.acompanhar(maria);loteArte.acompanhar(painel);loteArte.acompanhar(auditor);
  System.out.println("\n--- LANCES NO LOTE DE ARTE ---");
  loteArte.darLance(joao,1050.0);loteArte.darLance(maria,1200.0);loteArte.removerAcompanhamento(joao);loteArte.darLance(carlos,1500.0);
  System.out.println("\n--- CAMPANHA: TROCA DE REGRA ---");loteArte.trocarRegraComissao(new ComissaoVeiculos());
  System.out.println("\n--- ENCERRAMENTO ---");loteArte.encerrar();
  loteArte=new Lote("Escultura",1000.0,2000.0,new ComissaoArte());loteArte.acompanhar(painel);loteArte.darLance(maria,2500.0);loteArte.trocarRegraComissao(new ComissaoEletronicos());loteArte.encerrar();
  loteEletro.encerrar();
  System.out.println("\n--- ACERTO DO VENDEDOR ---");loteArte.imprimirAcertoVendedor();
  System.out.println("\n--- FATURA DO COMPRADOR (DECORATOR) ---");
  Fatura f=new FaturaBase(loteArte.getNome(),loteArte.getLanceAtual());f=new CertificadoAutenticidade(f);f=new EmbalagemEspecial(f);f=new EntregaExpressa(f);f=new EmbalagemEspecial(f);
  System.out.println(f.getDescricao());System.out.println("TOTAL A PAGAR: R$ "+f.getCusto());
 }
}