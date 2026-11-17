
public interface ProvedorFactory {
    MaquinaVirtual criarMaquinaVirtual(int seq);
    Armazenamento criarArmazenamento(int seq);
    FilaMensagens criarFila(int seq);
    String getNomeProvedor();
}
