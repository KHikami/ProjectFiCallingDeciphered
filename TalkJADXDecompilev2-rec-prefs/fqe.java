package p000;

import android.content.Intent;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

public final class fqe {
    private static final boolean f13732a = false;

    static {
        kae kae = glk.f15565l;
    }

    public static void m15953a(Intent intent, String str) {
        intent.putExtra("payload", str);
    }

    public static void m15952a(Intent intent, long j, long j2) {
        intent.putExtra("timestamp", j);
        intent.putExtra("gcm_handle_timestamps", j2);
    }

    public static List<fqd> m15950a(Intent intent, int i, boolean z) {
        if (!intent.getExtras().containsKey("payload")) {
            return null;
        }
        List<fqd> a = fqe.m15951a(intent.getStringExtra("payload"), intent.getLongExtra("timestamp", 0), intent.getLongExtra("gcm_handle_timestamps", 0), glj.m17963b() * 1000, i, z);
        if (!z || !gjk.f15365b) {
            return a;
        }
        gjk.m17812c();
        return a;
    }

    public static List<fqd> m15951a(String str, long j, long j2, long j3, int i, boolean z) {
        Object obj = (z && gjk.f15365b) ? 1 : null;
        bko e = fde.m15018e(i);
        if (obj != null) {
            new gjn().m17819a("recv_server_update").m17817a(e).m17825c(str.length()).m17824b();
        }
        String valueOf;
        try {
            lnt lnt = (lnt) nzf.m1027a(new lnt(), Base64.decode(str, 0));
            if (f13732a) {
                String valueOf2 = String.valueOf(lnt);
                new StringBuilder(String.valueOf(valueOf2).length() + 23).append("ClientBatchUpdate from:").append(valueOf2);
            }
            if (lnt.f25825a.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (lwd lwd : lnt.f25825a) {
                    gjn gjn;
                    fou fqf;
                    if (f13732a) {
                        valueOf = String.valueOf(lwd);
                        new StringBuilder(String.valueOf(valueOf).length() + 27).append("received ClientStateUpdate ").append(valueOf);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    bko e2 = fde.m15018e(i);
                    boolean z2 = gjk.f15365b;
                    long a = glj.m17956a();
                    edo b = e2.m5632b();
                    if (z2) {
                        gjn = new gjn();
                    } else {
                        gjn = null;
                    }
                    int i2 = 0;
                    long j4 = 0;
                    boolean z3 = false;
                    if (lwd.f26642a != null) {
                        lwe lwe = lwd.f26642a;
                        i2 = gwb.m1507a(lwe.f26668a);
                        j4 = gwb.m1523a(lwe.f26670c);
                        if (lwe.f26669b != null) {
                            ltj ltj = lwe.f26669b;
                            if (ltj.f26381a != null) {
                                z3 = gwb.m2061b(ltj.f26381a.f26030a);
                            }
                        }
                        if (z2) {
                            gjn.m17814a().m17819a("server_update_field").m17823b("ClientStateUpdateHeader").m17816a(a).m17815a(i2).m17820a(z3).m17817a(e2).m17824b();
                        }
                    }
                    boolean z4 = z3;
                    int i3 = i2;
                    if (glk.m17973a("Babel", 3)) {
                        String valueOf3 = String.valueOf(b);
                        glk.m17970a("Babel", new StringBuilder(String.valueOf(valueOf3).length() + 59).append("parseServerUpdates: acct=").append(valueOf3).append(", activeClientState is ").append(i3).toString(), new Object[0]);
                    }
                    if (i3 == 1 || !fkb.m15538a(i)) {
                        i2 = i3;
                    } else {
                        if (glk.m17973a("Babel", 3)) {
                            glk.m17970a("Babel", "Overwrite active client state from server: " + i3, new Object[0]);
                        }
                        i2 = 1;
                    }
                    if (z4) {
                        i2 = 2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    bko e3 = fde.m15018e(i);
                    if (!(lwd.f26643b == null && (lwd.f26644c == null || lwd.f26658q == null || lwd.f26644c.f26143a.f26113h == null))) {
                        fpg fpg = new fpg(lwd.f26658q);
                        if (fpg.m15881j() == null && e3.m5650s()) {
                            fpg.m15874b(e3.m5652u());
                        }
                        if (z2) {
                            gjn.m17814a().m17819a("server_update_field").m17823b("Conversation").m17816a(a).m17815a(i2).m17820a(z4).m17826c(fpg.a).m17817a(e3).m17824b();
                        }
                        arrayList3.add(fpg);
                    }
                    if (lwd.f26656o != null) {
                        arrayList3.add(new fpp(lwd.f26656o));
                    }
                    if (lwd.f26644c != null) {
                        fpl a2 = fpl.m15837a(lwd.f26644c.f26143a, i2, j4, fdq.f12789e.m14370b(i), i, j, j2, j3);
                        if (a2 != null) {
                            if (z2) {
                                gjn.m17814a().m17819a("server_update_field").m17823b(a2.getClass().getSimpleName()).m17816a(a).m17822b(a2.c).m17815a(i2).m17820a(z4).m17821b(a2.f13600e).m17826c(a2.a).m17817a(e3).m17824b();
                            }
                            arrayList3.add(a2);
                        }
                    }
                    if (lwd.f26645d != null) {
                        fqf = new fqf(lwd.f26645d);
                        if (z2) {
                            fqe.m15954a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    if (lwd.f26646e != null) {
                        fqf = new fqg(lwd.f26646e);
                        if (z2) {
                            fqe.m15954a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    if (lwd.f26649h != null) {
                        fqf = new fqj(lwd.f26649h);
                        if (z2) {
                            fqe.m15954a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    if (lwd.f26657p != null) {
                        fqf = new fpm(lwd.f26657p);
                        if (z2) {
                            fqe.m15954a(fqf, gjn, i, a, i2);
                        }
                        arrayList3.add(fqf);
                    }
                    arrayList2.addAll(arrayList3);
                    arrayList2.addAll(fqe.m15949a(lwd, i2, i, a, z4, z2, gjn));
                    if (arrayList2.isEmpty()) {
                        glk.m17981d("Babel", "Unexpected update type from babel server", new Object[0]);
                    }
                    arrayList.addAll(arrayList2);
                }
                return arrayList;
            }
            glk.m17982e("Babel", "received a client update with no contents", new Object[0]);
            return null;
        } catch (nzd e4) {
            valueOf = String.valueOf(e4);
            glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Problem parsing client update: ").append(valueOf).toString(), new Object[0]);
            return null;
        }
    }

    private static ArrayList<fqd> m15949a(lwd lwd, int i, int i2, long j, boolean z, boolean z2, gjn gjn) {
        ArrayList<fqd> arrayList = new ArrayList();
        bko e = fde.m15018e(i2);
        if (lwd.f26648g != null) {
            arrayList.add(new fqa(lwd.f26648g));
        }
        if (lwd.f26659r != null) {
            fqc fqc = new fqc(lwd.f26659r);
            if (z2) {
                gjn.m17814a().m17819a("server_update_field").m17823b("SelfPresenceNotification").m17816a(j).m17815a(i).m17820a(z).m17817a(e).m17824b();
            }
            arrayList.add(fqc);
        }
        if (lwd.f26654m != null) {
            for (fed a : jyn.m25438c(gwb.m1400H(), fed.class)) {
                a.mo535a(i2, lwd.f26654m.f25841a);
            }
        }
        if (lwd.f26650i != null) {
            fqi fqi = new fqi(lwd.f26650i);
            if (z2) {
                gjn.m17814a().m17819a("server_update_field").m17823b("ViewModificationNotification").m17826c(fqi.m15961a()).m17816a(j).m17815a(i).m17820a(z).m17817a(e).m17824b();
            }
            arrayList.add(fqi);
        }
        if (lwd.f26647f != null) {
            arrayList.add(new fps(lwd.f26647f));
        }
        if (lwd.f26652k != null) {
            arrayList.add(new fpj(lwd.f26652k));
        }
        if (lwd.f26666y != null) {
            arrayList.add(new fpi(lwd.f26666y));
        }
        if (lwd.f26661t != null) {
            arrayList.add(new fov(lwd.f26661t));
        }
        if (lwd.f26665x != null) {
            arrayList.add(new fpf(lwd.f26665x, lwd.f26642a.f26675h));
        }
        if (lwd.f26664w != null) {
            arrayList.add(new fqb(lwd.f26664w));
        }
        if (lwd.f26651j != null) {
            arrayList.add(new fpk(lwd.f26651j));
        }
        return arrayList;
    }

    private static void m15954a(fou fou, gjn gjn, int i, long j, int i2) {
        gjn.m17814a().m17819a("server_update_field").m17823b(fou.getClass().getSimpleName()).m17816a(j).m17822b(fou.f13595c).m17815a(i2).m17826c(fou.f13593a).m17817a(fde.m15018e(i)).m17824b();
    }
}
