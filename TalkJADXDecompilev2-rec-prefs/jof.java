package p000;

import android.content.Context;
import android.util.Log;

final class jof extends jgc {
    private final joh f20580a;

    jof(String str, joh joh) {
        super(str);
        this.f20580a = joh;
    }

    protected jgz mo648a(Context context) {
        try {
            return joa.m24782a(this.f20580a.m24837b());
        } catch (Exception e) {
            Exception exception = e;
            String valueOf = String.valueOf(exception);
            Log.e("LoginHelperFragment", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Device accounts load failed: ").append(valueOf).toString());
            return new jgz(0, exception, null);
        }
    }
}
