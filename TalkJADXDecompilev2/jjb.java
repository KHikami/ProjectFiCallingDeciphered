package defpackage;

import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

public final class jjb {
    public static final int A = jjb.a(0, (short) 532);
    public static final int B = jjb.a(0, (short) -32104);
    public static final int C = jjb.a(0, (short) -30871);
    public static final int D = jjb.a(0, (short) -30683);
    public static final int E = jjb.a(1, (short) 513);
    public static final int F = jjb.a(1, (short) 514);
    public static final int G = jjb.a(2, (short) -32102);
    public static final int H = jjb.a(2, (short) -32099);
    public static final int I = jjb.a(2, (short) -30686);
    public static final int J = jjb.a(2, (short) -30684);
    public static final int K = jjb.a(2, (short) -30681);
    public static final int L = jjb.a(2, (short) -30680);
    public static final int M = jjb.a(2, (short) -28672);
    public static final int N = jjb.a(2, (short) -28669);
    public static final int O = jjb.a(2, (short) -28668);
    public static final int P = jjb.a(2, (short) -28415);
    public static final int Q = jjb.a(2, (short) -28414);
    public static final int R = jjb.a(2, (short) -28159);
    public static final int S = jjb.a(2, (short) -28158);
    public static final int T = jjb.a(2, (short) -28157);
    public static final int U = jjb.a(2, (short) -28156);
    public static final int V = jjb.a(2, (short) -28155);
    public static final int W = jjb.a(2, (short) -28154);
    public static final int X = jjb.a(2, (short) -28153);
    public static final int Y = jjb.a(2, (short) -28152);
    public static final int Z = jjb.a(2, (short) -28151);
    public static final int a = jjb.a(0, (short) 256);
    public static final int aA = jjb.a(2, (short) -23549);
    public static final int aB = jjb.a(2, (short) -23548);
    public static final int aC = jjb.a(2, (short) -23547);
    public static final int aD = jjb.a(2, (short) -23546);
    public static final int aE = jjb.a(2, (short) -23545);
    public static final int aF = jjb.a(2, (short) -23544);
    public static final int aG = jjb.a(2, (short) -23543);
    public static final int aH = jjb.a(2, (short) -23542);
    public static final int aI = jjb.a(2, (short) -23541);
    public static final int aJ = jjb.a(2, (short) -23540);
    public static final int aK = jjb.a(2, (short) -23520);
    public static final int aL = jjb.a(4, (short) 0);
    public static final int aM = jjb.a(4, (short) 1);
    public static final int aN = jjb.a(4, (short) 2);
    public static final int aO = jjb.a(4, (short) 3);
    public static final int aP = jjb.a(4, (short) 4);
    public static final int aQ = jjb.a(4, (short) 5);
    public static final int aR = jjb.a(4, (short) 6);
    public static final int aS = jjb.a(4, (short) 7);
    public static final int aT = jjb.a(4, (short) 8);
    public static final int aU = jjb.a(4, (short) 9);
    public static final int aV = jjb.a(4, (short) 10);
    public static final int aW = jjb.a(4, (short) 11);
    public static final int aX = jjb.a(4, (short) 12);
    public static final int aY = jjb.a(4, (short) 13);
    public static final int aZ = jjb.a(4, (short) 14);
    public static final int aa = jjb.a(2, (short) -28150);
    public static final int ab = jjb.a(2, (short) -28140);
    public static final int ac = jjb.a(2, (short) -28036);
    public static final int ad = jjb.a(2, (short) -28026);
    public static final int ae = jjb.a(2, (short) -28016);
    public static final int af = jjb.a(2, (short) -28015);
    public static final int ag = jjb.a(2, (short) -28014);
    public static final int ah = jjb.a(2, (short) -24576);
    public static final int ai = jjb.a(2, (short) -24575);
    public static final int aj = jjb.a(2, (short) -24574);
    public static final int ak = jjb.a(2, (short) -24573);
    public static final int al = jjb.a(2, (short) -24572);
    public static final int am = jjb.a(2, (short) -24571);
    public static final int an = jjb.a(2, (short) -24053);
    public static final int ao = jjb.a(2, (short) -24052);
    public static final int ap = jjb.a(2, (short) -24050);
    public static final int aq = jjb.a(2, (short) -24049);
    public static final int ar = jjb.a(2, (short) -24048);
    public static final int as = jjb.a(2, (short) -24044);
    public static final int at = jjb.a(2, (short) -24043);
    public static final int au = jjb.a(2, (short) -24041);
    public static final int av = jjb.a(2, (short) -23808);
    public static final int aw = jjb.a(2, (short) -23807);
    public static final int ax = jjb.a(2, (short) -23806);
    public static final int ay = jjb.a(2, (short) -23551);
    public static final int az = jjb.a(2, (short) -23550);
    public static final int b = jjb.a(0, (short) 257);
    public static final int ba = jjb.a(4, (short) 15);
    public static final int bb = jjb.a(4, (short) 16);
    public static final int bc = jjb.a(4, (short) 17);
    public static final int bd = jjb.a(4, (short) 18);
    public static final int be = jjb.a(4, (short) 19);
    public static final int bf = jjb.a(4, (short) 20);
    public static final int bg = jjb.a(4, (short) 21);
    public static final int bh = jjb.a(4, (short) 22);
    public static final int bi = jjb.a(4, (short) 23);
    public static final int bj = jjb.a(4, (short) 24);
    public static final int bk = jjb.a(4, (short) 25);
    public static final int bl = jjb.a(4, (short) 26);
    public static final int bm = jjb.a(4, (short) 27);
    public static final int bn = jjb.a(4, (short) 28);
    public static final int bo = jjb.a(4, (short) 29);
    public static final int bp = jjb.a(4, (short) 30);
    public static final int bq = jjb.a(3, (short) 1);
    public static final ByteOrder br = ByteOrder.BIG_ENDIAN;
    private static final HashSet<Short> bs;
    private static final HashSet<Short> bt;
    public static final int c = jjb.a(0, (short) 258);
    public static final int d = jjb.a(0, (short) 259);
    public static final int e = jjb.a(0, (short) 262);
    public static final int f = jjb.a(0, (short) 270);
    public static final int g = jjb.a(0, (short) 271);
    public static final int h = jjb.a(0, (short) 272);
    public static final int i = jjb.a(0, (short) 273);
    public static final int j = jjb.a(0, (short) 274);
    public static final int k = jjb.a(0, (short) 277);
    public static final int l = jjb.a(0, (short) 278);
    public static final int m = jjb.a(0, (short) 279);
    public static final int n = jjb.a(0, (short) 282);
    public static final int o = jjb.a(0, (short) 283);
    public static final int p = jjb.a(0, (short) 284);
    public static final int q = jjb.a(0, (short) 296);
    public static final int r = jjb.a(0, (short) 301);
    public static final int s = jjb.a(0, (short) 305);
    public static final int t = jjb.a(0, (short) 306);
    public static final int u = jjb.a(0, (short) 315);
    public static final int v = jjb.a(0, (short) 318);
    public static final int w = jjb.a(0, (short) 319);
    public static final int x = jjb.a(0, (short) 529);
    public static final int y = jjb.a(0, (short) 530);
    public static final int z = jjb.a(0, (short) 531);
    private jjc bu = new jjc(br);
    private final DateFormat bv = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    private final DateFormat bw = new SimpleDateFormat("yyyy:MM:dd");
    private final Calendar bx = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    private SparseIntArray by = null;

    static {
        HashSet hashSet = new HashSet();
        bs = hashSet;
        hashSet.add(Short.valueOf((short) D));
        bs.add(Short.valueOf((short) C));
        bs.add(Short.valueOf((short) E));
        bs.add(Short.valueOf((short) am));
        bs.add(Short.valueOf((short) i));
        hashSet = new HashSet(bs);
        bt = hashSet;
        hashSet.add(Short.valueOf((short) -1));
        bt.add(Short.valueOf((short) F));
        bt.add(Short.valueOf((short) m));
    }

    private static int a(int i, short s) {
        return (65535 & s) | (i << 16);
    }

    public static short a(int i) {
        return (short) i;
    }

    public jjb() {
        this.bw.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private void a(byte[] bArr) {
        a(new ByteArrayInputStream(bArr));
    }

    public void a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        try {
            this.bu = new jjl(this).a(inputStream);
        } catch (jjd e) {
            String valueOf = String.valueOf(e);
            throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid exif format : ").append(valueOf).toString());
        }
    }

    public void a(String str) {
        IOException e;
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        Closeable bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                a((InputStream) bufferedInputStream);
                bufferedInputStream.close();
            } catch (IOException e2) {
                e = e2;
                jjb.a(bufferedInputStream);
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedInputStream = null;
            jjb.a(bufferedInputStream);
            throw e;
        }
    }

    private void a(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        Closeable closeable = null;
        try {
            closeable = c(str);
            closeable.write(bArr, 0, bArr.length);
            closeable.flush();
            closeable.close();
        } catch (IOException e) {
            jjb.a(closeable);
            throw e;
        }
    }

    private OutputStream a(OutputStream outputStream) {
        OutputStream jjg = new jjg(outputStream, this);
        jjg.a(this.bu);
        return jjg;
    }

    private OutputStream c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        try {
            return a(new FileOutputStream(str));
        } catch (FileNotFoundException e) {
            jjb.a(null);
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r11, java.util.Collection<defpackage.jjm> r12) {
        /*
        r10 = this;
        r8 = 0;
        r6 = 0;
        r0 = 0;
        r2 = new java.io.File;	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r2.<init>(r11);	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r1 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r3 = defpackage.jjh.a(r1, r10);	 Catch:{ jjd -> 0x0043 }
        r3 = r3.i();	 Catch:{ IOException -> 0x004c }
        r4 = (long) r3;	 Catch:{ IOException -> 0x004c }
        r1.close();	 Catch:{ IOException -> 0x004c }
        r7 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r1 = "rw";
        r7.<init>(r2, r1);	 Catch:{ IOException -> 0x006b, all -> 0x0069 }
        r2 = r7.length();	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x004e;
    L_0x002e:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
        r1 = "Filesize changed during operation";
        r0.<init>(r1);	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
        throw r0;	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
    L_0x0036:
        r0 = move-exception;
        r1 = r6;
        r6 = r7;
    L_0x0039:
        defpackage.jjb.a(r6);	 Catch:{ all -> 0x003d }
        throw r0;	 Catch:{ all -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        r6 = r1;
    L_0x003f:
        defpackage.jjb.a(r6);
        throw r0;
    L_0x0043:
        r0 = move-exception;
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x004c }
        r3 = "Invalid exif format : ";
        r2.<init>(r3, r0);	 Catch:{ IOException -> 0x004c }
        throw r2;	 Catch:{ IOException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        goto L_0x0039;
    L_0x004e:
        r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x0062;
    L_0x0052:
        r0 = r7.getChannel();	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
        r1 = java.nio.channels.FileChannel.MapMode.READ_WRITE;	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
        r2 = 0;
        r0 = r0.map(r1, r2, r4);	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
        r0 = r10.a(r0, r12);	 Catch:{ IOException -> 0x0036, all -> 0x0069 }
    L_0x0062:
        defpackage.jjb.a(r6);
        r7.close();
        return r0;
    L_0x0069:
        r0 = move-exception;
        goto L_0x003f;
    L_0x006b:
        r0 = move-exception;
        r1 = r6;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: jjb.a(java.lang.String, java.util.Collection):boolean");
    }

    private boolean a(ByteBuffer byteBuffer, Collection<jjm> collection) {
        if (collection == null) {
            return false;
        }
        try {
            jje jje = new jje(byteBuffer, this);
            for (jjm a : collection) {
                jje.a(a);
            }
            return jje.a();
        } catch (jjd e) {
            String valueOf = String.valueOf(e);
            throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid exif format : ").append(valueOf).toString());
        }
    }

    private void b(String str, Collection<jjm> collection) {
        FileInputStream fileInputStream;
        IOException e;
        Throwable th;
        if (!a(str, (Collection) collection)) {
            jjc jjc = this.bu;
            this.bu = new jjc(br);
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    jjb.a((InputStream) fileInputStream, byteArrayOutputStream);
                    byte[] toByteArray = byteArrayOutputStream.toByteArray();
                    a(toByteArray);
                    if (collection != null) {
                        a((Collection) collection);
                    }
                    a(toByteArray, str);
                    fileInputStream.close();
                    this.bu = jjc;
                } catch (IOException e2) {
                    e = e2;
                    try {
                        jjb.a((Closeable) fileInputStream);
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        this.bu = jjc;
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                fileInputStream = null;
                jjb.a((Closeable) fileInputStream);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.bu = jjc;
                throw th;
            }
        }
    }

    public void b(String str) {
        b(str, b());
    }

    private List<jjm> b() {
        return this.bu.h();
    }

    private jjm b(int i, int i2) {
        if (jjm.a(i2)) {
            return this.bu.a((short) i, i2);
        }
        return null;
    }

    private Integer c(int i, int i2) {
        int[] d = d(i, i2);
        if (d == null || d.length <= 0) {
            return null;
        }
        return Integer.valueOf(d[0]);
    }

    public Integer b(int i) {
        return c(i, d(i));
    }

    private int[] d(int i, int i2) {
        jjm b = b(i, i2);
        if (b == null) {
            return null;
        }
        return b.g();
    }

    private int d(int i) {
        if (a().get(i) == 0) {
            return -1;
        }
        return i >>> 16;
    }

    static boolean a(short s) {
        return bs.contains(Short.valueOf(s));
    }

    jjm c(int i) {
        int i2 = a().get(i);
        if (i2 == 0) {
            return null;
        }
        boolean z;
        short s = (short) ((i2 >> 16) & 255);
        int i3 = i2 & 65535;
        if (i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        return new jjm((short) i, s, i3, i >>> 16, z);
    }

    private boolean a(int i, int i2, Object obj) {
        jjm b = b(i, i2);
        if (b == null) {
            return false;
        }
        return b.a(obj);
    }

    public boolean a(int i, Object obj) {
        return a(i, d(i), obj);
    }

    private jjm a(jjm jjm) {
        return this.bu.a(jjm);
    }

    private void a(Collection<jjm> collection) {
        for (jjm a : collection) {
            a(a);
        }
    }

    public static int b(short s) {
        switch (s) {
            case (short) 3:
                return 180;
            case (short) 6:
                return 90;
            case (short) 8:
                return 270;
            default:
                return 0;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read != -1) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    SparseIntArray a() {
        if (this.by == null) {
            this.by = new SparseIntArray();
            int a = jjb.a(new int[]{0, 1}) << 24;
            this.by.put(g, a | 131072);
            this.by.put(a, (a | 262144) | 1);
            this.by.put(b, (a | 262144) | 1);
            this.by.put(c, (a | 196608) | 3);
            this.by.put(d, (a | 196608) | 1);
            this.by.put(e, (a | 196608) | 1);
            this.by.put(j, (a | 196608) | 1);
            this.by.put(k, (a | 196608) | 1);
            this.by.put(p, (a | 196608) | 1);
            this.by.put(y, (a | 196608) | 2);
            this.by.put(z, (a | 196608) | 1);
            this.by.put(n, (a | 327680) | 1);
            this.by.put(o, (a | 327680) | 1);
            this.by.put(q, (a | 196608) | 1);
            this.by.put(i, a | 262144);
            this.by.put(l, (a | 262144) | 1);
            this.by.put(m, a | 262144);
            this.by.put(r, (a | 196608) | 768);
            this.by.put(v, (a | 327680) | 2);
            this.by.put(w, (a | 327680) | 6);
            this.by.put(x, (a | 327680) | 3);
            this.by.put(A, (a | 327680) | 6);
            this.by.put(t, (a | 131072) | 20);
            this.by.put(f, a | 131072);
            this.by.put(g, a | 131072);
            this.by.put(h, a | 131072);
            this.by.put(s, a | 131072);
            this.by.put(u, a | 131072);
            this.by.put(B, a | 131072);
            this.by.put(C, (a | 262144) | 1);
            this.by.put(D, (a | 262144) | 1);
            a = jjb.a(new int[]{1}) << 24;
            this.by.put(E, (a | 262144) | 1);
            this.by.put(F, (a | 262144) | 1);
            a = jjb.a(new int[]{2}) << 24;
            this.by.put(M, (a | 458752) | 4);
            this.by.put(ah, (a | 458752) | 4);
            this.by.put(ai, (a | 196608) | 1);
            this.by.put(P, (a | 458752) | 4);
            this.by.put(Q, (a | 327680) | 1);
            this.by.put(aj, (a | 262144) | 1);
            this.by.put(ak, (a | 262144) | 1);
            this.by.put(ac, a | 458752);
            this.by.put(ad, a | 458752);
            this.by.put(al, (a | 131072) | 13);
            this.by.put(N, (a | 131072) | 20);
            this.by.put(O, (a | 131072) | 20);
            this.by.put(ae, a | 131072);
            this.by.put(af, a | 131072);
            this.by.put(ag, a | 131072);
            this.by.put(aK, (a | 131072) | 33);
            this.by.put(G, (a | 327680) | 1);
            this.by.put(H, (a | 327680) | 1);
            this.by.put(I, (a | 196608) | 1);
            this.by.put(J, a | 131072);
            this.by.put(K, a | 196608);
            this.by.put(L, a | 458752);
            this.by.put(R, (655360 | a) | 1);
            this.by.put(S, (a | 327680) | 1);
            this.by.put(T, (655360 | a) | 1);
            this.by.put(U, (655360 | a) | 1);
            this.by.put(V, (a | 327680) | 1);
            this.by.put(W, (a | 327680) | 1);
            this.by.put(X, (a | 196608) | 1);
            this.by.put(Y, (a | 196608) | 1);
            this.by.put(Z, (a | 196608) | 1);
            this.by.put(aa, (a | 327680) | 1);
            this.by.put(ab, a | 196608);
            this.by.put(an, (a | 327680) | 1);
            this.by.put(ao, a | 458752);
            this.by.put(ap, (a | 327680) | 1);
            this.by.put(aq, (a | 327680) | 1);
            this.by.put(ar, (a | 196608) | 1);
            this.by.put(as, (a | 196608) | 2);
            this.by.put(at, (a | 327680) | 1);
            this.by.put(au, (a | 196608) | 1);
            this.by.put(av, (a | 458752) | 1);
            this.by.put(aw, (a | 458752) | 1);
            this.by.put(ax, a | 458752);
            this.by.put(ay, (a | 196608) | 1);
            this.by.put(az, (a | 196608) | 1);
            this.by.put(aA, (a | 196608) | 1);
            this.by.put(aB, (a | 327680) | 1);
            this.by.put(aC, (a | 196608) | 1);
            this.by.put(aD, (a | 196608) | 1);
            this.by.put(aE, (a | 327680) | 1);
            this.by.put(aF, (a | 196608) | 1);
            this.by.put(aG, (a | 196608) | 1);
            this.by.put(aH, (a | 196608) | 1);
            this.by.put(aI, a | 458752);
            this.by.put(aJ, (a | 196608) | 1);
            this.by.put(am, (a | 262144) | 1);
            a = jjb.a(new int[]{4}) << 24;
            this.by.put(aL, (65536 | a) | 4);
            this.by.put(aM, (a | 131072) | 2);
            this.by.put(aO, (a | 131072) | 2);
            this.by.put(aN, (655360 | a) | 3);
            this.by.put(aP, (655360 | a) | 3);
            this.by.put(aQ, (65536 | a) | 1);
            this.by.put(aR, (a | 327680) | 1);
            this.by.put(aS, (a | 327680) | 3);
            this.by.put(aT, a | 131072);
            this.by.put(aU, (a | 131072) | 2);
            this.by.put(aV, (a | 131072) | 2);
            this.by.put(aW, (a | 327680) | 1);
            this.by.put(aX, (a | 131072) | 2);
            this.by.put(aY, (a | 327680) | 1);
            this.by.put(aZ, (a | 131072) | 2);
            this.by.put(ba, (a | 327680) | 1);
            this.by.put(bb, (a | 131072) | 2);
            this.by.put(bc, (a | 327680) | 1);
            this.by.put(bd, a | 131072);
            this.by.put(be, (a | 131072) | 2);
            this.by.put(bf, (a | 327680) | 1);
            this.by.put(bi, (a | 131072) | 2);
            this.by.put(bj, (a | 327680) | 1);
            this.by.put(bk, (a | 131072) | 2);
            this.by.put(bl, (a | 327680) | 1);
            this.by.put(bm, a | 458752);
            this.by.put(bn, a | 458752);
            this.by.put(bo, (a | 131072) | 11);
            this.by.put(bp, (a | 196608) | 11);
            this.by.put(bq, (jjb.a(new int[]{3}) << 24) | 131072);
        }
        return this.by;
    }

    private static int a(int[] iArr) {
        if (iArr.length == 0) {
            return 0;
        }
        int[] iArr2 = jjn.a;
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 : iArr) {
                if (iArr2[i2] == i3) {
                    i |= 1 << i2;
                    break;
                }
            }
        }
        return i;
    }

    static boolean a(int i, int i2) {
        int[] iArr = jjn.a;
        int i3 = i >>> 24;
        int i4 = 0;
        while (i4 < iArr.length) {
            if (i2 == iArr[i4] && ((i3 >> i4) & 1) == 1) {
                return true;
            }
            i4++;
        }
        return false;
    }
}