import android.content.Context;

public class evx extends esw {
    private static final long serialVersionUID = 2;
    public final evy[] c;
    public final int d;

    public evx(evy[] evyArr, int i) {
        this.c = evyArr;
        this.d = i;
    }

    public nzf a(String str, int i, int i2) {
        int i3 = 0;
        nzf lue = new lue();
        lue.requestHeader = euk.a(null, true, str, i, i2, this.i);
        if (this.c != null && this.d > 0) {
            lue.b = new lrw[this.d];
            int i4 = 0;
            while (i3 < this.c.length && i4 < this.d) {
                if (this.c[i3].b() > 0) {
                    int i5 = i4 + 1;
                    lue.b[i4] = this.c[i3].c();
                    i4 = i5;
                }
                i3++;
            }
        }
        return lue;
    }

    public String g() {
        return "analytics/recordanalyticsevents";
    }

    public String K_() {
        return "background_queue";
    }

    public void a(Context context, bko bko, fdo fdo) {
    }
}
