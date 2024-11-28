package ec.edu.espol.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ec.edu.espol.Notificaciones.Canal;
import ec.edu.espol.Notificaciones.CanalCorreo;
import ec.edu.espol.Notificaciones.CanalMensajes;
import ec.edu.espol.Notificaciones.Evento;
import ec.edu.espol.Notificaciones.Suscriptor;

public class Usuario implements Suscriptor {
    String correo;
    String contrasenia;
    String nombre_usuario;
    String nombre_completo;
    public List<Tarea> tareas;

    private static final List<Evento> EVENTOS_SUSCRITOS = new ArrayList<>(
        Arrays.asList(
            Evento.TAREA_COMPLETADA,
            Evento.TAREA_PROXIMA_A_VENCER
        )
    );

    private static final List<Canal> CANALES_SUSCRITOS = new ArrayList<>(
        Arrays.asList(
            new CanalCorreo(),
            new CanalMensajes()
        )
    );

    public List<Tarea> getTareas(){
        return tareas;
    }

    @Override
    public List<Evento> getEventos() {
        return EVENTOS_SUSCRITOS;
    }

    @Override
    public List<Canal> getCanales() {
        return CANALES_SUSCRITOS;
    }
}
