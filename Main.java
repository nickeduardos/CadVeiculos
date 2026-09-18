import java.util.ArrayList;
import java.util.List;

void main() {

    List<String> veiculos = new ArrayList<>();

    String menu = """
    ========== Cadastro De Veiculos ==========
    Selecione uma opção válida:
    [1] - Cadastrar Veículo
    [2] - Listar Veículos
    [3] - Consultar Veículo
    [0] - Sair
    """;

    int opcao;
    do {
        IO.println(menu);
        opcao = Input.readint("Digite uma opção: ");
    } while (opcao != 0); {
        switch (opcao) {
            case 1:
                cadastrarVeiculo();
                break;
        
            default:
                break;
        }
    }
}
