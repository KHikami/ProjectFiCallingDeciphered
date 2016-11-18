package defpackage;

import java.util.Comparator;

final class jcg implements Comparator<jch> {
    jcg() {
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        jch jch = (jch) obj2;
        int a = ((jch) obj).a("device_index", Integer.MAX_VALUE);
        int a2 = jch.a("device_index", Integer.MAX_VALUE);
        if (a < a2) {
            return -1;
        }
        return a == a2 ? 0 : 1;
    }
}
