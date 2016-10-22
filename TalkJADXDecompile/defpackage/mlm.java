package defpackage;

import java.util.NoSuchElementException;

/* renamed from: mlm */
final class mlm extends mny<T> {
    boolean a;
    final /* synthetic */ Object b;

    mlm(Object obj) {
        this.b = obj;
    }

    public boolean hasNext() {
        return !this.a;
    }

    public T next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
