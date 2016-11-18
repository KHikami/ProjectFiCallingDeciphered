package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.gcm.Task;

public class gzs {
    public int f16439c;
    public String f16440d;
    public String f16441e;
    public boolean f16442f;
    public boolean f16443g;
    public boolean f16444h;
    public gzr f16445i = gzr.f16451a;
    public Bundle f16446j;

    protected void mo2429a() {
        gwb.m2048b(this.f16440d != null, (Object) "Must provide an endpoint for this task by calling setService(ComponentName).");
        Object obj = this.f16441e;
        if (TextUtils.isEmpty(obj)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (100 < obj.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        } else {
            gzr gzr = this.f16445i;
            if (gzr != null) {
                int a = gzr.m19046a();
                if (a == 1 || a == 0) {
                    int b = gzr.m19048b();
                    int c = gzr.m19049c();
                    if (a == 0 && b < 0) {
                        throw new IllegalArgumentException("InitialBackoffSeconds can't be negative: " + b);
                    } else if (a == 1 && b < 10) {
                        throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    } else if (c < b) {
                        throw new IllegalArgumentException("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: " + gzr.m19049c());
                    }
                }
                throw new IllegalArgumentException("Must provide a valid RetryPolicy: " + a);
            }
            if (this.f16443g) {
                Task.m9739b(this.f16446j);
            }
        }
    }
}
