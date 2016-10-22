package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import wt;
import wv;

/* renamed from: bvb */
public final class bvb extends wv<btf> implements jza, kcd, kcn, kcq {
    static final long a;
    private final buc b;
    private final acx c;
    private wt<btf> d;
    private Parcelable e;
    private cgr f;
    private bpm g;
    private final boolean h;

    public /* synthetic */ boolean a(Object obj, Object obj2) {
        return gwb.g((btf) obj, (btf) obj2);
    }

    public /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((btf) obj).a == ((btf) obj2).a;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return btf.a((btf) obj, (btf) obj2);
    }

    static {
        a = TimeUnit.MINUTES.toMicros(15);
    }

    public bvb(buc buc, acx acx, boolean z) {
        this.b = buc;
        this.c = acx;
        this.h = z;
    }

    public void a(wt<btf> wtVar) {
        boolean z;
        boolean z2 = true;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Must be called only once.");
        if (wtVar == null) {
            z2 = false;
        }
        ba.a(z2, (Object) "MessageList must be valid.");
        this.d = wtVar;
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.f = (cgr) jyn.a(cgr.class);
        this.g = (bpm) jyn.a(bpm.class);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.e = bundle.getParcelable("scroll_state");
        }
    }

    public void b(Bundle bundle) {
        this.e = this.c.g();
        bundle.putParcelable("scroll_state", this.e);
    }

    public void a(int i, int i2) {
        boolean z;
        SortedSet e = e(i, (i + i2) - 1);
        this.b.g(i, i2);
        if (i == 0 && this.d.a() > 1) {
            this.b.d(true);
            this.b.b(1, Boolean.valueOf(true));
        }
        a(e, i, i2);
        if (i == 0) {
            z = ((btf) this.d.a(0)).i == fwy.OUTGOING_USER_MESSAGE;
            this.g.a_(this.f.c());
        } else {
            z = false;
        }
        a(z);
        int i3 = i;
        while (i3 < i + i2 && i3 < this.d.a()) {
            if (((btf) this.d.a(i3)).i == fwy.OUTGOING_USER_MESSAGE) {
                this.f.e(true);
                return;
            }
            i3++;
        }
    }

    public void b(int i, int i2) {
        if (this.d.a() == 0 || i >= this.d.a()) {
            this.b.h(i, i2);
            return;
        }
        SortedSet e = e(Math.max(i - 1, 0), Math.min(i, this.d.a() - 1));
        this.b.h(i, i2);
        a(e, 0, 0);
    }

    public void c(int i, int i2) {
        SortedSet e = e(Math.min(i, i2), Math.max(i, i2));
        this.b.e(i, i2);
        a(e, 0, 0);
    }

    public void d(int i, int i2) {
        SortedSet e = e(i, (i + i2) - 1);
        this.b.f(i, i2);
        a(e, i, i2);
    }

    private void a(boolean z) {
        if (this.e != null) {
            this.c.a(this.e);
            this.e = null;
        } else if (this.c.q() == 0 || z) {
            this.c.c(0);
        }
    }

    private SortedSet<Integer> e(int i, int i2) {
        Set treeSet = new TreeSet();
        a(treeSet, i, i2);
        b(treeSet, i, i2);
        return treeSet;
    }

    private void a(SortedSet<Integer> sortedSet, int i, int i2) {
        int i3 = -1;
        int i4 = 0;
        for (Integer a : sortedSet) {
            int a2 = gwb.a(a);
            if (i > a2 || a2 >= i + i2) {
                if (i3 < 0) {
                    i4 = 1;
                    i3 = a2;
                } else if (a2 == i3 + i4) {
                    i4++;
                } else {
                    this.b.f(i3, i4);
                    i4 = 1;
                    i3 = a2;
                }
            }
        }
        if (i3 >= 0) {
            this.b.f(i3, i4);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.Set<java.lang.Integer> r6, int r7, int r8) {
        /*
        r5 = this;
        r3 = 1;
        r2 = r7;
    L_0x0002:
        if (r2 <= 0) goto L_0x0072;
    L_0x0004:
        r0 = r5.d;
        r0 = r0.a(r2);
        r0 = (defpackage.btf) r0;
        r1 = r5.d;
        r4 = r2 + -1;
        r1 = r1.a(r4);
        r1 = (defpackage.btf) r1;
        r4 = r0.a();
        if (r4 == 0) goto L_0x0072;
    L_0x001c:
        r4 = r1.a();
        if (r4 == 0) goto L_0x0072;
    L_0x0022:
        r0 = r0.a(r1);
        if (r0 != 0) goto L_0x004f;
    L_0x0028:
        r0 = r2 + -1;
    L_0x002a:
        r2 = r0;
    L_0x002b:
        if (r2 > r8) goto L_0x004e;
    L_0x002d:
        r0 = r5.d;
        r0 = r0.a(r2);
        r0 = (defpackage.btf) r0;
        r1 = r0.a();
        if (r1 == 0) goto L_0x006c;
    L_0x003b:
        r1 = r2 + 1;
        r4 = r5.d;
        r4 = r4.a();
        if (r1 != r4) goto L_0x0052;
    L_0x0045:
        r0 = r0.a();
        if (r0 == 0) goto L_0x004e;
    L_0x004b:
        r5.a(r2, r3, r6);
    L_0x004e:
        return;
    L_0x004f:
        r2 = r2 + -1;
        goto L_0x0002;
    L_0x0052:
        r1 = r5.d;
        r4 = r2 + 1;
        r1 = r1.a(r4);
        r1 = (defpackage.btf) r1;
        r4 = r1.a();
        if (r4 == 0) goto L_0x0068;
    L_0x0062:
        r0 = r0.a(r1);
        if (r0 != 0) goto L_0x0070;
    L_0x0068:
        r0 = r3;
    L_0x0069:
        r5.a(r2, r0, r6);
    L_0x006c:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x002b;
    L_0x0070:
        r0 = 0;
        goto L_0x0069;
    L_0x0072:
        r0 = r2;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: bvb.a(java.util.Set, int, int):void");
    }

    private void a(int i, boolean z, Set<Integer> set) {
        btf btf = (btf) this.d.a(i);
        if (btf.u.a != z) {
            btf.u.a = z;
            set.add(Integer.valueOf(i));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.Set<java.lang.Integer> r11, int r12, int r13) {
        /*
        r10 = this;
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = r12;
    L_0x0006:
        if (r4 <= 0) goto L_0x00f2;
    L_0x0008:
        r0 = r10.d;
        r0 = r0.a(r4);
        r0 = (defpackage.btf) r0;
        r1 = r10.d;
        r5 = r4 + -1;
        r1 = r1.a(r5);
        r1 = (defpackage.btf) r1;
        r5 = r0.a();
        if (r5 == 0) goto L_0x00f2;
    L_0x0020:
        r5 = r1.a();
        if (r5 == 0) goto L_0x00f2;
    L_0x0026:
        r5 = r1.u;
        r5 = r5.b;
        if (r5 == 0) goto L_0x0058;
    L_0x002c:
        r0 = r1.g;
    L_0x002e:
        r2 = r0;
    L_0x002f:
        if (r4 <= r13) goto L_0x0040;
    L_0x0031:
        if (r4 == 0) goto L_0x00b9;
    L_0x0033:
        r0 = r10.d;
        r0 = r0.a();
        r0 = r0 + -1;
        if (r4 <= r0) goto L_0x0065;
    L_0x003d:
        r0 = 0;
    L_0x003e:
        if (r0 == 0) goto L_0x00f1;
    L_0x0040:
        r0 = r10.d;
        r0 = r0.a(r4);
        r0 = (defpackage.btf) r0;
        r1 = r0.a();
        if (r1 != 0) goto L_0x00bb;
    L_0x004e:
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0053:
        r2 = r4 + 1;
        r4 = r2;
        r2 = r0;
        goto L_0x002f;
    L_0x0058:
        r5 = r10.h;
        if (r5 != 0) goto L_0x0062;
    L_0x005c:
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x00f2;
    L_0x0062:
        r4 = r4 + -1;
        goto L_0x0006;
    L_0x0065:
        r0 = r10.d;
        r0 = r0.a(r4);
        r0 = (defpackage.btf) r0;
        r1 = r0.a();
        if (r1 != 0) goto L_0x0075;
    L_0x0073:
        r0 = 0;
        goto L_0x003e;
    L_0x0075:
        r6 = r0.g;
        r6 = r2 - r6;
        r8 = a;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x0089;
    L_0x007f:
        r0 = r0.u;
        r0 = r0.b;
        if (r0 != 0) goto L_0x0087;
    L_0x0085:
        r0 = 1;
        goto L_0x003e;
    L_0x0087:
        r0 = 0;
        goto L_0x003e;
    L_0x0089:
        r1 = r0.u;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00b9;
    L_0x008f:
        r1 = r10.d;
        r1 = r1.a();
        r1 = r1 + -1;
        if (r4 < r1) goto L_0x009b;
    L_0x0099:
        r0 = 0;
        goto L_0x003e;
    L_0x009b:
        r1 = r10.d;
        r5 = r4 + 1;
        r1 = r1.a(r5);
        r1 = (defpackage.btf) r1;
        r5 = r1.a();
        if (r5 != 0) goto L_0x00ad;
    L_0x00ab:
        r0 = 0;
        goto L_0x003e;
    L_0x00ad:
        r5 = r10.h;
        if (r5 != 0) goto L_0x00b9;
    L_0x00b1:
        r0 = r0.a(r1);
        if (r0 != 0) goto L_0x00b9;
    L_0x00b7:
        r0 = 0;
        goto L_0x003e;
    L_0x00b9:
        r0 = 1;
        goto L_0x003e;
    L_0x00bb:
        if (r4 == 0) goto L_0x00c7;
    L_0x00bd:
        r6 = r0.g;
        r6 = r2 - r6;
        r8 = a;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x00ce;
    L_0x00c7:
        r1 = 1;
        r10.b(r4, r1, r11);
        r0 = r0.g;
        goto L_0x0053;
    L_0x00ce:
        r1 = r10.d;
        r5 = r4 + -1;
        r1 = r1.a(r5);
        r1 = (defpackage.btf) r1;
        r5 = r10.h;
        if (r5 != 0) goto L_0x00ea;
    L_0x00dc:
        r1 = r0.a(r1);
        if (r1 != 0) goto L_0x00ea;
    L_0x00e2:
        r1 = 1;
        r10.b(r4, r1, r11);
        r0 = r0.g;
        goto L_0x0053;
    L_0x00ea:
        r0 = 0;
        r10.b(r4, r0, r11);
        r0 = r2;
        goto L_0x0053;
    L_0x00f1:
        return;
    L_0x00f2:
        r0 = r2;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: bvb.b(java.util.Set, int, int):void");
    }

    private void b(int i, boolean z, Set<Integer> set) {
        btf btf = (btf) this.d.a(i);
        if (btf.u.b != z) {
            btf.u.b = z;
            set.add(Integer.valueOf(i));
        }
    }
}
