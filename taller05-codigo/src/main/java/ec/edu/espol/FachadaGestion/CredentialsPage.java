package ec.edu.espol.FachadaGestion;

import ec.edu.espol.App.Tarea;
import ec.edu.espol.App.Usuario;
import ec.edu.espol.Notificaciones.Evento;
import ec.edu.espol.Notificaciones.Notificador;

import java.util.ArrayList;
import java.util.List;

public class CredentialsPage {
    List<Usuario> usuarios = new ArrayList<>();
    Notificador notificador = new Notificador();

    public Usuario crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
        notificador.suscribir(usuario);
        return usuario;
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
}
