public class Functions {

    public void cadastrarVeiculo() {
        IO.println("======= CADASTRAR VEICULO =======");
        String marca = IO.readln("Digite a marca do Veiculo que deseja cadastrar ou [0] para sair: ");
        String modelo = IO.readln("Digite o modelo do Veiculo: ");
        String anoNovo = IO.readln("Digite o ano do Veiculo (Não Pode ser antes de 1900): ");
        int ano = Integer.parseInt(anoNovo);
        String placa = IO.readln("Digite a placa do Veiculo (Modelo Mercosul): ");
        Veiculo novo = new Veiculo(marca, modelo, ano, placa);
    }
}
