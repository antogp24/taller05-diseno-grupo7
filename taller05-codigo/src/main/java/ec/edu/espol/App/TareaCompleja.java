package ec.edu.espol.App;

import java.time.LocalDateTime;
import java.util.List;

public class TareaCompleja extends Tarea {
    List<Tarea> subtareas;

    public TareaCompleja(String titulo, String descripcion, List<Objetivo> objetivos, LocalDateTime vencimiento, Prioridad prioridad, List<Tarea> subtareas) {
        super(titulo, descripcion, objetivos, vencimiento, prioridad);
        this.subtareas = subtareas;
    }
}
