package p000;

import java.util.Iterator;

final class eno {
    private final String f11886a;

    eno(String str) {
        this.f11886a = str;
    }

    public final StringBuilder m14148a(StringBuilder stringBuilder, Iterable<?> iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            stringBuilder.append(eno.m14147a(it.next()));
            while (it.hasNext()) {
                stringBuilder.append(this.f11886a);
                stringBuilder.append(eno.m14147a(it.next()));
            }
        }
        return stringBuilder;
    }

    private static CharSequence m14147a(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
