package p000;

import java.util.Set;

final class liq implements Runnable {
    final /* synthetic */ Set f25056a;
    final /* synthetic */ lip f25057b;

    liq(lip lip, Set set) {
        this.f25057b = lip;
        this.f25056a = set;
    }

    public void run() {
        this.f25057b.f25055b.f25051b.cancel(true);
        String valueOf = String.valueOf(this.f25056a);
        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Disallowed thread! ").append(valueOf).toString());
    }
}
