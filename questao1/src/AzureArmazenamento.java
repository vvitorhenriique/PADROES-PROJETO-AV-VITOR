
public class AzureArmazenamento implements Armazenamento {
    private final String id;
    public AzureArmazenamento(int seq) { this.id = "blob://" + seq; }
    public String getId() { return id; }
    public double getCustoPorGb() { return 0.02; }
}
