
public class AwsArmazenamento implements Armazenamento {
    private final String id;
    public AwsArmazenamento(int seq) { this.id = "s3://" + seq; }
    public String getId() { return id; }
    public double getCustoPorGb() { return 0.023; }
}
