package p000;

import java.util.NoSuchElementException;

final class mlm extends mny<T> {
    boolean f27886a;
    final /* synthetic */ Object f27887b;

    mlm(Object obj) {
        this.f27887b = obj;
    }

    public boolean hasNext() {
        return !this.f27886a;
    }

    public T next() {
        if (this.f27886a) {
            throw new NoSuchElementException();
        }
        this.f27886a = true;
        return this.f27887b;
    }
}
