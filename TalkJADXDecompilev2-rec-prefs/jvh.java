package p000;

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;

public class jvh {
    final String f21126a;
    final icq f21127b;
    final lo<String, jvi> f21128c = new lo();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jvi m25310a(Context context, String str) {
        Object a = ((jvb) jyn.m25426a(context, jvb.class)).mo2052a();
        if (!TextUtils.isEmpty(a)) {
            return jvi.m25313a(a, System.currentTimeMillis());
        }
        synchronized (this) {
            jvi jvi = (jvi) this.f21128c.get(str);
            if (jvi != null) {
                if (System.currentTimeMillis() - jvi.mo3618b() <= jvj.f21129a) {
                    return jvi;
                }
                this.f21128c.remove(str);
                this.f21127b.mo3142a(context, jvi.mo3617a());
            }
        }
    }

    public void m25312b(Context context, String str) {
        if (TextUtils.isEmpty(((jvb) jyn.m25426a(context, jvb.class)).mo2052a())) {
            synchronized (this) {
                jvi jvi = (jvi) this.f21128c.remove(str);
                if (jvi != null) {
                    this.f21127b.mo3142a(context, jvi.mo3617a());
                    return;
                }
                this.f21127b.mo3142a(context, this.f21127b.mo3141a(context, str, this.f21126a));
            }
        }
    }

    jvh(String str, icq icq) {
        this.f21126a = str;
        this.f21127b = icq;
    }

    jvi m25311a(Context context, String str, String str2, boolean z) {
        String a;
        ics ics = (ics) jyn.m25426a(context, ics.class);
        if (z) {
            a = this.f21127b.mo3141a(context, str, str2);
        } else {
            try {
                a = ics.mo3143a(str, str2);
            } catch (Throwable e) {
                throw new AuthenticatorException("Recoverable error", e);
            }
        }
        return jvi.m25313a(a, System.currentTimeMillis());
    }
}
