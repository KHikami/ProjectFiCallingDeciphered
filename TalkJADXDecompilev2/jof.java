package defpackage;

import android.content.Context;
import android.util.Log;

final class jof extends jgc {
    private final joh a;

    jof(String str, joh joh) {
        super(str);
        this.a = joh;
    }

    protected jgz a(Context context) {
        try {
            return joa.a(this.a.b());
        } catch (Exception e) {
            Exception exception = e;
            String valueOf = String.valueOf(exception);
            Log.e("LoginHelperFragment", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Device accounts load failed: ").append(valueOf).toString());
            return new jgz(0, exception, null);
        }
    }
}
