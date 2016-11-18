package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class ero implements jcm {
    private static final boolean f12127d = false;
    final SparseArray<erb> f12128a = new SparseArray();
    final eri f12129b = new eri();
    final jcf f12130c;
    private final err f12131e = new err(this);
    private final Context f12132f;
    private final fzw f12133g;
    private final fvv f12134h;

    static {
        kae kae = glk.f15573t;
    }

    public ero(Context context) {
        RealTimeChatService.m9040a(new erp(this));
        this.f12132f = context;
        this.f12130c = (jcf) jyn.m25426a(context, jcf.class);
        this.f12133g = (fzw) jyn.m25426a(context, fzw.class);
        this.f12134h = (fvv) jyn.m25426a(context, fvv.class);
        gwb.m1863a(new erq(this));
    }

    public void m14331a(int i, String str, erl erl, int i2) {
        boolean z = true;
        ba.m4577a(this.f12130c.mo3467c(i));
        ba.m4577a(!TextUtils.isEmpty(str));
        ba.m4536a((Object) erl);
        if (i2 == 0) {
            z = false;
        }
        ba.m4577a(z);
        if (f12127d) {
            String valueOf = String.valueOf(glk.m17974b(str));
            new StringBuilder(String.valueOf(valueOf).length() + 76).append("Registration for presence: fieldMask=").append(i2).append(", gaia=").append(valueOf).append(", account=").append(i);
        }
        if (!this.f12134h.m16337a(i)) {
            i2 &= etx.AVAILABLE.f12271l ^ -1;
        }
        synchronized (this.f12129b) {
            erb erb = (erb) this.f12128a.get(i);
            if (erb == null) {
                erb = new erb(this.f12132f, this.f12130c, this.f12133g, i, this.f12129b);
                this.f12128a.put(i, erb);
                this.f12131e.m14336b();
            }
            if (erb.m14310a(str, erl, i2)) {
                this.f12131e.m14335a();
            }
        }
    }

    public void m14333a(erl erl) {
        synchronized (this.f12129b) {
            for (int size = this.f12128a.size() - 1; size >= 0; size--) {
                if (!((erb) this.f12128a.valueAt(size)).m14309a(erl)) {
                    this.f12128a.removeAt(size);
                }
            }
        }
    }

    public void S_() {
        synchronized (this.f12129b) {
            for (int size = this.f12128a.size() - 1; size >= 0; size--) {
                if (!this.f12130c.mo3467c(this.f12128a.keyAt(size))) {
                    ((erb) this.f12128a.valueAt(size)).m14304a();
                    this.f12128a.removeAt(size);
                }
            }
        }
    }

    public void m14332a(int i, String str, etx etx, Object obj) {
        boolean z = false;
        if (this.f12130c.mo3467c(i)) {
            if (!TextUtils.isEmpty(str)) {
                z = true;
            }
            ba.m4577a(z);
            ba.m4536a((Object) etx);
            synchronized (this.f12129b) {
                erb erb = (erb) this.f12128a.get(i);
                if (erb == null) {
                    erb = new erb(this.f12132f, this.f12130c, this.f12133g, i, this.f12129b);
                    this.f12128a.put(i, erb);
                }
                erb.m14308a(str, etx, obj);
            }
            return;
        }
        glk.m17979c("Babel", "Dropping presence update for invalid account " + i, new Object[0]);
    }
}
