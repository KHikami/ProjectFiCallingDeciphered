package defpackage;

import java.util.concurrent.Callable;

/* renamed from: joj */
final class joj implements Callable<Void> {
    final /* synthetic */ jok a;
    final /* synthetic */ joh b;

    joj(joh joh, jok jok) {
        this.b = joh;
        this.a = jok;
    }

    public /* synthetic */ Object call() {
        return a();
    }

    private Void a() {
        this.a.b();
        return null;
    }
}
