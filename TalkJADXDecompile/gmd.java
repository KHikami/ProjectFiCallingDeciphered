import android.content.Context;
import java.util.List;

public final class gmd {
    private static final boolean a;
    private final Context b;
    private List<bjg> c;

    static {
        kae kae = glk.t;
        a = false;
    }

    public gmd(Context context, List<bjg> list) {
        this.b = context;
        this.c = list;
    }

    public boolean a() {
        if (this.c.isEmpty()) {
            return false;
        }
        if (this.c.size() > 1) {
            return false;
        }
        if (!((bjg) this.c.get(0)).z()) {
            return false;
        }
        boolean a = ((fbx) jyn.a(this.b, fbx.class)).a(this.b, fde.e(((jca) jyn.a(this.b, jca.class)).a()));
        boolean d = glq.d(this.b);
        if (a) {
            new StringBuilder(70).append("[canPhoneCall] canCallOverHangoutsDialer: ").append(a).append(" canCallOverPstn: ").append(d);
        }
        return a || d;
    }

    public boolean b() {
        if (this.c.isEmpty()) {
            return false;
        }
        return d();
    }

    public boolean c() {
        boolean z;
        for (bjg s : this.c) {
            if (!s.s()) {
                z = false;
                break;
            }
        }
        z = true;
        boolean d = d();
        if (a) {
            new StringBuilder(90).append("[canContactViaHangouts] isHangoutsCallingEnabled: ").append(d).append(" allContactsAreHangoutsUsers: ").append(z);
        }
        if (d && z) {
            return true;
        }
        return false;
    }

    private boolean d() {
        int a = ((jca) jyn.a(this.b, jca.class)).a();
        fzw fzw = (fzw) jyn.a(this.b, fzw.class);
        boolean c = dgg.a().c();
        boolean a2 = fzw.a(a);
        if (a) {
            new StringBuilder(84).append("[isHangoutsCallingEnabled] isHangoutsSupported: ").append(c).append(" isCarrierSmsOnlyAccount: ").append(a2);
        }
        return c && !a2;
    }
}
