package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @author Renato Marciano
 */

public class SingletonLazyHolder {

    private static class Instanceholder {
    private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return Instanceholder.instancia;
    }
}
