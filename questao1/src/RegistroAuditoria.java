
import java.time.LocalDateTime;

public class RegistroAuditoria {
    public final LocalDateTime dataHora;
    public final String ambiente;
    public final String provedor;
    public final String resultado;
    public final String motivo;

    public RegistroAuditoria(String ambiente, String provedor, String resultado, String motivo) {
        this.dataHora = LocalDateTime.now();
        this.ambiente = ambiente;
        this.provedor = provedor;
        this.resultado = resultado;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s | %s%s",
                dataHora, ambiente, provedor, resultado,
                motivo == null ? "" : " (" + motivo + ")");
    }
}
