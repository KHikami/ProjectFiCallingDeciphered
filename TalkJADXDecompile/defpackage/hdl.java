package defpackage;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: hdl */
final class hdl extends heb {
    private final LogEventParcelable a;

    hdl(LogEventParcelable logEventParcelable, gui gui) {
        super(gui);
        this.a = logEventParcelable;
    }

    private void a(hdo hdo) {
        hdp hdm = new hdm(this);
        try {
            hdc.b(this.a);
            hdo.a(hdm, this.a);
        } catch (Throwable e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageNanoProducer", e);
            c(new Status(10, "MessageProducer"));
        }
    }

    protected /* synthetic */ gup b(Status status) {
        return status;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hdl)) {
            return false;
        }
        return this.a.equals(((hdl) obj).a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append("MethodImpl(").append(valueOf).append(")").toString();
    }
}
