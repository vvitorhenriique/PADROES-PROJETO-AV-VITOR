
public class AwsFactory implements ProvedorFactory {
    public MaquinaVirtual criarMaquinaVirtual(int s) { return new AwsMaquinaVirtual(s); }
    public Armazenamento criarArmazenamento(int s) { return new AwsArmazenamento(s); }
    public FilaMensagens criarFila(int s) { return new AwsFilaMensagens(s); }
    public String getNomeProvedor() { return "AWS"; }
}
