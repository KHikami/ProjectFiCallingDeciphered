package defpackage;

import android.os.SystemClock;
import android.telecom.Call.Details;
import com.google.android.apps.dialer.spam.impl.CallScreeningServiceImpl;

/* compiled from: PG */
/* renamed from: bkj */
public final class bkj implements bks {
    private /* synthetic */ long a;
    private /* synthetic */ String b;
    private /* synthetic */ Details c;
    private /* synthetic */ CallScreeningServiceImpl d;

    public bkj(CallScreeningServiceImpl callScreeningServiceImpl, long j, String str, Details details) {
        this.d = callScreeningServiceImpl;
        this.a = j;
        this.b = str;
        this.c = details;
    }

    public final void a(bla bla) {
        buf.a("CallScreeningServiceImpl, checkSpamNumber took " + (SystemClock.elapsedRealtime() - this.a) + " ms.", new Object[0]);
        if (bla.a()) {
            String str = "CallScreeningServiceImpl, rejecting call from number: ";
            String valueOf = String.valueOf(buf.k(this.b));
            buf.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            this.d.respondToCall(this.c, CallScreeningServiceImpl.a(true));
            return;
        }
        str = "CallScreeningServiceImpl, allowing call from number: ";
        valueOf = String.valueOf(buf.k(this.b));
        buf.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        this.d.a(this.c);
    }
}
