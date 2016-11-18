package defpackage;

import android.content.Intent;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

public final class fqe {
    private static final boolean a = false;

    static {
        kae kae = glk.l;
    }

    public static void a(Intent intent, String str) {
        intent.putExtra("payload", str);
    }

    public static void a(Intent intent, long j, long j2) {
        intent.putExtra("timestamp", j);
        intent.putExtra("gcm_handle_timestamps", j2);
    }

    public static List<fqd> a(Intent intent, int i, boolean z) {
        if (!intent.getExtras().containsKey("payload")) {
            return null;
        }
        List<fqd> a = fqe.a(intent.getStringExtra("payload"), intent.getLongExtra("timestamp", 0), intent.getLongExtra("gcm_handle_timestamps", 0), glj.b() * 1000, i, z);
        if (!z || !gjk.b) {
            return a;
        }
        gjk.c();
        return a;
    }

    public static List<fqd> a(String str, long j, long j2, long j3, int i, boolean z) {
        String valueOf;
        Object obj = (z && gjk.b) ? 1 : null;
        bko e = fde.e(i);
        if (obj != null) {
            new gjn().a("recv_server_update").a(e).c(str.length()).b();
        }
        try {
            lnt lnt = (lnt) nzf.a(new lnt(), Base64.decode(str, 0));
            if (a) {
                String valueOf2 = String.valueOf(lnt);
                new StringBuilder(String.valueOf(valueOf2).length() + 23).append("ClientBatchUpdate from:").append(valueOf2);
            }
            if (lnt.a.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (lwd lwd : lnt.a) {
                    gjn gjn;
                    fou fqf;
                    if (a) {
                        valueOf = String.valueOf(lwd);
                        new StringBuilder(String.valueOf(valueOf).length() + 27).append("received ClientStateUpdate ").append(valueOf);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    bko e2 = fde.e(i);
                    boolean z2 = gjk.b;
                    long a = glj.a();
                    edo b = e2.b();
                    if (z2) {
                        gjn = new gjn();
                    } else {
                        gjn = null;
                    }
                    int i2 = 0;
                    long j4 = 0;
                    boolean z3 = false;
                    if (lwd.a != null) {
                        lwe lwe = lwd.a;
                        i2 = gwb.a(lwe.a);
                        j4 = gwb.a(lwe.c);
                        if (lwe.b != null) {
                            ltj ltj = lwe.b;
                            if (ltj.a != null) {
                                z3 = gwb.b(ltj.a.a);
                            }
                        }
                        if (z2) {
                            gjn.a().a("server_update_field").b("ClientStateUpdateHeader").a(a).a(i2).a(z3).a(e2).b();
                        }
                    }
                    boolean z4 = z3;
                    int i3 = i2;
                    if (glk.a("Babel", 3)) {
                        String valueOf3 = String.valueOf(b);
                        glk.a("Babel", new StringBuilder(String.valueOf(valueOf3).length() + 59).append("parseServerUpdates: acct=").append(valueOf3).append(", activeClientState is ").append(i3).toString(), new Object[0]);
                    }
                    if (i3 == 1 || !fkb.a(i)) {
                        i2 = i3;
                    } else {
                        if (glk.a("Babel", 3)) {
                            glk.a("Babel", "Overwrite active client state from server: " + i3, new Object[0]);
                        }
                        i2 = 1;
                    }
                    if (z4) {
                        i2 = 2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    bko e3 = fde.e(i);
                    if (!(lwd.b == null && (lwd.c == null || lwd.q == null || lwd.c.a.h == null))) {
                        fpg fpg = new fpg(lwd.q);
                        if (fpg.j() == null && e3.s()) {
                            fpg.b(e3.u());
                        }
                        if (z2) {
                            gjn.a().a("server_update_field").b("Conversation").a(a).a(i2).a(z4).c(fpg.a).a(e3).b();
                        }
                        arrayList3.add(fpg);
                    }
                    if (lwd.o != null) {
                        arrayList3.add(new fpp(lwd.o));
                    }
                    if (lwd.c != null) {
                        fpl a2 = fpl.a(lwd.c.a, i2, j4, fdq.e.b(i), i, j, j2, j3);
                        if (a2 != null) {
                            if (z2) {
                                gjn.a().a("server_update_field").b(a2.getClass().getSimpleName()).a(a).b(a2.c).a(i2).a(z4).b(a2.e).c(a2.a).a(e3).b();
                            }
                            arrayList3.add(a2);
                        }
                    }
                    if (lwd.d != null) {
                        fqf = new fqf(lwd.d);
                        if (z2) {
                            fqe.a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    if (lwd.e != null) {
                        fqf = new fqg(lwd.e);
                        if (z2) {
                            fqe.a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    if (lwd.h != null) {
                        fqf = new fqj(lwd.h);
                        if (z2) {
                            fqe.a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    if (lwd.p != null) {
                        fqf = new fpm(lwd.p);
                        if (z2) {
                            fqe.a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    arrayList2.addAll(arrayList3);
                    arrayList2.addAll(fqe.a(lwd, i2, i, a, z4, z2, gjn));
                    if (arrayList2.isEmpty()) {
                        glk.d("Babel", "Unexpected update type from babel server", new Object[0]);
                    }
                    arrayList.addAll(arrayList2);
                }
                return arrayList;
            }
            glk.e("Babel", "received a client update with no contents", new Object[0]);
            return null;
        } catch (nzd e4) {
            valueOf = String.valueOf(e4);
            glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Problem parsing client update: ").append(valueOf).toString(), new Object[0]);
            return null;
        }
    }

    private static ArrayList<fqd> a(lwd lwd, int i, int i2, long j, boolean z, boolean z2, gjn gjn) {
        ArrayList<fqd> arrayList = new ArrayList();
        bko e = fde.e(i2);
        if (lwd.g != null) {
            arrayList.add(new fqa(lwd.g));
        }
        if (lwd.r != null) {
            fqc fqc = new fqc(lwd.r);
            if (z2) {
                gjn.a().a("server_update_field").b("SelfPresenceNotification").a(j).a(i).a(z).a(e).b();
            }
            arrayList.add(fqc);
        }
        if (lwd.m != null) {
            for (fed a : jyn.c(gwb.H(), fed.class)) {
                a.a(i2, lwd.m.a);
            }
        }
        if (lwd.i != null) {
            fqi fqi = new fqi(lwd.i);
            if (z2) {
                gjn.a().a("server_update_field").b("ViewModificationNotification").c(fqi.a()).a(j).a(i).a(z).a(e).b();
            }
            arrayList.add(fqi);
        }
        if (lwd.f != null) {
            arrayList.add(new fps(lwd.f));
        }
        if (lwd.k != null) {
            arrayList.add(new fpj(lwd.k));
        }
        if (lwd.y != null) {
            arrayList.add(new fpi(lwd.y));
        }
        if (lwd.t != null) {
            arrayList.add(new fov(lwd.t));
        }
        if (lwd.x != null) {
            arrayList.add(new fpf(lwd.x, lwd.a.h));
        }
        if (lwd.w != null) {
            arrayList.add(new fqb(lwd.w));
        }
        if (lwd.j != null) {
            arrayList.add(new fpk(lwd.j));
        }
        return arrayList;
    }

    private static void a(fou fou, gjn gjn, int i, long j, int i2) {
        gjn.a().a("server_update_field").b(fou.getClass().getSimpleName()).a(j).b(fou.c).a(i2).c(fou.a).a(fde.e(i)).b();
    }
}
