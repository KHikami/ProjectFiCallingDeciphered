package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: dma */
final class dma implements dmh {
    private /* synthetic */ dmi a;
    private /* synthetic */ InputStream b;

    dma(dmi dmi, InputStream inputStream) {
        this.a = dmi;
        this.b = inputStream;
    }

    public final long a(dlu dlu, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            this.a.e();
            dme d = dlu.d(1);
            int read = this.b.read(d.a, d.c, (int) Math.min(j, (long) (2048 - d.c)));
            if (read == -1) {
                return -1;
            }
            d.c += read;
            dlu.b += (long) read;
            return (long) read;
        }
    }

    public final void close() {
        this.b.close();
    }

    public final String toString() {
        return "source(" + this.b + ")";
    }
}
