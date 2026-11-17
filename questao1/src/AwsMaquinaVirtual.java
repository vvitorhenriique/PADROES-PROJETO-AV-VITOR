
public class AwsMaquinaVirtual implements MaquinaVirtual {
    private final String id;
    public AwsMaquinaVirtual(int seq) { this.id = "i-" + seq; }
    public String getId() { return id; }
    public double getCustoHora() { return 0.10; }
}
