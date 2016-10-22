import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;

public class jvh {
    final String a;
    final icq b;
    final lo<String, jvi> c;

    public jvi a(Context context, String str) {
        Object a = ((jvb) jyn.a(context, jvb.class)).a();
        if (!TextUtils.isEmpty(a)) {
            return jvi.a(a, System.currentTimeMillis());
        }
        synchronized (this) {
            jvi jvi = (jvi) this.c.get(str);
            if (jvi != null) {
                if (System.currentTimeMillis() - jvi.b() <= jvj.a) {
                    return jvi;
                }
                this.c.remove(str);
                this.b.a(context, jvi.a());
            }
            jvi = a(context, str, this.a, jyn.a(context, "token_with_notification", true));
            if (jvi == null) {
                return jvi;
            }
            synchronized (this) {
                this.c.put(str, jvi);
            }
            return jvi;
        }
    }

    public void b(Context context, String str) {
        if (TextUtils.isEmpty(((jvb) jyn.a(context, jvb.class)).a())) {
            synchronized (this) {
                jvi jvi = (jvi) this.c.remove(str);
                if (jvi != null) {
                    this.b.a(context, jvi.a());
                    return;
                }
                this.b.a(context, this.b.a(context, str, this.a));
            }
        }
    }

    jvh(String str, icq icq) {
        this.c = new lo();
        this.a = str;
        this.b = icq;
    }

    jvi a(Context context, String str, String str2, boolean z) {
        String a;
        ics ics = (ics) jyn.a(context, ics.class);
        if (z) {
            a = this.b.a(context, str, str2);
        } else {
            try {
                a = ics.a(str, str2);
            } catch (Throwable e) {
                throw new AuthenticatorException("Recoverable error", e);
            }
        }
        return jvi.a(a, System.currentTimeMillis());
    }
}
