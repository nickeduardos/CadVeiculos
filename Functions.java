import java.time.LocalDate;
import java.util.List;


public class Functions {

    int anoAtual = LocalDate.now().getYear();

    public void cadastrarVeiculo(List <Veiculo> veiculos) {
        IO.println();
        IO.println("======= CADASTRAR VEICULO =======");
        IO.println();
        

        String marca = IO.readln("Digite a marca do Veiculo que deseja cadastrar ou [0] para sair: ");
        if (marca.equals("0")) {
            IO.println();
            IO.readln("Pressione ENTER para retornar ao menu.");
            return;
        }

        else {
            String modelo = IO.readln("Digite o modelo do Veiculo: ");
            int ano = Input.readint("Insira o ano do veículo (posterior a 1900). ");
            if (ano < 1900 || ano > anoAtual) {
                IO.println();
                IO.println("Erro!, o ano não pode ser anterior a 1900 e nem posterior ao ano atual.");
                IO.readln("Pressione ENTER para retornar. ");
                return;
            }
            else {
                String placa = IO.readln("Digite a placa do Veiculo: ");
                for (Veiculo veiculo : veiculos) {
                    if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                        IO.println();
                        IO.println("Erro! ja existe um veiculo cadastrado com essa placa.");
                        IO.readln("Pressione ENTER para retornar. ");
                        return;
                    }
                }

                Veiculo novo = new Veiculo(marca, modelo, ano, placa);
                veiculos.add(novo);
                IO.println();
                IO.println("Veículo cadastrado com sucesso.");
                IO.readln("Pressione ENTER para retornar ao menu.");
            }
        }
    }

    public void listarVeiculos(List<Veiculo> veiculos){
        IO.println();
        IO.println("===== VEÍCULOS CADASTRADOS =====");
        IO.println();

        if (veiculos.isEmpty()) {
            IO.println("Nenhum veículo cadastrado até o momento.");
            IO.readln("Pressione ENTER para retornar. ");
            return;
        }

        for (Veiculo veiculo : veiculos) {
            IO.println("      ====================      ");
            IO.println();
            IO.println("Veiculo:");
            IO.println("Marca: " + veiculo.getMarca());
            IO.println("Modelo " + veiculo.getModelo());
            IO.println("Ano: " + veiculo.getAno());
            IO.println("Placa: " + veiculo.getPlaca());
            IO.println();
        }
        IO.readln("Pressione ENTER para retornar ao menu.");
    }

    public void consultarVeiculos(List<Veiculo> veiculos){

        IO.println();
        IO.println("===== CONSULTAR VEÍCULOS =====");
        IO.println();

        if (veiculos.isEmpty()){
            IO.println("Nenhum veículo cadastrado até o momento");
            IO.readln("Pressione ENTER para retornar ao menu.");
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
                IO.readln("pressione ENTER para retornar ao menu. ");
                return;
                }
        }

        IO.println();
        IO.println("Placa não cadastrada.");
        IO.readln("Pressione ENTER para retornar ao menu.");
        IO.println();



    }








}

    
