package defpackage;

import java.util.ArrayList;

/* renamed from: jrg */
final class jrg extends ThreadLocal<ArrayList<jrh>> {
    jrg() {
    }

    protected /* synthetic */ Object initialValue() {
        return new ArrayList(8);
    }
}
