package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: bli */
final class bli implements Iterable {
    private /* synthetic */ CharSequence a;
    private /* synthetic */ blg b;

    bli(blg blg, CharSequence charSequence) {
        this.b = blg;
        this.a = charSequence;
    }

    public final Iterator iterator() {
        return this.b.b.a(this.b, this.a);
    }
}
