package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class nvr implements Iterator<Byte> {
    int a = 0;
    final int b = this.c.b();
    final /* synthetic */ nvn c;

    nvr(nvn nvn) {
        this.c = nvn;
    }

    public boolean hasNext() {
        return this.a < this.b;
    }

    public Byte a() {
        return Byte.valueOf(b());
    }

    public byte b() {
        try {
            nvn nvn = this.c;
            int i = this.a;
            this.a = i + 1;
            return nvn.a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return a();
    }
}
