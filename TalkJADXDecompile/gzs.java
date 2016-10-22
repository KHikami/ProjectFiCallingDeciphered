import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.gcm.Task;

public class gzs {
    public int c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public gzr i;
    public Bundle j;

    public gzs() {
        this.i = gzr.a;
    }

    protected void a() {
        gwb.b(this.d != null, (Object) "Must provide an endpoint for this task by calling setService(ComponentName).");
        Object obj = this.e;
        if (TextUtils.isEmpty(obj)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (100 < obj.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        } else {
            gzr gzr = this.i;
            if (gzr != null) {
                int a = gzr.a();
                if (a == 1 || a == 0) {
                    int b = gzr.b();
                    int c = gzr.c();
                    if (a == 0 && b < 0) {
                        throw new IllegalArgumentException("InitialBackoffSeconds can't be negative: " + b);
                    } else if (a == 1 && b < 10) {
                        throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    } else if (c < b) {
                        throw new IllegalArgumentException("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: " + gzr.c());
                    }
                }
                throw new IllegalArgumentException("Must provide a valid RetryPolicy: " + a);
            }
            if (this.g) {
                Task.b(this.j);
            }
        }
    }
}
