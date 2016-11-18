package p000;

import android.content.Context;

public class fli extends fjz {
    private long f13406c = 0;

    public fli(Context context, int i, String str, long j) {
        super(i, str, gwb.m1519a(context, "babel_pending_message_failure_duration", 1200000));
    }

    protected void mo2025c(Context context) {
        fhc fhc = new fhc();
        this.f13406c = blf.m5753a(new blo(context, this.a), this.b, fhc, this.f13406c, false);
        ((ect) jyn.m25426a(context, ect.class)).mo1827a(this.a, fhc.m15317f());
        fhc.m15313c();
        if (this.f13406c == -1) {
            throw new fka("latestReadTimestamp is -1. (e.g., a SMS conversation or max watermark of the conversation is less than the self watermark.) Do not proceed sending request.");
        }
    }

    protected euj mo2024b(Context context) {
        return new fbb(context, this.a, this.b, this.f13406c);
    }

    public String toString() {
        return m15523a("latestReadTimestamp=" + this.f13406c);
    }
}
