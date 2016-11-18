package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

abstract class mjf<E> extends mjq<E> {
    abstract mjk<E> b();

    mjf() {
    }

    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    public int size() {
        return b().size();
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    boolean e() {
        return b().e();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new mjg(b());
    }
}
