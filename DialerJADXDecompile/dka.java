import java.util.logging.Level;

/* compiled from: PG */
final class dka implements dmh {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final dlw f;

    public dka(dlw dlw) {
        this.f = dlw;
    }

    public final long a(dlu dlu, long j) {
        while (this.d == 0) {
            this.f.d((long) this.e);
            this.e = (short) 0;
            if ((this.b & 4) != 0) {
                return -1;
            }
            int i = this.c;
            int a = djz.a(this.f);
            this.d = a;
            this.a = a;
            byte c = (byte) this.f.c();
            this.b = (byte) this.f.c();
            if (djz.a.isLoggable(Level.FINE)) {
                djz.a.fine(dkb.a(true, this.c, this.a, c, this.b));
            }
            this.c = this.f.e() & Integer.MAX_VALUE;
            if (c != 9) {
                throw djz.b("%s != TYPE_CONTINUATION", Byte.valueOf(c));
            } else if (this.c != i) {
                throw djz.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
        long a2 = this.f.a(dlu, Math.min(j, (long) this.d));
        if (a2 == -1) {
            return -1;
        }
        this.d = (int) (((long) this.d) - a2);
        return a2;
    }

    public final void close() {
    }
}
