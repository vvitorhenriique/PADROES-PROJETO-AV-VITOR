
public class AwsFilaMensagens implements FilaMensagens {
    private final String id;
    public AwsFilaMensagens(int seq) { this.id = "sqs-" + seq; }
    public String getId() { return id; }
    public double getCustoFixo() { return 0.40; }
}
