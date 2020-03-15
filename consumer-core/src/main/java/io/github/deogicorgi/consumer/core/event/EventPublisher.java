package io.github.deogicorgi.consumer.core.event;

/**
 * Interface for publish {@link Event Event}.
 * published events are loaded into the listener's work queue and are performed as defined by the {@link io.github.deogicorgi.consumer.core.ListenerContainer}.
 *
 * @author Deogicorgi
 * @version 1.0
 * @since 2020/03/15
 **/
public interface EventPublisher {
    void publish(Event event);
}
