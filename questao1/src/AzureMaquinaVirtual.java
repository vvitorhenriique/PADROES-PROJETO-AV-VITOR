
public class AzureMaquinaVirtual implements MaquinaVirtual {
    private final String id;
    public AzureMaquinaVirtual(int seq) { this.id = "vm-" + seq; }
    public String getId() { return id; }
    public double getCustoHora() { return 0.12; }
}
