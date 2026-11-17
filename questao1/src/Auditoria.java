
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Auditoria {
    private static final Auditoria INSTANCIA = new Auditoria();
    private final List<RegistroAuditoria> registros =
            Collections.synchronizedList(new ArrayList<>());

    private Auditoria() {}

    public static Auditoria getInstancia() { return INSTANCIA; }

    public void registrar(RegistroAuditoria r) {
        synchronized (registros) { registros.add(r); }
    }

    public void imprimirHistorico() {
        synchronized (registros) {
            System.out.println("===== HISTÓRICO DE AUDITORIA =====");
            for (RegistroAuditoria r : registros) System.out.println(r);
        }
    }
}
