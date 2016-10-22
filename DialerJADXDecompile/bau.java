import android.content.Context;
import android.telecom.Call.Details;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class bau extends bdj implements bcr, bcv, bcx {
    Context a;

    public final /* synthetic */ void a(bdq bdq) {
        super.a((bav) bdq);
        bcj.b().b((bcv) this);
        bcj.b().b((bcx) this);
    }

    public final /* synthetic */ void b(bdq bdq) {
        super.b((bav) bdq);
        bcj.b().a((bcv) this);
        bcj.b().a((bcx) this);
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        if (((bav) this.i).a()) {
            String valueOf = String.valueOf(bcu2);
            bdf.b((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 13).append("onStateChange").append(valueOf).toString());
            if (bcu2 == bcu.INCALL) {
                ayo i = azs.i();
                if (i == null || !i.c(1)) {
                    bcj.b().d(false);
                    return;
                }
                String str = "Number of existing calls is ";
                valueOf = String.valueOf(String.valueOf(i.e.size()));
                bdf.b((Object) this, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                a(azs);
                return;
            }
            bcj.b().d(false);
        }
    }

    public final void a(ayo ayo, Details details) {
        boolean can = details.can(8192);
        boolean can2 = details.can(4096);
        if (!(ayo.b(8192) == can && ayo.b(4096) == can2)) {
            ((bav) this.i).a(ayo);
        }
        if (!details.can(128)) {
            bcj.b().d(false);
        }
    }

    final void a(azs azs) {
        boolean z = false;
        ayo i = azs.i();
        if (i != null) {
            boolean z2;
            List arrayList = new ArrayList(i.e.size());
            for (String a : i.e) {
                arrayList.add(azs.a(a));
            }
            String str = "Number of calls is ";
            String a2 = String.valueOf(String.valueOf(arrayList.size()));
            bdf.a((Object) this, a2.length() != 0 ? str.concat(a2) : new String(str));
            if (azs.e() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3;
            if (azs.f() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!(z2 && r3)) {
                z = true;
            }
            ((bav) this.i).a(this.a, arrayList, z);
        }
    }

    public final void a(bcu bcu, bcu bcu2, ayo ayo) {
        if (((bav) this.i).a()) {
            bdf.a((Object) this, "onIncomingCall()... Conference ui is showing, hide it.");
            bcj.b().d(false);
        }
    }
}
