import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.util.List;

public final class bjw extends bnn implements bnq {
    private static final boolean i;
    private static final double v;
    private static final double w;
    private Bitmap j;
    private Canvas k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private List<String> q;
    private final bnn[] r;
    private final fwu s;
    private Rect t;
    private Rect u;

    static {
        kae kae = glk.d;
        i = false;
        v = 2.0d / (Math.sqrt(2.0d) + 2.0d);
        w = (1.0d - Math.sin(Math.acos(ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR))) / 4.0d;
    }

    private bjw(bjx bjx, int i, List<String> list, bnq bnq, boolean z, Object obj) {
        super(bjx, bnq, z, obj);
        this.l = false;
        this.m = true;
        this.n = 0;
        this.r = new bnn[4];
        this.s = new fwu();
        this.p = i;
        this.q = list;
    }

    public void a(boolean z) {
        this.m = z;
    }

    public boolean a() {
        return false;
    }

    public void b() {
        super.b();
        synchronized (this.r) {
            this.l = true;
            for (int i = 0; i < this.n; i++) {
                if (this.r[i] != null) {
                    this.r[i].b();
                    this.r[i] = null;
                }
            }
            this.o = 0;
            if (this.j != null) {
                gkd.a().a(this.j);
                this.j = null;
                this.k = null;
            }
        }
    }

    public fsh m_() {
        String valueOf;
        int i = 0;
        if (i) {
            String str = "AvatarImageRequest getBytes for request ";
            valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        iil.b();
        bjx bjx = (bjx) this.f;
        int b = bjx.b();
        int size = bjx.a.size();
        synchronized (this.r) {
            if (this.l) {
            } else {
                this.n = Math.min(this.p + size, 4);
                for (int i2 = 0; i2 < Math.min(size, 4); i2++) {
                    valueOf = (String) bjx.a.get(i2);
                    if (!TextUtils.isEmpty(valueOf)) {
                        bnn bnn = new bnn(new gkc(valueOf, m()).a(b).d(true).b(this.m), this, false, null);
                        bnn.b(d());
                        if (i) {
                            valueOf = String.valueOf(bnn.toString());
                            String valueOf2 = String.valueOf(toString());
                            new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("AvatarImageRequest creating ImageRequest ").append(valueOf).append(" compound:").append(valueOf2);
                        }
                        this.r[this.o] = bnn;
                        this.o++;
                    }
                }
                Context H = gwb.H();
                while (i < this.o) {
                    frj frj = this.r[i];
                    if (!frj.e()) {
                        ((fsi) jyn.a(H, fsi.class)).c(frj);
                    }
                    i++;
                }
                if (this.o < this.n) {
                    Bitmap b2 = gkd.a().b(b, b);
                    int i3 = this.o;
                    for (String str2 : this.q) {
                        if (i3 >= this.n) {
                            break;
                        }
                        int i4;
                        if (this.s.a(H, b2, str2, 0.0f, 0.0f, (float) b, fww.a, gwb.dV)) {
                            i4 = i3 + 1;
                            a(b2, i3);
                        } else {
                            i4 = i3;
                        }
                        i3 = i4;
                    }
                    gkd.a().a(b2);
                    Bitmap b3 = ((boz) jyn.a(H, boz.class)).b();
                    while (i3 < this.n) {
                        a(b3, i3);
                        i3++;
                    }
                }
                p();
            }
        }
        return null;
    }

    private void a(Bitmap bitmap, int i) {
        boolean z;
        if (i < 0 || i >= this.n) {
            z = false;
        } else {
            z = true;
        }
        iil.a("Expected condition to be true", z);
        if (this.t == null) {
            this.t = new Rect();
        }
        if (this.u == null) {
            this.u = new Rect();
        }
        Bitmap b = b(bitmap);
        int b2 = ((bjx) this.f).b();
        int i2 = b2 / 2;
        a(this.t, b.getWidth(), b.getHeight());
        int i3;
        switch (this.n) {
            case wi.j /*1*/:
                switch (i) {
                    case wi.w /*0*/:
                        a(this.u, b2, b2);
                        break;
                    default:
                        break;
                }
            case wi.l /*2*/:
                i2 = (int) (v * ((double) b2));
                i3 = b2 - i2;
                this.u.set(0, 0, i2, i2);
                switch (i) {
                    case wi.w /*0*/:
                        break;
                    case wi.j /*1*/:
                        this.u.offset(i3, i3);
                        break;
                    default:
                        break;
                }
            case wi.z /*3*/:
                this.u.set(0, 0, i2, i2);
                i3 = (int) (((double) b2) * w);
                switch (i) {
                    case wi.w /*0*/:
                        this.u.offset(i2 / 2, i3);
                        break;
                    case wi.j /*1*/:
                        this.u.offset(0, i2 - i3);
                        break;
                    case wi.l /*2*/:
                        this.u.offset(i2, i2 - i3);
                        break;
                    default:
                        break;
                }
            case wi.h /*4*/:
                Rect rect = this.u;
                i3 = b2 / 2;
                int i4 = b2 - i3;
                rect.set(0, 0, i3, i3);
                switch (i) {
                    case wi.w /*0*/:
                        rect.offset(0, 0);
                        break;
                    case wi.j /*1*/:
                        rect.offset(i4, 0);
                        break;
                    case wi.l /*2*/:
                        rect.offset(0, i4);
                        break;
                    case wi.z /*3*/:
                        rect.offset(i4, i4);
                        break;
                    default:
                        break;
                }
        }
        if (i) {
            String valueOf = String.valueOf(toString());
            new StringBuilder(String.valueOf(valueOf).length() + 70).append("AvatarImageRequest  drew onto composite position=").append(i).append(" compound:").append(valueOf);
        }
        if (this.j == null) {
            this.j = gkd.a().b(b2, b2);
            this.k = new Canvas(this.j);
        }
        this.k.drawBitmap(b, this.t, this.u, null);
    }

    private void p() {
        if (this.o == 0) {
            fsq gkt = new gkt(this.j, c());
            gkt.a();
            gkd.a().a(c(), (gkt) gkt);
            ((fsi) jyn.a(gwb.H(), fsi.class)).a((fsr) this, gkt);
            this.j = null;
            this.k = null;
        }
    }

    private static void a(Rect rect, int i, int i2) {
        if (i > i2) {
            int i3 = (i - i2) / 2;
            rect.set(i3, 0, i3 + i2, i2);
            return;
        }
        i3 = (i2 - i) / 2;
        rect.set(0, i3, i, i3 + i);
    }

    public static bnn a(List<String> list, int i, List<String> list2, String str, int i2, String str2, bnq bnq, Object obj, String str3, boolean z, bjy bjy, boolean z2) {
        if (list == null) {
            return null;
        }
        if (i) {
            String valueOf = String.valueOf(list);
            new StringBuilder((String.valueOf(str3).length() + 73) + String.valueOf(valueOf).length()).append("makeImageRequest oldKey=").append(str3).append(" size=").append(i2).append(" urls=").append(valueOf).append("defaultAvatars=").append(i);
        }
        if (list.size() + i == 0) {
            return null;
        }
        if (list.size() == 1 && i == 0) {
            bnn bnn = new bnn(new gkc((String) list.get(0), str).a(i2).d(true).b(true).f(z).a(bjy), bnq, z2, obj);
            bnn.b(false);
            return bnn;
        }
        bjx bjx = new bjx(list, str, str2, i2, false);
        bjx.f(z).a(bjy);
        if (TextUtils.equals(bjx.q(), str3)) {
            return null;
        }
        bnn = new bjw(bjx, i, list2, bnq, z2, obj);
        if (!i) {
            return bnn;
        }
        valueOf = "makeImageRequest create new AvatarImageRequest=";
        String valueOf2 = String.valueOf(bnn.toString());
        if (valueOf2.length() != 0) {
            valueOf.concat(valueOf2);
            return bnn;
        }
        valueOf2 = new String(valueOf);
        return bnn;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(gkt r8, gjo r9, boolean r10, bnn r11, boolean r12) {
        /*
        r7 = this;
        r1 = 0;
        r0 = "Expected null";
        iil.a(r0, r9);
        iil.b();
        r0 = i;
        if (r0 == 0) goto L_0x005c;
    L_0x000d:
        r0 = r11.toString();
        r0 = java.lang.String.valueOf(r0);
        r2 = r7.toString();
        r2 = java.lang.String.valueOf(r2);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r0);
        r4 = r4.length();
        r4 = r4 + 92;
        r5 = java.lang.String.valueOf(r2);
        r5 = r5.length();
        r4 = r4 + r5;
        r3.<init>(r4);
        r4 = "AvatarImageRequest setImageBitmap for request ";
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r3 = " success=";
        r0 = r0.append(r3);
        r0 = r0.append(r10);
        r3 = " loadedFromCache=";
        r0 = r0.append(r3);
        r0 = r0.append(r12);
        r3 = " compound:";
        r0 = r0.append(r3);
        r0.append(r2);
    L_0x005c:
        if (r10 != 0) goto L_0x007c;
    L_0x005e:
        r0 = gwb.H();
        r2 = boz.class;
        r0 = jyn.a(r0, r2);
        r0 = (boz) r0;
        r0 = r0.b();
    L_0x006e:
        r2 = r7.r;
        monitor-enter(r2);
        r3 = r7.l;	 Catch:{ all -> 0x00a3 }
        if (r3 == 0) goto L_0x0081;
    L_0x0075:
        if (r8 == 0) goto L_0x007a;
    L_0x0077:
        r8.b();	 Catch:{ all -> 0x00a3 }
    L_0x007a:
        monitor-exit(r2);	 Catch:{ all -> 0x00a3 }
    L_0x007b:
        return;
    L_0x007c:
        r0 = r8.e();
        goto L_0x006e;
    L_0x0081:
        r3 = r7.n;	 Catch:{ all -> 0x00a3 }
        if (r1 >= r3) goto L_0x008e;
    L_0x0085:
        r3 = r7.r;	 Catch:{ all -> 0x00a3 }
        r3 = r3[r1];	 Catch:{ all -> 0x00a3 }
        if (r3 == r11) goto L_0x008e;
    L_0x008b:
        r1 = r1 + 1;
        goto L_0x0081;
    L_0x008e:
        r3 = r7.n;	 Catch:{ all -> 0x00a3 }
        if (r1 < r3) goto L_0x00a6;
    L_0x0092:
        if (r8 == 0) goto L_0x0097;
    L_0x0094:
        r8.b();	 Catch:{ all -> 0x00a3 }
    L_0x0097:
        r0 = "Babel";
        r1 = "Received image that was not part of the requested set";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x00a3 }
        glk.e(r0, r1, r3);	 Catch:{ all -> 0x00a3 }
        monitor-exit(r2);	 Catch:{ all -> 0x00a3 }
        goto L_0x007b;
    L_0x00a3:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00a3 }
        throw r0;
    L_0x00a6:
        r7.a(r0, r1);	 Catch:{ all -> 0x00a3 }
        if (r8 == 0) goto L_0x00ae;
    L_0x00ab:
        r8.b();	 Catch:{ all -> 0x00a3 }
    L_0x00ae:
        r0 = r7.r;	 Catch:{ all -> 0x00a3 }
        r3 = 0;
        r0[r1] = r3;	 Catch:{ all -> 0x00a3 }
        r0 = r7.o;	 Catch:{ all -> 0x00a3 }
        r0 = r0 + -1;
        r7.o = r0;	 Catch:{ all -> 0x00a3 }
        r0 = i;	 Catch:{ all -> 0x00a3 }
        if (r0 == 0) goto L_0x0100;
    L_0x00bd:
        r0 = r7.o;	 Catch:{ all -> 0x00a3 }
        r1 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x00a3 }
        r3 = r7.toString();	 Catch:{ all -> 0x00a3 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00a3 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a3 }
        r5 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00a3 }
        r5 = r5.length();	 Catch:{ all -> 0x00a3 }
        r5 = r5 + 70;
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00a3 }
        r6 = r6.length();	 Catch:{ all -> 0x00a3 }
        r5 = r5 + r6;
        r4.<init>(r5);	 Catch:{ all -> 0x00a3 }
        r5 = "AvatarImageRequest pending size=";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00a3 }
        r0 = r4.append(r0);	 Catch:{ all -> 0x00a3 }
        r4 = " request removed=";
        r0 = r0.append(r4);	 Catch:{ all -> 0x00a3 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00a3 }
        r1 = " compound:";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00a3 }
        r0.append(r3);	 Catch:{ all -> 0x00a3 }
    L_0x0100:
        r7.p();	 Catch:{ all -> 0x00a3 }
        monitor-exit(r2);	 Catch:{ all -> 0x00a3 }
        goto L_0x007b;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjw.a(gkt, gjo, boolean, bnn, boolean):void");
    }
}
