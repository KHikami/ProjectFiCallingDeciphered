package defpackage;

import java.util.Set;

/* renamed from: liq */
final class liq implements Runnable {
    final /* synthetic */ Set a;
    final /* synthetic */ lip b;

    liq(lip lip, Set set) {
        this.b = lip;
        this.a = set;
    }

    public void run() {
        this.b.b.b.cancel(true);
        String valueOf = String.valueOf(this.a);
        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Disallowed thread! ").append(valueOf).toString());
    }
}
