package p000;

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

public final class jph extends jkj implements jts, jtt {
    private static final jpk f20654A = f20675w.m24929a(f20674v);
    private static final jpk[] f20655B = new jpk[]{f20668p, f20667o.m24929a(f20668p), f20677y, f20671s.m24929a(f20668p), f20672t.m24929a(f20669q), f20670r.m24929a(f20669q), f20673u.m24929a(f20669q), f20674v.m24929a(f20669q)};
    private static final jpk[] f20656C = new jpk[]{f20667o, f20671s, f20678z, f20674v.m24929a(f20672t), f20669q, f20675w.m24929a(f20672t), f20670r.m24929a(f20672t), f20673u.m24929a(f20672t)};
    private static final jpk[] f20657D = new jpk[]{f20667o, f20674v, f20654A, f20672t, f20670r.m24929a(f20675w), f20673u.m24929a(f20675w), f20676x.m24929a(f20675w)};
    private static boolean f20658E;
    private static boolean f20659F;
    private static int f20660G;
    private static int f20661H;
    private static int f20662I;
    private static int f20663J;
    private static int f20664K;
    static int f20665d;
    static int f20666e;
    private static final jpk f20667o = new jpk(3, 0);
    private static final jpk f20668p = new jpk(6, 3);
    private static final jpk f20669q = new jpk(6, 2);
    private static final jpk f20670r = new jpk(6, 1);
    private static final jpk f20671s = new jpk(7, 3);
    private static final jpk f20672t = new jpk(7, 2);
    private static final jpk f20673u = new jpk(7, 1);
    private static final jpk f20674v = new jpk(8, 3);
    private static final jpk f20675w = new jpk(8, 2);
    private static final jpk f20676x = new jpk(8, 1);
    private static final jpk f20677y = f20669q.m24929a(f20668p);
    private static final jpk f20678z = f20672t.m24929a(f20671s);
    private String f20679L;
    private File f20680M;
    private File f20681N;
    private jpk f20682O;
    private jpk f20683P;
    private String f20684Q;
    private ConnectivityManager f20685R;
    private jpi f20686S;
    private int f20687T = -1;
    private int f20688U = -1;
    private int f20689V = 0;
    private int f20690W = 0;
    private int f20691X = -1;
    private int f20692Y = -1;

    public jph(jkn jkn, jpj jpj) {
        super(jkn, jpj);
        if (!f20658E) {
            f20661H = jkn.mo3548d();
            f20665d = (int) (((float) f20661H) * 0.5f);
            f20666e = (int) (((float) f20661H) * 0.3f);
            float j = jkn.mo3554j();
            if (((double) j) < 0.75d) {
                f20659F = true;
                f20660G = (int) (j * 8192.0f);
            }
            f20662I = jkn.mo3549e();
            f20663J = jkn.mo3550f();
            DisplayMetrics ay = gwb.ay(jkn.mo3535l());
            f20664K = Math.min(ay.widthPixels, ay.heightPixels) / 4;
            f20658E = true;
        }
        if (jpj.f20075c != -1) {
            this.f20686S = (jpi) jyn.m25426a(this.a.mo3535l(), jpi.class);
            this.f20687T = this.f20686S.m24927b();
            this.f20688U = this.f20686S.m24928c();
        }
    }

    private static boolean m24907a(jpj jpj) {
        return jpj.f20074b == 0 && jpj.f20075c != -1 && jpj.f20079g == null && jpj.f20078f == null && jpj.f20073a.m24895g() && (jpj.f20073a.m24893e() == jpl.IMAGE || jpj.f20073a.m24893e() == jpl.ANIMATION);
    }

    public String mo3521b() {
        if (this.f20679L == null) {
            jpj jpj = (jpj) this.g;
            if (jph.m24907a(jpj)) {
                this.f20679L = m24902a(jpj.f20073a, jpj.f20071i, jpj.f20076d, jpj.f20077e, this.f20687T, this.f20688U);
            } else {
                Object obj;
                String a;
                String valueOf;
                jpf jpf = jpj.f20073a;
                int i = jpj.f20071i;
                int i2 = jpj.f20074b;
                int i3 = jpj.f20076d;
                int i4 = jpj.f20077e;
                RectF rectF = jpj.f20078f;
                if (jpj.f20079g == null) {
                    obj = null;
                } else {
                    obj = jpj.f20079g.m21r();
                }
                if (jpf.m24895g()) {
                    if (jpf.m24893e() == jpl.VIDEO) {
                        a = jps.m24957a(jpf.m24890b());
                    } else {
                        a = jpf.m24890b();
                    }
                } else if (jpf.m24896h()) {
                    String valueOf2 = String.valueOf(jpf.m24891c());
                    a = String.valueOf(jpf.m24892d());
                    a = new StringBuilder((String.valueOf(valueOf2).length() + 0) + String.valueOf(a).length()).append(valueOf2).append(a).toString();
                } else if (jpf.m24897i()) {
                    a = Long.toString(jpf.m24889a());
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
                StringBuilder a2 = kdq.m25600a();
                a2.append(gwb.ac(valueOf));
                switch (i2) {
                    case 0:
                        a2.append('-').append(i3).append('x').append(i4);
                        break;
                    case 2:
                        a2.append("-t");
                        break;
                    case 3:
                        a2.append("-l");
                        break;
                    case 4:
                        a2.append("-z");
                        break;
                }
                jph.m24905a(a2, i);
                if (rectF != null) {
                    a2.append(jpo.m24935a(rectF, 0));
                }
                this.f20679L = kdq.m25599a(a2);
            }
        }
        return this.f20679L;
    }

    private static void m24905a(StringBuilder stringBuilder, int i) {
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

    private static StringBuilder m24903a(StringBuilder stringBuilder, String str) {
        stringBuilder.append(gwb.ac(gwb.ae(str))).append('+');
        return stringBuilder;
    }

    private String m24902a(jpf jpf, int i, int i2, int i3, int i4, int i5) {
        StringBuilder a = kdq.m25600a();
        jph.m24903a(a, jpf.m24890b()).append(File.separatorChar).append(i2).append(',').append(i3).append(',').append(i4).append(',').append(i5).append(',');
        jph.m24905a(a, i);
        a.append(',');
        return kdq.m25599a(a);
    }

    public File mo3518f() {
        if (this.f20680M != null) {
            return this.f20680M;
        }
        return super.mo3518f();
    }

    public File mo3519g() {
        if (this.f20680M != null) {
            return this.f20680M;
        }
        jpj jpj = (jpj) this.g;
        if ((jpj.f20071i & 1024) != 0) {
            return this.a.mo3547c().m24507a(mo3521b());
        }
        switch (jpj.f20074b) {
            case 0:
                if (jph.m24907a(jpj)) {
                    String str;
                    jpj = (jpj) this.g;
                    jjr b = this.a.mo3544b();
                    this.f20681N = null;
                    this.f20689V = 0;
                    this.f20690W = 0;
                    this.f20691X = -1;
                    this.f20692Y = -1;
                    StringBuilder a = kdq.m25600a();
                    jph.m24903a(a, jpj.f20073a.m24890b());
                    File file = new File(b.m24511b(kdq.m25599a(a)));
                    if (file.exists()) {
                        double d;
                        if (jpj.f20076d == 0 || jpj.f20077e == 0) {
                            d = -1.0d;
                        } else {
                            d = ((double) jpj.f20076d) / ((double) jpj.f20077e);
                        }
                        double d2 = d - 0.1d;
                        double d3 = d + 0.1d;
                        int i = jpj.f20071i & -33;
                        StringBuilder a2 = kdq.m25600a();
                        jph.m24905a(a2, i);
                        String a3 = kdq.m25599a(a2);
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
                                        if (d4 >= d2 && d4 <= d3 && parseInt3 == this.f20687T) {
                                            if (str == null) {
                                                this.f20689V = parseInt;
                                                this.f20690W = parseInt2;
                                                this.f20691X = parseInt3;
                                                this.f20692Y = parseInt4;
                                                str = name2;
                                            } else {
                                                if (parseInt3 == 0) {
                                                    if (this.f20692Y < parseInt4) {
                                                    }
                                                } else if (this.f20692Y <= parseInt4) {
                                                }
                                                if (!(this.f20689V == jpj.f20076d && this.f20690W == jpj.f20077e && (parseInt != jpj.f20076d || parseInt2 != jpj.f20077e))) {
                                                    if (!jph.m24906a(this.f20689V, parseInt, jpj.f20076d)) {
                                                        if (!jph.m24906a(this.f20690W, parseInt2, jpj.f20077e) && ((jpj.f20076d == 0 || this.f20689V == 0 || parseInt != 0) && (jpj.f20077e == 0 || this.f20690W == 0 || parseInt2 != 0))) {
                                                            this.f20689V = parseInt;
                                                            this.f20690W = parseInt2;
                                                            this.f20691X = parseInt3;
                                                            this.f20692Y = parseInt4;
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
                                this.f20681N = new File(file, str);
                                if (jpj.f20073a.m24893e() == jpl.IMAGE) {
                                    m24909b(jpj);
                                }
                            }
                        }
                    }
                    if (this.f20681N == null) {
                        if (Log.isLoggable("ImageResource", 3)) {
                            break;
                        }
                    }
                    if (Log.isLoggable("ImageResource", 3)) {
                        String valueOf = String.valueOf(this.f20681N.getParent());
                        str = String.valueOf(this.f20681N.getName());
                        new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(str).length()).append("Cached resource found: ").append(valueOf).append("/").append(str);
                    }
                    return this.f20681N;
                }
                break;
            case 5:
                m24910s();
                return this.f20681N;
        }
        return super.mo3519g();
    }

    private void m24909b(jpj jpj) {
        double d;
        if (jpj.f20076d != 0 && this.f20689V != 0) {
            d = ((double) this.f20689V) / ((double) jpj.f20076d);
        } else if (jpj.f20077e != 0 && this.f20690W != 0) {
            d = ((double) this.f20690W) / ((double) jpj.f20077e);
        } else {
            return;
        }
        if (d >= 2.0d) {
            int pow = (int) Math.pow(2.0d, Math.floor(Math.log(d) / Math.log(2.0d)));
            try {
                Bitmap a = gwb.m1561a(this.a.mo3535l().getContentResolver(), Uri.fromFile(this.f20681N), pow, null);
                if (a != null) {
                    int width = a.getWidth() * pow;
                    int height = a.getHeight() * pow;
                    if (this.f20689V != 0) {
                        width = this.f20689V - width;
                    } else {
                        width = this.f20690W - height;
                    }
                    if (Math.abs(width) < pow) {
                        this.f20689V /= pow;
                        this.f20690W /= pow;
                        String a2 = m24902a(jpj.f20073a, jpj.f20071i, this.f20689V, this.f20690W, this.f20691X, this.f20692Y);
                        m24904a(a, a2);
                        this.f20681N = new File(this.a.mo3544b().m24511b(a2));
                    }
                }
            } catch (Throwable e) {
                Log.e("ImageResource", "Cannot save downsampled bitmap", e);
            }
        }
    }

    private static boolean m24906a(int i, int i2, int i3) {
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

    private boolean m24908a(jpj jpj, Object obj) {
        if (jpj.f20073a.m24896h() || !jph.m24907a(jpj) || jpj.f20075c == -1 || (jpj.f20071i & 4096) != 0) {
            return false;
        }
        if (this.f20691X == 0) {
            if (this.f20692Y > this.f20688U) {
                return true;
            }
        } else if (this.f20692Y < this.f20688U) {
            return true;
        }
        int width = obj instanceof Bitmap ? ((Bitmap) obj).getWidth() : obj instanceof jjz ? ((jjz) obj).f20321b : 0;
        int height = this.h instanceof Bitmap ? ((Bitmap) this.h).getHeight() : this.h instanceof jjz ? ((jjz) this.h).f20322c : 0;
        double d = ((double) width) / ((double) height);
        height = jpj.f20076d == 0 ? (int) (((double) jpj.f20077e) * d) : jpj.f20076d;
        int i = this.f20689V == 0 ? (int) (d * ((double) this.f20690W)) : this.f20689V;
        if (height - f20664K <= i) {
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

    private void m24910s() {
        jpk[] jpkArr = null;
        switch (((jpj) this.g).m24221d()) {
            case 6:
                jpkArr = f20655B;
                break;
            case 7:
                jpkArr = f20656C;
                break;
            case 8:
                jpkArr = f20657D;
                break;
        }
        String b = mo3521b();
        for (int i = 0; i < jpkArr.length; i++) {
            File a;
            String valueOf = String.valueOf(b);
            String valueOf2 = String.valueOf(jpkArr[i].f20695c);
            valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            File a2 = this.a.mo3544b().m24507a(valueOf2);
            if (a2 == null) {
                a = this.a.mo3547c().m24507a(valueOf2);
            } else {
                a = a2;
            }
            if (a != null) {
                this.f20682O = jpkArr[i];
                this.f20681N = a;
                return;
            }
        }
    }

    protected void mo3587h() {
        Uri uri;
        jpj jpj = (jpj) this.g;
        if (this.f20683P == null && jpj.f20074b == 5 && (jpj.f20071i & 1024) == 0) {
            this.f20683P = m24912u();
            if (!(this.f20683P.f20696d == null || (jpj.f20071i & 32768) == 0 || !m24911t())) {
                this.f20683P = this.f20683P.f20696d;
            }
        }
        jpf jpf = ((jpj) this.g).f20073a;
        if (jpf.m24896h()) {
            Uri c = jpf.m24891c();
            String scheme = c.getScheme();
            jpb jpb = (jpb) jyn.m25433b(this.a.mo3535l(), jpb.class);
            Object obj = (jpb == null || !jpb.m24885b()) ? null : 1;
            if (!(scheme == null || scheme.startsWith("http") || obj != null)) {
                uri = c;
                if (uri == null) {
                    m24914w();
                } else {
                    super.mo3587h();
                }
            }
        }
        uri = null;
        if (uri == null) {
            super.mo3587h();
        } else {
            m24914w();
        }
    }

    private jpk m24912u() {
        switch (((jpj) this.g).m24221d()) {
            case 6:
                return f20677y;
            case 7:
                return f20678z;
            default:
                return f20654A;
        }
    }

    public String mo3586d() {
        if (this.f20683P == null) {
            return mo3521b();
        }
        String valueOf = String.valueOf(mo3521b());
        String valueOf2 = String.valueOf(this.f20683P.f20695c);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public void mo3585b(Object obj) {
        super.mo3585b(obj);
        if (m24251q() != 0) {
            jpj jpj = (jpj) this.g;
            switch (jpj.f20074b) {
                case 0:
                    if (m24908a(jpj, obj) && m24911t()) {
                        mo3587h();
                        return;
                    }
                    return;
                case 5:
                    Object obj2;
                    if (this.f20682O != null) {
                        jpk jpk = this.f20682O.f20696d;
                        if (jpk != null) {
                            if (jpk.f20694b == 2) {
                                this.f20683P = jpk;
                            } else if (jpk.f20694b == 3 && f20659F && (jpj.f20071i & 4096) == 0 && m24911t()) {
                                this.f20683P = jpk;
                            }
                            if (this.f20683P != null) {
                                obj2 = 1;
                                if (obj2 != null) {
                                    mo3587h();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
                        mo3587h();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void mo3515a(Object obj) {
        jpj jpj = (jpj) this.g;
        switch (jpj.f20074b) {
            case 0:
                this.f20689V = jpj.f20076d;
                this.f20690W = jpj.f20077e;
                this.f20691X = this.f20687T;
                this.f20692Y = this.f20688U;
                break;
            case 5:
                if (this.f20683P != null) {
                    this.f20682O = this.f20683P;
                    this.f20683P = null;
                    break;
                }
                break;
        }
        super.mo3515a(obj);
    }

    public void mo3517c() {
        jpj jpj = (jpj) this.g;
        jpf jpf = jpj.f20073a;
        if ((jpj.f20071i & 2) == 0 || !jpf.m24896h()) {
            super.mo3517c();
        } else if (m24913v()) {
            if (m24250p()) {
                String valueOf = String.valueOf(this.g);
                String valueOf2 = String.valueOf(mo3518f());
                new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("Returning file name to consumers: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.a.mo3532a((jtv) this, 1, (Object) mo3518f());
        } else {
            this.a.mo3532a((jtv) this, 5, null);
        }
    }

    private boolean m24913v() {
        Uri c = ((jpj) this.g).f20073a.m24891c();
        if (kdj.m25587a(c)) {
            this.f20680M = new File(c.getPath());
        } else {
            String a = kdj.m25586a(this.a.mo3535l().getContentResolver(), c);
            if (a == null) {
                a = String.valueOf(this.g);
                m24236a(new StringBuilder(String.valueOf(a).length() + 32).append("Couldn't compute raw file name: ").append(a).toString(), null);
                return false;
            }
            this.f20680M = new File(a);
        }
        return true;
    }

    public String mo3511a() {
        int i;
        jpj jpj = (jpj) this.g;
        jpf jpf = jpj.f20073a;
        String b = jpf.m24890b();
        if (TextUtils.isEmpty(b)) {
            jpb jpb = (jpb) jyn.m25433b(this.a.mo3535l(), jpb.class);
            jpf.m24891c();
            b = jpb != null ? jpb.m24884a() : null;
            if (TextUtils.isEmpty(b)) {
                if (!m24250p()) {
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
        int i3 = jpj2.f20071i;
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
        if (jpj2.f20078f != null) {
            i = i2 | 1024;
        } else {
            i = i2;
        }
        if ((i3 & 131072) != 0) {
            i2 = i | 512;
        } else {
            i2 = i;
        }
        switch (jpj.f20074b) {
            case 0:
                if (!(jpj.f20076d == 0 || jpj.f20077e == 0)) {
                    if ((jpj.f20071i & 256) == 0) {
                        i2 |= 72;
                    } else if ((jpj.f20071i & 512) == 512) {
                        i2 |= 64;
                    }
                }
                if (jpj.f20075c != -1) {
                    i = this.f20686S.m24926a();
                } else {
                    i = i2;
                }
                return jpo.m24938a(b, i, jpj.f20076d, jpj.f20077e, this.f20687T, this.f20688U, jpj.f20078f);
            case 1:
                return jpo.m24940a(b, i2, jpj.f20078f);
            case 2:
                if ((jpj.f20071i & 256) == 0) {
                    i2 |= 8;
                }
                return jpo.m24939a(b, i2, f20662I, jpj.f20078f);
            case 3:
                return jpo.m24939a(b, i2, f20663J, jpj.f20078f);
            case 5:
                jpj2 = (jpj) this.g;
                i3 = Math.max(jpj2.f20076d, jpj2.f20077e);
                if (i3 == 0) {
                    i3 = f20661H;
                }
                if ((jpj2.f20071i & 1024) == 0) {
                    if (this.f20683P == null) {
                        this.f20683P = m24912u();
                    }
                    switch (this.f20683P.f20694b) {
                        case 2:
                            if (f20659F) {
                                i3 = (f20660G * i3) / 8192;
                                break;
                            }
                            break;
                    }
                }
                return jpo.m24939a(b, i2, i3, jpj.f20078f);
            default:
                return b;
        }
    }

    private void m24914w() {
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        Context l = this.a.mo3535l();
        jpj jpj = (jpj) this.g;
        Uri c = jpj.f20073a.m24891c();
        if (m24250p()) {
            String valueOf = String.valueOf(c);
            new StringBuilder(String.valueOf(valueOf).length() + 23).append("Loading local resource ").append(valueOf);
        }
        this.f20684Q = kdj.m25589b(l.getContentResolver(), c);
        boolean c2 = kdj.m25593c(this.f20684Q);
        boolean a = kdj.m25588a(this.f20684Q);
        boolean b = kdj.m25590b(c);
        boolean a2 = kdj.m25587a(c);
        if (!c2 && !a) {
            jtq.m25206a(l).m25207a(c, this.f20684Q, this, this);
        } else if (a) {
            this.k = 2;
            this.a.mo3534b(this, 2);
        }
        Object obj = null;
        try {
            Object a3;
            int i = jpj.f20076d;
            int i2 = jpj.f20077e;
            if (jpj.f20074b == 2) {
                i2 = f20662I;
                i = i2;
            } else {
                switch (jpj.f20074b) {
                    case 0:
                    case 1:
                        break;
                    case 3:
                        i2 = f20663J;
                        i = i2;
                        break;
                    case 5:
                        if (i == 0 && i2 == 0) {
                            i2 = f20663J;
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
            if (jpj.f20074b == 2 && file != null && file.exists()) {
                a3 = gwb.m1683a(file, false);
            } else {
                if (a) {
                    if ((jpj.f20071i & 4) != 0) {
                        if (m24913v()) {
                            a3 = gwb.m1683a(this.f20680M, false);
                        }
                        a3 = null;
                    }
                }
                if (b) {
                    jpj jpj2 = (jpj) this.g;
                    if (jpj2.f20074b != 2 && !c2) {
                        obj = jpj2.f20074b == 1 ? gwb.m1560a(l.getContentResolver(), c, this.a.mo3536a()) : m24900a(l, c, Math.max(i, i2));
                    } else if (i == 0 && i2 == 0) {
                        throw new IllegalArgumentException("Both width and height cannot be zero.");
                    } else {
                        int i3;
                        Bitmap a4 = this.a.mo3537a(512, 384);
                        Bitmap a5 = gwb.m1564a(l, c, a4);
                        if (a5 != a4) {
                            this.a.mo3540a(a4);
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
                        Bitmap a6 = m24901a(l, c, a5);
                        if (a6 != a5) {
                            this.a.mo3540a(a5);
                        }
                        a5 = this.a.mo3537a(i2, i3);
                        obj = gwb.m1567a(a5, a6, i2, i3);
                        if (a6 != obj) {
                            this.a.mo3540a(a6);
                        }
                        if (a5 != obj) {
                            this.a.mo3540a(a5);
                        }
                    }
                    m24261a(currentThreadTimeMillis, "mediastore", -1, -1, -1, obj);
                    a3 = null;
                } else if (c2) {
                    obj = gwb.m1563a(l, c, i, i2);
                    m24261a(currentThreadTimeMillis, "video", -1, -1, -1, obj);
                    a3 = null;
                } else {
                    if (jpj.f20074b == 1) {
                        obj = gwb.m1560a(l.getContentResolver(), c, this.a.mo3536a());
                    } else {
                        obj = m24900a(l, c, Math.max(i, i2));
                    }
                    m24261a(currentThreadTimeMillis, c.getAuthority(), -1, -1, -1, obj);
                    a3 = null;
                }
            }
            if (obj != null) {
                if ((jpj.f20071i & 1) == 0) {
                    long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                    m24904a((Bitmap) obj, mo3586d());
                    if (m24250p()) {
                        String valueOf4 = String.valueOf(this.g);
                        String valueOf5 = String.valueOf(mo3518f());
                        String valueOf6 = String.valueOf(gwb.m2083c(currentThreadTimeMillis2));
                        new StringBuilder(((String.valueOf(valueOf4).length() + 62) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("Saved local thumbnail in file cache: ").append(valueOf4).append(" file name: ").append(valueOf5).append(" time spent: ").append(valueOf6);
                    }
                }
                mo3585b(obj);
            } else if (a3 != null) {
                mo3515a(a3);
            } else {
                mo3512a(3);
            }
        } catch (OutOfMemoryError e) {
            mo3512a(6);
        } catch (FileNotFoundException e2) {
            mo3512a(3);
        } catch (Exception e3) {
            mo3512a(5);
        }
    }

    private void m24904a(Bitmap bitmap, String str) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.a.mo3544b().m24509a(str, byteArrayOutputStream.toByteArray());
        } finally {
            byteArrayOutputStream.close();
        }
    }

    private Bitmap m24901a(Context context, Uri uri, Bitmap bitmap) {
        int b = gwb.m1966b(context.getContentResolver(), uri);
        if (b == 0) {
            return bitmap;
        }
        Bitmap a = this.a.mo3537a(bitmap.getWidth(), bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setRotate((float) b);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a2 = this.a.mo3537a(Math.round(rectF.width()), Math.round(rectF.height()));
        matrix.postTranslate(-rectF.left, -rectF.top);
        new Canvas(a2).drawBitmap(bitmap, matrix, new Paint(3));
        if (a2 != a) {
            this.a.mo3540a(a);
        }
        return a2;
    }

    private Bitmap m24900a(Context context, Uri uri, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        Point a = gwb.m1569a(contentResolver, uri);
        int max = Math.max(a.x / i, a.y / i);
        Bitmap bitmap = null;
        if (max == 1) {
            bitmap = this.a.mo3537a(a.x, a.y);
        }
        Bitmap a2 = gwb.m1561a(contentResolver, uri, max, bitmap);
        if (a2 != bitmap) {
            this.a.mo3540a(bitmap);
        }
        int width = a2.getWidth();
        int height = a2.getHeight();
        float max2 = ((float) i) / ((float) Math.max(width, height));
        if (max2 < 1.0f) {
            Bitmap a3 = this.a.mo3537a(Math.round(((float) width) * max2), Math.round(((float) height) * max2));
            bitmap = gwb.m1565a(a2, max2, a3);
            if (bitmap != a3) {
                this.a.mo3540a(a3);
            }
        } else {
            bitmap = a2;
        }
        if (bitmap != a2) {
            this.a.mo3540a(a2);
        }
        a2 = m24901a(context, uri, bitmap);
        if (a2 != bitmap) {
            this.a.mo3540a(bitmap);
        }
        return a2;
    }

    public void mo3584b(int i) {
        int i2 = 0;
        switch (i) {
            case 0:
                if (!kdj.m25588a(this.f20684Q)) {
                    if (!kdj.m25591b(this.f20684Q)) {
                        i2 = -1;
                        break;
                    } else {
                        i2 = 1;
                        break;
                    }
                }
                i2 = 2;
                break;
            case 1:
            case 3:
                i2 = 3;
                break;
            case 2:
                i2 = 4;
                break;
        }
        if (m24250p()) {
            String valueOf = String.valueOf(this.g);
            new StringBuilder(String.valueOf(valueOf).length() + 66).append("Delivering resource type to consumers: ").append(valueOf).append(" resource type: ").append(i2);
        }
        if (i2 != 0) {
            this.a.mo3534b(this, i2);
        }
    }

    public Uri mo3583a(Uri uri) {
        jpb jpb = (jpb) jyn.m25426a(this.a.mo3535l(), jpb.class);
        uri.getPath();
        jpl jpl = jpl.IMAGE;
        return jpb.m24886c();
    }

    private boolean m24911t() {
        if (this.f20685R == null) {
            this.f20685R = (ConnectivityManager) this.a.mo3535l().getSystemService("connectivity");
        }
        ConnectivityManager connectivityManager = this.f20685R;
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        if (jw.f21154a.mo3626a(connectivityManager)) {
            return false;
        }
        return true;
    }
}
