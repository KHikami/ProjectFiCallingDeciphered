package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;

/* renamed from: jph */
public final class jph extends jkj implements jts, jtt {
    private static final jpk A;
    private static final jpk[] B;
    private static final jpk[] C;
    private static final jpk[] D;
    private static boolean E;
    private static boolean F;
    private static int G;
    private static int H;
    private static int I;
    private static int J;
    private static int K;
    static int d;
    static int e;
    private static final jpk o;
    private static final jpk p;
    private static final jpk q;
    private static final jpk r;
    private static final jpk s;
    private static final jpk t;
    private static final jpk u;
    private static final jpk v;
    private static final jpk w;
    private static final jpk x;
    private static final jpk y;
    private static final jpk z;
    private String L;
    private File M;
    private File N;
    private jpk O;
    private jpk P;
    private String Q;
    private ConnectivityManager R;
    private jpi S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;

    static {
        o = new jpk(3, 0);
        p = new jpk(6, 3);
        q = new jpk(6, 2);
        r = new jpk(6, 1);
        s = new jpk(7, 3);
        t = new jpk(7, 2);
        u = new jpk(7, 1);
        v = new jpk(8, 3);
        w = new jpk(8, 2);
        x = new jpk(8, 1);
        y = q.a(p);
        z = t.a(s);
        A = w.a(v);
        B = new jpk[]{p, o.a(p), y, s.a(p), t.a(q), r.a(q), u.a(q), v.a(q)};
        C = new jpk[]{o, s, z, v.a(t), q, w.a(t), r.a(t), u.a(t)};
        D = new jpk[]{o, v, A, t, r.a(w), u.a(w), x.a(w)};
    }

    public jph(jkn jkn, jpj jpj) {
        super(jkn, jpj);
        this.T = -1;
        this.U = -1;
        this.V = 0;
        this.W = 0;
        this.X = -1;
        this.Y = -1;
        if (!E) {
            H = jkn.d();
            d = (int) (((float) H) * 0.5f);
            e = (int) (((float) H) * 0.3f);
            float j = jkn.j();
            if (((double) j) < 0.75d) {
                F = true;
                G = (int) (j * 8192.0f);
            }
            I = jkn.e();
            J = jkn.f();
            DisplayMetrics ay = gwb.ay(jkn.l());
            K = Math.min(ay.widthPixels, ay.heightPixels) / 4;
            E = true;
        }
        if (jpj.c != -1) {
            this.S = (jpi) jyn.a(this.a.l(), jpi.class);
            this.T = this.S.b();
            this.U = this.S.c();
        }
    }

    private static boolean a(jpj jpj) {
        return jpj.b == 0 && jpj.c != -1 && jpj.g == null && jpj.f == null && jpj.a.g() && (jpj.a.e() == jpl.IMAGE || jpj.a.e() == jpl.ANIMATION);
    }

    public String b() {
        if (this.L == null) {
            jpj jpj = (jpj) this.g;
            if (jph.a(jpj)) {
                this.L = a(jpj.a, jpj.i, jpj.d, jpj.e, this.T, this.U);
            } else {
                Object obj;
                String a;
                String valueOf;
                jpf jpf = jpj.a;
                int i = jpj.i;
                int i2 = jpj.b;
                int i3 = jpj.d;
                int i4 = jpj.e;
                RectF rectF = jpj.f;
                if (jpj.g == null) {
                    obj = null;
                } else {
                    obj = jpj.g.r();
                }
                if (jpf.g()) {
                    if (jpf.e() == jpl.VIDEO) {
                        a = jps.a(jpf.b());
                    } else {
                        a = jpf.b();
                    }
                } else if (jpf.h()) {
                    String valueOf2 = String.valueOf(jpf.c());
                    a = String.valueOf(jpf.d());
                    a = new StringBuilder((String.valueOf(valueOf2).length() + 0) + String.valueOf(a).length()).append(valueOf2).append(a).toString();
                } else if (jpf.i()) {
                    a = Long.toString(jpf.a());
                } else {
                    a = String.valueOf(jpf);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(a).length() + 31).append("A media ref should have a URI: ").append(a).toString());
                }
                if (obj != null) {
                    a = String.valueOf(a);
                    valueOf = String.valueOf(obj);
                    valueOf = valueOf.length() != 0 ? a.concat(valueOf) : new String(a);
                } else {
                    valueOf = a;
                }
                StringBuilder a2 = kdq.a();
                a2.append(gwb.ac(valueOf));
                switch (i2) {
                    case wi.w /*0*/:
                        a2.append('-').append(i3).append('x').append(i4);
                        break;
                    case wi.l /*2*/:
                        a2.append("-t");
                        break;
                    case wi.z /*3*/:
                        a2.append("-l");
                        break;
                    case wi.h /*4*/:
                        a2.append("-z");
                        break;
                }
                jph.a(a2, i);
                if (rectF != null) {
                    a2.append(jpo.a(rectF, 0));
                }
                this.L = kdq.a(a2);
            }
        }
        return this.L;
    }

    private static void a(StringBuilder stringBuilder, int i) {
        if ((i & 4) != 0) {
            stringBuilder.append("-a");
        }
        if ((i & 32) != 0) {
            stringBuilder.append("-nw");
        }
        if ((i & 256) != 0) {
            stringBuilder.append("-p");
        }
        if ((131072 & i) != 0) {
            stringBuilder.append("-ip");
        }
        if ((524288 & i) != 0) {
            stringBuilder.append("-mo");
        }
        if ((1048576 & i) != 0) {
            stringBuilder.append("-pa");
        }
        if ((2097152 & i) != 0) {
            stringBuilder.append("-rh");
        }
        if ((4194304 & i) != 0) {
            stringBuilder.append("-m18");
        }
    }

    private static StringBuilder a(StringBuilder stringBuilder, String str) {
        stringBuilder.append(gwb.ac(gwb.ae(str))).append('+');
        return stringBuilder;
    }

    private String a(jpf jpf, int i, int i2, int i3, int i4, int i5) {
        StringBuilder a = kdq.a();
        jph.a(a, jpf.b()).append(File.separatorChar).append(i2).append(',').append(i3).append(',').append(i4).append(',').append(i5).append(',');
        jph.a(a, i);
        a.append(',');
        return kdq.a(a);
    }

    public File f() {
        if (this.M != null) {
            return this.M;
        }
        return super.f();
    }

    public File g() {
        if (this.M != null) {
            return this.M;
        }
        jpj jpj = (jpj) this.g;
        if ((jpj.i & 1024) != 0) {
            return this.a.c().a(b());
        }
        switch (jpj.b) {
            case wi.w /*0*/:
                if (jph.a(jpj)) {
                    String str;
                    jpj = (jpj) this.g;
                    jjr b = this.a.b();
                    this.N = null;
                    this.V = 0;
                    this.W = 0;
                    this.X = -1;
                    this.Y = -1;
                    StringBuilder a = kdq.a();
                    jph.a(a, jpj.a.b());
                    File file = new File(b.b(kdq.a(a)));
                    if (file.exists()) {
                        double d;
                        if (jpj.d == 0 || jpj.e == 0) {
                            d = -1.0d;
                        } else {
                            d = ((double) jpj.d) / ((double) jpj.e);
                        }
                        double d2 = d - 0.1d;
                        double d3 = d + 0.1d;
                        int i = jpj.i & -33;
                        StringBuilder a2 = kdq.a();
                        jph.a(a2, i);
                        String a3 = kdq.a(a2);
                        File[] listFiles = file.listFiles();
                        if (!(listFiles == null || listFiles.length == 0)) {
                            str = null;
                            for (File name : listFiles) {
                                String name2 = name.getName();
                                String[] split = name2.split(",");
                                if (split.length < 4) {
                                    new File(file, name2).delete();
                                } else if (split.length < 6) {
                                    if (i != 0) {
                                        if (!a3.equals(split.length >= 5 ? split[4] : "")) {
                                        }
                                    }
                                    try {
                                        double d4;
                                        int parseInt = Integer.parseInt(split[0]);
                                        int parseInt2 = Integer.parseInt(split[1]);
                                        int parseInt3 = Integer.parseInt(split[2]);
                                        int parseInt4 = Integer.parseInt(split[3]);
                                        if (parseInt == 0 || parseInt2 == 0) {
                                            d4 = -1.0d;
                                        } else {
                                            d4 = ((double) parseInt) / ((double) parseInt2);
                                        }
                                        if (d4 >= d2 && d4 <= d3 && parseInt3 == this.T) {
                                            if (str == null) {
                                                this.V = parseInt;
                                                this.W = parseInt2;
                                                this.X = parseInt3;
                                                this.Y = parseInt4;
                                                str = name2;
                                            } else {
                                                if (parseInt3 == 0) {
                                                    if (this.Y < parseInt4) {
                                                    }
                                                } else if (this.Y <= parseInt4) {
                                                }
                                                if (!(this.V == jpj.d && this.W == jpj.e && (parseInt != jpj.d || parseInt2 != jpj.e))) {
                                                    if (!jph.a(this.V, parseInt, jpj.d)) {
                                                        if (!jph.a(this.W, parseInt2, jpj.e) && ((jpj.d == 0 || this.V == 0 || parseInt != 0) && (jpj.e == 0 || this.W == 0 || parseInt2 != 0))) {
                                                            this.V = parseInt;
                                                            this.W = parseInt2;
                                                            this.X = parseInt3;
                                                            this.Y = parseInt4;
                                                            str = name2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (NumberFormatException e) {
                                        Log.e("ImageResource", "NumberFormatException parsing cached file's filename.");
                                    }
                                }
                            }
                            if (str != null) {
                                this.N = new File(file, str);
                                if (jpj.a.e() == jpl.IMAGE) {
                                    b(jpj);
                                }
                            }
                        }
                    }
                    if (this.N == null) {
                        if (Log.isLoggable("ImageResource", 3)) {
                            break;
                        }
                    }
                    if (Log.isLoggable("ImageResource", 3)) {
                        String valueOf = String.valueOf(this.N.getParent());
                        str = String.valueOf(this.N.getName());
                        new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(str).length()).append("Cached resource found: ").append(valueOf).append("/").append(str);
                    }
                    return this.N;
                }
                break;
            case wi.p /*5*/:
                s();
                return this.N;
        }
        return super.g();
    }

    private void b(jpj jpj) {
        double d;
        if (jpj.d != 0 && this.V != 0) {
            d = ((double) this.V) / ((double) jpj.d);
        } else if (jpj.e != 0 && this.W != 0) {
            d = ((double) this.W) / ((double) jpj.e);
        } else {
            return;
        }
        if (d >= 2.0d) {
            int pow = (int) Math.pow(2.0d, Math.floor(Math.log(d) / Math.log(2.0d)));
            try {
                Bitmap a = gwb.a(this.a.l().getContentResolver(), Uri.fromFile(this.N), pow, null);
                if (a != null) {
                    int width = a.getWidth() * pow;
                    int height = a.getHeight() * pow;
                    if (this.V != 0) {
                        width = this.V - width;
                    } else {
                        width = this.W - height;
                    }
                    if (Math.abs(width) < pow) {
                        this.V /= pow;
                        this.W /= pow;
                        String a2 = a(jpj.a, jpj.i, this.V, this.W, this.X, this.Y);
                        a(a, a2);
                        this.N = new File(this.a.b().b(a2));
                    }
                }
            } catch (Throwable e) {
                Log.e("ImageResource", "Cannot save downsampled bitmap", e);
            }
        }
    }

    private static boolean a(int i, int i2, int i3) {
        if (!(i == 0 || i2 == 0)) {
            int i4 = i - i3;
            int i5 = i2 - i3;
            if (i4 > 0) {
                if (i5 < 0 || i5 > i4) {
                    return true;
                }
            } else if (i5 < 0 && i5 < i4) {
                return true;
            }
        }
        return false;
    }

    private boolean a(jpj jpj, Object obj) {
        if (jpj.a.h() || !jph.a(jpj) || jpj.c == -1 || (jpj.i & 4096) != 0) {
            return false;
        }
        if (this.X == 0) {
            if (this.Y > this.U) {
                return true;
            }
        } else if (this.Y < this.U) {
            return true;
        }
        int width = obj instanceof Bitmap ? ((Bitmap) obj).getWidth() : obj instanceof jjz ? ((jjz) obj).b : 0;
        int height = this.h instanceof Bitmap ? ((Bitmap) this.h).getHeight() : this.h instanceof jjz ? ((jjz) this.h).c : 0;
        double d = ((double) width) / ((double) height);
        height = jpj.d == 0 ? (int) (((double) jpj.e) * d) : jpj.d;
        int i = this.V == 0 ? (int) (d * ((double) this.W)) : this.V;
        if (height - K <= i) {
            return false;
        }
        boolean z;
        if (i > width) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    private void s() {
        jpk[] jpkArr = null;
        switch (((jpj) this.g).d()) {
            case wi.s /*6*/:
                jpkArr = B;
                break;
            case wi.q /*7*/:
                jpkArr = C;
                break;
            case wi.m /*8*/:
                jpkArr = D;
                break;
        }
        String b = b();
        for (int i = 0; i < jpkArr.length; i++) {
            File a;
            String valueOf = String.valueOf(b);
            String valueOf2 = String.valueOf(jpkArr[i].c);
            valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            File a2 = this.a.b().a(valueOf2);
            if (a2 == null) {
                a = this.a.c().a(valueOf2);
            } else {
                a = a2;
            }
            if (a != null) {
                this.O = jpkArr[i];
                this.N = a;
                return;
            }
        }
    }

    protected void h() {
        Uri uri;
        jpj jpj = (jpj) this.g;
        if (this.P == null && jpj.b == 5 && (jpj.i & 1024) == 0) {
            this.P = u();
            if (!(this.P.d == null || (jpj.i & 32768) == 0 || !t())) {
                this.P = this.P.d;
            }
        }
        jpf jpf = ((jpj) this.g).a;
        if (jpf.h()) {
            Uri c = jpf.c();
            String scheme = c.getScheme();
            jpb jpb = (jpb) jyn.b(this.a.l(), jpb.class);
            Object obj = (jpb == null || !jpb.b()) ? null : 1;
            if (!(scheme == null || scheme.startsWith("http") || obj != null)) {
                uri = c;
                if (uri == null) {
                    w();
                } else {
                    super.h();
                }
            }
        }
        uri = null;
        if (uri == null) {
            super.h();
        } else {
            w();
        }
    }

    private jpk u() {
        switch (((jpj) this.g).d()) {
            case wi.s /*6*/:
                return y;
            case wi.q /*7*/:
                return z;
            default:
                return A;
        }
    }

    public String d() {
        if (this.P == null) {
            return b();
        }
        String valueOf = String.valueOf(b());
        String valueOf2 = String.valueOf(this.P.c);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public void b(Object obj) {
        super.b(obj);
        if (q() != 0) {
            jpj jpj = (jpj) this.g;
            switch (jpj.b) {
                case wi.w /*0*/:
                    if (a(jpj, obj) && t()) {
                        h();
                    }
                case wi.p /*5*/:
                    Object obj2;
                    if (this.O != null) {
                        jpk jpk = this.O.d;
                        if (jpk != null) {
                            if (jpk.b == 2) {
                                this.P = jpk;
                            } else if (jpk.b == 3 && F && (jpj.i & 4096) == 0 && t()) {
                                this.P = jpk;
                            }
                            if (this.P != null) {
                                obj2 = 1;
                                if (obj2 != null) {
                                    h();
                                }
                            }
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
                        h();
                    }
                default:
            }
        }
    }

    public void a(Object obj) {
        jpj jpj = (jpj) this.g;
        switch (jpj.b) {
            case wi.w /*0*/:
                this.V = jpj.d;
                this.W = jpj.e;
                this.X = this.T;
                this.Y = this.U;
                break;
            case wi.p /*5*/:
                if (this.P != null) {
                    this.O = this.P;
                    this.P = null;
                    break;
                }
                break;
        }
        super.a(obj);
    }

    public void c() {
        jpj jpj = (jpj) this.g;
        jpf jpf = jpj.a;
        if ((jpj.i & 2) == 0 || !jpf.h()) {
            super.c();
        } else if (v()) {
            if (p()) {
                String valueOf = String.valueOf(this.g);
                String valueOf2 = String.valueOf(f());
                new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("Returning file name to consumers: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.a.a((jtv) this, 1, (Object) f());
        } else {
            this.a.a((jtv) this, 5, null);
        }
    }

    private boolean v() {
        Uri c = ((jpj) this.g).a.c();
        if (kdj.a(c)) {
            this.M = new File(c.getPath());
        } else {
            String a = kdj.a(this.a.l().getContentResolver(), c);
            if (a == null) {
                a = String.valueOf(this.g);
                a(new StringBuilder(String.valueOf(a).length() + 32).append("Couldn't compute raw file name: ").append(a).toString(), null);
                return false;
            }
            this.M = new File(a);
        }
        return true;
    }

    public String a() {
        int i;
        jpj jpj = (jpj) this.g;
        jpf jpf = jpj.a;
        String b = jpf.b();
        if (TextUtils.isEmpty(b)) {
            jpb jpb = (jpb) jyn.b(this.a.l(), jpb.class);
            jpf.c();
            b = jpb != null ? jpb.a() : null;
            if (TextUtils.isEmpty(b)) {
                if (!p()) {
                    return null;
                }
                b = String.valueOf(this.g);
                new StringBuilder(String.valueOf(b).length() + 33).append("Cannot retrieve content URI for: ").append(b);
                return null;
            }
        }
        b = gwb.ae(b);
        jpj jpj2 = (jpj) this.g;
        int i2 = 6;
        int i3 = jpj2.i;
        if ((i3 & 4) == 0) {
            i2 = 22;
        } else if ((i3 & 32) == 0) {
            i2 = 16390;
        }
        if ((i3 & 32) == 0) {
            i2 |= 32;
        }
        if ((i3 & 524288) != 0) {
            i2 |= 524288;
        }
        if ((i3 & 1048576) != 0) {
            i2 |= 1048576;
        }
        if ((i3 & 2097152) != 0) {
            i2 |= 131072;
        }
        if ((4194304 & i3) != 0) {
            i2 |= 2097152;
        }
        if ((i3 & 16384) != 0) {
            i2 |= 128;
        }
        if (jpj2.f != null) {
            i = i2 | 1024;
        } else {
            i = i2;
        }
        if ((i3 & 131072) != 0) {
            i2 = i | 512;
        } else {
            i2 = i;
        }
        switch (jpj.b) {
            case wi.w /*0*/:
                if (!(jpj.d == 0 || jpj.e == 0)) {
                    if ((jpj.i & 256) == 0) {
                        i2 |= 72;
                    } else if ((jpj.i & 512) == 512) {
                        i2 |= 64;
                    }
                }
                if (jpj.c != -1) {
                    i = this.S.a();
                } else {
                    i = i2;
                }
                return jpo.a(b, i, jpj.d, jpj.e, this.T, this.U, jpj.f);
            case wi.j /*1*/:
                return jpo.a(b, i2, jpj.f);
            case wi.l /*2*/:
                if ((jpj.i & 256) == 0) {
                    i2 |= 8;
                }
                return jpo.a(b, i2, I, jpj.f);
            case wi.z /*3*/:
                return jpo.a(b, i2, J, jpj.f);
            case wi.p /*5*/:
                jpj2 = (jpj) this.g;
                i3 = Math.max(jpj2.d, jpj2.e);
                if (i3 == 0) {
                    i3 = H;
                }
                if ((jpj2.i & 1024) == 0) {
                    if (this.P == null) {
                        this.P = u();
                    }
                    switch (this.P.b) {
                        case wi.l /*2*/:
                            if (F) {
                                i3 = (G * i3) / 8192;
                                break;
                            }
                            break;
                    }
                }
                return jpo.a(b, i2, i3, jpj.f);
            default:
                return b;
        }
    }

    private void w() {
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        Context l = this.a.l();
        jpj jpj = (jpj) this.g;
        Uri c = jpj.a.c();
        if (p()) {
            String valueOf = String.valueOf(c);
            new StringBuilder(String.valueOf(valueOf).length() + 23).append("Loading local resource ").append(valueOf);
        }
        this.Q = kdj.b(l.getContentResolver(), c);
        boolean c2 = kdj.c(this.Q);
        boolean a = kdj.a(this.Q);
        boolean b = kdj.b(c);
        boolean a2 = kdj.a(c);
        if (!c2 && !a) {
            jtq.a(l).a(c, this.Q, this, this);
        } else if (a) {
            this.k = 2;
            this.a.b(this, 2);
        }
        Object obj = null;
        try {
            Object a3;
            int i = jpj.d;
            int i2 = jpj.e;
            if (jpj.b == 2) {
                i2 = I;
                i = i2;
            } else {
                switch (jpj.b) {
                    case wi.w /*0*/:
                    case wi.j /*1*/:
                        break;
                    case wi.z /*3*/:
                        i2 = J;
                        i = i2;
                        break;
                    case wi.p /*5*/:
                        if (i == 0 && i2 == 0) {
                            i2 = J;
                            i = i2;
                            break;
                        }
                    default:
                        throw new UnsupportedOperationException();
                }
            }
            File file = null;
            if (a2) {
                String valueOf2 = String.valueOf(c.getPath());
                String valueOf3 = String.valueOf("-thumb");
                if (valueOf3.length() != 0) {
                    valueOf3 = valueOf2.concat(valueOf3);
                } else {
                    valueOf3 = new String(valueOf2);
                }
                file = new File(valueOf3);
            }
            if (jpj.b == 2 && file != null && file.exists()) {
                a3 = gwb.a(file, false);
            } else {
                if (a) {
                    if ((jpj.i & 4) != 0) {
                        if (v()) {
                            a3 = gwb.a(this.M, false);
                        }
                        a3 = null;
                    }
                }
                if (b) {
                    jpj jpj2 = (jpj) this.g;
                    if (jpj2.b != 2 && !c2) {
                        obj = jpj2.b == 1 ? gwb.a(l.getContentResolver(), c, this.a.a()) : a(l, c, Math.max(i, i2));
                    } else if (i == 0 && i2 == 0) {
                        throw new IllegalArgumentException("Both width and height cannot be zero.");
                    } else {
                        int i3;
                        Bitmap a4 = this.a.a(512, 384);
                        Bitmap a5 = gwb.a(l, c, a4);
                        if (a5 != a4) {
                            this.a.a(a4);
                        }
                        int width = a5.getWidth();
                        int height = a5.getHeight();
                        float f = ((float) width) / ((float) height);
                        if (i == 0) {
                            int i4 = i2;
                            i2 = Math.round(f * ((float) i2));
                            i3 = i4;
                        } else if (i2 == 0) {
                            i3 = Math.round(((float) i) / f);
                            i2 = i;
                        } else {
                            i3 = i2;
                            i2 = i;
                        }
                        i2 = Math.min(width, i2);
                        i3 = Math.min(height, i3);
                        Bitmap a6 = a(l, c, a5);
                        if (a6 != a5) {
                            this.a.a(a5);
                        }
                        a5 = this.a.a(i2, i3);
                        obj = gwb.a(a5, a6, i2, i3);
                        if (a6 != obj) {
                            this.a.a(a6);
                        }
                        if (a5 != obj) {
                            this.a.a(a5);
                        }
                    }
                    a(currentThreadTimeMillis, "mediastore", -1, -1, -1, obj);
                    a3 = null;
                } else if (c2) {
                    obj = gwb.a(l, c, i, i2);
                    a(currentThreadTimeMillis, "video", -1, -1, -1, obj);
                    a3 = null;
                } else {
                    if (jpj.b == 1) {
                        obj = gwb.a(l.getContentResolver(), c, this.a.a());
                    } else {
                        obj = a(l, c, Math.max(i, i2));
                    }
                    a(currentThreadTimeMillis, c.getAuthority(), -1, -1, -1, obj);
                    a3 = null;
                }
            }
            if (obj != null) {
                if ((jpj.i & 1) == 0) {
                    long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                    a((Bitmap) obj, d());
                    if (p()) {
                        String valueOf4 = String.valueOf(this.g);
                        String valueOf5 = String.valueOf(f());
                        String valueOf6 = String.valueOf(gwb.c(currentThreadTimeMillis2));
                        new StringBuilder(((String.valueOf(valueOf4).length() + 62) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("Saved local thumbnail in file cache: ").append(valueOf4).append(" file name: ").append(valueOf5).append(" time spent: ").append(valueOf6);
                    }
                }
                b(obj);
            } else if (a3 != null) {
                a(a3);
            } else {
                a(3);
            }
        } catch (OutOfMemoryError e) {
            a(6);
        } catch (FileNotFoundException e2) {
            a(3);
        } catch (Exception e3) {
            a(5);
        }
    }

    private void a(Bitmap bitmap, String str) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.a.b().a(str, byteArrayOutputStream.toByteArray());
        } finally {
            byteArrayOutputStream.close();
        }
    }

    private Bitmap a(Context context, Uri uri, Bitmap bitmap) {
        int b = gwb.b(context.getContentResolver(), uri);
        if (b == 0) {
            return bitmap;
        }
        Bitmap a = this.a.a(bitmap.getWidth(), bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setRotate((float) b);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a2 = this.a.a(Math.round(rectF.width()), Math.round(rectF.height()));
        matrix.postTranslate(-rectF.left, -rectF.top);
        new Canvas(a2).drawBitmap(bitmap, matrix, new Paint(3));
        if (a2 != a) {
            this.a.a(a);
        }
        return a2;
    }

    private Bitmap a(Context context, Uri uri, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        Point a = gwb.a(contentResolver, uri);
        int max = Math.max(a.x / i, a.y / i);
        Bitmap bitmap = null;
        if (max == 1) {
            bitmap = this.a.a(a.x, a.y);
        }
        Bitmap a2 = gwb.a(contentResolver, uri, max, bitmap);
        if (a2 != bitmap) {
            this.a.a(bitmap);
        }
        int width = a2.getWidth();
        int height = a2.getHeight();
        float max2 = ((float) i) / ((float) Math.max(width, height));
        if (max2 < 1.0f) {
            Bitmap a3 = this.a.a(Math.round(((float) width) * max2), Math.round(((float) height) * max2));
            bitmap = gwb.a(a2, max2, a3);
            if (bitmap != a3) {
                this.a.a(a3);
            }
        } else {
            bitmap = a2;
        }
        if (bitmap != a2) {
            this.a.a(a2);
        }
        a2 = a(context, uri, bitmap);
        if (a2 != bitmap) {
            this.a.a(bitmap);
        }
        return a2;
    }

    public void b(int i) {
        int i2 = 0;
        switch (i) {
            case wi.w /*0*/:
                if (!kdj.a(this.Q)) {
                    if (!kdj.b(this.Q)) {
                        i2 = -1;
                        break;
                    } else {
                        i2 = 1;
                        break;
                    }
                }
                i2 = 2;
                break;
            case wi.j /*1*/:
            case wi.z /*3*/:
                i2 = 3;
                break;
            case wi.l /*2*/:
                i2 = 4;
                break;
        }
        if (p()) {
            String valueOf = String.valueOf(this.g);
            new StringBuilder(String.valueOf(valueOf).length() + 66).append("Delivering resource type to consumers: ").append(valueOf).append(" resource type: ").append(i2);
        }
        if (i2 != 0) {
            this.a.b(this, i2);
        }
    }

    public Uri a(Uri uri) {
        jpb jpb = (jpb) jyn.a(this.a.l(), jpb.class);
        uri.getPath();
        jpl jpl = jpl.IMAGE;
        return jpb.c();
    }

    private boolean t() {
        if (this.R == null) {
            this.R = (ConnectivityManager) this.a.l().getSystemService("connectivity");
        }
        ConnectivityManager connectivityManager = this.R;
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        if (jw.a.a(connectivityManager)) {
            return false;
        }
        return true;
    }
}
