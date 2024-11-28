package ec.edu.espol.App;

import java.time.LocalDateTime;
import java.util.List;

public class TareaSimple extends Tarea {
    public TareaSimple(String titulo, String descripcion, List<Objetivo> objetivos, LocalDateTime vencimiento, Prioridad prioridad) {
        super(titulo, descripcion, objetivos, vencimiento, prioridad);
    }
}
