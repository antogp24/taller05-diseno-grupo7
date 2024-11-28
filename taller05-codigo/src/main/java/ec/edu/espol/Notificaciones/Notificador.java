package ec.edu.espol.Notificaciones;

import java.util.ArrayList;
import java.util.List;

import ec.edu.espol.App.Tarea;

public class Notificador {
    List<Suscriptor> suscriptores;

    public Notificador() {
        this.suscriptores = new ArrayList<>();
    }

    public void notificarSuscriptores(Evento evento, Tarea tarea) {
        for (Suscriptor suscriptor: suscriptores) {
            if (suscriptor.getEventos().contains(evento)) {
                suscriptor.actualizar(evento, tarea);
            }
        }
    }

    public void suscribir(Suscriptor suscriptor) {
        if (!suscriptores.contains(suscriptor)) {
            suscriptores.add(suscriptor);
        }
    }

    public void unsuscribir(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
    }
}
