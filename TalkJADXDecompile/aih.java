import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class aih {
    private static lo<String, Integer> g;
    public ByteArrayOutputStream a;
    public int b;
    aii c;
    private aid d;
    private final ContentResolver e;
    private aim f;

    static {
        g = null;
        g = new lo();
        for (int i = 0; i < ail.a.length; i++) {
            g.put(ail.a[i], Integer.valueOf(i));
        }
    }

    public aih(Context context, aid aid) {
        this.a = null;
        this.d = null;
        this.b = 0;
        this.c = null;
        this.f = null;
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
                    aic b22 = b(b22);
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
                c = b(c);
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b() {
        /*
        r15 = this;
        r14 = 62;
        r13 = 60;
        r1 = 1;
        r2 = 0;
        r0 = r15.c;
        r0.a();
        r0 = r15.c;
        r3 = r0.d();
        r0 = new java.lang.String;
        r4 = r15.f;
        r5 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r4 = r4.b(r5);
        r0.<init>(r4);
        r4 = g;
        r0 = r4.get(r0);
        r0 = (java.lang.Integer) r0;
        if (r0 != 0) goto L_0x002a;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        return r0;
    L_0x002a:
        r0 = r0.intValue();
        r15.b(r0);
        r0 = r15.d;
        r0 = (aiv) r0;
        r5 = r0.d();
        if (r5 == 0) goto L_0x0041;
    L_0x003b:
        r0 = r5.b();
        if (r0 != 0) goto L_0x0052;
    L_0x0041:
        r0 = 0;
        r15.b(r0);
        r0 = r15.c;
        r0.b();
        r0 = r15.c;
        r0.c();
        r0 = r2;
        goto L_0x0029;
    L_0x0052:
        r0 = 0;
        r0 = r5.a(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r4 = r0.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        if (r4 == 0) goto L_0x0071;
    L_0x005d:
        r6 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r15.c(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r6 = 0;
        r6 = r4[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        if (r13 != r6) goto L_0x00bd;
    L_0x0067:
        r6 = r4.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r6 = r6 + -1;
        r6 = r4[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        if (r14 != r6) goto L_0x00bd;
    L_0x006e:
        r15.a(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
    L_0x0071:
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r15.c(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r0 = r0.g();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r15.a(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
    L_0x007d:
        r0 = r3.a();
        r3 = r15.c;
        r3.b();
        r6 = (long) r0;
        r15.d(r6);
        r0 = r15.c;
        r0.c();
        r6 = r5.b();
        r8 = (long) r6;
        r15.b(r8);
        r4 = r2;
    L_0x0098:
        if (r4 >= r6) goto L_0x0223;
    L_0x009a:
        r3 = r5.a(r4);
        r0 = r15.c;
        r0.a();
        r0 = r15.c;
        r7 = r0.d();
        r0 = r15.c;
        r0.a();
        r0 = r15.c;
        r8 = r0.d();
        r9 = r3.g();
        if (r9 != 0) goto L_0x00ee;
    L_0x00ba:
        r0 = r1;
        goto L_0x0029;
    L_0x00bd:
        r6 = new java.lang.String;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r6.<init>(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r4 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r7 = java.lang.String.valueOf(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r7 = r7.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r7 = r7 + 2;
        r4.<init>(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r7 = "<";
        r4 = r4.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r4 = r4.append(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r6 = ">";
        r4 = r4.append(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r4 = r4.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        r15.a(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e9 }
        goto L_0x0071;
    L_0x00e9:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x007d;
    L_0x00ee:
        r0 = g;
        r10 = new java.lang.String;
        r10.<init>(r9);
        r0 = r0.get(r10);
        r0 = (java.lang.Integer) r0;
        if (r0 != 0) goto L_0x0185;
    L_0x00fd:
        r15.a(r9);
    L_0x0100:
        r0 = r3.i();
        if (r0 != 0) goto L_0x0118;
    L_0x0106:
        r0 = r3.j();
        if (r0 != 0) goto L_0x0118;
    L_0x010c:
        r0 = r3.e();
        if (r0 != 0) goto L_0x0118;
    L_0x0112:
        r0 = "smil.xml";
        r0 = r0.getBytes();
    L_0x0118:
        r9 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r15.c(r9);
        r15.a(r0);
        r0 = r3.d();
        if (r0 == 0) goto L_0x012e;
    L_0x0126:
        r9 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r15.c(r9);
        r15.b(r0);
    L_0x012e:
        r0 = r8.a();
        r8 = r15.c;
        r8.b();
        r8 = (long) r0;
        r15.d(r8);
        r0 = r15.c;
        r0.c();
        r0 = r3.c();
        if (r0 == 0) goto L_0x0159;
    L_0x0146:
        r8 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r15.c(r8);
        r8 = r0[r2];
        if (r13 != r8) goto L_0x018e;
    L_0x014f:
        r8 = r0.length;
        r8 = r8 + -1;
        r8 = r0[r8];
        if (r14 != r8) goto L_0x018e;
    L_0x0156:
        r15.b(r0);
    L_0x0159:
        r0 = r3.e();
        if (r0 == 0) goto L_0x0167;
    L_0x015f:
        r8 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r15.c(r8);
        r15.a(r0);
    L_0x0167:
        r8 = r7.a();
        r0 = r3.a();
        if (r0 == 0) goto L_0x01ba;
    L_0x0171:
        r3 = r0.length;
        r15.a(r0, r2, r3);
        r0 = r0.length;
    L_0x0176:
        r3 = r7.a();
        r3 = r3 - r8;
        if (r0 == r3) goto L_0x020c;
    L_0x017d:
        r0 = new java.lang.RuntimeException;
        r1 = "BUG: Length sanity check failed";
        r0.<init>(r1);
        throw r0;
    L_0x0185:
        r0 = r0.intValue();
        r15.b(r0);
        goto L_0x0100;
    L_0x018e:
        r8 = new java.lang.String;
        r8.<init>(r0);
        r0 = new java.lang.StringBuilder;
        r9 = java.lang.String.valueOf(r8);
        r9 = r9.length();
        r9 = r9 + 2;
        r0.<init>(r9);
        r9 = "<";
        r0 = r0.append(r9);
        r0 = r0.append(r8);
        r8 = ">";
        r0 = r0.append(r8);
        r0 = r0.toString();
        r15.b(r0);
        goto L_0x0159;
    L_0x01ba:
        r0 = 0;
        r9 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r9 = new byte[r9];	 Catch:{ FileNotFoundException -> 0x01e6, IOException -> 0x01ef, RuntimeException -> 0x01f9, all -> 0x0203 }
        r10 = r15.e;	 Catch:{ FileNotFoundException -> 0x01e6, IOException -> 0x01ef, RuntimeException -> 0x01f9, all -> 0x0203 }
        r3 = r3.b();	 Catch:{ FileNotFoundException -> 0x01e6, IOException -> 0x01ef, RuntimeException -> 0x01f9, all -> 0x0203 }
        r3 = r10.openInputStream(r3);	 Catch:{ FileNotFoundException -> 0x01e6, IOException -> 0x01ef, RuntimeException -> 0x01f9, all -> 0x0203 }
        r0 = r2;
    L_0x01ca:
        r10 = r3.read(r9);	 Catch:{ FileNotFoundException -> 0x0234, IOException -> 0x0232, RuntimeException -> 0x0230, all -> 0x022e }
        r11 = -1;
        if (r10 == r11) goto L_0x01de;
    L_0x01d1:
        r11 = r15.a;	 Catch:{ FileNotFoundException -> 0x0234, IOException -> 0x0232, RuntimeException -> 0x0230, all -> 0x022e }
        r12 = 0;
        r11.write(r9, r12, r10);	 Catch:{ FileNotFoundException -> 0x0234, IOException -> 0x0232, RuntimeException -> 0x0230, all -> 0x022e }
        r11 = r15.b;	 Catch:{ FileNotFoundException -> 0x0234, IOException -> 0x0232, RuntimeException -> 0x0230, all -> 0x022e }
        r11 = r11 + r10;
        r15.b = r11;	 Catch:{ FileNotFoundException -> 0x0234, IOException -> 0x0232, RuntimeException -> 0x0230, all -> 0x022e }
        r0 = r0 + r10;
        goto L_0x01ca;
    L_0x01de:
        if (r3 == 0) goto L_0x0176;
    L_0x01e0:
        r3.close();	 Catch:{ IOException -> 0x01e4 }
        goto L_0x0176;
    L_0x01e4:
        r3 = move-exception;
        goto L_0x0176;
    L_0x01e6:
        r2 = move-exception;
    L_0x01e7:
        if (r0 == 0) goto L_0x01ec;
    L_0x01e9:
        r0.close();	 Catch:{ IOException -> 0x0226 }
    L_0x01ec:
        r0 = r1;
        goto L_0x0029;
    L_0x01ef:
        r2 = move-exception;
        r3 = r0;
    L_0x01f1:
        if (r3 == 0) goto L_0x01f6;
    L_0x01f3:
        r3.close();	 Catch:{ IOException -> 0x0228 }
    L_0x01f6:
        r0 = r1;
        goto L_0x0029;
    L_0x01f9:
        r2 = move-exception;
        r3 = r0;
    L_0x01fb:
        if (r3 == 0) goto L_0x0200;
    L_0x01fd:
        r3.close();	 Catch:{ IOException -> 0x022a }
    L_0x0200:
        r0 = r1;
        goto L_0x0029;
    L_0x0203:
        r1 = move-exception;
        r3 = r0;
        r0 = r1;
    L_0x0206:
        if (r3 == 0) goto L_0x020b;
    L_0x0208:
        r3.close();	 Catch:{ IOException -> 0x022c }
    L_0x020b:
        throw r0;
    L_0x020c:
        r3 = r15.c;
        r3.b();
        r8 = (long) r8;
        r15.b(r8);
        r8 = (long) r0;
        r15.b(r8);
        r0 = r15.c;
        r0.c();
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x0098;
    L_0x0223:
        r0 = r2;
        goto L_0x0029;
    L_0x0226:
        r0 = move-exception;
        goto L_0x01ec;
    L_0x0228:
        r0 = move-exception;
        goto L_0x01f6;
    L_0x022a:
        r0 = move-exception;
        goto L_0x0200;
    L_0x022c:
        r1 = move-exception;
        goto L_0x020b;
    L_0x022e:
        r0 = move-exception;
        goto L_0x0206;
    L_0x0230:
        r0 = move-exception;
        goto L_0x01fb;
    L_0x0232:
        r0 = move-exception;
        goto L_0x01f1;
    L_0x0234:
        r0 = move-exception;
        r0 = r3;
        goto L_0x01e7;
        */
        throw new UnsupportedOperationException("Method not decompiled: aih.b():int");
    }
}
