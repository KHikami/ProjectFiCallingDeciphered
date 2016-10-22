package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: dlz */
final class dlz implements dmg {
    private /* synthetic */ dmi a;
    private /* synthetic */ OutputStream b;

    dlz(dmi dmi, OutputStream outputStream) {
        this.a = dmi;
        this.b = outputStream;
    }

    public final void a_(dlu dlu, long j) {
        dmk.a(dlu.b, 0, j);
        while (j > 0) {
            this.a.e();
            dme dme = dlu.a;
            int min = (int) Math.min(j, (long) (dme.c - dme.b));
            this.b.write(dme.a, dme.b, min);
            dme.b += min;
            j -= (long) min;
            dlu.b -= (long) min;
            if (dme.b == dme.c) {
                dlu.a = dme.a();
                dmf.a(dme);
            }
        }
    }

    public final void flush() {
        this.b.flush();
    }

    public final void close() {
        this.b.close();
    }

    public final String toString() {
        return "sink(" + this.b + ")";
    }
}
