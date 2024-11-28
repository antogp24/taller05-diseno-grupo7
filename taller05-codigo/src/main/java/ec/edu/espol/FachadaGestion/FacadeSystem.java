package ec.edu.espol.FachadaGestion;

import ec.edu.espol.App.Prioridad;
import ec.edu.espol.App.Tarea;
import ec.edu.espol.App.Usuario;
import ec.edu.espol.TareaFactory.TareaComplejaFactory;
import ec.edu.espol.TareaFactory.TareaSimpleFactory;
import ec.edu.espol.Visualizacion.Strategy;
import ec.edu.espol.Visualizacion.StrategyContext;

import java.time.LocalDateTime;

public class FacadeSystem {
    private Usuario usuario_actual;
    private CredentialsPage cred;
    private GestionTareas gest;
    private TareaSimpleFactory simpleFactory;
    private TareaComplejaFactory complejaFactory;
    private StrategyContext strat;

    public FacadeSystem(GestionTareas gest){
        cred = new CredentialsPage();
        this.gest=gest;
        simpleFactory = new TareaSimpleFactory();
        complejaFactory = new TareaComplejaFactory();
        strat = new StrategyContext();
    }

    public void asignarUser(Usuario usuario){
        usuario_actual=cred.crearUsuario(usuario);
        this.gest=gest;
    }

    public void actualizarPrioridad(Tarea t, Prioridad p){
        gest.cambiarPrioridad(t, p);
    }

    public void actualizarVencimiento(Tarea t, LocalDateTime l){
        gest.cambiarVencimiento(t,l);
    }

    public void crearTarea(int opcion){
        Tarea nuevaTarea;
        if (opcion==1){
            nuevaTarea=simpleFactory.crearTarea();
        } else {
            nuevaTarea=complejaFactory.crearTarea();
        }
        gest.añadirTareaUsuario(nuevaTarea);
    }

    public void visualizar(){
        strat.visualizar();
    }

    public void cambiarVisualizacion(Strategy str){
        strat.cambiarEstrategia(str);
    }

    void logout() {
        this.usuario_actual = null;
    }

}
