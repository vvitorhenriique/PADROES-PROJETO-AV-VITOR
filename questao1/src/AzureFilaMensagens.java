
public class AzureFilaMensagens implements FilaMensagens {
    private final String id;
    public AzureFilaMensagens(int seq) { this.id = "sb-" + seq; }
    public String getId() { return id; }
    public double getCustoFixo() { return 0.50; }
}
