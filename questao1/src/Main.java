

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Provisionador prov = new Provisionador();

        Solicitacao a1 = new Solicitacao("aws-prod", 1, 10);
        Solicitacao a2 = new Solicitacao("aws-dev", 1, 5);
        Solicitacao az1 = new Solicitacao("azure-stg", 1, 5);
        Solicitacao recus = new Solicitacao("big", 10, 500);

        Thread t1 = new Thread(() -> prov.provisionar(a1, new AwsFactory()));
        Thread t2 = new Thread(() -> prov.provisionar(a2, new AwsFactory()));
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        prov.provisionar(az1, new AzureFactory());
        prov.provisionar(recus, new AwsFactory());

        Auditoria.getInstancia().imprimirHistorico();
    }
}
