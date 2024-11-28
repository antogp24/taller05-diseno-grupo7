package ec.edu.espol.FachadaGestion;

import java.util.ArrayList;
import java.util.List;

import ec.edu.espol.App.Tarea;
import ec.edu.espol.App.Usuario;
import ec.edu.espol.Notificaciones.Evento;
import ec.edu.espol.Notificaciones.Notificador;

public class GestionTareas {
    List<Usuario> usuarios = new ArrayList<>();
    Usuario usuario_actual = null;
    Notificador notificador = new Notificador();

    void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
        notificador.suscribir(usuario);
    }

    void borrarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
        notificador.unsuscribir(usuario);
    }

    void notificar(Evento evento, Tarea tarea) {
        notificador.notificarSuscriptores(evento, tarea);
    }

    void login(String correo_o_usuario, String contrasenia) {
        // ...
    }

    void logout() {
        this.usuario_actual = null;
    }

    void crearTarea(Tarea tarea) {
        usuario_actual.tareas.add(tarea);
    }

    void eliminarTarea(Tarea tarea) {
        usuario_actual.tareas.remove(tarea);
    }
}
