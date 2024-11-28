package ec.edu.espol.Notificaciones;

import java.util.List;

import ec.edu.espol.App.Tarea;

public interface Suscriptor {
    List<Evento> getEventos();
    List<Canal> getCanales();

    default public void actualizar(Evento evento, Tarea tarea) {
        for (Canal canal: getCanales()) {
            canal.informar(this, evento, tarea);
        }
    }
}
