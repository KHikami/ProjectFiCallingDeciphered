package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fhc */
public final class fhc {
    private static final boolean a;
    private final List<fok> b;
    private final List<Runnable> c;
    private final int d;
    private fhe e;
    private boolean f;
    private fhd g;
    private boolean h;

    public fhc() {
        this.b = new LinkedList();
        this.c = new LinkedList();
        this.d = 0;
        this.e = fhe.NONE;
        this.h = false;
    }

    static {
        kae kae = glk.o;
        a = false;
    }

    public void a(bko bko) {
        this.g = new fhd(bko);
    }

    public void a() {
        this.f = true;
    }

    public void a(fok fok) {
        this.b.add(fok);
    }

    public List<fok> b() {
        return this.b;
    }

    public void a(Runnable runnable) {
        this.c.add(runnable);
    }

    public void c() {
        for (Runnable run : this.c) {
            run.run();
        }
        this.c.clear();
    }

    public void a(Context context, blo blo, String str, List<edo> list) {
        if (this.g != null) {
            this.g.a(context, blo, str, list);
        }
    }

    public void d() {
        if (this.g != null) {
            this.g.a();
        }
    }

    private void a(long j, fhe fhe) {
        boolean z;
        if (fhe == fhe.LOUD || fhe == fhe.SILENT || fhe == fhe.DISPLAYONLY) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        if (a) {
            long a = glj.a();
            String valueOf = String.valueOf(fhe);
            String valueOf2 = String.valueOf(this.e.toString());
            new StringBuilder((String.valueOf(valueOf).length() + 157) + String.valueOf(valueOf2).length()).append("setNotificationTrigger eventTime: ").append(j).append(", currentTimeMillis: ").append(a).append(", triggerLevel: ").append(valueOf).append(", mNotifTriggerLevel: ").append(valueOf2).append(", mIsFromLivePush: ").append(this.f);
        }
        if (this.e.ordinal() < fhe.ordinal()) {
            this.e = fhe;
        }
    }

    public void a(long j) {
        a(j, fhe.LOUD);
    }

    public void b(long j) {
        a(j, fhe.DISPLAYONLY);
    }

    public void e() {
        c(-1);
    }

    public void c(long j) {
        a(j, fhe.SILENT);
    }

    public fhe f() {
        return this.e;
    }

    public boolean g() {
        return this.h;
    }

    public void a(boolean z) {
        this.h = z;
    }
}
