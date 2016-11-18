package p000;

import com.google.android.libraries.hangouts.video.internal.Stats;
import com.google.android.libraries.hangouts.video.internal.Stats.AggregatePrintStats;
import java.io.PrintWriter;

public final class inv extends Stats {
    public int f18168a = -1;
    public int f18169b = -1;
    public int f18170c = -1;
    public boolean f18171d = true;
    public int f18172e = -1;

    public void m22394b(int i) {
        this.f18168a = i;
    }

    public void m22395c(int i) {
        this.f18169b = i;
    }

    public void m22396d(int i) {
        this.f18170c = i;
    }

    public void m22393a(boolean z) {
        this.f18171d = z;
    }

    public void m22397e(int i) {
        this.f18172e = i;
    }

    public void addTo(lkq lkq) {
        lkq.f25190k = Integer.valueOf(this.f18168a);
        lkq.f25194o = Integer.valueOf(this.f18169b);
        lkq.f25195p = Integer.valueOf(this.f18170c);
        lkq.f25196q = Boolean.valueOf(this.f18171d);
        lkq.f25197r = Integer.valueOf(this.f18172e);
    }

    public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
        int i = this.f18168a;
        int i2 = this.f18170c;
        int i3 = this.f18169b;
        boolean z = this.f18171d;
        printWriter.println(" -- GlobalStats -- " + i + ", " + i2 + ", " + i3 + ", " + z + ", " + this.f18172e);
    }
}
