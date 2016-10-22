import android.graphics.Bitmap;

public final class gkt implements fsq {
    public static int a;
    private static final boolean b;
    private static final Object c;
    private Bitmap d;
    private int e;
    private final int f;
    private final String g;
    private boolean h;
    private int i;

    static {
        kae kae = glk.t;
        b = false;
        c = new Object();
        a = 1;
    }

    public gkt(Bitmap bitmap, String str) {
        this.e = 0;
        this.h = false;
        int byteCount = bitmap == null ? 1 : bitmap.getByteCount();
        synchronized (c) {
            this.d = bitmap;
            this.g = str;
            this.f = byteCount;
            byteCount = a;
            a = byteCount + 1;
            this.i = byteCount;
        }
        if (b) {
            String str2 = "RefcountedBitmap created: ";
            String valueOf = String.valueOf(toString());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
    }

    public void a() {
        synchronized (c) {
            if (b) {
                String str = "RefcountedBitmap acquire :";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            this.e++;
        }
    }

    public void b() {
        synchronized (c) {
            boolean z;
            if (b) {
                String str = "RefcountedBitmap release : ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            if (this.e > 0) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            this.e--;
        }
    }

    private void j() {
        boolean z;
        boolean z2 = true;
        if (this.e > 0) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        if (this.i <= 0) {
            z2 = false;
        }
        iil.a("Expected condition to be true", z2);
    }

    public Bitmap c() {
        Bitmap bitmap = null;
        synchronized (c) {
            if (b) {
                String str = "RefcountedBitmap dispose : ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            if (!(this.h || this.d == null)) {
                bitmap = this.d;
            }
            this.i = -this.i;
            this.d = null;
        }
        return bitmap;
    }

    public Bitmap d() {
        Bitmap bitmap;
        synchronized (c) {
            if (b) {
                String str = "RefcountedBitmap getBitmapWithoutRefcount : ";
                String valueOf = String.valueOf(toString());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            j();
            bitmap = this.d;
            this.h = true;
            b();
        }
        return bitmap;
    }

    public Bitmap e() {
        j();
        return this.d;
    }

    Bitmap f() {
        return this.d;
    }

    public boolean g() {
        return this.d != null && this.d.isMutable();
    }

    public String h() {
        return this.g;
    }

    public int i() {
        return this.e;
    }

    public boolean a(int i, int i2) {
        boolean z;
        if (this.i > 0) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        return this.d != null && this.d.getWidth() == i && this.d.getHeight() == i2;
    }

    public String toString() {
        int i = this.i;
        int i2 = this.e;
        String str = this.g;
        boolean z = this.h;
        int i3 = this.f;
        String valueOf = String.valueOf(this.d);
        return new StringBuilder((String.valueOf(str).length() + 98) + String.valueOf(valueOf).length()).append("RefCountedBitmap id=").append(i).append(" count=").append(i2).append(" key=").append(str).append(" dontreturn=").append(z).append(" size=").append(i3).append(" bitmap = ").append(valueOf).toString();
    }
}
