

public class Solicitacao {
    public final String nome;
    public final int quantidadeVms;
    public final double gbArmazenamento;

    public Solicitacao(String nome, int quantidadeVms, double gbArmazenamento) {
        this.nome = nome;
        this.quantidadeVms = quantidadeVms;
        this.gbArmazenamento = gbArmazenamento;
    }
}
