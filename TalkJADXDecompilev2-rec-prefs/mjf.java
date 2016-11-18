package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

abstract class mjf<E> extends mjq<E> {
    abstract mjk<E> mo3870b();

    mjf() {
    }

    public boolean contains(Object obj) {
        return mo3870b().contains(obj);
    }

    public int size() {
        return mo3870b().size();
    }

    public boolean isEmpty() {
        return mo3870b().isEmpty();
    }

    boolean mo3822e() {
        return mo3870b().mo3822e();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new mjg(mo3870b());
    }
}
