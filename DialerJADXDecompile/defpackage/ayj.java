package defpackage;

import android.content.Context;
import com.android.incallui.InCallActivity;
import java.util.List;

/* compiled from: PG */
/* renamed from: ayj */
public class ayj extends bdj implements azz, baa, bcw, bcx {
    private static final String c;
    String a;
    ayo b;
    private boolean d;

    public ayj() {
        this.b = null;
        this.d = false;
    }

    static {
        c = ayj.class.getSimpleName();
    }

    public final void a(boolean z) {
        if (z) {
            azs.a.a((baa) this);
            azs azs = azs.a;
            ayo j = azs.j();
            if (j != null) {
                f(j);
            }
            ayo l = azs.l();
            String valueOf = String.valueOf(l);
            bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 33).append("getVideoUpgradeRequestCall call =").append(valueOf).toString());
            if (l != null) {
                b(true);
                g(l);
                return;
            }
            return;
        }
        azs.a.b((baa) this);
        if (this.a != null) {
            azs.a.b(this.a, (azz) this);
        }
    }

    public final void a(bcu bcu, bcu bcu2, ayo ayo) {
        String valueOf = String.valueOf(this);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 16).append("onIncomingCall: ").append(valueOf).toString());
        if (azs.a.l() != null) {
            Context context;
            b(false);
            bdf.a((Object) this, "declining upgrade request id: ");
            azs.a.b(this.a, (azz) this);
            bcj b = bcj.b();
            if (b.m != null) {
                context = b.m;
            } else {
                context = b.i;
            }
            b.c(context);
        }
        if (!ayo.d.equals(this.a)) {
            f(ayo);
        }
    }

    public final void a(ayo ayo) {
    }

    public final void a(azs azs) {
    }

    public final void b(ayo ayo) {
    }

    public final void a(int i) {
        if (!(i == 3)) {
            azs.a.b(this.a, (azz) this);
            b(false);
        }
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c(ayo ayo) {
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append("onUpgradeToVideo: ").append(valueOf).append(" call=").append(valueOf2).toString());
        b(true);
        boolean e = ayj.e(ayo);
        bcj b = bcj.b();
        if (e && b.o == bcu.INCOMING) {
            bdf.a((Object) this, "declining upgrade request");
            b.c(((ayk) this.i).getContext());
        } else if (e) {
            bdf.a((Object) this, "process upgrade request as no MT call");
            g(ayo);
        }
    }

    private final boolean b(boolean z) {
        InCallActivity inCallActivity = bcj.b().m;
        if (inCallActivity == null) {
            return false;
        }
        inCallActivity.a("tag_answer_fragment", z, true);
        if (this.i != null) {
            ((ayk) this.i).a(z);
        }
        return true;
    }

    private final void g(ayo ayo) {
        String valueOf = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 37).append(" processVideoUpgradeRequestCall call=").append(valueOf).toString());
        this.a = ayo.d;
        this.b = ayo;
        azs.a.a(this.a, (azz) this);
        int k = ayo.k();
        int i = ayo.j;
        if (k == i) {
            bdf.e(this, "processVideoUpgradeRequestCall: Video states are same. Return.");
            return;
        }
        ayk ayk = (ayk) this.i;
        if (ayk == null) {
            bdf.c((Object) this, "Ui is null. Can't process upgrade request");
            return;
        }
        b(true);
        ayk.a(4, i);
    }

    public final void d(ayo ayo) {
        String valueOf = String.valueOf(ayo);
        String valueOf2 = String.valueOf(this);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append("onCallStateChange() ").append(valueOf).append(" ").append(valueOf2).toString());
        if (ayo.c() != 4) {
            boolean e = ayj.e(ayo);
            if (!e) {
                azs.a.b(this.a, (azz) this);
            }
            if (azs.a.j() != null || e) {
                b(true);
            } else {
                b(false);
            }
            this.d = false;
        } else if (!this.d) {
            List b = azs.a.b(ayo.d);
            if (b != null) {
                a(ayo, b);
            }
        }
    }

    public final void a(String str) {
        bdf.a((Object) this, "sendTextToDefaultActivity()...");
        bdp.a().a(this.b.d, true, str);
        bcj.b().g();
    }

    public static void c() {
        bcj.b().g();
    }

    private final void a(ayo ayo, List list) {
        if (this.i != null) {
            boolean z;
            int i;
            if (list != null) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            if (buf.a(((ayk) this.i).getContext()) && ayo.b(32) && this.d) {
                i = 1;
            } else {
                i = 0;
            }
            if (buf.b(ayo)) {
                if (i != 0) {
                    ((ayk) this.i).a(3);
                    ((ayk) this.i).a(list);
                    return;
                }
                ((ayk) this.i).a(2);
            } else if (i != 0) {
                ((ayk) this.i).a(1);
                ((ayk) this.i).a(list);
            } else {
                ((ayk) this.i).a(0);
            }
        }
    }

    private static boolean e(ayo ayo) {
        return ayo.i == 3;
    }

    private final void f(ayo ayo) {
        this.a = ayo.d;
        this.b = ayo;
        azs.a.a(this.a, (azz) this);
        String str = c;
        String str2 = this.a;
        String valueOf = String.valueOf(this);
        bdf.a(str, new StringBuilder((String.valueOf(str2).length() + 31) + String.valueOf(valueOf).length()).append("Showing incoming for call id: ").append(str2).append(" ").append(valueOf).toString());
        if (b(true)) {
            a(ayo, azs.a.b(ayo.d));
        }
    }
}
