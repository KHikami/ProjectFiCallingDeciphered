package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.util.List;

public final class bjw extends bnn implements bnq {
    private static final boolean f3563i = false;
    private static final double f3564v = (2.0d / (Math.sqrt(2.0d) + 2.0d));
    private static final double f3565w = ((1.0d - Math.sin(Math.acos(ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR))) / 4.0d);
    private Bitmap f3566j;
    private Canvas f3567k;
    private boolean f3568l = false;
    private boolean f3569m = true;
    private int f3570n = 0;
    private int f3571o;
    private int f3572p;
    private List<String> f3573q;
    private final bnn[] f3574r = new bnn[4];
    private final fwu f3575s = new fwu();
    private Rect f3576t;
    private Rect f3577u;

    static {
        kae kae = glk.f15557d;
    }

    private bjw(bjx bjx, int i, List<String> list, bnq bnq, boolean z, Object obj) {
        super(bjx, bnq, z, obj);
        this.f3572p = i;
        this.f3573q = list;
    }

    public void mo605a(boolean z) {
        this.f3569m = z;
    }

    public boolean mo606a() {
        return false;
    }

    public void mo607b() {
        super.mo607b();
        synchronized (this.f3574r) {
            this.f3568l = true;
            for (int i = 0; i < this.f3570n; i++) {
                if (this.f3574r[i] != null) {
                    this.f3574r[i].mo607b();
                    this.f3574r[i] = null;
                }
            }
            this.f3571o = 0;
            if (this.f3566j != null) {
                gkd.m17873a().m17771a(this.f3566j);
                this.f3566j = null;
                this.f3567k = null;
            }
        }
    }

    public fsh m_() {
        String valueOf;
        int i = 0;
        if (f3563i) {
            String str = "AvatarImageRequest getBytes for request ";
            valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        iil.m21876b();
        bjx bjx = (bjx) this.f;
        int b = bjx.m5552b();
        int size = bjx.f3596a.size();
        synchronized (this.f3574r) {
            if (this.f3568l) {
            } else {
                this.f3570n = Math.min(this.f3572p + size, 4);
                for (int i2 = 0; i2 < Math.min(size, 4); i2++) {
                    valueOf = (String) bjx.f3596a.get(i2);
                    if (!TextUtils.isEmpty(valueOf)) {
                        bnn bnn = new bnn(new gkc(valueOf, m5507m()).m5547a(b).m5558d(true).m5555b(this.f3569m), this, false, null);
                        bnn.m5521b(m5522d());
                        if (f3563i) {
                            valueOf = String.valueOf(bnn.toString());
                            String valueOf2 = String.valueOf(toString());
                            new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("AvatarImageRequest creating ImageRequest ").append(valueOf).append(" compound:").append(valueOf2);
                        }
                        this.f3574r[this.f3571o] = bnn;
                        this.f3571o++;
                    }
                }
                Context H = gwb.m1400H();
                while (i < this.f3571o) {
                    frj frj = this.f3574r[i];
                    if (!frj.mo598e()) {
                        ((fsi) jyn.m25426a(H, fsi.class)).m12718c(frj);
                    }
                    i++;
                }
                if (this.f3571o < this.f3570n) {
                    Bitmap b2 = gkd.m17873a().m17772b(b, b);
                    int i3 = this.f3571o;
                    for (String str2 : this.f3573q) {
                        if (i3 >= this.f3570n) {
                            break;
                        }
                        int i4;
                        if (this.f3575s.m16412a(H, b2, str2, 0.0f, 0.0f, (float) b, fww.f14173a, gwb.dV)) {
                            i4 = i3 + 1;
                            m5529a(b2, i3);
                        } else {
                            i4 = i3;
                        }
                        i3 = i4;
                    }
                    gkd.m17873a().m17771a(b2);
                    Bitmap b3 = ((boz) jyn.m25426a(H, boz.class)).mo638b();
                    while (i3 < this.f3570n) {
                        m5529a(b3, i3);
                        i3++;
                    }
                }
                m5531p();
            }
        }
        return null;
    }

    private void m5529a(Bitmap bitmap, int i) {
        boolean z;
        if (i < 0 || i >= this.f3570n) {
            z = false;
        } else {
            z = true;
        }
        iil.m21874a("Expected condition to be true", z);
        if (this.f3576t == null) {
            this.f3576t = new Rect();
        }
        if (this.f3577u == null) {
            this.f3577u = new Rect();
        }
        Bitmap b = m5520b(bitmap);
        int b2 = ((bjx) this.f).m5552b();
        int i2 = b2 / 2;
        bjw.m5530a(this.f3576t, b.getWidth(), b.getHeight());
        int i3;
        switch (this.f3570n) {
            case 1:
                switch (i) {
                    case 0:
                        bjw.m5530a(this.f3577u, b2, b2);
                        break;
                    default:
                        break;
                }
            case 2:
                i2 = (int) (f3564v * ((double) b2));
                i3 = b2 - i2;
                this.f3577u.set(0, 0, i2, i2);
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        this.f3577u.offset(i3, i3);
                        break;
                    default:
                        break;
                }
            case 3:
                this.f3577u.set(0, 0, i2, i2);
                i3 = (int) (((double) b2) * f3565w);
                switch (i) {
                    case 0:
                        this.f3577u.offset(i2 / 2, i3);
                        break;
                    case 1:
                        this.f3577u.offset(0, i2 - i3);
                        break;
                    case 2:
                        this.f3577u.offset(i2, i2 - i3);
                        break;
                    default:
                        break;
                }
            case 4:
                Rect rect = this.f3577u;
                i3 = b2 / 2;
                int i4 = b2 - i3;
                rect.set(0, 0, i3, i3);
                switch (i) {
                    case 0:
                        rect.offset(0, 0);
                        break;
                    case 1:
                        rect.offset(i4, 0);
                        break;
                    case 2:
                        rect.offset(0, i4);
                        break;
                    case 3:
                        rect.offset(i4, i4);
                        break;
                    default:
                        break;
                }
        }
        if (f3563i) {
            String valueOf = String.valueOf(toString());
            new StringBuilder(String.valueOf(valueOf).length() + 70).append("AvatarImageRequest  drew onto composite position=").append(i).append(" compound:").append(valueOf);
        }
        if (this.f3566j == null) {
            this.f3566j = gkd.m17873a().m17772b(b2, b2);
            this.f3567k = new Canvas(this.f3566j);
        }
        this.f3567k.drawBitmap(b, this.f3576t, this.f3577u, null);
    }

    private void m5531p() {
        if (this.f3571o == 0) {
            fsq gkt = new gkt(this.f3566j, mo594c());
            gkt.mo2291a();
            gkd.m17873a().m17769a(mo594c(), (gkt) gkt);
            ((fsi) jyn.m25426a(gwb.m1400H(), fsi.class)).m16138a((fsr) this, gkt);
            this.f3566j = null;
            this.f3567k = null;
        }
    }

    private static void m5530a(Rect rect, int i, int i2) {
        if (i > i2) {
            int i3 = (i - i2) / 2;
            rect.set(i3, 0, i3 + i2, i2);
            return;
        }
        i3 = (i2 - i) / 2;
        rect.set(0, i3, i, i3 + i);
    }

    public static bnn m5528a(List<String> list, int i, List<String> list2, String str, int i2, String str2, bnq bnq, Object obj, String str3, boolean z, bjy bjy, boolean z2) {
        if (list == null) {
            return null;
        }
        if (f3563i) {
            String valueOf = String.valueOf(list);
            new StringBuilder((String.valueOf(str3).length() + 73) + String.valueOf(valueOf).length()).append("makeImageRequest oldKey=").append(str3).append(" size=").append(i2).append(" urls=").append(valueOf).append("defaultAvatars=").append(i);
        }
        if (list.size() + i == 0) {
            return null;
        }
        if (list.size() == 1 && i == 0) {
            bnn bnn = new bnn(new gkc((String) list.get(0), str).m5547a(i2).m5558d(true).m5555b(true).m5563f(z).m5549a(bjy), bnq, z2, obj);
            bnn.m5521b(false);
            return bnn;
        }
        bjx bjx = new bjx(list, str, str2, i2, false);
        bjx.m5563f(z).m5549a(bjy);
        if (TextUtils.equals(bjx.m5544q(), str3)) {
            return null;
        }
        bnn = new bjw(bjx, i, list2, bnq, z2, obj);
        if (!f3563i) {
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
    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        Bitmap e;
        int i = 0;
        iil.m21872a("Expected null", (Object) gjo);
        iil.m21876b();
        if (f3563i) {
            String valueOf = String.valueOf(bnn.toString());
            String valueOf2 = String.valueOf(toString());
            new StringBuilder((String.valueOf(valueOf).length() + 92) + String.valueOf(valueOf2).length()).append("AvatarImageRequest setImageBitmap for request ").append(valueOf).append(" success=").append(z).append(" loadedFromCache=").append(z2).append(" compound:").append(valueOf2);
        }
        if (z) {
            e = gkt.m17898e();
        } else {
            e = ((boz) jyn.m25426a(gwb.m1400H(), boz.class)).mo638b();
        }
        synchronized (this.f3574r) {
            if (!this.f3568l) {
                while (i < this.f3570n && this.f3574r[i] != bnn) {
                    i++;
                }
                if (i >= this.f3570n) {
                    if (gkt != null) {
                        gkt.mo2292b();
                    }
                    glk.m17982e("Babel", "Received image that was not part of the requested set", new Object[0]);
                    return;
                }
                m5529a(e, i);
                if (gkt != null) {
                    gkt.mo2292b();
                }
                this.f3574r[i] = null;
                this.f3571o--;
                if (f3563i) {
                    int i2 = this.f3571o;
                    String valueOf3 = String.valueOf(bnn);
                    String valueOf4 = String.valueOf(toString());
                    new StringBuilder((String.valueOf(valueOf3).length() + 70) + String.valueOf(valueOf4).length()).append("AvatarImageRequest pending size=").append(i2).append(" request removed=").append(valueOf3).append(" compound:").append(valueOf4);
                }
                m5531p();
            } else if (gkt != null) {
                gkt.mo2292b();
            }
        }
    }
}
