package p000;

import android.graphics.RectF;

public class jpj extends jtw {
    jpf f20073a;
    int f20074b;
    int f20075c;
    public int f20076d;
    int f20077e;
    RectF f20078f;
    C0000a f20079g;
    String f20080h;
    private jpj f20081k;
    private int f20082l;

    public jpj() {
        super((byte) 0);
    }

    public void m24218a(int i, jpf jpf, int i2, int i3, int i4, int i5, RectF rectF, C0000a c0000a) {
        m24217a(i, jpf.m24894f());
        this.f20073a = jpf;
        this.f20074b = 0;
        this.f20075c = i5;
        this.f20076d = i3;
        this.f20077e = i4;
        this.f20078f = null;
        this.f20079g = null;
        this.f20082l = 0;
    }

    public int m24221d() {
        int max = Math.max(this.f20076d, this.f20077e);
        if (max == 0 || max > jph.f20665d) {
            return 6;
        }
        if (max > jph.f20666e) {
            return 7;
        }
        return 8;
    }

    public int hashCode() {
        if (this.f20082l == 0) {
            this.f20082l = gwb.m2161e(this.f20073a, gwb.m2161e(this.f20080h, gwb.m2188f(this.f20074b, gwb.m2161e(this.f20078f, gwb.m2188f(this.f20071i, 17)))));
        }
        return this.f20082l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jpj)) {
            return false;
        }
        jpj jpj = (jpj) obj;
        if (this.f20071i == jpj.f20071i && this.f20075c == jpj.f20075c && this.f20073a.equals(jpj.f20073a)) {
            boolean z;
            if (this.f20074b == jpj.f20074b) {
                switch (this.f20074b) {
                    case 0:
                        if (this.f20076d != jpj.f20076d || this.f20077e != jpj.f20077e) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case 5:
                        if (m24221d() != jpj.m24221d()) {
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
                C0000a c0000a = this.f20079g;
                C0000a c0000a2 = jpj.f20079g;
                if (c0000a == null && c0000a2 == null) {
                    z = true;
                } else if ((c0000a != null || c0000a2 == null) && (c0000a == null || c0000a2 != null)) {
                    z = c0000a.m20q();
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f20078f == null) {
                        return true;
                    }
                    if (this.f20078f.equals(jpj.f20078f) && (this.f20080h == null || this.f20080h.equals(jpj.f20080h))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String c = mo3508c();
        String e = m24222e();
        String f = m24223f();
        String g = m24224g();
        boolean z = this.f20079g != null;
        String valueOf = String.valueOf(this.f20073a);
        return new StringBuilder(((((String.valueOf(valueOf).length() + 22) + String.valueOf(c).length()) + String.valueOf(e).length()) + String.valueOf(f).length()) + String.valueOf(g).length()).append("{").append(valueOf).append(" (").append(c).append(e).append(f).append(") hasEdits: ").append(z).append(" ").append(g).append("}").toString();
    }

    public String mo3508c() {
        int i;
        switch (this.f20074b) {
            case 0:
                i = this.f20076d;
                return i + "x" + this.f20077e;
            case 1:
                return "full";
            case 2:
                return "thumbnail";
            case 3:
                return "large";
            case 4:
                return "original";
            case 5:
                i = this.f20076d;
                return "auto(" + i + "x" + this.f20077e + ")";
            default:
                return "";
        }
    }

    protected String m24222e() {
        switch (this.f20074b) {
            case 0:
                if (this.f20075c != -1) {
                    String str = "-";
                    String valueOf = String.valueOf(gwb.m1391F(this.f20075c));
                    return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                }
                break;
        }
        return "";
    }

    protected String m24223f() {
        if (this.f20078f == null) {
            return "";
        }
        float f = this.f20078f.left;
        float f2 = this.f20078f.top;
        float f3 = this.f20078f.right;
        return ", crop(" + f + ", " + f2 + ", " + f3 + ", " + this.f20078f.bottom + ")";
    }

    protected String m24224g() {
        String str = "";
        if ((this.f20071i & 1) != 0) {
            str = String.valueOf(str).concat(" no-disk-cache");
        }
        if ((this.f20071i & 2) != 0) {
            str = String.valueOf(str).concat(" download-only");
        }
        if ((this.f20071i & 4) != 0) {
            str = String.valueOf(str).concat(" accept-animation");
            if ((this.f20071i & 32) != 0) {
                str = String.valueOf(str).concat("-disable-webp");
            }
        }
        if ((this.f20071i & 8) != 0) {
            str = String.valueOf(str).concat(" disable-decoding");
        }
        if ((this.f20071i & 16) != 0) {
            str = String.valueOf(str).concat(" disable-recycling");
        }
        if ((this.f20071i & 32) != 0) {
            str = String.valueOf(str).concat(" disable-webp");
        }
        if ((this.f20071i & 524288) != 0) {
            str = String.valueOf(str).concat(" monogram");
        }
        if ((this.f20071i & 1048576) != 0) {
            str = String.valueOf(str).concat(" preserve-aspect-ratio");
        }
        if ((this.f20071i & 2097152) != 0) {
            str = String.valueOf(str).concat(" request-mp4");
        }
        if ((this.f20071i & 4194304) != 0) {
            str = String.valueOf(str).concat(" request-h264");
        }
        if ((this.f20071i & 64) != 0) {
            str = String.valueOf(str).concat(" accept-bitmap-container");
        }
        if ((this.f20071i & 128) != 0) {
            str = String.valueOf(str).concat(" disable-loading");
        }
        if ((this.f20071i & 256) != 0) {
            str = String.valueOf(str).concat(" disable-smart-crop");
        }
        if ((this.f20071i & 512) != 0) {
            str = String.valueOf(str).concat(" disable-upscale");
        }
        if ((this.f20071i & 1024) != 0) {
            str = String.valueOf(str).concat(" long-term-cache");
        }
        if ((this.f20071i & 2048) != 0) {
            str = String.valueOf(str).concat(" keep-partial-download");
        }
        if ((this.f20071i & 4096) != 0) {
            str = String.valueOf(str).concat(" disable-automatic-high-res-download");
        }
        if ((this.f20071i & 8192) != 0) {
            str = String.valueOf(str).concat(" allow-large-file-download");
        }
        if ((this.f20071i & 16384) != 0) {
            str = String.valueOf(str).concat(" for-media-sync");
        }
        if ((this.f20071i & 32768) != 0) {
            str = String.valueOf(str).concat(" prefer-high-res-download");
        }
        if ((this.f20071i & 65536) != 0) {
            str = String.valueOf(str).concat(" convert-webp-to-jpeg");
        }
        if ((this.f20071i & 131072) != 0) {
            return String.valueOf(str).concat(" include-exif");
        }
        return str;
    }

    public void m24219a(jpj jpj) {
        this.f20081k = jpj;
    }

    public jpj m24225h() {
        return this.f20081k;
    }
}
