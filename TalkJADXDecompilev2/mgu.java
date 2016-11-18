package defpackage;

import com.google.common.cache.LocalCache.ReferenceEntry;

public enum mgu implements ReferenceEntry<Object, Object> {
    INSTANCE;

    public mhi<Object, Object> getValueReference() {
        return null;
    }

    public void setValueReference(mhi<Object, Object> mhi_java_lang_Object__java_lang_Object) {
    }

    public ReferenceEntry<Object, Object> getNext() {
        return null;
    }

    public int getHash() {
        return 0;
    }

    public Object getKey() {
        return null;
    }

    public long getAccessTime() {
        return 0;
    }

    public void setAccessTime(long j) {
    }

    public ReferenceEntry<Object, Object> getNextInAccessQueue() {
        return this;
    }

    public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
    }

    public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
        return this;
    }

    public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
    }

    public long getWriteTime() {
        return 0;
    }

    public void setWriteTime(long j) {
    }

    public ReferenceEntry<Object, Object> getNextInWriteQueue() {
        return this;
    }

    public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
    }

    public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
        return this;
    }

    public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
    }
}
