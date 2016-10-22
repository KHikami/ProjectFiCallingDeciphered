import android.app.Service;
import android.os.Bundle;
import com.google.android.gms.gcm.OneoffTask;

public final class gzn extends gzs {
    public long a;
    public long b;

    public gzn() {
        this.a = -1;
        this.b = -1;
        this.g = false;
    }

    public gzn a(int i) {
        this.c = i;
        return this;
    }

    public gzn a(long j, long j2) {
        this.a = j;
        this.b = j2;
        return this;
    }

    public gzn a(Bundle bundle) {
        this.j = bundle;
        return this;
    }

    public gzn a(Class<? extends Service> cls) {
        this.d = cls.getName();
        return this;
    }

    public gzn a(String str) {
        this.e = str;
        return this;
    }

    public gzn a(boolean z) {
        this.h = z;
        return this;
    }

    protected void a() {
        super.a();
        if (this.a == -1 || this.b == -1) {
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        } else if (this.a >= this.b) {
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        }
    }

    public OneoffTask b() {
        a();
        return new OneoffTask(this);
    }

    public gzn b(boolean z) {
        this.g = z;
        return this;
    }

    public gzn c(boolean z) {
        this.f = z;
        return this;
    }
}
