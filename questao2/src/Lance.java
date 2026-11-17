package questao2.src;
import java.time.LocalDateTime;
public class Lance {
 private Participante participante; private double valor; private LocalDateTime dataHora;
 public Lance(Participante p,double valor){participante=p;this.valor=valor;dataHora=LocalDateTime.now();}
 public double getValor(){return valor;}
}