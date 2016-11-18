package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

public final class gjo implements Callback, fsq, Runnable {
    private static gjp T;
    private static Handler U;
    private static final byte[] W = new byte[768];
    static final byte[] a = "NETSCAPE2.0".getBytes();
    private static final Object aa = new Object();
    int A;
    final Handler B = new Handler(Looper.getMainLooper(), this);
    boolean C;
    boolean D;
    final byte[] E;
    int F;
    int G;
    int[] H;
    public int I;
    public final int[] J = new int[256];
    public int K;
    int L;
    boolean M;
    private final gix N;
    private long O;
    private boolean P;
    private int Q;
    private boolean R;
    private boolean S = true;
    private boolean V;
    private boolean X;
    private int Y;
    private gjr Z;
    volatile boolean b;
    volatile boolean c;
    int d;
    boolean e;
    int f;
    int[] g;
    int[] h;
    boolean i;
    int j;
    int k;
    int l;
    int m;
    int n;
    final byte[] o = new byte[256];
    int p = 2;
    boolean q;
    int r;
    final short[] s = new short[4096];
    final byte[] t = new byte[4096];
    final byte[] u = new byte[4097];
    byte[] v;
    boolean w;
    int[] x;
    int y;
    Bitmap z;

    public gjo(byte[] bArr, gjr gjr, gix gix) {
        boolean z = false;
        this.N = gix;
        this.M = true;
        synchronized (aa) {
            if (T == null) {
                gjp gjp = new gjp();
                T = gjp;
                gjp.start();
                U = new Handler(T.getLooper(), T);
            }
        }
        this.Z = gjr;
        this.E = bArr;
        InputStream gjq = new gjq(this, bArr);
        try {
            boolean z2;
            int read;
            if ((gjq.read() == 71) && gjq.read() == 73) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && gjq.read() == 70) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                gjq.skip(3);
                this.F = gjo.a(gjq);
                this.G = gjo.a(gjq);
                if (this.F <= 0 || this.G <= 0) {
                    this.b = true;
                    glk.d("Babel", "Not a valid Gif. Width or height is 0", new Object[0]);
                } else {
                    read = gjq.read();
                    this.X = (read & 128) != 0;
                    this.Y = 2 << (read & 7);
                    this.K = gjq.read();
                    gjq.skip(1);
                }
                if (this.X && !this.b) {
                    try {
                        gjo.a(gjq, this.J, this.Y);
                        this.d = this.J[this.K];
                    } catch (Throwable e) {
                        this.b = true;
                        glk.c("Babel", "Not a valid Gif.", e);
                    }
                }
            } else {
                this.b = true;
                glk.d("Babel", "Not a valid Gif.", new Object[0]);
            }
            this.I = gjq.a();
            this.L = this.I;
            int i = this.F;
            this.n = i;
            this.l = i;
            this.m = this.G;
            i = 0;
            while (!z) {
                try {
                    this.z = this.N.b(this.F, this.G);
                    this.C = false;
                    read = this.F * this.G;
                    this.H = new int[read];
                    this.v = new byte[read];
                    U.sendMessage(U.obtainMessage(10, this));
                    z = true;
                } catch (OutOfMemoryError e2) {
                    glk.d("Babel", "Out of memory trying to create bitmap to use for Gif.", new Object[0]);
                    i++;
                    if (i <= 1) {
                        iio.a.a();
                    } else {
                        this.b = true;
                        glk.d("Babel", "Out of Memory. Failed to create bitmap to use for Gif. Aborting", new Object[0]);
                        z = true;
                    }
                }
            }
        } catch (Throwable e3) {
            this.b = true;
            glk.c("Babel", "Could not read input stream from the gif.", e3);
        } catch (Throwable e32) {
            this.b = true;
            glk.c("Babel", "Gif has invalid arguments", e32);
        }
        try {
            gjq.close();
        } catch (IOException e4) {
        }
    }

    public static boolean a(byte[] bArr) {
        return bArr.length >= 3 && bArr[0] == (byte) 71 && bArr[1] == (byte) 73 && bArr[2] == (byte) 70;
    }

    public byte[] c() {
        return this.E;
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.G;
    }

    public void a(gjr gjr) {
        this.Z = gjr;
        if (gjr != null && this.V) {
            this.Z.a(this.z);
        }
    }

    private static boolean a(InputStream inputStream, int[] iArr, int i) {
        synchronized (W) {
            int i2 = i * 3;
            if (inputStream.read(W, 0, i2) < i2) {
                return false;
            }
            gjo.a(W, iArr, i, 0);
            return true;
        }
    }

    public static int a(byte[] bArr, int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + 1;
            int i5 = bArr[i2] & 255;
            int i6 = i4 + 1;
            i2 = i6 + 1;
            iArr[i3] = (((bArr[i4] & 255) << 8) | ((i5 << 16) | -16777216)) | (bArr[i6] & 255);
        }
        return i2;
    }

    public boolean f() {
        return this.b;
    }

    private static int a(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8);
    }

    public void a() {
    }

    public void b() {
    }

    public void g() {
        if (!this.P) {
            this.P = true;
            this.O = SystemClock.uptimeMillis();
            run();
        }
    }

    public void h() {
        if (this.P) {
            a((Runnable) this);
        }
    }

    private void a(Runnable runnable, long j) {
        if (this.S) {
            this.B.postAtTime(runnable, j);
            this.R = true;
        }
    }

    private void a(Runnable runnable) {
        this.B.removeCallbacks(runnable);
        this.P = false;
    }

    public void run() {
        if (!this.C && !this.c) {
            U.sendMessage(U.obtainMessage(10, this));
        }
    }

    public void a(boolean z) {
        if (this.S != z) {
            this.S = z;
            if (this.S) {
                g();
            } else {
                h();
            }
        }
    }

    void i() {
        if (!this.w) {
            if (this.x == null) {
                this.x = null;
                try {
                    this.x = new int[this.H.length];
                } catch (Throwable e) {
                    Log.e("Babel", "Gif backupFrame threw an OOME", e);
                }
            }
            if (this.x != null) {
                System.arraycopy(this.H, 0, this.x, 0, this.H.length);
                this.w = true;
            }
        }
    }

    private boolean n() {
        return !this.b && this.V && !this.C && this.l > 0 && this.m > 0;
    }

    public void j() {
        if (this.z != null) {
            this.N.a(this.z);
            this.z = null;
        }
        this.C = true;
    }

    int k() {
        byte[] bArr = this.E;
        int i = this.L;
        this.L = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 > 0) {
            System.arraycopy(this.E, this.L, this.o, 0, i2);
            this.L += i2;
        }
        return i2;
    }

    int l() {
        byte[] bArr = this.E;
        int i = this.L;
        this.L = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.E;
        int i3 = this.L;
        this.L = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
    }

    void m() {
        int i;
        do {
            byte[] bArr = this.E;
            int i2 = this.L;
            this.L = i2 + 1;
            i = bArr[i2] & 255;
            this.L += i;
        } while (i > 0);
    }

    public boolean handleMessage(Message message) {
        if (message.what != 11) {
            return false;
        }
        this.Q = message.arg1;
        if (this.z != null) {
            this.z.setPixels(this.H, 0, this.F, 0, 0, this.F, this.G);
            this.V = true;
            this.R = false;
            if (this.Z != null && n()) {
                this.Z.a(this.z);
                if (!this.P) {
                    a((Runnable) this);
                } else if (!this.R) {
                    this.O = Math.max(this.O + ((long) this.Q), SystemClock.uptimeMillis() + 5);
                    a(this, this.O);
                }
            }
        }
        return true;
    }
}
