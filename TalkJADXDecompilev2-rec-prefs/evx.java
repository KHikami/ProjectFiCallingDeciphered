package p000;

import android.content.Context;

public class evx extends esw {
    private static final long serialVersionUID = 2;
    public final evy[] f12397c;
    public final int f12398d;

    public evx(evy[] evyArr, int i) {
        this.f12397c = evyArr;
        this.f12398d = i;
    }

    public nzf mo1944a(String str, int i, int i2) {
        int i3 = 0;
        nzf lue = new lue();
        lue.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        if (this.f12397c != null && this.f12398d > 0) {
            lue.f26442b = new lrw[this.f12398d];
            int i4 = 0;
            while (i3 < this.f12397c.length && i4 < this.f12398d) {
                if (this.f12397c[i3].m14697b() > 0) {
                    int i5 = i4 + 1;
                    lue.f26442b[i4] = this.f12397c[i3].m14698c();
                    i4 = i5;
                }
                i3++;
            }
        }
        return lue;
    }

    public String mo1947g() {
        return "analytics/recordanalyticsevents";
    }

    public String K_() {
        return "background_queue";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
    }
}
