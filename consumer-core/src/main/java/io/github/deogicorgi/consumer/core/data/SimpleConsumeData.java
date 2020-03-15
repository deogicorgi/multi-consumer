package io.github.deogicorgi.consumer.core.data;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Deogicorgi
 * @version 1.0
 * @since 2020/03/15
 **/
public abstract class SimpleConsumeData<T> implements ConsumeData<T> {

    T consumeData;
    private ConsumeMetaData consumeMetaData = new ConsumeMetaData();

    public SimpleConsumeData(T consumeData) { this.consumeData = consumeData; }
    public ConsumeMetaData getConsumeMetaData() { return consumeMetaData; }

    @Override
    public T getConsumeData() { return this.consumeData; }

    @Override
    public int hashCode() { return Objects.hash(consumeData, consumeMetaData);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleConsumeData<?> that = (SimpleConsumeData<?>) o;
        return Objects.equals(consumeData, that.consumeData) &&
                Objects.equals(consumeMetaData, that.consumeMetaData);
    }
    
    /**
     *
     * @author Deogicorgi
     * @version 1.0
     * @since 2020/03/15
     **/
    private static class ConsumeMetaData {
        private String subject;
        private LocalDateTime consumedAt;
        private LocalDateTime publishedAt;

        public String getSubject() { return subject; }
        public void setSubject(String subject) { this.subject = subject; }
        public LocalDateTime getConsumedAt() { return consumedAt; }
        public void setConsumedAt(LocalDateTime consumedAt) { this.consumedAt = consumedAt; }
        public LocalDateTime getPublishedAt() { return publishedAt; }
        public void setPublishedAt(LocalDateTime publishedAt) { this.publishedAt = publishedAt; }
    }
}
