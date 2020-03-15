package io.github.deogicorgi.consumer.core.data;

/**
 * Wrapper class that encloses data polled by module.
 * Each {@code ConsumeData} is loaded in {@link io.github.deogicorgi.consumer.core.event.ConsumeEvent ConsumeEvent}
 * and passed to the listener class of the connected {@link io.github.deogicorgi.consumer.core.event.ProcessEvent ProcessEvent}.
 *
 * @author Deogicorgi
 * @version 1.0
 * @since 2020/03/15
 **/
public interface ConsumeData {
}
