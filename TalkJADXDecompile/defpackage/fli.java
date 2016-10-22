package defpackage;

import android.content.Context;

/* renamed from: fli */
public class fli extends fjz {
    private long c;

    public fli(Context context, int i, String str, long j) {
        super(i, str, gwb.a(context, "babel_pending_message_failure_duration", 1200000));
        this.c = 0;
    }

    protected void c(Context context) {
        fhc fhc = new fhc();
        this.c = blf.a(new blo(context, this.a), this.b, fhc, this.c, false);
        ((ect) jyn.a(context, ect.class)).a(this.a, fhc.f());
        fhc.c();
        if (this.c == -1) {
            throw new fka("latestReadTimestamp is -1. (e.g., a SMS conversation or max watermark of the conversation is less than the self watermark.) Do not proceed sending request.");
        }
    }

    protected euj b(Context context) {
        return new fbb(context, this.a, this.b, this.c);
    }

    public String toString() {
        return a("latestReadTimestamp=" + this.c);
    }
}
