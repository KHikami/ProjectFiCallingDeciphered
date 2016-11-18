package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.R$drawable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

final class ecs extends ebf {
    private static final Object f11180h = new Object();
    private final boolean f11181i;

    static void m13519a(Context context, int i, List<ecs> list) {
        Set treeSet = new TreeSet();
        if (list != null) {
            for (ecs ecs : list) {
                treeSet.add(ecs.t.m17807a());
            }
        }
        jci b = ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(i);
        synchronized (f11180h) {
            String a;
            Object a2 = b.mo3436a("active_hangouts_list", null);
            if (a2 != null) {
                Set<String> hashSet = new HashSet(a2);
                hashSet.removeAll(treeSet);
                for (String a3 : hashSet) {
                    if (a) {
                        String str = "OngoingHangoutNotifier.cancelOngoingNotification conversationId=";
                        String valueOf = String.valueOf(a3);
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                    }
                    a3 = ecm.m13298a(context, i, a3);
                    gw a4 = gw.m18748a(context);
                    ecm.m13301a(a3, 1);
                    a4.m18751a(a3, 1);
                }
                a2 = hashSet;
            }
            b.m23880b("active_hangouts_list", treeSet).m23891d();
            if (a) {
                a3 = a2 != null ? a2.toString() : "empty";
                String valueOf2 = String.valueOf(treeSet.toString());
                new StringBuilder((String.valueOf(a3).length() + 44) + String.valueOf(valueOf2).length()).append("updateActiveHangouts: lastActive=").append(a3).append("\nnewActive=").append(valueOf2);
            }
        }
    }

    ecs(Context context, int i, String str, String str2, int i2, String str3, long j, int i3) {
        super(context, i, i2, gjj.m17806a(str2), j);
        this.f11181i = i3 == 1;
        int i4;
        if (i2 == 2) {
            if (this.f11181i) {
                i4 = bc.uq;
            } else {
                i4 = bc.eP;
            }
            this.c = context.getString(i4, new Object[]{str3});
        } else {
            if (this.f11181i) {
                i4 = bc.ur;
            } else {
                i4 = bc.eQ;
            }
            this.c = context.getString(i4);
        }
        this.f = str2;
        this.b = str;
    }

    protected void mo1807a(boolean z) {
        int i;
        this.w.m16429a(this.b).m16440c(m13307b(this.b, this.c, null, 0)).m16436b(this.c).m16419a(this.d);
        fx fxVar = this.y;
        Context context = this.r;
        if (this.f11181i) {
            i = bc.us;
        } else {
            i = bc.eS;
        }
        fxVar.m16429a(context.getString(i));
        this.v = new fw(this.w).m16352b(this.c);
        super.mo1807a(z);
    }

    protected int mo1810f() {
        return 1;
    }

    protected boolean mo1815k() {
        return false;
    }

    protected boolean mo1808b() {
        return false;
    }

    protected Intent mo1813i() {
        return gwb.m1537a(this.s, this.f, this.e);
    }

    protected int mo1811g() {
        return gwb.m1492a(this.r, "babel_notify_ongoing_video_priority_level", 2);
    }

    protected int mo1816l() {
        return this.f11181i ? R$drawable.cu : R$drawable.cq;
    }
}
