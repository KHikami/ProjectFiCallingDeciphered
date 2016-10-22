package defpackage;

import java.io.PrintWriter;

/* renamed from: ejr */
public final class ejr {
    public final long a;
    private final String b;
    private final StackTraceElement[] c;

    public ejr(String str) {
        this.b = str;
        this.c = new Exception().getStackTrace();
        this.a = glj.a();
    }

    public void a(int i, PrintWriter printWriter, long j) {
        long j2;
        long j3 = 0;
        if (j != 0) {
            j3 = this.a - j;
            j2 = j3 / 1000;
            j3 %= 1000;
        } else {
            j2 = 0;
        }
        printWriter.write(String.format("@ %d; time %d [+%d.%03d] %s\n", new Object[]{Integer.valueOf(i), Long.valueOf(this.a), Long.valueOf(j2), Long.valueOf(j3), this.b}));
        for (int i2 = 2; i2 < this.c.length; i2++) {
            String valueOf = String.valueOf(this.c[i2].toString());
            printWriter.write(new StringBuilder(String.valueOf(valueOf).length() + 5).append("    ").append(valueOf).append("\n").toString());
        }
        printWriter.write("\n");
    }
}
