
public class MontadorAmbiente {
    private final ProvedorFactory factory;

    public MontadorAmbiente(ProvedorFactory factory) { this.factory = factory; }

    public Ambiente montar(Solicitacao s) {
        Ambiente amb = new Ambiente(s.nome, factory.getNomeProvedor(),
                Configuracao.getInstancia().getRegiao());
        int seq = 1;
        for (int i = 0; i < s.quantidadeVms; i++) {
            amb.addVm(factory.criarMaquinaVirtual(seq++));
        }
        amb.addStorage(factory.criarArmazenamento(seq++));
        amb.setGbArmazenamento(s.gbArmazenamento);
        amb.setFila(factory.criarFila(seq));
        return amb;
    }
}
