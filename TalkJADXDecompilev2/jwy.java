package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public final class jwy {
    private Activity a;
    private jwp b;
    private Context c;
    private long d = 0;
    private int e;
    private SharedPreferences f;
    private Editor g;
    private boolean h;
    private String i;
    private int j;
    private PreferenceScreen k;
    private List<jxa> l;
    private List<a> m;
    private List<jwz> n;
    private List<DialogInterface> o;
    private jxb p;

    public jwy(Activity activity, int i) {
        this.a = activity;
        this.e = 100;
        this.c = activity;
        a(jwy.c(activity));
    }

    void a(jwp jwp) {
        this.b = jwp;
    }

    jwp a() {
        return this.b;
    }

    public PreferenceScreen a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.a(this);
        return preferenceScreen;
    }

    long b() {
        long j;
        synchronized (this) {
            j = this.d;
            this.d = 1 + j;
        }
        return j;
    }

    private void a(String str) {
        this.i = str;
        this.f = null;
    }

    public SharedPreferences c() {
        if (this.f == null) {
            this.f = this.c.getSharedPreferences(this.i, this.j);
        }
        return this.f;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(jwy.c(context), 0);
    }

    private static String c(Context context) {
        return String.valueOf(context.getPackageName()).concat("_preferences");
    }

    PreferenceScreen d() {
        return this.k;
    }

    boolean a(PreferenceScreen preferenceScreen) {
        if (preferenceScreen == this.k) {
            return false;
        }
        this.k = preferenceScreen;
        return true;
    }

    public jwi a(CharSequence charSequence) {
        if (this.k == null) {
            return null;
        }
        return this.k.a(charSequence);
    }

    Editor e() {
        if (!this.h) {
            return c().edit();
        }
        if (this.g == null) {
            this.g = c().edit();
        }
        return this.g;
    }

    boolean f() {
        return !this.h;
    }

    Activity g() {
        return this.a;
    }

    public void a(jxa jxa) {
        synchronized (this) {
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (!this.l.contains(jxa)) {
                this.l.add(jxa);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(int r5, int r6, android.content.Intent r7) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.l;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r4);	 Catch:{ all -> 0x0027 }
    L_0x0006:
        return;
    L_0x0007:
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0027 }
        r0 = r4.l;	 Catch:{ all -> 0x0027 }
        r2.<init>(r0);	 Catch:{ all -> 0x0027 }
        monitor-exit(r4);	 Catch:{ all -> 0x0027 }
        r3 = r2.size();
        r0 = 0;
        r1 = r0;
    L_0x0015:
        if (r1 >= r3) goto L_0x0006;
    L_0x0017:
        r0 = r2.get(r1);
        r0 = (defpackage.jxa) r0;
        r0 = r0.a(r5, r6, r7);
        if (r0 != 0) goto L_0x0006;
    L_0x0023:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0015;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0027 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jwy.a(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void h() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.m;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);	 Catch:{ all -> 0x001c }
    L_0x0006:
        return;
    L_0x0007:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x001c }
        r0 = r3.m;	 Catch:{ all -> 0x001c }
        r1.<init>(r0);	 Catch:{ all -> 0x001c }
        monitor-exit(r3);	 Catch:{ all -> 0x001c }
        r2 = r1.size();
        r0 = 0;
    L_0x0014:
        if (r0 >= r2) goto L_0x0006;
    L_0x0016:
        r1.get(r0);
        r0 = r0 + 1;
        goto L_0x0014;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jwy.h():void");
    }

    void a(jwz jwz) {
        synchronized (this) {
            if (this.n == null) {
                this.n = new ArrayList();
            }
            if (!this.n.contains(jwz)) {
                this.n.add(jwz);
            }
        }
    }

    void b(jwz jwz) {
        synchronized (this) {
            if (this.n != null) {
                this.n.remove(jwz);
            }
        }
    }

    void i() {
        List arrayList;
        synchronized (this) {
            if (this.n != null) {
                arrayList = new ArrayList(this.n);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jwz) arrayList.get(i)).d();
            }
        }
        l();
    }

    int j() {
        int i;
        synchronized (this) {
            i = this.e;
            this.e = i + 1;
        }
        return i;
    }

    public void a(DialogInterface dialogInterface) {
        synchronized (this) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(dialogInterface);
        }
    }

    public void b(DialogInterface dialogInterface) {
        synchronized (this) {
            if (this.o == null) {
                return;
            }
            this.o.remove(dialogInterface);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.o;	 Catch:{ all -> 0x002a }
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
    L_0x0006:
        return;
    L_0x0007:
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x002a }
        r0 = r3.o;	 Catch:{ all -> 0x002a }
        r2.<init>(r0);	 Catch:{ all -> 0x002a }
        r0 = r3.o;	 Catch:{ all -> 0x002a }
        r0.clear();	 Catch:{ all -> 0x002a }
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
        r0 = r2.size();
        r0 = r0 + -1;
        r1 = r0;
    L_0x001b:
        if (r1 < 0) goto L_0x0006;
    L_0x001d:
        r0 = r2.get(r1);
        r0 = (android.content.DialogInterface) r0;
        r0.dismiss();
        r0 = r1 + -1;
        r1 = r0;
        goto L_0x001b;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jwy.l():void");
    }

    void a(jxb jxb) {
        this.p = jxb;
    }

    jxb k() {
        return this.p;
    }
}
