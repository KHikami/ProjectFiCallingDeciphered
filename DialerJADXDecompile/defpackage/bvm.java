package defpackage;

import java.util.Iterator;

/* renamed from: bvm */
public final class bvm {
    private final String a;

    public bvm(String str) {
        this.a = str;
    }

    private static CharSequence a(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterable iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            stringBuilder.append(bvm.a(it.next()));
            while (it.hasNext()) {
                stringBuilder.append(this.a);
                stringBuilder.append(bvm.a(it.next()));
            }
        }
        return stringBuilder;
    }
}
