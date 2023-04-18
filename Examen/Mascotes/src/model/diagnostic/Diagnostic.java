package model.diagnostic;

import java.time.LocalDate;
import java.time.LocalTime;

public class Diagnostic {
    
    private int id;
    private LocalDate data;
    private LocalTime hora;
    private String descripcio;

    public Diagnostic(int id, LocalDate data, LocalTime hora, String descripcio) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.descripcio = descripcio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "Diagnostic{" + "id=" + id + ", data=" + data + ", hora=" + hora + ", descripcio=" + descripcio + '}';
    }

}
