package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class aih {
    private static lo<String, Integer> f919g;
    public ByteArrayOutputStream f920a = null;
    public int f921b = 0;
    aii f922c = null;
    private aid f923d = null;
    private final ContentResolver f924e;
    private aim f925f = null;

    static {
        f919g = null;
        f919g = new lo();
        for (int i = 0; i < ail.f936a.length; i++) {
            f919g.put(ail.f936a[i], Integer.valueOf(i));
        }
    }

    public aih(Context context, aid aid) {
        this.f923d = aid;
        this.f924e = context.getContentResolver();
        this.f925f = aid.m2445a();
        this.f922c = new aii(this);
        this.f920a = new ByteArrayOutputStream();
        this.f921b = 0;
    }

    public byte[] m2481a() {
        int i = 0;
        int i2 = 1;
        switch (this.f923d.m2449b()) {
            case 128:
                if (this.f920a == null) {
                    this.f920a = new ByteArrayOutputStream();
                    this.f921b = 0;
                }
                m2486c(140);
                m2486c(128);
                m2486c(152);
                byte[] b = this.f925f.m2502b(152);
                if (b == null) {
                    throw new IllegalArgumentException("Transaction-ID is null.");
                }
                m2479a(b);
                if (m2474e(141) == 0) {
                    m2474e(133);
                    if (m2474e(137) == 0) {
                        if (m2474e(151) != 1) {
                            i = 1;
                        }
                        if (m2474e(130) != 1) {
                            i = 1;
                        }
                        if (m2474e(129) != 1) {
                            i = 1;
                        }
                        if (i != 0) {
                            m2474e(150);
                            m2474e(138);
                            m2474e(136);
                            m2474e(143);
                            m2474e(134);
                            m2474e(144);
                            m2486c(132);
                            i2 = m2472b();
                        }
                    }
                }
                if (i2 != 0) {
                    return null;
                }
                break;
            case 131:
                if (this.f920a == null) {
                    this.f920a = new ByteArrayOutputStream();
                    this.f921b = 0;
                }
                m2486c(140);
                m2486c(131);
                if (m2474e(152) == 0 && m2474e(141) == 0 && m2474e(149) == 0) {
                    i2 = 0;
                }
                if (i2 != 0) {
                    return null;
                }
                break;
            case 133:
                if (this.f920a == null) {
                    this.f920a = new ByteArrayOutputStream();
                    this.f921b = 0;
                }
                m2486c(140);
                m2486c(133);
                if (m2474e(152) == 0 && m2474e(141) == 0) {
                    m2474e(145);
                    i2 = 0;
                }
                if (i2 != 0) {
                    return null;
                }
                break;
            case 135:
                if (this.f920a == null) {
                    this.f920a = new ByteArrayOutputStream();
                    this.f921b = 0;
                }
                m2486c(140);
                m2486c(135);
                if (m2474e(141) == 0 && m2474e(139) == 0 && m2474e(151) == 0 && m2474e(137) == 0) {
                    m2474e(133);
                    if (m2474e(155) == 0) {
                        i2 = 0;
                    }
                }
                if (i2 != 0) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return this.f920a.toByteArray();
    }

    protected void m2480a(byte[] bArr, int i, int i2) {
        this.f920a.write(bArr, 0, i2);
        this.f921b += i2;
    }

    protected void m2475a(int i) {
        this.f920a.write(i);
        this.f921b++;
    }

    protected void m2482b(int i) {
        m2475a((i | 128) & 255);
    }

    protected void m2486c(int i) {
        m2475a(i);
    }

    protected void m2488d(int i) {
        m2475a(i);
    }

    protected void m2476a(long j) {
        int i = 0;
        long j2 = j;
        int i2 = 0;
        while (j2 != 0 && i2 < 8) {
            j2 >>>= 8;
            i2++;
        }
        m2488d(i2);
        long j3 = (i2 - 1) << 3;
        while (i < i2) {
            m2475a((int) ((j >>> j3) & 255));
            j3 -= 8;
            i++;
        }
    }

    protected void m2479a(byte[] bArr) {
        if ((bArr[0] & 255) > 127) {
            m2475a(127);
        }
        m2480a(bArr, 0, bArr.length);
        m2475a(0);
    }

    protected void m2478a(String str) {
        m2479a(str.getBytes());
    }

    protected void m2477a(aic aic) {
        int a = aic.m2440a();
        byte[] b = aic.m2443b();
        if (b != null) {
            this.f922c.m2490a();
            aik d = this.f922c.m2493d();
            m2482b(a);
            m2479a(b);
            a = d.m2494a();
            this.f922c.m2491b();
            m2489d((long) a);
            this.f922c.m2492c();
        }
    }

    protected void m2483b(long j) {
        int i = 0;
        long j2 = 127;
        while (i < 5 && j >= j2) {
            j2 = (j2 << 7) | 127;
            i++;
        }
        while (i > 0) {
            m2475a((int) ((((j >>> (i * 7)) & 127) | 128) & 255));
            i--;
        }
        m2475a((int) (j & 127));
    }

    protected void m2487c(long j) {
        m2476a(j);
    }

    protected void m2489d(long j) {
        if (j < 31) {
            m2488d((int) j);
            return;
        }
        m2475a(31);
        m2483b(j);
    }

    protected void m2485b(byte[] bArr) {
        m2475a(34);
        m2480a(bArr, 0, bArr.length);
        m2475a(0);
    }

    protected void m2484b(String str) {
        m2485b(str.getBytes());
    }

    private static aic m2473b(aic aic) {
        try {
            aic aic2;
            String c = aic.m2444c();
            if (c != null) {
                int i;
                if (c.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}")) {
                    i = 3;
                } else if (c.matches("\\+?[0-9|\\.|\\-]+")) {
                    i = 1;
                } else if (c.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}")) {
                    i = 2;
                } else if (c.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}")) {
                    i = 4;
                }
                if (aic != null) {
                    aic2 = null;
                } else {
                    aic2 = new aic(aic.f914a, aic.f915b);
                }
                if (1 == r2) {
                    aic2.m2442b("/TYPE=PLMN".getBytes());
                    return aic2;
                } else if (3 == r2) {
                    aic2.m2442b("/TYPE=IPV4".getBytes());
                    return aic2;
                } else if (4 == r2) {
                    return aic2;
                } else {
                    aic2.m2442b("/TYPE=IPV6".getBytes());
                    return aic2;
                }
            }
            Object obj = 5;
            if (aic != null) {
                aic2 = new aic(aic.f914a, aic.f915b);
            } else {
                aic2 = null;
            }
            if (1 == obj) {
                aic2.m2442b("/TYPE=PLMN".getBytes());
                return aic2;
            } else if (3 == obj) {
                aic2.m2442b("/TYPE=IPV4".getBytes());
                return aic2;
            } else if (4 == obj) {
                return aic2;
            } else {
                aic2.m2442b("/TYPE=IPV6".getBytes());
                return aic2;
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

    private int m2474e(int i) {
        int a;
        long e;
        byte[] b;
        switch (i) {
            case 129:
            case 130:
            case 151:
                aic[] d = this.f925f.m2504d(i);
                if (d == null) {
                    return 2;
                }
                for (aic b2 : d) {
                    aic b22 = aih.m2473b(b22);
                    if (b22 == null) {
                        return 1;
                    }
                    m2486c(i);
                    m2477a(b22);
                }
                return 0;
            case 133:
                e = this.f925f.m2505e(i);
                if (-1 == e) {
                    return 2;
                }
                m2486c(i);
                m2487c(e);
                return 0;
            case 134:
            case 143:
            case 144:
            case 145:
            case 149:
            case 155:
                int a2 = this.f925f.m2495a(i);
                if (a2 == 0) {
                    return 2;
                }
                m2486c(i);
                m2486c(a2);
                return 0;
            case 136:
                e = this.f925f.m2505e(i);
                if (-1 == e) {
                    return 2;
                }
                m2486c(i);
                this.f922c.m2490a();
                aik d2 = this.f922c.m2493d();
                m2475a(129);
                m2476a(e);
                a = d2.m2494a();
                this.f922c.m2491b();
                m2489d((long) a);
                this.f922c.m2492c();
                return 0;
            case 137:
                m2486c(i);
                aic c = this.f925f.m2503c(i);
                if (c == null || TextUtils.isEmpty(c.m2444c()) || new String(c.m2443b()).equals("insert-address-token")) {
                    m2475a(1);
                    m2475a(129);
                    return 0;
                }
                this.f922c.m2490a();
                aik d3 = this.f922c.m2493d();
                m2475a(128);
                c = aih.m2473b(c);
                if (c == null) {
                    return 1;
                }
                m2477a(c);
                a = d3.m2494a();
                this.f922c.m2491b();
                m2489d((long) a);
                this.f922c.m2492c();
                return 0;
            case 138:
                b = this.f925f.m2502b(i);
                if (b == null) {
                    return 2;
                }
                m2486c(i);
                if (Arrays.equals(b, "advertisement".getBytes())) {
                    m2486c(129);
                    return 0;
                } else if (Arrays.equals(b, "auto".getBytes())) {
                    m2486c(131);
                    return 0;
                } else if (Arrays.equals(b, "personal".getBytes())) {
                    m2486c(128);
                    return 0;
                } else if (Arrays.equals(b, "informational".getBytes())) {
                    m2486c(130);
                    return 0;
                } else {
                    m2479a(b);
                    return 0;
                }
            case 139:
            case 152:
                b = this.f925f.m2502b(i);
                if (b == null) {
                    return 2;
                }
                m2486c(i);
                m2479a(b);
                return 0;
            case 141:
                m2486c(i);
                a = this.f925f.m2495a(i);
                if (a == 0) {
                    m2482b(18);
                    return 0;
                }
                m2482b(a);
                return 0;
            case 150:
                aic c2 = this.f925f.m2503c(i);
                if (c2 == null) {
                    return 2;
                }
                m2486c(i);
                m2477a(c2);
                return 0;
            default:
                return 3;
        }
    }

    private int m2472b() {
        InputStream openInputStream;
        Throwable th;
        this.f922c.m2490a();
        aik d = this.f922c.m2493d();
        Integer num = (Integer) f919g.get(new String(this.f925f.m2502b(132)));
        if (num == null) {
            return 1;
        }
        m2482b(num.intValue());
        aig d2 = ((aiv) this.f923d).m2456d();
        if (d2 == null || d2.m2471b() == 0) {
            m2483b(0);
            this.f922c.m2491b();
            this.f922c.m2492c();
            return 0;
        }
        try {
            aio a = d2.m2467a(0);
            byte[] c = a.m2527c();
            if (c != null) {
                m2486c(138);
                if ((byte) 60 == c[0] && (byte) 62 == c[c.length - 1]) {
                    m2479a(c);
                } else {
                    String str = new String(c);
                    m2478a(new StringBuilder(String.valueOf(str).length() + 2).append("<").append(str).append(">").toString());
                }
            }
            m2486c(137);
            m2479a(a.m2535g());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        int a2 = d.m2494a();
        this.f922c.m2491b();
        m2489d((long) a2);
        this.f922c.m2492c();
        int b = d2.m2471b();
        m2483b((long) b);
        for (int i = 0; i < b; i++) {
            aio a3 = d2.m2467a(i);
            this.f922c.m2490a();
            aik d3 = this.f922c.m2493d();
            this.f922c.m2490a();
            aik d4 = this.f922c.m2493d();
            byte[] g = a3.m2535g();
            if (g == null) {
                return 1;
            }
            num = (Integer) f919g.get(new String(g));
            if (num == null) {
                m2479a(g);
            } else {
                m2482b(num.intValue());
            }
            byte[] i2 = a3.m2538i();
            if (i2 == null) {
                i2 = a3.m2539j();
                if (i2 == null) {
                    i2 = a3.m2531e();
                    if (i2 == null) {
                        i2 = "smil.xml".getBytes();
                    }
                }
            }
            m2486c(133);
            m2479a(i2);
            a2 = a3.m2528d();
            if (a2 != 0) {
                m2486c(129);
                m2482b(a2);
            }
            a2 = d4.m2494a();
            this.f922c.m2491b();
            m2489d((long) a2);
            this.f922c.m2492c();
            i2 = a3.m2527c();
            if (i2 != null) {
                m2486c(192);
                if ((byte) 60 == i2[0] && (byte) 62 == i2[i2.length - 1]) {
                    m2485b(i2);
                } else {
                    String str2 = new String(i2);
                    m2484b(new StringBuilder(String.valueOf(str2).length() + 2).append("<").append(str2).append(">").toString());
                }
            }
            i2 = a3.m2531e();
            if (i2 != null) {
                m2486c(142);
                m2479a(i2);
            }
            int a4 = d3.m2494a();
            i2 = a3.m2523a();
            if (i2 != null) {
                m2480a(i2, 0, i2.length);
                a2 = i2.length;
            } else {
                InputStream inputStream = null;
                try {
                    g = new byte[1024];
                    openInputStream = this.f924e.openInputStream(a3.m2524b());
                    a2 = 0;
                    while (true) {
                        try {
                            int read = openInputStream.read(g);
                            if (read == -1) {
                                break;
                            }
                            this.f920a.write(g, 0, read);
                            this.f921b += read;
                            a2 += read;
                        } catch (FileNotFoundException e2) {
                            inputStream = openInputStream;
                        } catch (IOException e3) {
                        } catch (RuntimeException e4) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (FileNotFoundException e6) {
                } catch (IOException e7) {
                    openInputStream = null;
                } catch (RuntimeException e8) {
                    openInputStream = null;
                } catch (Throwable th3) {
                    openInputStream = null;
                    th = th3;
                }
            }
            if (a2 != d3.m2494a() - a4) {
                throw new RuntimeException("BUG: Length sanity check failed");
            }
            this.f922c.m2491b();
            m2483b((long) a4);
            m2483b((long) a2);
            this.f922c.m2492c();
        }
        return 0;
        return 1;
        if (openInputStream != null) {
            try {
                openInputStream.close();
            } catch (IOException e9) {
            }
        }
        return 1;
        return 1;
        if (openInputStream != null) {
            try {
                openInputStream.close();
            } catch (IOException e10) {
            }
        }
        throw th;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
            }
        }
        return 1;
        throw th;
        if (openInputStream != null) {
            try {
                openInputStream.close();
            } catch (IOException e12) {
            }
        }
        return 1;
        return 1;
    }
}
