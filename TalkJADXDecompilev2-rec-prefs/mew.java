package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class mew {
    private final meu f27595a;
    private final String f27596b;

    mew(meu meu, String str) {
        this.f27595a = meu;
        this.f27596b = (String) bm.m6122a((Object) str);
    }

    public StringBuilder m31972a(StringBuilder stringBuilder, Map<?, ?> map) {
        return m31970a(stringBuilder, map.entrySet());
    }

    private <A extends Appendable> A m31969a(A a, Iterator<? extends Entry<?, ?>> it) {
        bm.m6122a((Object) a);
        if (it.hasNext()) {
            Entry entry = (Entry) it.next();
            a.append(this.f27595a.mo3740a(entry.getKey()));
            a.append(this.f27596b);
            a.append(this.f27595a.mo3740a(entry.getValue()));
            while (it.hasNext()) {
                a.append(this.f27595a.f27592a);
                entry = (Entry) it.next();
                a.append(this.f27595a.mo3740a(entry.getKey()));
                a.append(this.f27596b);
                a.append(this.f27595a.mo3740a(entry.getValue()));
            }
        }
        return a;
    }

    private StringBuilder m31970a(StringBuilder stringBuilder, Iterable<? extends Entry<?, ?>> iterable) {
        return m31971a(stringBuilder, iterable.iterator());
    }

    private StringBuilder m31971a(StringBuilder stringBuilder, Iterator<? extends Entry<?, ?>> it) {
        try {
            m31969a((Appendable) stringBuilder, (Iterator) it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
