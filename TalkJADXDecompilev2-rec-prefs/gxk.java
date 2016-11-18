package p000;

import java.util.Iterator;

public final class gxk {
    private final String f16325a;

    public gxk(String str) {
        this.f16325a = str;
    }

    private static CharSequence m18913a(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder m18914a(StringBuilder stringBuilder, Iterable<?> iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            stringBuilder.append(gxk.m18913a(it.next()));
            while (it.hasNext()) {
                stringBuilder.append(this.f16325a);
                stringBuilder.append(gxk.m18913a(it.next()));
            }
        }
        return stringBuilder;
    }
}
