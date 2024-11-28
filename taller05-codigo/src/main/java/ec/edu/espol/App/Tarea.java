package ec.edu.espol.App;

import java.time.LocalDateTime;
import java.util.List;

public class Tarea {
    String titulo;
    String descripcion;
    List<Objetivo> objetivos;
    LocalDateTime vencimiento;
    Prioridad prioridad;

    public Tarea(String titulo, String descripcion, List<Objetivo> objetivos, LocalDateTime vencimiento, Prioridad prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.objetivos = objetivos;
        this.vencimiento = vencimiento;
        this.prioridad = prioridad;
    }

    public boolean haSidoCompletada() {
        for (Objetivo objetivo: objetivos) {
            if (!objetivo.completado) {
                return false;
            }
        }
        return true;
    }
}
