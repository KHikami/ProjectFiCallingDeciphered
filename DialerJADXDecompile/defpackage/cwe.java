package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: cwe */
final class cwe implements Callable {
    private /* synthetic */ Callable a;
    private /* synthetic */ cwc b;

    cwe(cwc cwc, Callable callable) {
        this.b = cwc;
        this.a = callable;
    }

    public final Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            this.b.a.a(th);
        }
    }
}
