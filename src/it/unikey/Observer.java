package it.unikey;

/**
 * ##############
 * #  Observer  #
 * ##############
 *
 * Implementare questa interfaccia consente a un oggetto di tenerne un altro sotto osservazione
 */
public interface Observer {
    void update(String context);
}
