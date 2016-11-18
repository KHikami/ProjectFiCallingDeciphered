package p000;

import java.io.IOException;
import java.util.Iterator;

public class meu {
    final String f27592a;

    public static meu m31960a(String str) {
        return new meu(str);
    }

    public static meu m31959a(char c) {
        return new meu(String.valueOf(c));
    }

    private meu(String str) {
        this.f27592a = (String) bm.m6122a((Object) str);
    }

    meu(meu meu) {
        this.f27592a = meu.f27592a;
    }

    public <A extends Appendable> A m31961a(A a, Iterator<?> it) {
        bm.m6122a((Object) a);
        if (it.hasNext()) {
            a.append(mo3740a(it.next()));
            while (it.hasNext()) {
                a.append(this.f27592a);
                a.append(mo3740a(it.next()));
            }
        }
        return a;
    }

    public final StringBuilder m31964a(StringBuilder stringBuilder, Iterator<?> it) {
        try {
            m31961a((Appendable) stringBuilder, (Iterator) it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String m31963a(Iterable<?> iterable) {
        return m31964a(new StringBuilder(), iterable.iterator()).toString();
    }

    public meu mo3741b(String str) {
        bm.m6122a((Object) str);
        return new mev(this, this, str);
    }

    public mew m31966c(String str) {
        return new mew(this, str);
    }

    CharSequence mo3740a(Object obj) {
        bm.m6122a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
