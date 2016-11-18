package p000;

import android.graphics.Bitmap;

public final class gkt implements fsq {
    public static int f15513a = 1;
    private static final boolean f15514b = false;
    private static final Object f15515c = new Object();
    private Bitmap f15516d;
    private int f15517e = 0;
    private final int f15518f;
    private final String f15519g;
    private boolean f15520h = false;
    private int f15521i;

    static {
        kae kae = glk.f15573t;
    }

    public gkt(Bitmap bitmap, String str) {
        int byteCount = bitmap == null ? 1 : bitmap.getByteCount();
        synchronized (f15515c) {
            this.f15516d = bitmap;
            this.f15519g = str;
            this.f15518f = byteCount;
            byteCount = f15513a;
            f15513a = byteCount + 1;
            this.f15521i = byteCount;
        }
        if (f15514b) {
            String str2 = "RefcountedBitmap created: ";
            String valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
    }

    public void mo2291a() {
        synchronized (f15515c) {
            if (f15514b) {
                String str = "RefcountedBitmap acquire :";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.f15517e++;
        }
    }

    public void mo2292b() {
        synchronized (f15515c) {
            boolean z;
            if (f15514b) {
                String str = "RefcountedBitmap release : ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            if (this.f15517e > 0) {
                z = true;
            } else {
                z = false;
            }
            iil.m21874a("Expected condition to be true", z);
            this.f15517e--;
        }
    }

    private void m17892j() {
        boolean z;
        boolean z2 = true;
        if (this.f15517e > 0) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        if (this.f15521i <= 0) {
            z2 = false;
        }
        iil.m21874a("Expected condition to be true", z2);
    }

    public Bitmap m17896c() {
        Bitmap bitmap = null;
        synchronized (f15515c) {
            if (f15514b) {
                String str = "RefcountedBitmap dispose : ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            if (!(this.f15520h || this.f15516d == null)) {
                bitmap = this.f15516d;
            }
            this.f15521i = -this.f15521i;
            this.f15516d = null;
        }
        return bitmap;
    }

    public Bitmap m17897d() {
        Bitmap bitmap;
        synchronized (f15515c) {
            if (f15514b) {
                String str = "RefcountedBitmap getBitmapWithoutRefcount : ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            m17892j();
            bitmap = this.f15516d;
            this.f15520h = true;
            mo2292b();
        }
        return bitmap;
    }

    public Bitmap m17898e() {
        m17892j();
        return this.f15516d;
    }

    Bitmap m17899f() {
        return this.f15516d;
    }

    public boolean m17900g() {
        return this.f15516d != null && this.f15516d.isMutable();
    }

    public String m17901h() {
        return this.f15519g;
    }

    public int m17902i() {
        return this.f15517e;
    }

    public boolean m17894a(int i, int i2) {
        boolean z;
        if (this.f15521i > 0) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        return this.f15516d != null && this.f15516d.getWidth() == i && this.f15516d.getHeight() == i2;
    }

    public String toString() {
        int i = this.f15521i;
        int i2 = this.f15517e;
        String str = this.f15519g;
        boolean z = this.f15520h;
        int i3 = this.f15518f;
        String valueOf = String.valueOf(this.f15516d);
        return new StringBuilder((String.valueOf(str).length() + 98) + String.valueOf(valueOf).length()).append("RefCountedBitmap id=").append(i).append(" count=").append(i2).append(" key=").append(str).append(" dontreturn=").append(z).append(" size=").append(i3).append(" bitmap = ").append(valueOf).toString();
    }
}
