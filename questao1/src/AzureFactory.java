
public class AzureFactory implements ProvedorFactory {
    public MaquinaVirtual criarMaquinaVirtual(int s) { return new AzureMaquinaVirtual(s); }
    public Armazenamento criarArmazenamento(int s) { return new AzureArmazenamento(s); }
    public FilaMensagens criarFila(int s) { return new AzureFilaMensagens(s); }
    public String getNomeProvedor() { return "AZURE"; }
}
