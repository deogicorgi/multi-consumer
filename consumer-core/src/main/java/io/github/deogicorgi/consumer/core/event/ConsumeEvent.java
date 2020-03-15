package io.github.deogicorgi.consumer.core.event;

import io.github.deogicorgi.consumer.core.data.ConsumeData;

/**
 * Listener events that receive data to process.
 * One {@code ConsumerEvent} is associated with one or several {@link ProcessEvent ProcessEvents}.
 *
 * @author Deogicorgi
 * @version 1.0
 * @since 2020/03/15
 **/
public interface ConsumeEvent extends Event {
    ConsumeData getConsumeData();

}
