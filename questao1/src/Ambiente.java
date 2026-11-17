
import java.util.ArrayList;
import java.util.List;

public class Ambiente {
    private final String nome;
    private final String provedor;
    private final String regiao;
    private final List<MaquinaVirtual> vms = new ArrayList<>();
    private final List<Armazenamento> storages = new ArrayList<>();
    private FilaMensagens fila;
    private double gbArmazenamento;

    public Ambiente(String nome, String provedor, String regiao) {
        this.nome = nome;
        this.provedor = provedor;
        this.regiao = regiao;
    }

    public void addVm(MaquinaVirtual vm) { vms.add(vm); }
    public void addStorage(Armazenamento a) { storages.add(a); }
    public void setFila(FilaMensagens f) { this.fila = f; }
    public void setGbArmazenamento(double gb) { this.gbArmazenamento = gb; }

    public double custoMensal() {
        double custo = 0;
        for (MaquinaVirtual vm : vms) custo += vm.getCustoHora() * 730;
        for (Armazenamento a : storages) custo += gbArmazenamento * a.getCustoPorGb();
        if (fila != null) custo += fila.getCustoFixo();
        return custo;
    }

    public String resumo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ambiente: ").append(nome).append("\n");
        sb.append("Provedor: ").append(provedor).append("\n");
        sb.append("Região: ").append(regiao).append("\n");
        for (MaquinaVirtual vm : vms) sb.append("VM: ").append(vm.getId()).append("\n");
        for (Armazenamento a : storages) sb.append("Storage: ").append(a.getId()).append("\n");
        if (fila != null) sb.append("Fila: ").append(fila.getId()).append("\n");
        sb.append(String.format("Custo mensal estimado: R$ %.2f%n", custoMensal()));
        return sb.toString();
    }

    public String getNome() { return nome; }
    public String getProvedor() { return provedor; }
}
