package questao2.src;
public class PainelLeiloeiro implements Interessado {
 private int totalLances=0; private double maiorLance=0;
 public void atualizar(Lote lote,double valor){totalLances++; if(valor>maiorLance)maiorLance=valor; System.out.println("[Painel Leiloeiro] Lote: "+lote.getNome()+" | Maior Lance: R$ "+maiorLance+" | Total de Lances: "+totalLances);}
}