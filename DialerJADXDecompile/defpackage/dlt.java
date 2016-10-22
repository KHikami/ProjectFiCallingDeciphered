package defpackage;

/* compiled from: PG */
/* renamed from: dlt */
final class dlt extends Thread {
    public dlt() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    public final void run() {
        while (true) {
            try {
                dlq c = dlq.c();
                if (c != null) {
                    c.b();
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
