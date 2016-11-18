package p000;

import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel.MapMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

public final class jjb {
    public static final int f20178A = jjb.m24356a(0, (short) 532);
    public static final int f20179B = jjb.m24356a(0, (short) -32104);
    public static final int f20180C = jjb.m24356a(0, (short) -30871);
    public static final int f20181D = jjb.m24356a(0, (short) -30683);
    public static final int f20182E = jjb.m24356a(1, (short) 513);
    public static final int f20183F = jjb.m24356a(1, (short) 514);
    public static final int f20184G = jjb.m24356a(2, (short) -32102);
    public static final int f20185H = jjb.m24356a(2, (short) -32099);
    public static final int f20186I = jjb.m24356a(2, (short) -30686);
    public static final int f20187J = jjb.m24356a(2, (short) -30684);
    public static final int f20188K = jjb.m24356a(2, (short) -30681);
    public static final int f20189L = jjb.m24356a(2, (short) -30680);
    public static final int f20190M = jjb.m24356a(2, (short) -28672);
    public static final int f20191N = jjb.m24356a(2, (short) -28669);
    public static final int f20192O = jjb.m24356a(2, (short) -28668);
    public static final int f20193P = jjb.m24356a(2, (short) -28415);
    public static final int f20194Q = jjb.m24356a(2, (short) -28414);
    public static final int f20195R = jjb.m24356a(2, (short) -28159);
    public static final int f20196S = jjb.m24356a(2, (short) -28158);
    public static final int f20197T = jjb.m24356a(2, (short) -28157);
    public static final int f20198U = jjb.m24356a(2, (short) -28156);
    public static final int f20199V = jjb.m24356a(2, (short) -28155);
    public static final int f20200W = jjb.m24356a(2, (short) -28154);
    public static final int f20201X = jjb.m24356a(2, (short) -28153);
    public static final int f20202Y = jjb.m24356a(2, (short) -28152);
    public static final int f20203Z = jjb.m24356a(2, (short) -28151);
    public static final int f20204a = jjb.m24356a(0, (short) 256);
    public static final int aA = jjb.m24356a(2, (short) -23549);
    public static final int aB = jjb.m24356a(2, (short) -23548);
    public static final int aC = jjb.m24356a(2, (short) -23547);
    public static final int aD = jjb.m24356a(2, (short) -23546);
    public static final int aE = jjb.m24356a(2, (short) -23545);
    public static final int aF = jjb.m24356a(2, (short) -23544);
    public static final int aG = jjb.m24356a(2, (short) -23543);
    public static final int aH = jjb.m24356a(2, (short) -23542);
    public static final int aI = jjb.m24356a(2, (short) -23541);
    public static final int aJ = jjb.m24356a(2, (short) -23540);
    public static final int aK = jjb.m24356a(2, (short) -23520);
    public static final int aL = jjb.m24356a(4, (short) 0);
    public static final int aM = jjb.m24356a(4, (short) 1);
    public static final int aN = jjb.m24356a(4, (short) 2);
    public static final int aO = jjb.m24356a(4, (short) 3);
    public static final int aP = jjb.m24356a(4, (short) 4);
    public static final int aQ = jjb.m24356a(4, (short) 5);
    public static final int aR = jjb.m24356a(4, (short) 6);
    public static final int aS = jjb.m24356a(4, (short) 7);
    public static final int aT = jjb.m24356a(4, (short) 8);
    public static final int aU = jjb.m24356a(4, (short) 9);
    public static final int aV = jjb.m24356a(4, (short) 10);
    public static final int aW = jjb.m24356a(4, (short) 11);
    public static final int aX = jjb.m24356a(4, (short) 12);
    public static final int aY = jjb.m24356a(4, (short) 13);
    public static final int aZ = jjb.m24356a(4, (short) 14);
    public static final int aa = jjb.m24356a(2, (short) -28150);
    public static final int ab = jjb.m24356a(2, (short) -28140);
    public static final int ac = jjb.m24356a(2, (short) -28036);
    public static final int ad = jjb.m24356a(2, (short) -28026);
    public static final int ae = jjb.m24356a(2, (short) -28016);
    public static final int af = jjb.m24356a(2, (short) -28015);
    public static final int ag = jjb.m24356a(2, (short) -28014);
    public static final int ah = jjb.m24356a(2, (short) -24576);
    public static final int ai = jjb.m24356a(2, (short) -24575);
    public static final int aj = jjb.m24356a(2, (short) -24574);
    public static final int ak = jjb.m24356a(2, (short) -24573);
    public static final int al = jjb.m24356a(2, (short) -24572);
    public static final int am = jjb.m24356a(2, (short) -24571);
    public static final int an = jjb.m24356a(2, (short) -24053);
    public static final int ao = jjb.m24356a(2, (short) -24052);
    public static final int ap = jjb.m24356a(2, (short) -24050);
    public static final int aq = jjb.m24356a(2, (short) -24049);
    public static final int ar = jjb.m24356a(2, (short) -24048);
    public static final int as = jjb.m24356a(2, (short) -24044);
    public static final int at = jjb.m24356a(2, (short) -24043);
    public static final int au = jjb.m24356a(2, (short) -24041);
    public static final int av = jjb.m24356a(2, (short) -23808);
    public static final int aw = jjb.m24356a(2, (short) -23807);
    public static final int ax = jjb.m24356a(2, (short) -23806);
    public static final int ay = jjb.m24356a(2, (short) -23551);
    public static final int az = jjb.m24356a(2, (short) -23550);
    public static final int f20205b = jjb.m24356a(0, (short) 257);
    public static final int ba = jjb.m24356a(4, (short) 15);
    public static final int bb = jjb.m24356a(4, (short) 16);
    public static final int bc = jjb.m24356a(4, (short) 17);
    public static final int bd = jjb.m24356a(4, (short) 18);
    public static final int be = jjb.m24356a(4, (short) 19);
    public static final int bf = jjb.m24356a(4, (short) 20);
    public static final int bg = jjb.m24356a(4, (short) 21);
    public static final int bh = jjb.m24356a(4, (short) 22);
    public static final int bi = jjb.m24356a(4, (short) 23);
    public static final int bj = jjb.m24356a(4, (short) 24);
    public static final int bk = jjb.m24356a(4, (short) 25);
    public static final int bl = jjb.m24356a(4, (short) 26);
    public static final int bm = jjb.m24356a(4, (short) 27);
    public static final int bn = jjb.m24356a(4, (short) 28);
    public static final int bo = jjb.m24356a(4, (short) 29);
    public static final int bp = jjb.m24356a(4, (short) 30);
    public static final int bq = jjb.m24356a(3, (short) 1);
    public static final ByteOrder br = ByteOrder.BIG_ENDIAN;
    private static final HashSet<Short> bs;
    private static final HashSet<Short> bt;
    public static final int f20206c = jjb.m24356a(0, (short) 258);
    public static final int f20207d = jjb.m24356a(0, (short) 259);
    public static final int f20208e = jjb.m24356a(0, (short) 262);
    public static final int f20209f = jjb.m24356a(0, (short) 270);
    public static final int f20210g = jjb.m24356a(0, (short) 271);
    public static final int f20211h = jjb.m24356a(0, (short) 272);
    public static final int f20212i = jjb.m24356a(0, (short) 273);
    public static final int f20213j = jjb.m24356a(0, (short) 274);
    public static final int f20214k = jjb.m24356a(0, (short) 277);
    public static final int f20215l = jjb.m24356a(0, (short) 278);
    public static final int f20216m = jjb.m24356a(0, (short) 279);
    public static final int f20217n = jjb.m24356a(0, (short) 282);
    public static final int f20218o = jjb.m24356a(0, (short) 283);
    public static final int f20219p = jjb.m24356a(0, (short) 284);
    public static final int f20220q = jjb.m24356a(0, (short) 296);
    public static final int f20221r = jjb.m24356a(0, (short) 301);
    public static final int f20222s = jjb.m24356a(0, (short) 305);
    public static final int f20223t = jjb.m24356a(0, (short) 306);
    public static final int f20224u = jjb.m24356a(0, (short) 315);
    public static final int f20225v = jjb.m24356a(0, (short) 318);
    public static final int f20226w = jjb.m24356a(0, (short) 319);
    public static final int f20227x = jjb.m24356a(0, (short) 529);
    public static final int f20228y = jjb.m24356a(0, (short) 530);
    public static final int f20229z = jjb.m24356a(0, (short) 531);
    private jjc bu = new jjc(br);
    private final DateFormat bv = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    private final DateFormat bw = new SimpleDateFormat("yyyy:MM:dd");
    private final Calendar bx = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    private SparseIntArray by = null;

    static {
        HashSet hashSet = new HashSet();
        bs = hashSet;
        hashSet.add(Short.valueOf((short) f20181D));
        bs.add(Short.valueOf((short) f20180C));
        bs.add(Short.valueOf((short) f20182E));
        bs.add(Short.valueOf((short) am));
        bs.add(Short.valueOf((short) f20212i));
        hashSet = new HashSet(bs);
        bt = hashSet;
        hashSet.add(Short.valueOf((short) -1));
        bt.add(Short.valueOf((short) f20183F));
        bt.add(Short.valueOf((short) f20216m));
    }

    private static int m24356a(int i, short s) {
        return (65535 & s) | (i << 16);
    }

    public static short m24360a(int i) {
        return (short) i;
    }

    public jjb() {
        this.bw.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private void m24364a(byte[] bArr) {
        m24380a(new ByteArrayInputStream(bArr));
    }

    public void m24380a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        try {
            this.bu = new jjl(this).m24451a(inputStream);
        } catch (jjd e) {
            String valueOf = String.valueOf(e);
            throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid exif format : ").append(valueOf).toString());
        }
    }

    public void m24381a(String str) {
        Closeable bufferedInputStream;
        IOException e;
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                m24380a((InputStream) bufferedInputStream);
                bufferedInputStream.close();
            } catch (IOException e2) {
                e = e2;
                jjb.m24361a(bufferedInputStream);
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedInputStream = null;
            jjb.m24361a(bufferedInputStream);
            throw e;
        }
    }

    private void m24365a(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        Closeable closeable = null;
        try {
            closeable = m24375c(str);
            closeable.write(bArr, 0, bArr.length);
            closeable.flush();
            closeable.close();
        } catch (IOException e) {
            jjb.m24361a(closeable);
            throw e;
        }
    }

    private OutputStream m24358a(OutputStream outputStream) {
        OutputStream jjg = new jjg(outputStream, this);
        jjg.m24416a(this.bu);
        return jjg;
    }

    private OutputStream m24375c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        try {
            return m24358a(new FileOutputStream(str));
        } catch (FileNotFoundException e) {
            jjb.m24361a(null);
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24368a(String str, Collection<jjm> collection) {
        Throwable e;
        IOException e2;
        Closeable closeable = null;
        boolean z = false;
        InputStream bufferedInputStream;
        try {
            File file = new File(str);
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                long i = (long) jjh.m24419a(bufferedInputStream, this).m24448i();
                bufferedInputStream.close();
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                if (randomAccessFile.length() < i) {
                    throw new IOException("Filesize changed during operation");
                }
                if (i > 0) {
                    z = m24369a(randomAccessFile.getChannel().map(MapMode.READ_WRITE, 0, i), (Collection) collection);
                }
                jjb.m24361a(null);
                randomAccessFile.close();
                return z;
            } catch (Throwable e3) {
                throw new IOException("Invalid exif format : ", e3);
            } catch (IOException e4) {
                e2 = e4;
                try {
                    jjb.m24361a(closeable);
                    throw e2;
                } catch (Throwable th) {
                    e3 = th;
                    closeable = bufferedInputStream;
                    jjb.m24361a(closeable);
                    throw e3;
                }
            }
        } catch (IOException e5) {
            e2 = e5;
            bufferedInputStream = null;
            jjb.m24361a(closeable);
            throw e2;
        } catch (Throwable th2) {
            e3 = th2;
            jjb.m24361a(closeable);
            throw e3;
        }
    }

    private boolean m24369a(ByteBuffer byteBuffer, Collection<jjm> collection) {
        if (collection == null) {
            return false;
        }
        try {
            jje jje = new jje(byteBuffer, this);
            for (jjm a : collection) {
                jje.m24406a(a);
            }
            return jje.m24407a();
        } catch (jjd e) {
            String valueOf = String.valueOf(e);
            throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid exif format : ").append(valueOf).toString());
        }
    }

    private void m24374b(String str, Collection<jjm> collection) {
        FileInputStream fileInputStream;
        IOException e;
        Throwable th;
        if (!m24368a(str, (Collection) collection)) {
            jjc jjc = this.bu;
            this.bu = new jjc(br);
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    jjb.m24362a((InputStream) fileInputStream, byteArrayOutputStream);
                    byte[] toByteArray = byteArrayOutputStream.toByteArray();
                    m24364a(toByteArray);
                    if (collection != null) {
                        m24363a((Collection) collection);
                    }
                    m24365a(toByteArray, str);
                    fileInputStream.close();
                    this.bu = jjc;
                } catch (IOException e2) {
                    e = e2;
                    try {
                        jjb.m24361a((Closeable) fileInputStream);
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
                jjb.m24361a((Closeable) fileInputStream);
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

    public void m24384b(String str) {
        m24374b(str, m24372b());
    }

    private List<jjm> m24372b() {
        return this.bu.m24404h();
    }

    private jjm m24373b(int i, int i2) {
        if (jjm.m24453a(i2)) {
            return this.bu.m24389a((short) i, i2);
        }
        return null;
    }

    private Integer m24376c(int i, int i2) {
        int[] d = m24378d(i, i2);
        if (d == null || d.length <= 0) {
            return null;
        }
        return Integer.valueOf(d[0]);
    }

    public Integer m24383b(int i) {
        return m24376c(i, m24377d(i));
    }

    private int[] m24378d(int i, int i2) {
        jjm b = m24373b(i, i2);
        if (b == null) {
            return null;
        }
        return b.m24483g();
    }

    private int m24377d(int i) {
        if (m24379a().get(i) == 0) {
            return -1;
        }
        return i >>> 16;
    }

    static boolean m24370a(short s) {
        return bs.contains(Short.valueOf(s));
    }

    jjm m24385c(int i) {
        int i2 = m24379a().get(i);
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

    private boolean m24367a(int i, int i2, Object obj) {
        jjm b = m24373b(i, i2);
        if (b == null) {
            return false;
        }
        return b.m24465a(obj);
    }

    public boolean m24382a(int i, Object obj) {
        return m24367a(i, m24377d(i), obj);
    }

    private jjm m24359a(jjm jjm) {
        return this.bu.m24388a(jjm);
    }

    private void m24363a(Collection<jjm> collection) {
        for (jjm a : collection) {
            m24359a(a);
        }
    }

    public static int m24371b(short s) {
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

    private static void m24362a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read != -1) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
    }

    public static void m24361a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    SparseIntArray m24379a() {
        if (this.by == null) {
            this.by = new SparseIntArray();
            int a = jjb.m24357a(new int[]{0, 1}) << 24;
            this.by.put(f20210g, a | 131072);
            this.by.put(f20204a, (a | 262144) | 1);
            this.by.put(f20205b, (a | 262144) | 1);
            this.by.put(f20206c, (a | 196608) | 3);
            this.by.put(f20207d, (a | 196608) | 1);
            this.by.put(f20208e, (a | 196608) | 1);
            this.by.put(f20213j, (a | 196608) | 1);
            this.by.put(f20214k, (a | 196608) | 1);
            this.by.put(f20219p, (a | 196608) | 1);
            this.by.put(f20228y, (a | 196608) | 2);
            this.by.put(f20229z, (a | 196608) | 1);
            this.by.put(f20217n, (a | 327680) | 1);
            this.by.put(f20218o, (a | 327680) | 1);
            this.by.put(f20220q, (a | 196608) | 1);
            this.by.put(f20212i, a | 262144);
            this.by.put(f20215l, (a | 262144) | 1);
            this.by.put(f20216m, a | 262144);
            this.by.put(f20221r, (a | 196608) | 768);
            this.by.put(f20225v, (a | 327680) | 2);
            this.by.put(f20226w, (a | 327680) | 6);
            this.by.put(f20227x, (a | 327680) | 3);
            this.by.put(f20178A, (a | 327680) | 6);
            this.by.put(f20223t, (a | 131072) | 20);
            this.by.put(f20209f, a | 131072);
            this.by.put(f20210g, a | 131072);
            this.by.put(f20211h, a | 131072);
            this.by.put(f20222s, a | 131072);
            this.by.put(f20224u, a | 131072);
            this.by.put(f20179B, a | 131072);
            this.by.put(f20180C, (a | 262144) | 1);
            this.by.put(f20181D, (a | 262144) | 1);
            a = jjb.m24357a(new int[]{1}) << 24;
            this.by.put(f20182E, (a | 262144) | 1);
            this.by.put(f20183F, (a | 262144) | 1);
            a = jjb.m24357a(new int[]{2}) << 24;
            this.by.put(f20190M, (a | 458752) | 4);
            this.by.put(ah, (a | 458752) | 4);
            this.by.put(ai, (a | 196608) | 1);
            this.by.put(f20193P, (a | 458752) | 4);
            this.by.put(f20194Q, (a | 327680) | 1);
            this.by.put(aj, (a | 262144) | 1);
            this.by.put(ak, (a | 262144) | 1);
            this.by.put(ac, a | 458752);
            this.by.put(ad, a | 458752);
            this.by.put(al, (a | 131072) | 13);
            this.by.put(f20191N, (a | 131072) | 20);
            this.by.put(f20192O, (a | 131072) | 20);
            this.by.put(ae, a | 131072);
            this.by.put(af, a | 131072);
            this.by.put(ag, a | 131072);
            this.by.put(aK, (a | 131072) | 33);
            this.by.put(f20184G, (a | 327680) | 1);
            this.by.put(f20185H, (a | 327680) | 1);
            this.by.put(f20186I, (a | 196608) | 1);
            this.by.put(f20187J, a | 131072);
            this.by.put(f20188K, a | 196608);
            this.by.put(f20189L, a | 458752);
            this.by.put(f20195R, (655360 | a) | 1);
            this.by.put(f20196S, (a | 327680) | 1);
            this.by.put(f20197T, (655360 | a) | 1);
            this.by.put(f20198U, (655360 | a) | 1);
            this.by.put(f20199V, (a | 327680) | 1);
            this.by.put(f20200W, (a | 327680) | 1);
            this.by.put(f20201X, (a | 196608) | 1);
            this.by.put(f20202Y, (a | 196608) | 1);
            this.by.put(f20203Z, (a | 196608) | 1);
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
            a = jjb.m24357a(new int[]{4}) << 24;
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
            this.by.put(bq, (jjb.m24357a(new int[]{3}) << 24) | 131072);
        }
        return this.by;
    }

    private static int m24357a(int[] iArr) {
        if (iArr.length == 0) {
            return 0;
        }
        int[] iArr2 = jjn.f20296a;
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

    static boolean m24366a(int i, int i2) {
        int[] iArr = jjn.f20296a;
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
