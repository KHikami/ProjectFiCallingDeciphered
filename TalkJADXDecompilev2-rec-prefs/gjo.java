package p000;

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
    private static gjp f15386T;
    private static Handler f15387U;
    private static final byte[] f15388W = new byte[768];
    static final byte[] f15389a = "NETSCAPE2.0".getBytes();
    private static final Object aa = new Object();
    int f15390A;
    final Handler f15391B = new Handler(Looper.getMainLooper(), this);
    boolean f15392C;
    boolean f15393D;
    final byte[] f15394E;
    int f15395F;
    int f15396G;
    int[] f15397H;
    public int f15398I;
    public final int[] f15399J = new int[256];
    public int f15400K;
    int f15401L;
    boolean f15402M;
    private final gix f15403N;
    private long f15404O;
    private boolean f15405P;
    private int f15406Q;
    private boolean f15407R;
    private boolean f15408S = true;
    private boolean f15409V;
    private boolean f15410X;
    private int f15411Y;
    private gjr f15412Z;
    volatile boolean f15413b;
    volatile boolean f15414c;
    int f15415d;
    boolean f15416e;
    int f15417f;
    int[] f15418g;
    int[] f15419h;
    boolean f15420i;
    int f15421j;
    int f15422k;
    int f15423l;
    int f15424m;
    int f15425n;
    final byte[] f15426o = new byte[256];
    int f15427p = 2;
    boolean f15428q;
    int f15429r;
    final short[] f15430s = new short[4096];
    final byte[] f15431t = new byte[4096];
    final byte[] f15432u = new byte[4097];
    byte[] f15433v;
    boolean f15434w;
    int[] f15435x;
    int f15436y;
    Bitmap f15437z;

    public gjo(byte[] bArr, gjr gjr, gix gix) {
        boolean z = false;
        this.f15403N = gix;
        this.f15402M = true;
        synchronized (aa) {
            if (f15386T == null) {
                gjp gjp = new gjp();
                f15386T = gjp;
                gjp.start();
                f15387U = new Handler(f15386T.getLooper(), f15386T);
            }
        }
        this.f15412Z = gjr;
        this.f15394E = bArr;
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
                this.f15395F = gjo.m17828a(gjq);
                this.f15396G = gjo.m17828a(gjq);
                if (this.f15395F <= 0 || this.f15396G <= 0) {
                    this.f15413b = true;
                    glk.m17981d("Babel", "Not a valid Gif. Width or height is 0", new Object[0]);
                } else {
                    read = gjq.read();
                    this.f15410X = (read & 128) != 0;
                    this.f15411Y = 2 << (read & 7);
                    this.f15400K = gjq.read();
                    gjq.skip(1);
                }
                if (this.f15410X && !this.f15413b) {
                    try {
                        gjo.m17832a(gjq, this.f15399J, this.f15411Y);
                        this.f15415d = this.f15399J[this.f15400K];
                    } catch (Throwable e) {
                        this.f15413b = true;
                        glk.m17978c("Babel", "Not a valid Gif.", e);
                    }
                }
            } else {
                this.f15413b = true;
                glk.m17981d("Babel", "Not a valid Gif.", new Object[0]);
            }
            this.f15398I = gjq.m17850a();
            this.f15401L = this.f15398I;
            int i = this.f15395F;
            this.f15425n = i;
            this.f15423l = i;
            this.f15424m = this.f15396G;
            i = 0;
            while (!z) {
                try {
                    this.f15437z = this.f15403N.m17772b(this.f15395F, this.f15396G);
                    this.f15392C = false;
                    read = this.f15395F * this.f15396G;
                    this.f15397H = new int[read];
                    this.f15433v = new byte[read];
                    f15387U.sendMessage(f15387U.obtainMessage(10, this));
                    z = true;
                } catch (OutOfMemoryError e2) {
                    glk.m17981d("Babel", "Out of memory trying to create bitmap to use for Gif.", new Object[0]);
                    i++;
                    if (i <= 1) {
                        iio.f17742a.m21892a();
                    } else {
                        this.f15413b = true;
                        glk.m17981d("Babel", "Out of Memory. Failed to create bitmap to use for Gif. Aborting", new Object[0]);
                        z = true;
                    }
                }
            }
        } catch (Throwable e3) {
            this.f15413b = true;
            glk.m17978c("Babel", "Could not read input stream from the gif.", e3);
        } catch (Throwable e32) {
            this.f15413b = true;
            glk.m17978c("Babel", "Gif has invalid arguments", e32);
        }
        try {
            gjq.close();
        } catch (IOException e4) {
        }
    }

    public static boolean m17833a(byte[] bArr) {
        return bArr.length >= 3 && bArr[0] == (byte) 71 && bArr[1] == (byte) 73 && bArr[2] == (byte) 70;
    }

    public byte[] m17839c() {
        return this.f15394E;
    }

    public int m17840d() {
        return this.f15395F;
    }

    public int m17841e() {
        return this.f15396G;
    }

    public void m17836a(gjr gjr) {
        this.f15412Z = gjr;
        if (gjr != null && this.f15409V) {
            this.f15412Z.mo596a(this.f15437z);
        }
    }

    private static boolean m17832a(InputStream inputStream, int[] iArr, int i) {
        synchronized (f15388W) {
            int i2 = i * 3;
            if (inputStream.read(f15388W, 0, i2) < i2) {
                return false;
            }
            gjo.m17829a(f15388W, iArr, i, 0);
            return true;
        }
    }

    public static int m17829a(byte[] bArr, int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + 1;
            int i5 = bArr[i2] & 255;
            int i6 = i4 + 1;
            i2 = i6 + 1;
            iArr[i3] = (((bArr[i4] & 255) << 8) | ((i5 << 16) | -16777216)) | (bArr[i6] & 255);
        }
        return i2;
    }

    public boolean m17842f() {
        return this.f15413b;
    }

    private static int m17828a(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8);
    }

    public void mo2291a() {
    }

    public void mo2292b() {
    }

    public void m17843g() {
        if (!this.f15405P) {
            this.f15405P = true;
            this.f15404O = SystemClock.uptimeMillis();
            run();
        }
    }

    public void m17844h() {
        if (this.f15405P) {
            m17830a((Runnable) this);
        }
    }

    private void m17831a(Runnable runnable, long j) {
        if (this.f15408S) {
            this.f15391B.postAtTime(runnable, j);
            this.f15407R = true;
        }
    }

    private void m17830a(Runnable runnable) {
        this.f15391B.removeCallbacks(runnable);
        this.f15405P = false;
    }

    public void run() {
        if (!this.f15392C && !this.f15414c) {
            f15387U.sendMessage(f15387U.obtainMessage(10, this));
        }
    }

    public void m17837a(boolean z) {
        if (this.f15408S != z) {
            this.f15408S = z;
            if (this.f15408S) {
                m17843g();
            } else {
                m17844h();
            }
        }
    }

    void m17845i() {
        if (!this.f15434w) {
            if (this.f15435x == null) {
                this.f15435x = null;
                try {
                    this.f15435x = new int[this.f15397H.length];
                } catch (Throwable e) {
                    Log.e("Babel", "Gif backupFrame threw an OOME", e);
                }
            }
            if (this.f15435x != null) {
                System.arraycopy(this.f15397H, 0, this.f15435x, 0, this.f15397H.length);
                this.f15434w = true;
            }
        }
    }

    private boolean m17834n() {
        return !this.f15413b && this.f15409V && !this.f15392C && this.f15423l > 0 && this.f15424m > 0;
    }

    public void m17846j() {
        if (this.f15437z != null) {
            this.f15403N.m17771a(this.f15437z);
            this.f15437z = null;
        }
        this.f15392C = true;
    }

    int m17847k() {
        byte[] bArr = this.f15394E;
        int i = this.f15401L;
        this.f15401L = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 > 0) {
            System.arraycopy(this.f15394E, this.f15401L, this.f15426o, 0, i2);
            this.f15401L += i2;
        }
        return i2;
    }

    int m17848l() {
        byte[] bArr = this.f15394E;
        int i = this.f15401L;
        this.f15401L = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.f15394E;
        int i3 = this.f15401L;
        this.f15401L = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
    }

    void m17849m() {
        int i;
        do {
            byte[] bArr = this.f15394E;
            int i2 = this.f15401L;
            this.f15401L = i2 + 1;
            i = bArr[i2] & 255;
            this.f15401L += i;
        } while (i > 0);
    }

    public boolean handleMessage(Message message) {
        if (message.what != 11) {
            return false;
        }
        this.f15406Q = message.arg1;
        if (this.f15437z != null) {
            this.f15437z.setPixels(this.f15397H, 0, this.f15395F, 0, 0, this.f15395F, this.f15396G);
            this.f15409V = true;
            this.f15407R = false;
            if (this.f15412Z != null && m17834n()) {
                this.f15412Z.mo596a(this.f15437z);
                if (!this.f15405P) {
                    m17830a((Runnable) this);
                } else if (!this.f15407R) {
                    this.f15404O = Math.max(this.f15404O + ((long) this.f15406Q), SystemClock.uptimeMillis() + 5);
                    m17831a(this, this.f15404O);
                }
            }
        }
        return true;
    }
}
