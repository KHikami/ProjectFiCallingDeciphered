package p000;

import java.util.Comparator;

final class jll implements Comparator<jla> {
    final /* synthetic */ jlk f20419a;

    jll(jlk jlk) {
        this.f20419a = jlk;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((jla) obj).f20396c - ((jla) obj2).f20396c);
    }
}
