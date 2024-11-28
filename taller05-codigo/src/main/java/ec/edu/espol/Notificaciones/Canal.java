package ec.edu.espol.Notificaciones;

import ec.edu.espol.App.Tarea;

public interface Canal {
    void informar(Suscriptor suscriptor, Evento evento, Tarea tarea);
}
