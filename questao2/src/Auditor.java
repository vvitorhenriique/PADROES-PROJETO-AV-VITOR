package questao2.src;
import java.time.LocalDateTime;
public class Auditor implements Interessado {
 public void atualizar(Lote lote,double valor){System.out.println("[Auditor] Log: Lance de R$ "+valor+" no lote '"+lote.getNome()+"' em "+LocalDateTime.now());}
}