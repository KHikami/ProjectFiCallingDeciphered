package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* renamed from: czk */
abstract class czk extends czt {
    abstract czp a();

    czk() {
    }

    public boolean contains(Object obj) {
        return a().contains(obj);
    }

    public int size() {
        return a().size();
    }

    public boolean isEmpty() {
        return a().isEmpty();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new czl(a());
    }
}
