package defpackage;

import java.util.Comparator;

final class jll implements Comparator<jla> {
    final /* synthetic */ jlk a;

    jll(jlk jlk) {
        this.a = jlk;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((jla) obj).c - ((jla) obj2).c);
    }
}
