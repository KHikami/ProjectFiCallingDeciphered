package defpackage;

/* renamed from: dzu */
final class dzu implements Runnable {
    final /* synthetic */ dzs a;

    dzu(dzs dzs) {
        this.a = dzs;
    }

    public void run() {
        dzs dzs = this.a;
        if (dzs.a) {
            String str = dzs.b;
            new StringBuilder(String.valueOf(str).length() + 48).append("resuming queue for internal retry ").append(str).append(" [").append(dzs.c.size()).append("]");
        }
        if (dzs.f != null) {
            dzs.f = null;
            dzs.a(true);
        }
    }
}
