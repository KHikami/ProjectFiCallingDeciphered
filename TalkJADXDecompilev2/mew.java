package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class mew {
    private final meu a;
    private final String b;

    mew(meu meu, String str) {
        this.a = meu;
        this.b = (String) bm.a((Object) str);
    }

    public StringBuilder a(StringBuilder stringBuilder, Map<?, ?> map) {
        return a(stringBuilder, map.entrySet());
    }

    private <A extends Appendable> A a(A a, Iterator<? extends Entry<?, ?>> it) {
        bm.a((Object) a);
        if (it.hasNext()) {
            Entry entry = (Entry) it.next();
            a.append(this.a.a(entry.getKey()));
            a.append(this.b);
            a.append(this.a.a(entry.getValue()));
            while (it.hasNext()) {
                a.append(this.a.a);
                entry = (Entry) it.next();
                a.append(this.a.a(entry.getKey()));
                a.append(this.b);
                a.append(this.a.a(entry.getValue()));
            }
        }
        return a;
    }

    private StringBuilder a(StringBuilder stringBuilder, Iterable<? extends Entry<?, ?>> iterable) {
        return a(stringBuilder, iterable.iterator());
    }

    private StringBuilder a(StringBuilder stringBuilder, Iterator<? extends Entry<?, ?>> it) {
        try {
            a((Appendable) stringBuilder, (Iterator) it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
