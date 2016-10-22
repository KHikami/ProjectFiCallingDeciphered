package defpackage;

import android.telecom.VideoProfile;

/* compiled from: PG */
/* renamed from: bdx */
public final class bdx implements bcv, bcx {
    private static bdx d;
    public bcj a;
    public bdy b;
    public boolean c;

    bdx() {
        this.b = null;
        this.c = false;
    }

    public static synchronized bdx a() {
        bdx bdx;
        synchronized (bdx.class) {
            if (d == null) {
                d = new bdx();
            }
            bdx = d;
        }
        return bdx;
    }

    private static boolean a(ayo ayo, bdy bdy) {
        if (ayo == null && bdy == null) {
            return true;
        }
        if (ayo == null || bdy == null) {
            return false;
        }
        return ayo.equals(bdy.c);
    }

    static boolean a(bdy bdy) {
        return bdx.b(bdy) && bdy.a == 3;
    }

    private static boolean b(bdy bdy) {
        return bdy != null && buf.h(bdy.b);
    }

    private static boolean a(ayo ayo) {
        return ayo != null && (ayo.c() == 5 || ayo.c() == 4);
    }

    private static boolean c(bdy bdy) {
        return bdy != null && buf.f(bdy.a);
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        ayo j;
        String valueOf = String.valueOf(bcu);
        String valueOf2 = String.valueOf(bcu2);
        a(new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("onStateChange, OldState=").append(valueOf).append(" NewState=").append(valueOf2).toString());
        if (bcu2 == bcu.INCOMING) {
            j = azs.j();
        } else if (bcu2 == bcu.WAITING_FOR_ACCOUNT) {
            j = azs.b();
        } else if (bcu2 == bcu.PENDING_OUTGOING) {
            j = azs.c();
        } else if (bcu2 == bcu.OUTGOING) {
            j = azs.d();
        } else {
            j = azs.e();
        }
        boolean z = !bdx.a(j, this.b);
        boolean h = buf.h(j);
        a("onStateChange, hasPrimaryCallChanged=" + z);
        a("onStateChange, canVideoPause=" + h);
        a("onStateChange, IsInBackground=" + this.c);
        if (z) {
            b(j);
            return;
        }
        if (bdx.c(this.b) && h && this.c) {
            b();
        } else if (!bdx.b(this.b) && h && this.c) {
            b();
        }
        c(j);
    }

    private final void b(ayo ayo) {
        String valueOf = String.valueOf(ayo);
        a(new StringBuilder(String.valueOf(valueOf).length() + 33).append("onPrimaryCallChanged: New call = ").append(valueOf).toString());
        valueOf = String.valueOf(this.b);
        a(new StringBuilder(String.valueOf(valueOf).length() + 33).append("onPrimaryCallChanged: Old call = ").append(valueOf).toString());
        a("onPrimaryCallChanged, IsInBackground=" + this.c);
        if (bdx.a(ayo, this.b)) {
            throw new IllegalStateException();
        }
        boolean z;
        boolean h = buf.h(ayo);
        bdy bdy = this.b;
        if (bdy == null || !bdx.a(bdy.c)) {
            z = false;
        } else {
            z = true;
        }
        if ((z || bdx.c(this.b) || (ayo != null && VideoProfile.isPaused(ayo.k()))) && h && !this.c) {
            a(ayo, true);
        } else if (bdx.a(ayo) && bdx.a(this.b)) {
            a(this.b.c, false);
        }
        c(ayo);
    }

    public final void a(bcu bcu, bcu bcu2, ayo ayo) {
        String valueOf = String.valueOf(bcu);
        String valueOf2 = String.valueOf(bcu2);
        String valueOf3 = String.valueOf(ayo);
        a(new StringBuilder(((String.valueOf(valueOf).length() + 41) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("onIncomingCall, OldState=").append(valueOf).append(" NewState=").append(valueOf2).append(" Call=").append(valueOf3).toString());
        if (!bdx.a(ayo, this.b)) {
            b(ayo);
        }
    }

    private final void c(ayo ayo) {
        if (ayo == null) {
            this.b = null;
        } else if (this.b != null) {
            this.b.a(ayo);
        } else {
            this.b = new bdy(this, ayo);
        }
    }

    private final void b() {
        if (this.a != null) {
            a("Bringing UI to foreground");
            this.a.c(false);
            return;
        }
        String valueOf = String.valueOf("VideoPauseController");
        String valueOf2 = String.valueOf("InCallPresenter is null. Cannot bring UI to foreground");
        bdf.c((Object) this, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    final void a(ayo ayo, boolean z) {
        if (!ayo.b(1048576)) {
            return;
        }
        if (z) {
            String valueOf = String.valueOf(ayo);
            a(new StringBuilder(String.valueOf(valueOf).length() + 29).append("sending resume request, call=").append(valueOf).toString());
            ayo.j().sendSessionModifyRequest(buf.j(ayo));
            return;
        }
        valueOf = String.valueOf(ayo);
        a(new StringBuilder(String.valueOf(valueOf).length() + 28).append("sending pause request, call=").append(valueOf).toString());
        ayo.j().sendSessionModifyRequest(buf.i(ayo));
    }

    public final void a(String str) {
        String valueOf = String.valueOf("VideoPauseController");
        String valueOf2 = String.valueOf(str);
        bdf.a((Object) this, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
