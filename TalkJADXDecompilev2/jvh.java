package defpackage;

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;

public class jvh {
    final String a;
    final icq b;
    final lo<String, jvi> c = new lo();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.jvi a(android.content.Context r7, java.lang.String r8) {
        /*
        r6 = this;
        r0 = defpackage.jvb.class;
        r0 = defpackage.jyn.a(r7, r0);
        r0 = (defpackage.jvb) r0;
        r0 = r0.a();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x001b;
    L_0x0012:
        r2 = java.lang.System.currentTimeMillis();
        r0 = defpackage.jvi.a(r0, r2);
    L_0x001a:
        return r0;
    L_0x001b:
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x0038 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0038 }
        r0 = (defpackage.jvi) r0;	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0049;
    L_0x0026:
        r2 = r0.b();	 Catch:{ all -> 0x0038 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0038 }
        r2 = r4 - r2;
        r4 = defpackage.jvj.a;	 Catch:{ all -> 0x0038 }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 > 0) goto L_0x003b;
    L_0x0036:
        monitor-exit(r6);	 Catch:{ all -> 0x0038 }
        goto L_0x001a;
    L_0x0038:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0038 }
        throw r0;
    L_0x003b:
        r1 = r6.c;	 Catch:{ all -> 0x0038 }
        r1.remove(r8);	 Catch:{ all -> 0x0038 }
        r1 = r6.b;	 Catch:{ all -> 0x0038 }
        r0 = r0.a();	 Catch:{ all -> 0x0038 }
        r1.a(r7, r0);	 Catch:{ all -> 0x0038 }
    L_0x0049:
        monitor-exit(r6);	 Catch:{ all -> 0x0038 }
        r0 = "token_with_notification";
        r1 = 1;
        r0 = defpackage.jyn.a(r7, r0, r1);
        r1 = r6.a;
        r0 = r6.a(r7, r8, r1, r0);
        if (r0 == 0) goto L_0x001a;
    L_0x0059:
        monitor-enter(r6);
        r1 = r6.c;	 Catch:{ all -> 0x0061 }
        r1.put(r8, r0);	 Catch:{ all -> 0x0061 }
        monitor-exit(r6);	 Catch:{ all -> 0x0061 }
        goto L_0x001a;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0061 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jvh.a(android.content.Context, java.lang.String):jvi");
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
