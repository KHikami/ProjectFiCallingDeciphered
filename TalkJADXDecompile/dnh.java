import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class dnh implements dna {
    static final boolean a;
    static final long b;
    final dgg c;
    final dnc d;
    final dnl e;
    final dnm f;
    final Map<String, lym> g;
    final List<dmz> h;
    final Handler i;
    ijd j;
    lym k;
    lym l;
    int m;
    boolean n;
    boolean o;
    private final dnk p;

    static {
        kae kae = glk.g;
        a = false;
        b = TimeUnit.SECONDS.toMillis(30);
    }

    public dnh(Context context) {
        this.c = dgg.a();
        this.d = (dnc) jyn.a(context, dnc.class);
        this.p = new dnk(this);
        this.e = new dnl(this);
        this.f = new dnm(this);
        this.g = new LinkedHashMap();
        this.h = new CopyOnWriteArrayList();
        this.i = new Handler(Looper.getMainLooper());
        this.c.a(this.p);
    }

    public lym a() {
        return this.k;
    }

    public void a(dmz dmz) {
        this.h.add(dmz);
    }

    public void b(dmz dmz) {
        this.h.remove(dmz);
    }

    public boolean b() {
        return this.o;
    }

    public void a(lym lym) {
        glk.c("Babel", String.format("Accepting knock (%s)", new Object[]{lym.b}), new Object[0]);
        a(lym, true);
    }

    public void b(lym lym) {
        int i = 1;
        glk.c("Babel", String.format("Rejecting knock (%s)", new Object[]{lym.b}), new Object[0]);
        a(lym, false);
        int i2 = this.m + 1;
        this.m = i2;
        if (((long) i2) % 3 != 0) {
            i = 0;
        }
        if (this.d.b() && r0 != 0) {
            for (dmz b : this.h) {
                b.b();
            }
        }
    }

    void a(lym lym, boolean z) {
        if (d() && this.g.containsKey(lym.b)) {
            lym lym2 = new lym();
            lym2.a = lym.a;
            lym2.b = lym.b;
            lym2.p = Integer.valueOf(z ? 12 : 11);
            nzf lyr = new lyr();
            lyr.c = new lym[]{lym2};
            this.j.b(lyr, new dni(this, lym, z));
        }
    }

    void c() {
        lym lym = null;
        if (d()) {
            CharSequence charSequence;
            if (this.k == null) {
                charSequence = null;
            } else {
                Object obj = this.k.b;
            }
            lym lym2 = this.g.isEmpty() ? null : (lym) this.g.values().iterator().next();
            if (!TextUtils.equals(charSequence, lym2 == null ? null : lym2.b)) {
                String str = "Babel";
                String str2 = "New head of knocking queue (%s)";
                Object[] objArr = new Object[1];
                if (lym2 != null) {
                    lym = lym2.b;
                }
                objArr[0] = lym;
                glk.c(str, String.format(str2, objArr), new Object[0]);
                this.k = lym2;
                c(this.k);
            }
        } else if (this.k != null) {
            this.k = null;
            c(null);
        }
    }

    private boolean d() {
        return this.j != null && this.c.m() && this.d.a() == dnd.KNOCKABLE && b();
    }

    void c(lym lym) {
        for (dmz a : this.h) {
            a.a(lym);
        }
    }
}
