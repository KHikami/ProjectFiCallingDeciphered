package p000;

import java.util.ArrayList;

final class jrg extends ThreadLocal<ArrayList<jrh>> {
    jrg() {
    }

    protected /* synthetic */ Object initialValue() {
        return new ArrayList(8);
    }
}
