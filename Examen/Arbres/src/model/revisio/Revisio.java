package Arbres.src.model.revisio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Revisio {

    private int id;
    private LocalDate data;
    private LocalTime hora;
    private String informe;

    public Revisio(int id, LocalDate data, LocalTime hora, String informe) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.informe = informe;
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

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    @Override
    public String toString() {
        return "Revisio [data=" + data + ", hora=" + hora + ", id=" + id + ", informe=" + informe + "]";
    }
    
}
