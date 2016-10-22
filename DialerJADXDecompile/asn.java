/* compiled from: PG */
final class asn implements Runnable {
    private /* synthetic */ asm a;

    asn(asm asm) {
        this.a = asm;
    }

    public final void run() {
        synchronized (this.a.b) {
            if (this.a.d == null || this.a.e.c == null) {
                return;
            }
            int i;
            asp asp = this.a.e.c;
            if (!asp.l || asp.g == null) {
                i = 0;
            } else {
                i = asp.g.getCurrentPosition();
            }
            this.a.e.a(i, this.a.c);
        }
    }
}
