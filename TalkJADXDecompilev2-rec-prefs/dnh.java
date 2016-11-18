package p000;

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
    static final boolean f10151a = false;
    static final long f10152b = TimeUnit.SECONDS.toMillis(30);
    final dgg f10153c = dgg.m11692a();
    final dnc f10154d;
    final dnl f10155e;
    final dnm f10156f;
    final Map<String, lym> f10157g;
    final List<dmz> f10158h;
    final Handler f10159i;
    ijd f10160j;
    lym f10161k;
    lym f10162l;
    int f10163m;
    boolean f10164n;
    boolean f10165o;
    private final dnk f10166p;

    static {
        kae kae = glk.f15560g;
    }

    public dnh(Context context) {
        this.f10154d = (dnc) jyn.m25426a(context, dnc.class);
        this.f10166p = new dnk(this);
        this.f10155e = new dnl(this);
        this.f10156f = new dnm(this);
        this.f10157g = new LinkedHashMap();
        this.f10158h = new CopyOnWriteArrayList();
        this.f10159i = new Handler(Looper.getMainLooper());
        this.f10153c.m11701a(this.f10166p);
    }

    public lym mo1609a() {
        return this.f10161k;
    }

    public void mo1610a(dmz dmz) {
        this.f10158h.add(dmz);
    }

    public void mo1612b(dmz dmz) {
        this.f10158h.remove(dmz);
    }

    public boolean mo1614b() {
        return this.f10165o;
    }

    public void mo1611a(lym lym) {
        glk.m17979c("Babel", String.format("Accepting knock (%s)", new Object[]{lym.f26907b}), new Object[0]);
        m12285a(lym, true);
    }

    public void mo1613b(lym lym) {
        int i = 1;
        glk.m17979c("Babel", String.format("Rejecting knock (%s)", new Object[]{lym.f26907b}), new Object[0]);
        m12285a(lym, false);
        int i2 = this.f10163m + 1;
        this.f10163m = i2;
        if (((long) i2) % 3 != 0) {
            i = 0;
        }
        if (this.f10154d.mo1626b() && r0 != 0) {
            for (dmz b : this.f10158h) {
                b.mo1619b();
            }
        }
    }

    void m12285a(lym lym, boolean z) {
        if (m12281d() && this.f10157g.containsKey(lym.f26907b)) {
            lym lym2 = new lym();
            lym2.f26906a = lym.f26906a;
            lym2.f26907b = lym.f26907b;
            lym2.f26921p = Integer.valueOf(z ? 12 : 11);
            nzf lyr = new lyr();
            lyr.f26946c = new lym[]{lym2};
            this.f10160j.mo3367b(lyr, new dni(this, lym, z));
        }
    }

    void m12289c() {
        lym lym = null;
        if (m12281d()) {
            CharSequence charSequence;
            if (this.f10161k == null) {
                charSequence = null;
            } else {
                Object obj = this.f10161k.f26907b;
            }
            lym lym2 = this.f10157g.isEmpty() ? null : (lym) this.f10157g.values().iterator().next();
            if (!TextUtils.equals(charSequence, lym2 == null ? null : lym2.f26907b)) {
                String str = "Babel";
                String str2 = "New head of knocking queue (%s)";
                Object[] objArr = new Object[1];
                if (lym2 != null) {
                    lym = lym2.f26907b;
                }
                objArr[0] = lym;
                glk.m17979c(str, String.format(str2, objArr), new Object[0]);
                this.f10161k = lym2;
                m12290c(this.f10161k);
            }
        } else if (this.f10161k != null) {
            this.f10161k = null;
            m12290c(null);
        }
    }

    private boolean m12281d() {
        return this.f10160j != null && this.f10153c.m11721m() && this.f10154d.mo1622a() == dnd.KNOCKABLE && mo1614b();
    }

    void m12290c(lym lym) {
        for (dmz a : this.f10158h) {
            a.mo1618a(lym);
        }
    }
}
