import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class ero implements jcm {
    private static final boolean d;
    final SparseArray<erb> a;
    final eri b;
    final jcf c;
    private final err e;
    private final Context f;
    private final fzw g;
    private final fvv h;

    static {
        kae kae = glk.t;
        d = false;
    }

    public ero(Context context) {
        this.a = new SparseArray();
        this.b = new eri();
        this.e = new err(this);
        RealTimeChatService.a(new erp(this));
        this.f = context;
        this.c = (jcf) jyn.a(context, jcf.class);
        this.g = (fzw) jyn.a(context, fzw.class);
        this.h = (fvv) jyn.a(context, fvv.class);
        gwb.a(new erq(this));
    }

    public void a(int i, String str, erl erl, int i2) {
        boolean z = true;
        ba.a(this.c.c(i));
        ba.a(!TextUtils.isEmpty(str));
        ba.a((Object) erl);
        if (i2 == 0) {
            z = false;
        }
        ba.a(z);
        if (d) {
            String valueOf = String.valueOf(glk.b(str));
            new StringBuilder(String.valueOf(valueOf).length() + 76).append("Registration for presence: fieldMask=").append(i2).append(", gaia=").append(valueOf).append(", account=").append(i);
        }
        if (!this.h.a(i)) {
            i2 &= etx.AVAILABLE.l ^ -1;
        }
        synchronized (this.b) {
            erb erb = (erb) this.a.get(i);
            if (erb == null) {
                erb = new erb(this.f, this.c, this.g, i, this.b);
                this.a.put(i, erb);
                this.e.b();
            }
            if (erb.a(str, erl, i2)) {
                this.e.a();
            }
        }
    }

    public void a(erl erl) {
        synchronized (this.b) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                if (!((erb) this.a.valueAt(size)).a(erl)) {
                    this.a.removeAt(size);
                }
            }
        }
    }

    public void S_() {
        synchronized (this.b) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                if (!this.c.c(this.a.keyAt(size))) {
                    ((erb) this.a.valueAt(size)).a();
                    this.a.removeAt(size);
                }
            }
        }
    }

    public void a(int i, String str, etx etx, Object obj) {
        boolean z = false;
        if (this.c.c(i)) {
            if (!TextUtils.isEmpty(str)) {
                z = true;
            }
            ba.a(z);
            ba.a((Object) etx);
            synchronized (this.b) {
                erb erb = (erb) this.a.get(i);
                if (erb == null) {
                    erb = new erb(this.f, this.c, this.g, i, this.b);
                    this.a.put(i, erb);
                }
                erb.a(str, etx, obj);
            }
            return;
        }
        glk.c("Babel", "Dropping presence update for invalid account " + i, new Object[0]);
    }
}
