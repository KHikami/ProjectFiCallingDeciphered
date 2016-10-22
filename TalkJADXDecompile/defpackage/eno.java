package defpackage;

import java.util.Iterator;

/* renamed from: eno */
final class eno {
    private final String a;

    eno(String str) {
        this.a = str;
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterable<?> iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            stringBuilder.append(eno.a(it.next()));
            while (it.hasNext()) {
                stringBuilder.append(this.a);
                stringBuilder.append(eno.a(it.next()));
            }
        }
        return stringBuilder;
    }

    private static CharSequence a(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
