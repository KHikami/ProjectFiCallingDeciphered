package p000;

import android.app.Service;
import android.os.Bundle;
import com.google.android.gms.gcm.OneoffTask;

public final class gzn extends gzs {
    public long f16447a;
    public long f16448b;

    public gzn() {
        this.f16447a = -1;
        this.f16448b = -1;
        this.g = false;
    }

    public gzn m19035a(int i) {
        this.c = i;
        return this;
    }

    public gzn m19036a(long j, long j2) {
        this.f16447a = j;
        this.f16448b = j2;
        return this;
    }

    public gzn m19037a(Bundle bundle) {
        this.j = bundle;
        return this;
    }

    public gzn m19038a(Class<? extends Service> cls) {
        this.d = cls.getName();
        return this;
    }

    public gzn m19039a(String str) {
        this.e = str;
        return this;
    }

    public gzn m19040a(boolean z) {
        this.h = z;
        return this;
    }

    protected void mo2429a() {
        super.mo2429a();
        if (this.f16447a == -1 || this.f16448b == -1) {
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        } else if (this.f16447a >= this.f16448b) {
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        }
    }

    public OneoffTask m19042b() {
        mo2429a();
        return new OneoffTask(this);
    }

    public gzn m19043b(boolean z) {
        this.g = z;
        return this;
    }

    public gzn m19044c(boolean z) {
        this.f = z;
        return this;
    }
}
