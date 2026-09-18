import java.util.List;


public class Functions {

    public void cadastrarVeiculo(List <Veiculo> veiculos) {
        IO.println("======= CADASTRAR VEICULO =======");
        String marca = IO.readln("Digite a marca do Veiculo que deseja cadastrar ou [0] para sair: ");
        String modelo = IO.readln("Digite o modelo do Veiculo: ");
        int ano = Input.readint("Insira o ano do veículo (posterior a 1900).");
        String placa = IO.readln("Digite a placa do Veiculo (Modelo Mercosul): ");
        Veiculo novo = new Veiculo(marca, modelo, ano, placa);
        veiculos.add(novo);
        IO.println("Veículo cadastrado com sucesso!!");
    }

    public void listarVeiculos(List<Veiculo> veiculos){
        IO.println("===== VEÍCULOS CADASTRADOS =====");
        IO.println();

        if (veiculos.isEmpty()) {
            IO.println();
            IO.println("Nenhum veículo cadastrado até o momento.");
            return;
        }

        for (Veiculo veiculo : veiculos) {
            IO.println("Marca: " + veiculo.getMarca());
            IO.println("Modelo " + veiculo.getModelo());
            IO.println("Ano: " + veiculo.getAno());
            IO.println("Placa: " + veiculo.getPlaca());
            IO.println();
            IO.println("      ====================      ");
        }
    }

    public void consultarVeiculos(List<Veiculo> veiculos){

        IO.println("===== CONSULTAR VEÍCULOS =====");

        if (veiculos.isEmpty()){
            IO.println();
            IO.println("Nenhum veículo cadastrado até o momento");
            return;
        }

        String placa = IO.readln("Informe a placa do veículo: ");

        for (Veiculo veiculo : veiculos) {

            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {

                IO.println();
                IO.println("Veículo encontrado!");
                IO.println("Marca: " + veiculo.getMarca());
                IO.println("Modelo " + veiculo.getModelo());
                IO.println("Ano: " + veiculo.getAno());
                IO.println("Placa: " + veiculo.getPlaca());
                IO.println();
                IO.println("      ==================      ");

                return;
                }
        }

        IO.println("Veículo nao encontrado.");



    }








}

    
