package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: dai */
final class dai extends dap {
    private final czy a;

    public final /* synthetic */ Iterator iterator() {
        return b();
    }

    dai(czy czy) {
        this.a = czy;
    }

    public final int size() {
        return this.a.size();
    }

    public final dbn b() {
        czy czy = this.a;
        return new czz(czy, czy.c().b());
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    final Object a(int i) {
        return ((Entry) this.a.c().c().get(i)).getKey();
    }

    final Object writeReplace() {
        return new daj(this.a);
    }
}
