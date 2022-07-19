package it.unikey;

/**
 * ##############
 * #  Observer  #
 * ##############
 *
 * Implementare questa interfaccia consente a un oggetto di tenerne un altro sotto osservazione
 */
public interface Observer {

    /**
     * Questo, una volta concretizzato, sarà il metodo invocato per notificare gli Observer
     * del cambio di stato del Subject
     */
    void update(String context);
}
