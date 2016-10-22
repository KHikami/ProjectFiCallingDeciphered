package defpackage;

import java.util.Iterator;

/* renamed from: enr */
final class enr implements Iterable<String> {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ enp b;

    enr(enp enp, CharSequence charSequence) {
        this.b = enp;
        this.a = charSequence;
    }

    public Iterator<String> iterator() {
        return this.b.b.a(this.b, this.a);
    }
}
