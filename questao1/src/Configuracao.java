
import java.io.InputStream;
import java.util.Properties;

public final class Configuracao {
    private static final Configuracao INSTANCIA = new Configuracao();
    private final String regiao;
    private final double orcamentoMensal;

    private Configuracao() {
        try (InputStream in = Configuracao.class.getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (in == null) {
                throw new IllegalStateException("config.properties não encontrado no classpath");
            }
            Properties p = new Properties();
            p.load(in);
            this.regiao = p.getProperty("regiao");
            this.orcamentoMensal = Double.parseDouble(p.getProperty("orcamentoMensal"));
        } catch (Exception e) {
            throw new IllegalStateException("Falha ao ler config.properties", e);
        }
    }

    public static Configuracao getInstancia() { return INSTANCIA; }
    public String getRegiao() { return regiao; }
    public double getOrcamentoMensal() { return orcamentoMensal; }
}
