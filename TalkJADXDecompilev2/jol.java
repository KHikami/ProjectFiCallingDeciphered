package defpackage;

import java.util.concurrent.Callable;

final class jol implements Callable<Void> {
    final /* synthetic */ juo a;
    final /* synthetic */ jok b;

    jol(jok jok, juo juo) {
        this.b = jok;
        this.a = juo;
    }

    public /* synthetic */ Object call() {
        return a();
    }

    private Void a() {
        this.b.a.e.a(this.a);
        joh joh = this.b.a;
        Exception a = joh.a(this.a);
        if (a != null) {
            this.b.a(a);
        }
        return null;
    }
}
