package defpackage;

import com.google.android.libraries.hangouts.video.internal.Stats;
import com.google.android.libraries.hangouts.video.internal.Stats.AggregatePrintStats;
import java.io.PrintWriter;

public final class inv extends Stats {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public boolean d = true;
    public int e = -1;

    public void b(int i) {
        this.a = i;
    }

    public void c(int i) {
        this.b = i;
    }

    public void d(int i) {
        this.c = i;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void e(int i) {
        this.e = i;
    }

    public void addTo(lkq lkq) {
        lkq.k = Integer.valueOf(this.a);
        lkq.o = Integer.valueOf(this.b);
        lkq.p = Integer.valueOf(this.c);
        lkq.q = Boolean.valueOf(this.d);
        lkq.r = Integer.valueOf(this.e);
    }

    public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        boolean z = this.d;
        printWriter.println(" -- GlobalStats -- " + i + ", " + i2 + ", " + i3 + ", " + z + ", " + this.e);
    }
}
