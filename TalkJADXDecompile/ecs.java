import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.R$drawable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

final class ecs extends ebf {
    private static final Object h;
    private final boolean i;

    static {
        h = new Object();
    }

    static void a(Context context, int i, List<ecs> list) {
        Set treeSet = new TreeSet();
        if (list != null) {
            for (ecs ecs : list) {
                treeSet.add(ecs.t.a());
            }
        }
        jci b = ((jcf) jyn.a(context, jcf.class)).b(i);
        synchronized (h) {
            String a;
            Object a2 = b.a("active_hangouts_list", null);
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
                    a3 = ecm.a(context, i, a3);
                    gw a4 = gw.a(context);
                    ecm.a(a3, 1);
                    a4.a(a3, 1);
                }
                a2 = hashSet;
            }
            b.b("active_hangouts_list", treeSet).d();
            if (a) {
                a3 = a2 != null ? a2.toString() : "empty";
                String valueOf2 = String.valueOf(treeSet.toString());
                new StringBuilder((String.valueOf(a3).length() + 44) + String.valueOf(valueOf2).length()).append("updateActiveHangouts: lastActive=").append(a3).append("\nnewActive=").append(valueOf2);
            }
        }
    }

    ecs(Context context, int i, String str, String str2, int i2, String str3, long j, int i3) {
        super(context, i, i2, gjj.a(str2), j);
        this.i = i3 == 1;
        int i4;
        if (i2 == 2) {
            if (this.i) {
                i4 = bc.uq;
            } else {
                i4 = bc.eP;
            }
            this.c = context.getString(i4, new Object[]{str3});
        } else {
            if (this.i) {
                i4 = bc.ur;
            } else {
                i4 = bc.eQ;
            }
            this.c = context.getString(i4);
        }
        this.f = str2;
        this.b = str;
    }

    protected void a(boolean z) {
        int i;
        this.w.a(this.b).c(b(this.b, this.c, null, 0)).b(this.c).a(this.d);
        fx fxVar = this.y;
        Context context = this.r;
        if (this.i) {
            i = bc.us;
        } else {
            i = bc.eS;
        }
        fxVar.a(context.getString(i));
        this.v = new fw(this.w).b(this.c);
        super.a(z);
    }

    protected int f() {
        return 1;
    }

    protected boolean k() {
        return false;
    }

    protected boolean b() {
        return false;
    }

    protected Intent i() {
        return gwb.a(this.s, this.f, this.e);
    }

    protected int g() {
        return gwb.a(this.r, "babel_notify_ongoing_video_priority_level", 2);
    }

    protected int l() {
        return this.i ? R$drawable.cu : R$drawable.cq;
    }
}
