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
        if (!marca.isBlank()) {
            this.marca = marca;
        } else {
            IO.println();
            IO.println("Erro! O campo não pode ser vazio.");
            IO.readln("Pressione ENTER para retornar.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (!modelo.isBlank()) {
            this.modelo = modelo;
        } else {
            IO.println();
            IO.println("Erro! O campo não pode ser vazio.");
            IO.readln("Pressione ENTER para retornar.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1900 && ano <= LocalDate.now().getYear() + 1) {
            this.ano = ano;
        } else {
            IO.println();
            IO.println("Erro! O Veículo deve possuir um ano posterior a 1900.");
            IO.readln("Pressione ENTER para retornar.");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (!placa.isBlank()) {
            this.placa = placa;
        } else {
            IO.println();
            IO.println("Erro! O campo não pode ser vazio.");
            IO.readln("Pressione ENTER para retornar.");
        }
    }

    public Veiculo(String marca, String modelo, int ano, String placa) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setPlaca(placa);
    }

    int calculaTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
    }

}