package p000;

import java.util.concurrent.Callable;

final class jol implements Callable<Void> {
    final /* synthetic */ juo f20614a;
    final /* synthetic */ jok f20615b;

    jol(jok jok, juo juo) {
        this.f20615b = jok;
        this.f20614a = juo;
    }

    public /* synthetic */ Object call() {
        return m24852a();
    }

    private Void m24852a() {
        this.f20615b.f20599a.f20588e.mo3608a(this.f20614a);
        joh joh = this.f20615b.f20599a;
        Exception a = joh.m24816a(this.f20614a);
        if (a != null) {
            this.f20615b.m24846a(a);
        }
        return null;
    }
}
