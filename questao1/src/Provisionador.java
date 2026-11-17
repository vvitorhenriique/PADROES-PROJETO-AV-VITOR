
public class Provisionador {
    public void provisionar(Solicitacao s, ProvedorFactory factory) {
        MontadorAmbiente montador = new MontadorAmbiente(factory);
        Ambiente amb = montador.montar(s);

        double custo = amb.custoMensal();
        double orcamento = Configuracao.getInstancia().getOrcamentoMensal();

        if (custo > orcamento) {
            Auditoria.getInstancia().registrar(new RegistroAuditoria(
                    s.nome, factory.getNomeProvedor(), "RECUSADO",
                    String.format("custo R$ %.2f > orçamento R$ %.2f", custo, orcamento)));
            System.out.printf("[RECUSADO] %s%n", s.nome);
        } else {
            Auditoria.getInstancia().registrar(new RegistroAuditoria(
                    s.nome, factory.getNomeProvedor(), "ACEITO", null));
            System.out.println(amb.resumo());
        }
    }
}
