package p000;

import java.util.Iterator;

final class enr implements Iterable<String> {
    final /* synthetic */ CharSequence f11895a;
    final /* synthetic */ enp f11896b;

    enr(enp enp, CharSequence charSequence) {
        this.f11896b = enp;
        this.f11895a = charSequence;
    }

    public Iterator<String> iterator() {
        return this.f11896b.f11888b.m14160a(this.f11896b, this.f11895a);
    }
}
