package p000;

import java.io.PrintWriter;

public final class ejr {
    public final long f11659a = glj.m17956a();
    private final String f11660b;
    private final StackTraceElement[] f11661c = new Exception().getStackTrace();

    public ejr(String str) {
        this.f11660b = str;
    }

    public void m14024a(int i, PrintWriter printWriter, long j) {
        long j2;
        long j3 = 0;
        if (j != 0) {
            j3 = this.f11659a - j;
            j2 = j3 / 1000;
            j3 %= 1000;
        } else {
            j2 = 0;
        }
        printWriter.write(String.format("@ %d; time %d [+%d.%03d] %s\n", new Object[]{Integer.valueOf(i), Long.valueOf(this.f11659a), Long.valueOf(j2), Long.valueOf(j3), this.f11660b}));
        for (int i2 = 2; i2 < this.f11661c.length; i2++) {
            String valueOf = String.valueOf(this.f11661c[i2].toString());
            printWriter.write(new StringBuilder(String.valueOf(valueOf).length() + 5).append("    ").append(valueOf).append("\n").toString());
        }
        printWriter.write("\n");
    }
}
