package tarefa.domain;

import java.util.Objects;

public class Carro implements Chassi {

    private Long codChassi;
    private String marca;
    private String modelo;

    public Carro(String codChassi, String marca, String modelo) {
        this.codChassi = Long.valueOf(codChassi.trim());
        this.marca = marca;
        this.modelo = modelo;
    }



    public Long getCodChassi() {
        return codChassi;
    }

    public void setCodChassi(Long codChassi) {
        this.codChassi = codChassi;
    }

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

    @Override
    public long getChassis() {
        return codChassi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(codChassi, carro.codChassi) && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codChassi, marca, modelo);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "codChassi=" + codChassi +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

