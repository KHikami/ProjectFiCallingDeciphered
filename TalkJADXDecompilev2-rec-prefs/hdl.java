package p000;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

final class hdl extends heb {
    private final LogEventParcelable f16701a;

    hdl(LogEventParcelable logEventParcelable, gui gui) {
        super(gui);
        this.f16701a = logEventParcelable;
    }

    private void m19421a(hdo hdo) {
        hdp hdm = new hdm(this);
        try {
            hdc.m19407b(this.f16701a);
            hdo.m19431a(hdm, this.f16701a);
        } catch (Throwable e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageNanoProducer", e);
            m18993c(new Status(10, "MessageProducer"));
        }
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return status;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hdl)) {
            return false;
        }
        return this.f16701a.equals(((hdl) obj).f16701a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f16701a);
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append("MethodImpl(").append(valueOf).append(")").toString();
    }
}
