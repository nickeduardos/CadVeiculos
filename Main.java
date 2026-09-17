import java.util.ArrayList;
import java.util.List;

List<String> veiculos = new ArrayList<>();

void Main() {
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
    }











}
