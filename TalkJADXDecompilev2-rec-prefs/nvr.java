package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class nvr implements Iterator<Byte> {
    int f31136a = 0;
    final int f31137b = this.f31138c.b();
    final /* synthetic */ nvn f31138c;

    nvr(nvn nvn) {
        this.f31138c = nvn;
    }

    public boolean hasNext() {
        return this.f31136a < this.f31137b;
    }

    public Byte m36752a() {
        return Byte.valueOf(m36753b());
    }

    public byte m36753b() {
        try {
            nvn nvn = this.f31138c;
            int i = this.f31136a;
            this.f31136a = i + 1;
            return nvn.a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return m36752a();
    }
}
