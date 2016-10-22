import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/* compiled from: PG */
public class bhw extends alt {
    SharedPreferences r;
    Context s;
    boolean t;
    private final OnClickListener u;
    private final OnClickListener v;

    static {
        bhw.class.getSimpleName();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bhw(android.content.Context r6, alz r7, awt r8, asp r9, int r10) {
        /*
        r5 = this;
        r1 = 0;
        r0 = 1;
        r5.<init>(r6, r7, r8, r9, r10);
        r5.t = r1;
        r2 = new bhx;
        r2.<init>(r5);
        r5.u = r2;
        r2 = new bhy;
        r2.<init>(r5);
        r5.v = r2;
        r5.s = r6;
        r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r6);
        r5.r = r2;
        r2 = r5.s;
        r2 = r2.getResources();
        r3 = buf.lI;
        r2 = r2.getString(r3);
        r3 = r5.r;
        r2 = r3.getBoolean(r2, r0);
        r3 = r5.r;
        r4 = "show_personalization_promo_card";
        r3 = r3.getBoolean(r4, r0);
        if (r3 == 0) goto L_0x004b;
    L_0x0039:
        if (r2 == 0) goto L_0x004b;
    L_0x003b:
        r2 = r5.g;
        if (r2 != r0) goto L_0x0049;
    L_0x003f:
        r2 = r0;
    L_0x0040:
        if (r2 != 0) goto L_0x004b;
    L_0x0042:
        r2 = r5.d;
        if (r2 != 0) goto L_0x004b;
    L_0x0046:
        r5.t = r0;
        return;
    L_0x0049:
        r2 = r1;
        goto L_0x0040;
    L_0x004b:
        r0 = r1;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: bhw.<init>(android.content.Context, alz, awt, asp, int):void");
    }

    public final zk a(ViewGroup viewGroup, int i) {
        if (i == 100) {
            return any.a(LayoutInflater.from(this.s).inflate(buf.lu, viewGroup, false));
        }
        return super.a(viewGroup, i);
    }

    public final void a(zk zkVar, int i) {
        if (a(i) == 100) {
            any any = (any) zkVar;
            any.o.setOnClickListener(this.u);
            any.n.setOnClickListener(this.v);
            return;
        }
        super.a(zkVar, i);
    }

    public final int a() {
        return (this.t ? 1 : 0) + super.a();
    }

    public final Object d(int i) {
        return super.d(i - (this.t ? 1 : 0));
    }

    public final int e(int i) {
        return super.e(i - (this.t ? 1 : 0));
    }

    public final int a(int i) {
        int a = super.a(i);
        int i2 = this.j ? 1 : 0;
        if (this.t && i == i2 + 0) {
            return 100;
        }
        return a;
    }
}
