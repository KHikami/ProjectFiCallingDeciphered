package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: meu */
public class meu {
    final String a;

    public static meu a(String str) {
        return new meu(str);
    }

    public static meu a(char c) {
        return new meu(String.valueOf(c));
    }

    private meu(String str) {
        this.a = (String) bm.a((Object) str);
    }

    meu(meu meu) {
        this.a = meu.a;
    }

    public <A extends Appendable> A a(A a, Iterator<?> it) {
        bm.a((Object) a);
        if (it.hasNext()) {
            a.append(a(it.next()));
            while (it.hasNext()) {
                a.append(this.a);
                a.append(a(it.next()));
            }
        }
        return a;
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterator<?> it) {
        try {
            a((Appendable) stringBuilder, (Iterator) it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String a(Iterable<?> iterable) {
        return a(new StringBuilder(), iterable.iterator()).toString();
    }

    public meu b(String str) {
        bm.a((Object) str);
        return new mev(this, this, str);
    }

    public mew c(String str) {
        return new mew(this, str);
    }

    CharSequence a(Object obj) {
        bm.a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
