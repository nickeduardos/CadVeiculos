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
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    } 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
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