package ec.edu.espol.FachadaGestion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ec.edu.espol.App.Prioridad;
import ec.edu.espol.App.Tarea;
import ec.edu.espol.App.Usuario;
import ec.edu.espol.Notificaciones.Evento;
import ec.edu.espol.Notificaciones.Notificador;

public class GestionTareas {
    Usuario usuario_actual;

    public GestionTareas(Usuario usuario_actual){
        this.usuario_actual=usuario_actual;
    }

    void cambiarPrioridad(Tarea tarea, Prioridad nuevaPrioridad){
        tarea.setPrioridad(nuevaPrioridad);
    }

    void cambiarVencimiento(Tarea tarea, LocalDateTime vencimiento){
        tarea.setVencimiento(vencimiento);
    }

    public void añadirTareaUsuario(Tarea tarea){
        usuario_actual.getTareas().add(tarea);
    }
}
