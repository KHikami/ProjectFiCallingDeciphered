import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

public abstract class jkj extends jtv implements jsh {
    public final jkn a;
    final jkc b;
    public jkl c;
    private long d;
    private String e;
    private String o;
    private String p;
    private int q;
    private int r;
    private String s;
    private String t;
    private String u;
    private String v;

    public abstract String a();

    public abstract String b();

    public jkj(jkn jkn, jtw jtw) {
        super(jkn, jtw);
        this.r = -1;
        this.a = jkn;
        this.b = new jkc(this, jkn);
    }

    public final void a(long j, long j2) {
    }

    public String d() {
        return b();
    }

    public String e() {
        String valueOf = String.valueOf(d());
        return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append('~').toString();
    }

    public File f() {
        jtw jtw = this.g;
        if ((jtw.i & 1) != 0) {
            return null;
        }
        return new File(((jtw.i & 1024) != 0 ? this.a.c() : this.a.b()).b(d()));
    }

    public File g() {
        String d = d();
        File a = this.a.b().a(d);
        return a != null ? a : this.a.c().a(d);
    }

    public void h() {
        this.b.f();
        String a = a();
        this.b.a(a);
        if (a == null) {
            if (Log.isLoggable("ImageResource", 3)) {
                a = String.valueOf(this.g);
                new StringBuilder(String.valueOf(a).length() + 35).append("Unable to download null image url: ").append(a);
            }
            a(5);
        } else if ((this.g.i & 2) != 0) {
            this.b.b();
        } else {
            this.b.c();
        }
    }

    public void a(Object obj) {
        boolean z = false;
        if ((this.g.i & 2) != 0) {
            this.b.g();
            File d = this.b.d();
            if (p()) {
                String valueOf = String.valueOf(this.g);
                String valueOf2 = String.valueOf(d);
                new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length()).append("Completing a download-only request: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.a.a((jtv) this, 1, (Object) d);
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (p()) {
            int remaining = byteBuffer.remaining();
            valueOf = String.valueOf(this.g);
            new StringBuilder(String.valueOf(valueOf).length() + 47).append("Delivering data: ").append(valueOf).append("; buffer has ").append(remaining).append(" bytes");
        }
        if (byteBuffer != null) {
            jtw jtw = this.g;
            this.b.g();
            this.b.h();
            if (this.i == 2 || byteBuffer.remaining() != 0) {
                boolean z2;
                if (this.b.j() == -1 && this.i != 2) {
                    z2 = true;
                } else if (this.b.j() <= 0 || ((long) byteBuffer.remaining()) >= this.b.j()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                valueOf = z2 ? e() : d();
                if ((jtw.i & 1024) != 0) {
                    z = true;
                }
                String str;
                if ((jtw.i & 2) != 0) {
                    a(valueOf, byteBuffer, z2, z);
                    if (p()) {
                        valueOf = String.valueOf(this.g);
                        String valueOf3 = String.valueOf(f());
                        str = z ? "; long-term cache" : "";
                        new StringBuilder(((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()).append("Completing a download-only request: ").append(valueOf).append(" file name: ").append(valueOf3).append(str);
                    }
                    this.a.a((jtv) this, 1, (Object) f());
                    return;
                }
                if (!z2) {
                    a(byteBuffer);
                }
                if ((jtw.i & 1) == 0) {
                    if (p()) {
                        String valueOf4 = String.valueOf(this.g);
                        str = z ? "; long-term cache" : "";
                        new StringBuilder(((String.valueOf(valueOf4).length() + 40) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append("Saving image in file cache: ").append(valueOf4).append(" file name: ").append(valueOf).append(str);
                    }
                    a(valueOf, byteBuffer, z2, z);
                }
            }
        }
    }

    public final void i() {
        if ((this.g.i & 16) == 0) {
            Bitmap bitmap;
            if (this.h instanceof Bitmap) {
                bitmap = (Bitmap) this.h;
            } else if (this.h instanceof jjz) {
                bitmap = ((jjz) this.h).a;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (bitmap.isMutable()) {
                    bitmap.eraseColor(0);
                }
                this.a.a(bitmap);
            }
        }
        super.i();
    }

    public final int j() {
        if (this.r == -1) {
            if (this.h != null) {
                if (this.h instanceof Bitmap) {
                    this.r = a((Bitmap) this.h);
                } else if (this.h instanceof jjz) {
                    this.r = a(((jjz) this.h).a);
                } else if (this.h instanceof jjy) {
                    this.r = ((jjy) this.h).a();
                } else if (this.h instanceof byte[]) {
                    this.r = ((byte[]) this.h).length;
                }
            }
            this.r = Integer.MAX_VALUE;
        }
        return this.r;
    }

    private static int a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public void c() {
        jtw jtw = this.g;
        if ((jtw.i & 128) != 0) {
            if (p()) {
                String valueOf = String.valueOf(this.g);
                String valueOf2 = String.valueOf(f());
                new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("Loading disabled for: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.a.a((jtv) this, 3, null);
            return;
        }
        File g;
        ByteBuffer a;
        if ((jtw.i & 2) != 0) {
            g = g();
            if (g != null) {
                if (p()) {
                    valueOf = String.valueOf(this.g);
                    String valueOf3 = String.valueOf(g);
                    new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf3).length()).append("Returning file name to consumers: ").append(valueOf).append(" file name: ").append(valueOf3);
                }
                this.a.a((jtv) this, 1, (Object) g);
                return;
            }
        }
        if ((jtw.i & 1) == 0) {
            g = g();
            if (g != null) {
                if (p()) {
                    String valueOf4 = String.valueOf(this.g);
                    String valueOf5 = String.valueOf(g);
                    new StringBuilder((String.valueOf(valueOf4).length() + 37) + String.valueOf(valueOf5).length()).append("Loading image from file: ").append(valueOf4).append(" file name: ").append(valueOf5);
                }
                try {
                    a = gwb.a(g, true);
                } catch (FileNotFoundException e) {
                    a = null;
                } catch (Throwable e2) {
                    valueOf2 = String.valueOf(g);
                    a(new StringBuilder(String.valueOf(valueOf2).length() + 18).append("Cannot load file: ").append(valueOf2).toString(), e2);
                }
                if (a != null) {
                    a(a);
                } else if ((jtw.i & 262144) == 0) {
                    if (p()) {
                        valueOf = String.valueOf(this.g);
                        valueOf2 = String.valueOf(f());
                        new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("Downloading disabled for: ").append(valueOf).append(" file name: ").append(valueOf2);
                    }
                    this.a.a((jtv) this, 3, null);
                } else {
                    if (p()) {
                        valueOf = String.valueOf(this.g);
                        new StringBuilder(String.valueOf(valueOf).length() + 21).append("Requesting download: ").append(valueOf);
                    }
                    h();
                }
            }
        }
        a = null;
        if (a != null) {
            a(a);
        } else if ((jtw.i & 262144) == 0) {
            if (p()) {
                valueOf = String.valueOf(this.g);
                new StringBuilder(String.valueOf(valueOf).length() + 21).append("Requesting download: ").append(valueOf);
            }
            h();
        } else {
            if (p()) {
                valueOf = String.valueOf(this.g);
                valueOf2 = String.valueOf(f());
                new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("Downloading disabled for: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.a.a((jtv) this, 3, null);
        }
    }

    private void a(ByteBuffer byteBuffer) {
        jtw jtw = this.g;
        String valueOf;
        String valueOf2;
        if (this.i == 2 || this.i == 1) {
            if ((jtw.i & 2) != 0) {
                if (p()) {
                    valueOf = String.valueOf(this.g);
                    String valueOf3 = String.valueOf(f());
                    new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf3).length()).append("Completing a download-only request: ").append(valueOf).append(" file name: ").append(valueOf3);
                }
                this.a.a((jtv) this, 1, (Object) f());
            } else if ((jtw.i & 8) != 0) {
                if (p()) {
                    valueOf = String.valueOf(this.g);
                    new StringBuilder(String.valueOf(valueOf).length() + 56).append("Image decoding disabled. Delivering bytes to consumers: ").append(valueOf);
                }
                this.a.a((jtv) this, 1, gwb.a(byteBuffer));
            } else {
                try {
                    int i;
                    boolean z;
                    Object a;
                    Object a2;
                    File f;
                    if (byteBuffer.limit() >= 6) {
                        byteBuffer.rewind();
                        if (byteBuffer.get(0) == 71 && byteBuffer.get(1) == 73 && byteBuffer.get(2) == 70) {
                            i = 1;
                            if (i != 0) {
                                this.k = 2;
                            }
                            if ((jtw.i & 4) == 0 && (jtw.i & 32) == 0 && jkg.a(byteBuffer)) {
                                b((Object) new jkg(FrameSequence.decodeByteBuffer(byteBuffer)));
                                return;
                            } else if ((jtw.i & 4) != 0 || i == 0) {
                                if ((jtw.i & 64) == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a = this.a.a(this, byteBuffer, z);
                                if (this.c == null) {
                                    a2 = this.c.a(this.g, a);
                                } else {
                                    a2 = a;
                                }
                                if (a2 == null) {
                                    if (p()) {
                                        valueOf2 = String.valueOf(this.g);
                                        new StringBuilder(String.valueOf(valueOf2).length() + 31).append("Delivering image to consumers: ").append(valueOf2);
                                    }
                                    b(a2);
                                }
                                if (p()) {
                                    valueOf = String.valueOf(this.g);
                                    new StringBuilder(String.valueOf(valueOf).length() + 26).append("Bad image; cannot decode: ").append(valueOf);
                                }
                                f = f();
                                if (f != null) {
                                    f.delete();
                                }
                                this.a.a((jtv) this, 5);
                                return;
                            } else {
                                b((Object) new jjy(byteBuffer));
                                return;
                            }
                        }
                    }
                    i = 0;
                    if (i != 0) {
                        this.k = 2;
                    }
                    if ((jtw.i & 4) == 0) {
                    }
                    if ((jtw.i & 4) != 0) {
                    }
                    if ((jtw.i & 64) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a = this.a.a(this, byteBuffer, z);
                    if (this.c == null) {
                        a2 = a;
                    } else {
                        a2 = this.c.a(this.g, a);
                    }
                    if (a2 == null) {
                        if (p()) {
                            valueOf = String.valueOf(this.g);
                            new StringBuilder(String.valueOf(valueOf).length() + 26).append("Bad image; cannot decode: ").append(valueOf);
                        }
                        f = f();
                        if (f != null) {
                            f.delete();
                        }
                        this.a.a((jtv) this, 5);
                        return;
                    }
                    if (p()) {
                        valueOf2 = String.valueOf(this.g);
                        new StringBuilder(String.valueOf(valueOf2).length() + 31).append("Delivering image to consumers: ").append(valueOf2);
                    }
                    b(a2);
                } catch (OutOfMemoryError e) {
                    if (p()) {
                        valueOf = String.valueOf(this.g);
                        new StringBuilder(String.valueOf(valueOf).length() + 36).append("Out of memory while decoding image: ").append(valueOf);
                    }
                    gwb.a(new jkk(this));
                    this.a.a((jtv) this, 6, null);
                }
            }
        } else if (p()) {
            valueOf = String.valueOf(this.g);
            valueOf2 = String.valueOf(n());
            new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(valueOf2).length()).append("Resource no longer needed, not delivering: ").append(valueOf).append(", status: ").append(valueOf2);
        }
    }

    private void a(String str, ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (!z || this.b.a(str, z2)) {
            (z2 ? this.a.c() : this.a.b()).a(str, byteBuffer);
        }
    }

    public final void a(int i) {
        this.b.g();
        super.a(i);
    }

    public final void a(int i, String str) {
        this.b.g();
        super.a(i, str);
    }

    protected final void a(StringBuilder stringBuilder) {
        stringBuilder.append("\n  Size:").append(j());
    }

    public final void a(long j, String str, int i, int i2, int i3, Bitmap bitmap) {
        this.d = SystemClock.currentThreadTimeMillis() - j;
        this.e = this.d + " ms";
        this.p = str;
        this.q = i;
        if (p()) {
            String str2;
            if (bitmap == null) {
                str2 = "null";
            } else {
                int width = bitmap.getWidth();
                str2 = "[" + width + "x" + bitmap.getHeight() + "]";
            }
            String str3 = this.e;
            new StringBuilder(((String.valueOf(str).length() + 80) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("Decoded ").append(i).append(" byte ").append(str).append(" from source [").append(i2).append("x").append(i3).append("] into bitmap ").append(str2).append(" in ").append(str3);
        }
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }

    String k() {
        String str = (this.b.k() - this.b.i()) + " ms";
        this.o = str;
        return str;
    }
}
