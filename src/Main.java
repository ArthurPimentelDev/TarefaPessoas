public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Carlos Silva", "Rua A, 123", "9999-9999", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "8888-8888", "12.345.678/0001-99");

        pf.exibirDetalhes();
        System.out.println();
        pj.exibirDetalhes();
    }
}
