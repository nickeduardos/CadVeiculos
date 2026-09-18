import java.time.LocalDate;

public class Veiculo {
    
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (!marca.isBlank())
            this.marca = marca;
        else 
            IO.println();
            IO.println("Erro! O campo não pode ser vazio.");
            IO.readln("Pressione ENTER para retornar.");
            return;
    }
    public String getModelo() {
        return modelo;
    } 
    public void setModelo(String modelo) {
        if (modelo.isBlank())
            this.modelo = modelo;
        else 
            IO.println();
            IO.println("Erro! O campo não pode ser vazio.");
            IO.readln("Pressione ENTER para retornar.");
            return;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (ano > 1900 && ano <= LocalDate.now().getYear() + 1)
            this.ano = ano;
        else
            IO.println();
            IO.println("Erro! O Veiculo não pode ter idade inferior a 1900.");
            IO.readln("Pressione ENTER para retornar.");
            return;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        if (!placa.isBlank())
            this.placa = placa;
        else 
            IO.println();
            IO.println("Erro! O campo não pode ser vazio.");
            IO.readln("Pressione ENTER para retornar.");
            return;
    }
    
    public Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    int calculaTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
    }

    void cadastrarVeiculo(String marca, String modelo, int ano, String placa) {
        Veiculo novoVeiculo = new Veiculo(marca, modelo, ano, placa);
        IO.println("Veículo Cadastrado:");
    
    }
}



// ======= Cadastro de Veículos OO =======
// 1 - Cadastrar Veículo
// 2 - Listar Veículos
// 3 - Consultar Veículo
// 0 - Sair