public class StrategyContext{
    private Strategy estrategia;
    public void cambiarEstrategia(Strategy estra){
        this.estrategia = estra;
    }
    public void visualizar(){
        this.estrategia.visualizar();
    }

}