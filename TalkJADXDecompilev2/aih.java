package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class aih {
    private static lo<String, Integer> g;
    public ByteArrayOutputStream a = null;
    public int b = 0;
    aii c = null;
    private aid d = null;
    private final ContentResolver e;
    private aim f = null;

    static {
        g = null;
        g = new lo();
        for (int i = 0; i < ail.a.length; i++) {
            g.put(ail.a[i], Integer.valueOf(i));
        }
    }

    public aih(Context context, aid aid) {
        this.d = aid;
        this.e = context.getContentResolver();
        this.f = aid.a();
        this.c = new aii(this);
        this.a = new ByteArrayOutputStream();
        this.b = 0;
    }

    public byte[] a() {
        int i = 0;
        int i2 = 1;
        switch (this.d.b()) {
            case 128:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                c(140);
                c(128);
                c(152);
                byte[] b = this.f.b(152);
                if (b == null) {
                    throw new IllegalArgumentException("Transaction-ID is null.");
                }
                a(b);
                if (e(141) == 0) {
                    e(133);
                    if (e(137) == 0) {
                        if (e(151) != 1) {
                            i = 1;
                        }
                        if (e(130) != 1) {
                            i = 1;
                        }
                        if (e(129) != 1) {
                            i = 1;
                        }
                        if (i != 0) {
                            e(150);
                            e(138);
                            e(136);
                            e(143);
                            e(134);
                            e(144);
                            c(132);
                            i2 = b();
                        }
                    }
                }
                if (i2 != 0) {
                    return null;
                }
                break;
            case 131:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                c(140);
                c(131);
                if (e(152) == 0 && e(141) == 0 && e(149) == 0) {
                    i2 = 0;
                }
                if (i2 != 0) {
                    return null;
                }
                break;
            case 133:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                c(140);
                c(133);
                if (e(152) == 0 && e(141) == 0) {
                    e(145);
                    i2 = 0;
                }
                if (i2 != 0) {
                    return null;
                }
                break;
            case 135:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                c(140);
                c(135);
                if (e(141) == 0 && e(139) == 0 && e(151) == 0 && e(137) == 0) {
                    e(133);
                    if (e(155) == 0) {
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
        return this.a.toByteArray();
    }

    protected void a(byte[] bArr, int i, int i2) {
        this.a.write(bArr, 0, i2);
        this.b += i2;
    }

    protected void a(int i) {
        this.a.write(i);
        this.b++;
    }

    protected void b(int i) {
        a((i | 128) & 255);
    }

    protected void c(int i) {
        a(i);
    }

    protected void d(int i) {
        a(i);
    }

    protected void a(long j) {
        int i = 0;
        long j2 = j;
        int i2 = 0;
        while (j2 != 0 && i2 < 8) {
            j2 >>>= 8;
            i2++;
        }
        d(i2);
        long j3 = (i2 - 1) << 3;
        while (i < i2) {
            a((int) ((j >>> j3) & 255));
            j3 -= 8;
            i++;
        }
    }

    protected void a(byte[] bArr) {
        if ((bArr[0] & 255) > 127) {
            a(127);
        }
        a(bArr, 0, bArr.length);
        a(0);
    }

    protected void a(String str) {
        a(str.getBytes());
    }

    protected void a(aic aic) {
        int a = aic.a();
        byte[] b = aic.b();
        if (b != null) {
            this.c.a();
            aik d = this.c.d();
            b(a);
            a(b);
            a = d.a();
            this.c.b();
            d((long) a);
            this.c.c();
        }
    }

    protected void b(long j) {
        int i = 0;
        long j2 = 127;
        while (i < 5 && j >= j2) {
            j2 = (j2 << 7) | 127;
            i++;
        }
        while (i > 0) {
            a((int) ((((j >>> (i * 7)) & 127) | 128) & 255));
            i--;
        }
        a((int) (j & 127));
    }

    protected void c(long j) {
        a(j);
    }

    protected void d(long j) {
        if (j < 31) {
            d((int) j);
            return;
        }
        a(31);
        b(j);
    }

    protected void b(byte[] bArr) {
        a(34);
        a(bArr, 0, bArr.length);
        a(0);
    }

    protected void b(String str) {
        b(str.getBytes());
    }

    private static aic b(aic aic) {
        try {
            aic aic2;
            String c = aic.c();
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
                    aic2 = new aic(aic.a, aic.b);
                }
                if (1 == r2) {
                    aic2.b("/TYPE=PLMN".getBytes());
                    return aic2;
                } else if (3 == r2) {
                    aic2.b("/TYPE=IPV4".getBytes());
                    return aic2;
                } else if (4 == r2) {
                    return aic2;
                } else {
                    aic2.b("/TYPE=IPV6".getBytes());
                    return aic2;
                }
            }
            Object obj = 5;
            if (aic != null) {
                aic2 = new aic(aic.a, aic.b);
            } else {
                aic2 = null;
            }
            if (1 == obj) {
                aic2.b("/TYPE=PLMN".getBytes());
                return aic2;
            } else if (3 == obj) {
                aic2.b("/TYPE=IPV4".getBytes());
                return aic2;
            } else if (4 == obj) {
                return aic2;
            } else {
                aic2.b("/TYPE=IPV6".getBytes());
                return aic2;
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

    private int e(int i) {
        int a;
        long e;
        byte[] b;
        switch (i) {
            case 129:
            case 130:
            case 151:
                aic[] d = this.f.d(i);
                if (d == null) {
                    return 2;
                }
                for (aic b2 : d) {
                    aic b22 = aih.b(b22);
                    if (b22 == null) {
                        return 1;
                    }
                    c(i);
                    a(b22);
                }
                return 0;
            case 133:
                e = this.f.e(i);
                if (-1 == e) {
                    return 2;
                }
                c(i);
                c(e);
                return 0;
            case 134:
            case 143:
            case 144:
            case 145:
            case 149:
            case 155:
                int a2 = this.f.a(i);
                if (a2 == 0) {
                    return 2;
                }
                c(i);
                c(a2);
                return 0;
            case 136:
                e = this.f.e(i);
                if (-1 == e) {
                    return 2;
                }
                c(i);
                this.c.a();
                aik d2 = this.c.d();
                a(129);
                a(e);
                a = d2.a();
                this.c.b();
                d((long) a);
                this.c.c();
                return 0;
            case 137:
                c(i);
                aic c = this.f.c(i);
                if (c == null || TextUtils.isEmpty(c.c()) || new String(c.b()).equals("insert-address-token")) {
                    a(1);
                    a(129);
                    return 0;
                }
                this.c.a();
                aik d3 = this.c.d();
                a(128);
                c = aih.b(c);
                if (c == null) {
                    return 1;
                }
                a(c);
                a = d3.a();
                this.c.b();
                d((long) a);
                this.c.c();
                return 0;
            case 138:
                b = this.f.b(i);
                if (b == null) {
                    return 2;
                }
                c(i);
                if (Arrays.equals(b, "advertisement".getBytes())) {
                    c(129);
                    return 0;
                } else if (Arrays.equals(b, "auto".getBytes())) {
                    c(131);
                    return 0;
                } else if (Arrays.equals(b, "personal".getBytes())) {
                    c(128);
                    return 0;
                } else if (Arrays.equals(b, "informational".getBytes())) {
                    c(130);
                    return 0;
                } else {
                    a(b);
                    return 0;
                }
            case 139:
            case 152:
                b = this.f.b(i);
                if (b == null) {
                    return 2;
                }
                c(i);
                a(b);
                return 0;
            case 141:
                c(i);
                a = this.f.a(i);
                if (a == 0) {
                    b(18);
                    return 0;
                }
                b(a);
                return 0;
            case 150:
                aic c2 = this.f.c(i);
                if (c2 == null) {
                    return 2;
                }
                c(i);
                a(c2);
                return 0;
            default:
                return 3;
        }
    }

    private int b() {
        InputStream openInputStream;
        Throwable th;
        this.c.a();
        aik d = this.c.d();
        Integer num = (Integer) g.get(new String(this.f.b(132)));
        if (num == null) {
            return 1;
        }
        b(num.intValue());
        aig d2 = ((aiv) this.d).d();
        if (d2 == null || d2.b() == 0) {
            b(0);
            this.c.b();
            this.c.c();
            return 0;
        }
        try {
            aio a = d2.a(0);
            byte[] c = a.c();
            if (c != null) {
                c(138);
                if ((byte) 60 == c[0] && (byte) 62 == c[c.length - 1]) {
                    a(c);
                } else {
                    String str = new String(c);
                    a(new StringBuilder(String.valueOf(str).length() + 2).append("<").append(str).append(">").toString());
                }
            }
            c(137);
            a(a.g());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        int a2 = d.a();
        this.c.b();
        d((long) a2);
        this.c.c();
        int b = d2.b();
        b((long) b);
        for (int i = 0; i < b; i++) {
            aio a3 = d2.a(i);
            this.c.a();
            aik d3 = this.c.d();
            this.c.a();
            aik d4 = this.c.d();
            byte[] g = a3.g();
            if (g == null) {
                return 1;
            }
            num = (Integer) g.get(new String(g));
            if (num == null) {
                a(g);
            } else {
                b(num.intValue());
            }
            byte[] i2 = a3.i();
            if (i2 == null) {
                i2 = a3.j();
                if (i2 == null) {
                    i2 = a3.e();
                    if (i2 == null) {
                        i2 = "smil.xml".getBytes();
                    }
                }
            }
            c(133);
            a(i2);
            a2 = a3.d();
            if (a2 != 0) {
                c(129);
                b(a2);
            }
            a2 = d4.a();
            this.c.b();
            d((long) a2);
            this.c.c();
            i2 = a3.c();
            if (i2 != null) {
                c(192);
                if ((byte) 60 == i2[0] && (byte) 62 == i2[i2.length - 1]) {
                    b(i2);
                } else {
                    String str2 = new String(i2);
                    b(new StringBuilder(String.valueOf(str2).length() + 2).append("<").append(str2).append(">").toString());
                }
            }
            i2 = a3.e();
            if (i2 != null) {
                c(142);
                a(i2);
            }
            int a4 = d3.a();
            i2 = a3.a();
            if (i2 != null) {
                a(i2, 0, i2.length);
                a2 = i2.length;
            } else {
                InputStream inputStream = null;
                try {
                    g = new byte[1024];
                    openInputStream = this.e.openInputStream(a3.b());
                    a2 = 0;
                    while (true) {
                        try {
                            int read = openInputStream.read(g);
                            if (read == -1) {
                                break;
                            }
                            this.a.write(g, 0, read);
                            this.b += read;
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
            if (a2 != d3.a() - a4) {
                throw new RuntimeException("BUG: Length sanity check failed");
            }
            this.c.b();
            b((long) a4);
            b((long) a2);
            this.c.c();
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
