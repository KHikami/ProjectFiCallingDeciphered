package defpackage;

import android.graphics.RectF;

public class jpj extends jtw {
    jpf a;
    int b;
    int c;
    public int d;
    int e;
    RectF f;
    a g;
    String h;
    private jpj k;
    private int l;

    public jpj() {
        super((byte) 0);
    }

    public void a(int i, jpf jpf, int i2, int i3, int i4, int i5, RectF rectF, a aVar) {
        a(i, jpf.f());
        this.a = jpf;
        this.b = 0;
        this.c = i5;
        this.d = i3;
        this.e = i4;
        this.f = null;
        this.g = null;
        this.l = 0;
    }

    public int d() {
        int max = Math.max(this.d, this.e);
        if (max == 0 || max > jph.d) {
            return 6;
        }
        if (max > jph.e) {
            return 7;
        }
        return 8;
    }

    public int hashCode() {
        if (this.l == 0) {
            this.l = gwb.e(this.a, gwb.e(this.h, gwb.f(this.b, gwb.e(this.f, gwb.f(this.i, 17)))));
        }
        return this.l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jpj)) {
            return false;
        }
        jpj jpj = (jpj) obj;
        if (this.i == jpj.i && this.c == jpj.c && this.a.equals(jpj.a)) {
            boolean z;
            if (this.b == jpj.b) {
                switch (this.b) {
                    case 0:
                        if (this.d != jpj.d || this.e != jpj.e) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case 5:
                        if (d() != jpj.d()) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    default:
                        z = true;
                        break;
                }
            }
            z = false;
            if (z) {
                a aVar = this.g;
                a aVar2 = jpj.g;
                if (aVar == null && aVar2 == null) {
                    z = true;
                } else if ((aVar != null || aVar2 == null) && (aVar == null || aVar2 != null)) {
                    z = aVar.q();
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f == null) {
                        return true;
                    }
                    if (this.f.equals(jpj.f) && (this.h == null || this.h.equals(jpj.h))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String c = c();
        String e = e();
        String f = f();
        String g = g();
        boolean z = this.g != null;
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(((((String.valueOf(valueOf).length() + 22) + String.valueOf(c).length()) + String.valueOf(e).length()) + String.valueOf(f).length()) + String.valueOf(g).length()).append("{").append(valueOf).append(" (").append(c).append(e).append(f).append(") hasEdits: ").append(z).append(" ").append(g).append("}").toString();
    }

    public String c() {
        int i;
        switch (this.b) {
            case 0:
                i = this.d;
                return i + "x" + this.e;
            case 1:
                return "full";
            case 2:
                return "thumbnail";
            case 3:
                return "large";
            case 4:
                return "original";
            case 5:
                i = this.d;
                return "auto(" + i + "x" + this.e + ")";
            default:
                return "";
        }
    }

    protected String e() {
        switch (this.b) {
            case 0:
                if (this.c != -1) {
                    String str = "-";
                    String valueOf = String.valueOf(gwb.F(this.c));
                    return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                }
                break;
        }
        return "";
    }

    protected String f() {
        if (this.f == null) {
            return "";
        }
        float f = this.f.left;
        float f2 = this.f.top;
        float f3 = this.f.right;
        return ", crop(" + f + ", " + f2 + ", " + f3 + ", " + this.f.bottom + ")";
    }

    protected String g() {
        String str = "";
        if ((this.i & 1) != 0) {
            str = String.valueOf(str).concat(" no-disk-cache");
        }
        if ((this.i & 2) != 0) {
            str = String.valueOf(str).concat(" download-only");
        }
        if ((this.i & 4) != 0) {
            str = String.valueOf(str).concat(" accept-animation");
            if ((this.i & 32) != 0) {
                str = String.valueOf(str).concat("-disable-webp");
            }
        }
        if ((this.i & 8) != 0) {
            str = String.valueOf(str).concat(" disable-decoding");
        }
        if ((this.i & 16) != 0) {
            str = String.valueOf(str).concat(" disable-recycling");
        }
        if ((this.i & 32) != 0) {
            str = String.valueOf(str).concat(" disable-webp");
        }
        if ((this.i & 524288) != 0) {
            str = String.valueOf(str).concat(" monogram");
        }
        if ((this.i & 1048576) != 0) {
            str = String.valueOf(str).concat(" preserve-aspect-ratio");
        }
        if ((this.i & 2097152) != 0) {
            str = String.valueOf(str).concat(" request-mp4");
        }
        if ((this.i & 4194304) != 0) {
            str = String.valueOf(str).concat(" request-h264");
        }
        if ((this.i & 64) != 0) {
            str = String.valueOf(str).concat(" accept-bitmap-container");
        }
        if ((this.i & 128) != 0) {
            str = String.valueOf(str).concat(" disable-loading");
        }
        if ((this.i & 256) != 0) {
            str = String.valueOf(str).concat(" disable-smart-crop");
        }
        if ((this.i & 512) != 0) {
            str = String.valueOf(str).concat(" disable-upscale");
        }
        if ((this.i & 1024) != 0) {
            str = String.valueOf(str).concat(" long-term-cache");
        }
        if ((this.i & 2048) != 0) {
            str = String.valueOf(str).concat(" keep-partial-download");
        }
        if ((this.i & 4096) != 0) {
            str = String.valueOf(str).concat(" disable-automatic-high-res-download");
        }
        if ((this.i & 8192) != 0) {
            str = String.valueOf(str).concat(" allow-large-file-download");
        }
        if ((this.i & 16384) != 0) {
            str = String.valueOf(str).concat(" for-media-sync");
        }
        if ((this.i & 32768) != 0) {
            str = String.valueOf(str).concat(" prefer-high-res-download");
        }
        if ((this.i & 65536) != 0) {
            str = String.valueOf(str).concat(" convert-webp-to-jpeg");
        }
        if ((this.i & 131072) != 0) {
            return String.valueOf(str).concat(" include-exif");
        }
        return str;
    }

    public void a(jpj jpj) {
        this.k = jpj;
    }

    public jpj h() {
        return this.k;
    }
}
