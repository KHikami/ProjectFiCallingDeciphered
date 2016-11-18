package p000;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

public abstract class jkj extends jtv implements jsh {
    public final jkn f20096a;
    final jkc f20097b;
    public jkl f20098c;
    private long f20099d;
    private String f20100e;
    private String f20101o;
    private String f20102p;
    private int f20103q;
    private int f20104r = -1;
    private String f20105s;
    private String f20106t;
    private String f20107u;
    private String f20108v;

    public abstract String mo3511a();

    public abstract String mo3521b();

    public jkj(jkn jkn, jtw jtw) {
        super(jkn, jtw);
        this.f20096a = jkn;
        this.f20097b = new jkc(this, jkn);
    }

    public final void mo3514a(long j, long j2) {
    }

    public String mo3586d() {
        return mo3521b();
    }

    public String m24267e() {
        String valueOf = String.valueOf(mo3586d());
        return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append('~').toString();
    }

    public File mo3518f() {
        jtw jtw = this.g;
        if ((jtw.f20071i & 1) != 0) {
            return null;
        }
        return new File(((jtw.f20071i & 1024) != 0 ? this.f20096a.mo3547c() : this.f20096a.mo3544b()).m24511b(mo3586d()));
    }

    public File mo3519g() {
        String d = mo3586d();
        File a = this.f20096a.mo3544b().m24507a(d);
        return a != null ? a : this.f20096a.mo3547c().m24507a(d);
    }

    public void mo3587h() {
        this.f20097b.m24539f();
        String a = mo3511a();
        this.f20097b.m24531a(a);
        if (a == null) {
            if (Log.isLoggable("ImageResource", 3)) {
                a = String.valueOf(this.g);
                new StringBuilder(String.valueOf(a).length() + 35).append("Unable to download null image url: ").append(a);
            }
            mo3512a(5);
        } else if ((this.g.f20071i & 2) != 0) {
            this.f20097b.m24535b();
        } else {
            this.f20097b.m24536c();
        }
    }

    public void mo3515a(Object obj) {
        boolean z = false;
        if ((this.g.f20071i & 2) != 0) {
            this.f20097b.m24540g();
            File d = this.f20097b.m24537d();
            if (m24250p()) {
                String valueOf = String.valueOf(this.g);
                String valueOf2 = String.valueOf(d);
                new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length()).append("Completing a download-only request: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.f20096a.mo3532a((jtv) this, 1, (Object) d);
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (m24250p()) {
            int remaining = byteBuffer.remaining();
            valueOf = String.valueOf(this.g);
            new StringBuilder(String.valueOf(valueOf).length() + 47).append("Delivering data: ").append(valueOf).append("; buffer has ").append(remaining).append(" bytes");
        }
        if (byteBuffer != null) {
            jtw jtw = this.g;
            this.f20097b.m24540g();
            this.f20097b.m24541h();
            if (this.i == 2 || byteBuffer.remaining() != 0) {
                boolean z2;
                if (this.f20097b.m24543j() == -1 && this.i != 2) {
                    z2 = true;
                } else if (this.f20097b.m24543j() <= 0 || ((long) byteBuffer.remaining()) >= this.f20097b.m24543j()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                valueOf = z2 ? m24267e() : mo3586d();
                if ((jtw.f20071i & 1024) != 0) {
                    z = true;
                }
                String str;
                if ((jtw.f20071i & 2) != 0) {
                    m24255a(valueOf, byteBuffer, z2, z);
                    if (m24250p()) {
                        valueOf = String.valueOf(this.g);
                        String valueOf3 = String.valueOf(mo3518f());
                        str = z ? "; long-term cache" : "";
                        new StringBuilder(((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()).append("Completing a download-only request: ").append(valueOf).append(" file name: ").append(valueOf3).append(str);
                    }
                    this.f20096a.mo3532a((jtv) this, 1, (Object) mo3518f());
                    return;
                }
                if (!z2) {
                    m24256a(byteBuffer);
                }
                if ((jtw.f20071i & 1) == 0) {
                    if (m24250p()) {
                        String valueOf4 = String.valueOf(this.g);
                        str = z ? "; long-term cache" : "";
                        new StringBuilder(((String.valueOf(valueOf4).length() + 40) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append("Saving image in file cache: ").append(valueOf4).append(" file name: ").append(valueOf).append(str);
                    }
                    m24255a(valueOf, byteBuffer, z2, z);
                }
            }
        }
    }

    public final void mo3520i() {
        if ((this.g.f20071i & 16) == 0) {
            Bitmap bitmap;
            if (this.h instanceof Bitmap) {
                bitmap = (Bitmap) this.h;
            } else if (this.h instanceof jjz) {
                bitmap = ((jjz) this.h).f20320a;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (bitmap.isMutable()) {
                    bitmap.eraseColor(0);
                }
                this.f20096a.mo3540a(bitmap);
            }
        }
        super.mo3520i();
    }

    public final int m24272j() {
        if (this.f20104r == -1) {
            if (this.h != null) {
                if (this.h instanceof Bitmap) {
                    this.f20104r = jkj.m24254a((Bitmap) this.h);
                } else if (this.h instanceof jjz) {
                    this.f20104r = jkj.m24254a(((jjz) this.h).f20320a);
                } else if (this.h instanceof jjy) {
                    this.f20104r = ((jjy) this.h).a();
                } else if (this.h instanceof byte[]) {
                    this.f20104r = ((byte[]) this.h).length;
                }
            }
            this.f20104r = Integer.MAX_VALUE;
        }
        return this.f20104r;
    }

    private static int m24254a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public void mo3517c() {
        jtw jtw = this.g;
        if ((jtw.f20071i & 128) != 0) {
            if (m24250p()) {
                String valueOf = String.valueOf(this.g);
                String valueOf2 = String.valueOf(mo3518f());
                new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("Loading disabled for: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.f20096a.mo3532a((jtv) this, 3, null);
            return;
        }
        File g;
        ByteBuffer a;
        if ((jtw.f20071i & 2) != 0) {
            g = mo3519g();
            if (g != null) {
                if (m24250p()) {
                    valueOf = String.valueOf(this.g);
                    String valueOf3 = String.valueOf(g);
                    new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf3).length()).append("Returning file name to consumers: ").append(valueOf).append(" file name: ").append(valueOf3);
                }
                this.f20096a.mo3532a((jtv) this, 1, (Object) g);
                return;
            }
        }
        if ((jtw.f20071i & 1) == 0) {
            g = mo3519g();
            if (g != null) {
                if (m24250p()) {
                    String valueOf4 = String.valueOf(this.g);
                    String valueOf5 = String.valueOf(g);
                    new StringBuilder((String.valueOf(valueOf4).length() + 37) + String.valueOf(valueOf5).length()).append("Loading image from file: ").append(valueOf4).append(" file name: ").append(valueOf5);
                }
                try {
                    a = gwb.m1683a(g, true);
                } catch (FileNotFoundException e) {
                    a = null;
                } catch (Throwable e2) {
                    valueOf2 = String.valueOf(g);
                    m24236a(new StringBuilder(String.valueOf(valueOf2).length() + 18).append("Cannot load file: ").append(valueOf2).toString(), e2);
                }
                if (a != null) {
                    m24256a(a);
                } else if ((jtw.f20071i & 262144) == 0) {
                    if (m24250p()) {
                        valueOf = String.valueOf(this.g);
                        valueOf2 = String.valueOf(mo3518f());
                        new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("Downloading disabled for: ").append(valueOf).append(" file name: ").append(valueOf2);
                    }
                    this.f20096a.mo3532a((jtv) this, 3, null);
                } else {
                    if (m24250p()) {
                        valueOf = String.valueOf(this.g);
                        new StringBuilder(String.valueOf(valueOf).length() + 21).append("Requesting download: ").append(valueOf);
                    }
                    mo3587h();
                }
            }
        }
        a = null;
        if (a != null) {
            m24256a(a);
        } else if ((jtw.f20071i & 262144) == 0) {
            if (m24250p()) {
                valueOf = String.valueOf(this.g);
                new StringBuilder(String.valueOf(valueOf).length() + 21).append("Requesting download: ").append(valueOf);
            }
            mo3587h();
        } else {
            if (m24250p()) {
                valueOf = String.valueOf(this.g);
                valueOf2 = String.valueOf(mo3518f());
                new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length()).append("Downloading disabled for: ").append(valueOf).append(" file name: ").append(valueOf2);
            }
            this.f20096a.mo3532a((jtv) this, 3, null);
        }
    }

    private void m24256a(ByteBuffer byteBuffer) {
        jtw jtw = this.g;
        String valueOf;
        String valueOf2;
        if (this.i == 2 || this.i == 1) {
            if ((jtw.f20071i & 2) != 0) {
                if (m24250p()) {
                    valueOf = String.valueOf(this.g);
                    String valueOf3 = String.valueOf(mo3518f());
                    new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf3).length()).append("Completing a download-only request: ").append(valueOf).append(" file name: ").append(valueOf3);
                }
                this.f20096a.mo3532a((jtv) this, 1, (Object) mo3518f());
            } else if ((jtw.f20071i & 8) != 0) {
                if (m24250p()) {
                    valueOf = String.valueOf(this.g);
                    new StringBuilder(String.valueOf(valueOf).length() + 56).append("Image decoding disabled. Delivering bytes to consumers: ").append(valueOf);
                }
                this.f20096a.mo3532a((jtv) this, 1, gwb.m1950a(byteBuffer));
            } else {
                try {
                    int i;
                    boolean z;
                    Object a;
                    Object a2;
                    File f;
                    if (byteBuffer.limit() >= 6) {
                        byteBuffer.rewind();
                        if (byteBuffer.get(0) == (byte) 71 && byteBuffer.get(1) == (byte) 73 && byteBuffer.get(2) == (byte) 70) {
                            i = 1;
                            if (i != 0) {
                                this.k = 2;
                            }
                            if ((jtw.f20071i & 4) == 0 && (jtw.f20071i & 32) == 0 && jkg.m24551a(byteBuffer)) {
                                mo3585b((Object) new jkg(FrameSequence.decodeByteBuffer(byteBuffer)));
                                return;
                            } else if ((jtw.f20071i & 4) != 0 || i == 0) {
                                if ((jtw.f20071i & 64) == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a = this.f20096a.mo3538a(this, byteBuffer, z);
                                if (this.f20098c == null) {
                                    a2 = this.f20098c.mo3522a(this.g, a);
                                } else {
                                    a2 = a;
                                }
                                if (a2 == null) {
                                    if (m24250p()) {
                                        valueOf2 = String.valueOf(this.g);
                                        new StringBuilder(String.valueOf(valueOf2).length() + 31).append("Delivering image to consumers: ").append(valueOf2);
                                    }
                                    mo3585b(a2);
                                }
                                if (m24250p()) {
                                    valueOf = String.valueOf(this.g);
                                    new StringBuilder(String.valueOf(valueOf).length() + 26).append("Bad image; cannot decode: ").append(valueOf);
                                }
                                f = mo3518f();
                                if (f != null) {
                                    f.delete();
                                }
                                this.f20096a.mo3530a((jtv) this, 5);
                                return;
                            } else {
                                mo3585b((Object) new jjy(byteBuffer));
                                return;
                            }
                        }
                    }
                    i = 0;
                    if (i != 0) {
                        this.k = 2;
                    }
                    if ((jtw.f20071i & 4) == 0) {
                    }
                    if ((jtw.f20071i & 4) != 0) {
                    }
                    if ((jtw.f20071i & 64) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a = this.f20096a.mo3538a(this, byteBuffer, z);
                    if (this.f20098c == null) {
                        a2 = a;
                    } else {
                        a2 = this.f20098c.mo3522a(this.g, a);
                    }
                    if (a2 == null) {
                        if (m24250p()) {
                            valueOf = String.valueOf(this.g);
                            new StringBuilder(String.valueOf(valueOf).length() + 26).append("Bad image; cannot decode: ").append(valueOf);
                        }
                        f = mo3518f();
                        if (f != null) {
                            f.delete();
                        }
                        this.f20096a.mo3530a((jtv) this, 5);
                        return;
                    }
                    if (m24250p()) {
                        valueOf2 = String.valueOf(this.g);
                        new StringBuilder(String.valueOf(valueOf2).length() + 31).append("Delivering image to consumers: ").append(valueOf2);
                    }
                    mo3585b(a2);
                } catch (OutOfMemoryError e) {
                    if (m24250p()) {
                        valueOf = String.valueOf(this.g);
                        new StringBuilder(String.valueOf(valueOf).length() + 36).append("Out of memory while decoding image: ").append(valueOf);
                    }
                    gwb.m1863a(new jkk(this));
                    this.f20096a.mo3532a((jtv) this, 6, null);
                }
            }
        } else if (m24250p()) {
            valueOf = String.valueOf(this.g);
            valueOf2 = String.valueOf(m24248n());
            new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(valueOf2).length()).append("Resource no longer needed, not delivering: ").append(valueOf).append(", status: ").append(valueOf2);
        }
    }

    private void m24255a(String str, ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (!z || this.f20097b.m24534a(str, z2)) {
            (z2 ? this.f20096a.mo3547c() : this.f20096a.mo3544b()).m24508a(str, byteBuffer);
        }
    }

    public final void mo3512a(int i) {
        this.f20097b.m24540g();
        super.mo3512a(i);
    }

    public final void mo3513a(int i, String str) {
        this.f20097b.m24540g();
        super.mo3513a(i, str);
    }

    protected final void mo3516a(StringBuilder stringBuilder) {
        stringBuilder.append("\n  Size:").append(m24272j());
    }

    public final void m24261a(long j, String str, int i, int i2, int i3, Bitmap bitmap) {
        this.f20099d = SystemClock.currentThreadTimeMillis() - j;
        this.f20100e = this.f20099d + " ms";
        this.f20102p = str;
        this.f20103q = i;
        if (m24250p()) {
            String str2;
            if (bitmap == null) {
                str2 = "null";
            } else {
                int width = bitmap.getWidth();
                str2 = "[" + width + "x" + bitmap.getHeight() + "]";
            }
            String str3 = this.f20100e;
            new StringBuilder(((String.valueOf(str).length() + 80) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("Decoded ").append(i).append(" byte ").append(str).append(" from source [").append(i2).append("x").append(i3).append("] into bitmap ").append(str2).append(" in ").append(str3);
        }
        this.f20105s = null;
        this.f20106t = null;
        this.f20107u = null;
        this.f20108v = null;
    }

    String m24273k() {
        String str = (this.f20097b.m24544k() - this.f20097b.m24542i()) + " ms";
        this.f20101o = str;
        return str;
    }
}
