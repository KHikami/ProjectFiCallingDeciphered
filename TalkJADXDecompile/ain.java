import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ain {
    private static byte[] d;
    private static byte[] e;
    private ByteArrayInputStream a;
    private aim b;
    private aig c;

    static {
        d = null;
        e = null;
    }

    public ain(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new ByteArrayInputStream(bArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aid a() {
        /*
        r10 = this;
        r7 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r8 = -1;
        r6 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0 = 0;
        r2 = 0;
        r1 = r10.a;
        if (r1 != 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r1 = r10.a;
        r1 = r10.a(r1);
        r10.b = r1;
        r1 = r10.b;
        if (r1 == 0) goto L_0x000c;
    L_0x0019:
        r1 = r10.b;
        r3 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r3 = r1.a(r3);
        r1 = r10.b;
        if (r1 != 0) goto L_0x0048;
    L_0x0025:
        r1 = r2;
    L_0x0026:
        if (r1 == 0) goto L_0x000c;
    L_0x0028:
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 == r3) goto L_0x002e;
    L_0x002c:
        if (r7 != r3) goto L_0x003a;
    L_0x002e:
        r1 = r10.a;
        r1 = b(r1);
        r10.c = r1;
        r1 = r10.c;
        if (r1 == 0) goto L_0x000c;
    L_0x003a:
        switch(r3) {
            case 128: goto L_0x003e;
            case 129: goto L_0x0189;
            case 130: goto L_0x0192;
            case 131: goto L_0x019b;
            case 132: goto L_0x01a4;
            case 133: goto L_0x01f7;
            case 134: goto L_0x01ee;
            case 135: goto L_0x0209;
            case 136: goto L_0x0200;
            default: goto L_0x003d;
        };
    L_0x003d:
        goto L_0x000c;
    L_0x003e:
        r0 = new aiv;
        r1 = r10.b;
        r2 = r10.c;
        r0.<init>(r1, r2);
        goto L_0x000c;
    L_0x0048:
        r4 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r4 = r1.a(r4);
        r5 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r5 = r1.a(r5);
        if (r5 != 0) goto L_0x0058;
    L_0x0056:
        r1 = r2;
        goto L_0x0026;
    L_0x0058:
        switch(r4) {
            case 128: goto L_0x005d;
            case 129: goto L_0x0077;
            case 130: goto L_0x0089;
            case 131: goto L_0x00c0;
            case 132: goto L_0x00d4;
            case 133: goto L_0x0118;
            case 134: goto L_0x00ea;
            case 135: goto L_0x015a;
            case 136: goto L_0x0121;
            default: goto L_0x005b;
        };
    L_0x005b:
        r1 = r2;
        goto L_0x0026;
    L_0x005d:
        r4 = r1.b(r7);
        if (r4 != 0) goto L_0x0065;
    L_0x0063:
        r1 = r2;
        goto L_0x0026;
    L_0x0065:
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r4 = r1.c(r4);
        if (r4 != 0) goto L_0x006f;
    L_0x006d:
        r1 = r2;
        goto L_0x0026;
    L_0x006f:
        r1 = r1.b(r6);
        if (r1 != 0) goto L_0x0186;
    L_0x0075:
        r1 = r2;
        goto L_0x0026;
    L_0x0077:
        r4 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r4 = r1.a(r4);
        if (r4 != 0) goto L_0x0081;
    L_0x007f:
        r1 = r2;
        goto L_0x0026;
    L_0x0081:
        r1 = r1.b(r6);
        if (r1 != 0) goto L_0x0186;
    L_0x0087:
        r1 = r2;
        goto L_0x0026;
    L_0x0089:
        r4 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r4 = r1.b(r4);
        if (r4 != 0) goto L_0x0093;
    L_0x0091:
        r1 = r2;
        goto L_0x0026;
    L_0x0093:
        r4 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r4 = r1.e(r4);
        r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x009f;
    L_0x009d:
        r1 = r2;
        goto L_0x0026;
    L_0x009f:
        r4 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r4 = r1.b(r4);
        if (r4 != 0) goto L_0x00aa;
    L_0x00a7:
        r1 = r2;
        goto L_0x0026;
    L_0x00aa:
        r4 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r4 = r1.e(r4);
        r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x00b7;
    L_0x00b4:
        r1 = r2;
        goto L_0x0026;
    L_0x00b7:
        r1 = r1.b(r6);
        if (r1 != 0) goto L_0x0186;
    L_0x00bd:
        r1 = r2;
        goto L_0x0026;
    L_0x00c0:
        r4 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r4 = r1.a(r4);
        if (r4 != 0) goto L_0x00cb;
    L_0x00c8:
        r1 = r2;
        goto L_0x0026;
    L_0x00cb:
        r1 = r1.b(r6);
        if (r1 != 0) goto L_0x0186;
    L_0x00d1:
        r1 = r2;
        goto L_0x0026;
    L_0x00d4:
        r4 = r1.b(r7);
        if (r4 != 0) goto L_0x00dd;
    L_0x00da:
        r1 = r2;
        goto L_0x0026;
    L_0x00dd:
        r4 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r4 = r1.e(r4);
        r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r1 != 0) goto L_0x0186;
    L_0x00e7:
        r1 = r2;
        goto L_0x0026;
    L_0x00ea:
        r4 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r4 = r1.e(r4);
        r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x00f7;
    L_0x00f4:
        r1 = r2;
        goto L_0x0026;
    L_0x00f7:
        r4 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r4 = r1.b(r4);
        if (r4 != 0) goto L_0x0102;
    L_0x00ff:
        r1 = r2;
        goto L_0x0026;
    L_0x0102:
        r4 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r4 = r1.a(r4);
        if (r4 != 0) goto L_0x010d;
    L_0x010a:
        r1 = r2;
        goto L_0x0026;
    L_0x010d:
        r4 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r1 = r1.d(r4);
        if (r1 != 0) goto L_0x0186;
    L_0x0115:
        r1 = r2;
        goto L_0x0026;
    L_0x0118:
        r1 = r1.b(r6);
        if (r1 != 0) goto L_0x0186;
    L_0x011e:
        r1 = r2;
        goto L_0x0026;
    L_0x0121:
        r4 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r4 = r1.e(r4);
        r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x012e;
    L_0x012b:
        r1 = r2;
        goto L_0x0026;
    L_0x012e:
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r4 = r1.c(r4);
        if (r4 != 0) goto L_0x0139;
    L_0x0136:
        r1 = r2;
        goto L_0x0026;
    L_0x0139:
        r4 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r4 = r1.b(r4);
        if (r4 != 0) goto L_0x0144;
    L_0x0141:
        r1 = r2;
        goto L_0x0026;
    L_0x0144:
        r4 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r4 = r1.a(r4);
        if (r4 != 0) goto L_0x014f;
    L_0x014c:
        r1 = r2;
        goto L_0x0026;
    L_0x014f:
        r4 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r1 = r1.d(r4);
        if (r1 != 0) goto L_0x0186;
    L_0x0157:
        r1 = r2;
        goto L_0x0026;
    L_0x015a:
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r4 = r1.c(r4);
        if (r4 != 0) goto L_0x0165;
    L_0x0162:
        r1 = r2;
        goto L_0x0026;
    L_0x0165:
        r4 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r4 = r1.b(r4);
        if (r4 != 0) goto L_0x0170;
    L_0x016d:
        r1 = r2;
        goto L_0x0026;
    L_0x0170:
        r4 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r4 = r1.a(r4);
        if (r4 != 0) goto L_0x017b;
    L_0x0178:
        r1 = r2;
        goto L_0x0026;
    L_0x017b:
        r4 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r1 = r1.d(r4);
        if (r1 != 0) goto L_0x0186;
    L_0x0183:
        r1 = r2;
        goto L_0x0026;
    L_0x0186:
        r1 = 1;
        goto L_0x0026;
    L_0x0189:
        r0 = new aiu;
        r1 = r10.b;
        r0.<init>(r1);
        goto L_0x000c;
    L_0x0192:
        r0 = new aif;
        r1 = r10.b;
        r0.<init>(r1);
        goto L_0x000c;
    L_0x019b:
        r0 = new aid;
        r1 = r10.b;
        r0.<init>(r1, r2);
        goto L_0x000c;
    L_0x01a4:
        r1 = new ait;
        r3 = r10.b;
        r4 = r10.c;
        r1.<init>(r3, r4);
        r3 = r1.g();
        if (r3 == 0) goto L_0x000c;
    L_0x01b3:
        r4 = new java.lang.String;
        r4.<init>(r3);
        r3 = "application/vnd.wap.multipart.mixed";
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x01d0;
    L_0x01c0:
        r3 = "application/vnd.wap.multipart.related";
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x01d0;
    L_0x01c8:
        r3 = "application/vnd.wap.multipart.alternative";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x01d3;
    L_0x01d0:
        r0 = r1;
        goto L_0x000c;
    L_0x01d3:
        r3 = "application/vnd.wap.multipart.alternative";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x000c;
    L_0x01db:
        r0 = r10.c;
        r0 = r0.a(r2);
        r3 = r10.c;
        r3.a();
        r3 = r10.c;
        r3.a(r2, r0);
        r0 = r1;
        goto L_0x000c;
    L_0x01ee:
        r0 = new aid;
        r1 = r10.b;
        r0.<init>(r1, r2);
        goto L_0x000c;
    L_0x01f7:
        r0 = new aid;
        r1 = r10.b;
        r0.<init>(r1, r2);
        goto L_0x000c;
    L_0x0200:
        r0 = new ais;
        r1 = r10.b;
        r0.<init>(r1);
        goto L_0x000c;
    L_0x0209:
        r0 = new aid;
        r1 = r10.b;
        r0.<init>(r1, r2);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: ain.a():aid");
    }

    protected aim a(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream == null) {
            return null;
        }
        int i = 1;
        aim aim = new aim();
        while (i != 0 && byteArrayInputStream.available() > 0) {
            byteArrayInputStream.mark(1);
            int f = f(byteArrayInputStream);
            if (f < 32 || f > 127) {
                byte[] b;
                int indexOf;
                byte[] a;
                int f2;
                aic e;
                switch (f) {
                    case 129:
                    case 130:
                    case 151:
                        aic e2 = e(byteArrayInputStream);
                        if (e2 != null) {
                            b = e2.b();
                            if (b != null) {
                                String str = new String(b);
                                indexOf = str.indexOf("/");
                                if (indexOf > 0) {
                                    str = str.substring(0, indexOf);
                                }
                                try {
                                    e2.a(str.getBytes());
                                } catch (NullPointerException e3) {
                                    return null;
                                }
                            }
                            try {
                                aim.b(e2, f);
                                break;
                            } catch (NullPointerException e4) {
                                break;
                            } catch (RuntimeException e5) {
                                new StringBuilder(52).append(f).append("is not Encoded-String-Value header field!");
                                return null;
                            }
                        }
                        continue;
                    case 131:
                    case 139:
                    case 152:
                    case 158:
                    case 183:
                    case 184:
                    case 185:
                    case 189:
                    case 190:
                        a = a(byteArrayInputStream, 0);
                        if (a != null) {
                            try {
                                aim.a(a, f);
                                break;
                            } catch (NullPointerException e6) {
                                break;
                            } catch (RuntimeException e7) {
                                new StringBuilder(43).append(f).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        continue;
                    case 132:
                        SparseArray sparseArray = new SparseArray();
                        byte[] a2 = a(byteArrayInputStream, sparseArray);
                        if (a2 != null) {
                            try {
                                aim.a(a2, 132);
                            } catch (NullPointerException e8) {
                            } catch (RuntimeException e9) {
                                new StringBuilder(43).append(f).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        e = (byte[]) sparseArray.get(153);
                        d = (byte[]) sparseArray.get(131);
                        i = 0;
                        break;
                    case 133:
                    case 142:
                    case 159:
                        try {
                            aim.a(h(byteArrayInputStream), f);
                            break;
                        } catch (RuntimeException e10) {
                            new StringBuilder(44).append(f).append("is not Long-Integer header field!");
                            return null;
                        }
                    case 134:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 148:
                    case 149:
                    case 153:
                    case 155:
                    case 156:
                    case 162:
                    case 163:
                    case 165:
                    case 167:
                    case 169:
                    case 171:
                    case 177:
                    case 180:
                    case 186:
                    case 187:
                    case 188:
                    case 191:
                        f2 = f(byteArrayInputStream);
                        try {
                            aim.a(f2, f);
                            break;
                        } catch (ahy e11) {
                            new StringBuilder(71).append("Set invalid Octet value: ").append(f2).append(" into the header filed: ").append(f);
                            return null;
                        } catch (RuntimeException e12) {
                            new StringBuilder(37).append(f).append("is not Octet header field!");
                            return null;
                        }
                    case 135:
                    case 136:
                    case 157:
                        d(byteArrayInputStream);
                        indexOf = f(byteArrayInputStream);
                        try {
                            long h = h(byteArrayInputStream);
                            if (129 == indexOf) {
                                h += System.currentTimeMillis() / 1000;
                            }
                            try {
                                aim.a(h, f);
                                break;
                            } catch (RuntimeException e13) {
                                new StringBuilder(44).append(f).append("is not Long-Integer header field!");
                                return null;
                            }
                        } catch (RuntimeException e14) {
                            new StringBuilder(44).append(f).append("is not Long-Integer header field!");
                            return null;
                        }
                    case 137:
                        d(byteArrayInputStream);
                        if (128 == f(byteArrayInputStream)) {
                            e = e(byteArrayInputStream);
                            if (e != null) {
                                b = e.b();
                                if (b != null) {
                                    String str2 = new String(b);
                                    indexOf = str2.indexOf("/");
                                    if (indexOf > 0) {
                                        str2 = str2.substring(0, indexOf);
                                    }
                                    try {
                                        e.a(str2.getBytes());
                                    } catch (NullPointerException e15) {
                                        return null;
                                    }
                                }
                            }
                        }
                        try {
                            e = new aic("insert-address-token".getBytes());
                        } catch (NullPointerException e16) {
                            new StringBuilder(52).append(f).append("is not Encoded-String-Value header field!");
                            return null;
                        }
                        try {
                            aim.a(e, 137);
                            break;
                        } catch (NullPointerException e17) {
                            break;
                        } catch (RuntimeException e18) {
                            new StringBuilder(52).append(f).append("is not Encoded-String-Value header field!");
                            return null;
                        }
                    case 138:
                        byteArrayInputStream.mark(1);
                        f2 = f(byteArrayInputStream);
                        if (f2 >= 128) {
                            if (128 != f2) {
                                if (129 != f2) {
                                    if (130 != f2) {
                                        if (131 != f2) {
                                            break;
                                        }
                                        aim.a("auto".getBytes(), 138);
                                        break;
                                    }
                                    aim.a("informational".getBytes(), 138);
                                    break;
                                }
                                aim.a("advertisement".getBytes(), 138);
                                break;
                            }
                            try {
                                aim.a("personal".getBytes(), 138);
                                break;
                            } catch (NullPointerException e19) {
                                break;
                            } catch (RuntimeException e20) {
                                new StringBuilder(43).append(f).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        byteArrayInputStream.reset();
                        a = a(byteArrayInputStream, 0);
                        if (a != null) {
                            try {
                                aim.a(a, 138);
                                break;
                            } catch (NullPointerException e21) {
                                break;
                            } catch (RuntimeException e22) {
                                new StringBuilder(43).append(f).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        continue;
                    case 140:
                        f2 = f(byteArrayInputStream);
                        switch (f2) {
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            case 151:
                                return null;
                            default:
                                try {
                                    aim.a(f2, f);
                                    break;
                                } catch (ahy e23) {
                                    new StringBuilder(71).append("Set invalid Octet value: ").append(f2).append(" into the header filed: ").append(f);
                                    return null;
                                } catch (RuntimeException e24) {
                                    new StringBuilder(37).append(f).append("is not Octet header field!");
                                    return null;
                                }
                        }
                    case 141:
                        f2 = g(byteArrayInputStream);
                        try {
                            aim.a(f2, 141);
                            break;
                        } catch (ahy e25) {
                            new StringBuilder(71).append("Set invalid Octet value: ").append(f2).append(" into the header filed: ").append(f);
                            return null;
                        } catch (RuntimeException e26) {
                            new StringBuilder(37).append(f).append("is not Octet header field!");
                            return null;
                        }
                    case 147:
                    case 150:
                    case 154:
                    case 166:
                    case 181:
                    case 182:
                        e = e(byteArrayInputStream);
                        if (e != null) {
                            try {
                                aim.a(e, f);
                                break;
                            } catch (NullPointerException e27) {
                                break;
                            } catch (RuntimeException e28) {
                                new StringBuilder(52).append(f).append("is not Encoded-String-Value header field!");
                                return null;
                            }
                        }
                        continue;
                    case 160:
                        d(byteArrayInputStream);
                        try {
                            i(byteArrayInputStream);
                            e = e(byteArrayInputStream);
                            if (e != null) {
                                try {
                                    aim.a(e, 160);
                                    break;
                                } catch (NullPointerException e29) {
                                    break;
                                } catch (RuntimeException e30) {
                                    new StringBuilder(52).append(f).append("is not Encoded-String-Value header field!");
                                    return null;
                                }
                            }
                            continue;
                        } catch (RuntimeException e31) {
                            new StringBuilder(32).append(f).append(" is not Integer-Value");
                            return null;
                        }
                    case 161:
                        d(byteArrayInputStream);
                        try {
                            i(byteArrayInputStream);
                            try {
                                aim.a(h(byteArrayInputStream), 161);
                                break;
                            } catch (RuntimeException e32) {
                                new StringBuilder(44).append(f).append("is not Long-Integer header field!");
                                return null;
                            }
                        } catch (RuntimeException e33) {
                            new StringBuilder(32).append(f).append(" is not Integer-Value");
                            return null;
                        }
                    case 164:
                        d(byteArrayInputStream);
                        f(byteArrayInputStream);
                        e(byteArrayInputStream);
                        break;
                    case 170:
                    case 172:
                        d(byteArrayInputStream);
                        f(byteArrayInputStream);
                        try {
                            i(byteArrayInputStream);
                            break;
                        } catch (RuntimeException e34) {
                            new StringBuilder(32).append(f).append(" is not Integer-Value");
                            return null;
                        }
                    case 173:
                    case 175:
                    case 179:
                        try {
                            aim.a(i(byteArrayInputStream), f);
                            break;
                        } catch (RuntimeException e35) {
                            new StringBuilder(44).append(f).append("is not Long-Integer header field!");
                            return null;
                        }
                    case 178:
                        a(byteArrayInputStream, null);
                        break;
                    default:
                        break;
                }
            }
            byteArrayInputStream.reset();
            a(byteArrayInputStream, 0);
        }
        return aim;
    }

    private static aig b(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream == null) {
            return null;
        }
        int c = c(byteArrayInputStream);
        aig aig = new aig();
        for (int i = 0; i < c; i++) {
            int c2 = c(byteArrayInputStream);
            int c3 = c(byteArrayInputStream);
            aio aio = new aio();
            int available = byteArrayInputStream.available();
            if (available <= 0) {
                return null;
            }
            aio a;
            byte[] c4;
            int i2;
            SparseArray sparseArray = new SparseArray();
            byte[] a2 = a(byteArrayInputStream, sparseArray);
            if (a2 != null) {
                aio.e(a2);
            } else {
                aio.e(ail.a[0].getBytes());
            }
            a2 = (byte[]) sparseArray.get(151);
            if (a2 != null) {
                aio.g(a2);
            }
            Integer num = (Integer) sparseArray.get(129);
            if (num != null) {
                aio.a(num.intValue());
            }
            int available2 = c2 - (available - byteArrayInputStream.available());
            if (available2 > 0) {
                if (!a(byteArrayInputStream, aio, available2)) {
                    return null;
                }
            } else if (available2 < 0) {
                return null;
            }
            if (aio.e() == null && aio.i() == null && aio.j() == null && aio.c() == null) {
                aio.c(Long.toOctalString(System.currentTimeMillis()).getBytes());
            }
            if (c3 > 0) {
                a2 = new byte[c3];
                String str = new String(aio.g());
                byteArrayInputStream.read(a2, 0, c3);
                if (str.equalsIgnoreCase("application/vnd.wap.multipart.alternative")) {
                    a = b(new ByteArrayInputStream(a2)).a(0);
                    if (!(d == null && e == null)) {
                        if (e == null) {
                            c4 = a.c();
                            if (c4 == null && true == Arrays.equals(e, c4)) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                        } else if (d != null) {
                            c4 = a.g();
                            if (c4 != null && true == Arrays.equals(d, c4)) {
                                i2 = 0;
                            }
                        }
                        if (i2 == 0) {
                            aig.a(0, a);
                        } else {
                            aig.a(a);
                        }
                    }
                    i2 = 1;
                    if (i2 == 0) {
                        aig.a(a);
                    } else {
                        aig.a(0, a);
                    }
                } else {
                    byte[] h = aio.h();
                    if (h != null) {
                        String str2 = new String(h);
                        if (str2.equalsIgnoreCase("base64")) {
                            a2 = aia.a(a2);
                        } else if (str2.equalsIgnoreCase("quoted-printable")) {
                            a2 = air.a(a2);
                        }
                    }
                    if (a2 == null) {
                        return null;
                    }
                    aio.a(a2);
                }
            }
            a = aio;
            if (e == null) {
                if (d != null) {
                    c4 = a.g();
                    i2 = 0;
                }
                i2 = 1;
            } else {
                c4 = a.c();
                if (c4 == null) {
                }
                i2 = 1;
            }
            if (i2 == 0) {
                aig.a(0, a);
            } else {
                aig.a(a);
            }
        }
        return aig;
    }

    private static int c(ByteArrayInputStream byteArrayInputStream) {
        int i = 0;
        int read = byteArrayInputStream.read();
        if (read == -1) {
            return read;
        }
        while ((read & 128) != 0) {
            i = (i << 7) | (read & 127);
            read = byteArrayInputStream.read();
            if (read == -1) {
                return read;
            }
        }
        return (read & 127) | (i << 7);
    }

    private static int d(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & 255;
        if (read <= 30) {
            return read;
        }
        if (read == 31) {
            return c(byteArrayInputStream);
        }
        throw new RuntimeException("Value length > LENGTH_QUOTE!");
    }

    private static aic e(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read() & 255;
        if (read == 0) {
            return null;
        }
        byteArrayInputStream.reset();
        if (read < 32) {
            d(byteArrayInputStream);
            read = g(byteArrayInputStream);
        } else {
            read = 0;
        }
        byte[] a = a(byteArrayInputStream, 0);
        if (read == 0) {
            return new aic(a);
        }
        try {
            return new aic(read, a);
        } catch (Exception e) {
            return null;
        }
    }

    private static byte[] a(ByteArrayInputStream byteArrayInputStream, int i) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        if (1 == i && 34 == read) {
            byteArrayInputStream.mark(1);
        } else if (i == 0 && 127 == read) {
            byteArrayInputStream.mark(1);
        } else {
            byteArrayInputStream.reset();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read2 = byteArrayInputStream.read();
        while (-1 != read2 && read2 != 0) {
            if (i == 2) {
                if (read2 >= 33 && read2 <= 126) {
                    switch (read2) {
                        case 34:
                        case 40:
                        case 41:
                        case 44:
                        case 47:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 91:
                        case 92:
                        case 93:
                        case 123:
                        case 125:
                            read = 0;
                            break;
                        default:
                            read = 1;
                            break;
                    }
                }
                read = 0;
                if (read != 0) {
                    byteArrayOutputStream.write(read2);
                }
            } else {
                if ((read2 < 32 || read2 > 126) && (read2 < 128 || read2 > 255)) {
                    switch (read2) {
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dD /*13*/:
                            read = 1;
                            break;
                        default:
                            read = 0;
                            break;
                    }
                }
                read = 1;
                if (read != 0) {
                    byteArrayOutputStream.write(read2);
                }
            }
            read2 = byteArrayInputStream.read();
        }
        if (byteArrayOutputStream.size() > 0) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    private static int f(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 255;
    }

    private static int g(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 127;
    }

    private static long h(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & 255;
        if (read > 8) {
            throw new RuntimeException("Octet count greater than 8 and I can't represent that!");
        }
        long j = 0;
        for (int i = 0; i < read; i++) {
            j = (j << 8) + ((long) (byteArrayInputStream.read() & 255));
        }
        return j;
    }

    private static long i(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        if (read > 127) {
            return (long) g(byteArrayInputStream);
        }
        return h(byteArrayInputStream);
    }

    private static int b(ByteArrayInputStream byteArrayInputStream, int i) {
        int read = byteArrayInputStream.read(new byte[i], 0, i);
        if (read < i) {
            return -1;
        }
        return read;
    }

    private static byte[] a(ByteArrayInputStream byteArrayInputStream, SparseArray<Object> sparseArray) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        read &= 255;
        if (read < 32) {
            byte[] a;
            int d = d(byteArrayInputStream);
            int available = byteArrayInputStream.available();
            byteArrayInputStream.mark(1);
            read = byteArrayInputStream.read();
            byteArrayInputStream.reset();
            read &= 255;
            if (read >= 32 && read <= 127) {
                a = a(byteArrayInputStream, 0);
            } else if (read > 127) {
                read = g(byteArrayInputStream);
                if (read < ail.a.length) {
                    a = ail.a[read].getBytes();
                } else {
                    byteArrayInputStream.reset();
                    a = a(byteArrayInputStream, 0);
                }
            } else {
                Log.e("PduParser", "Corrupt content-type");
                return ail.a[0].getBytes();
            }
            available = d - (available - byteArrayInputStream.available());
            if (available > 0) {
                Integer valueOf = Integer.valueOf(available);
                int available2 = byteArrayInputStream.available();
                d = valueOf.intValue();
                while (d > 0) {
                    d--;
                    Object a2;
                    switch (byteArrayInputStream.read()) {
                        case 129:
                            byteArrayInputStream.mark(1);
                            d = f(byteArrayInputStream);
                            byteArrayInputStream.reset();
                            if ((d <= 32 || d >= 127) && d != 0) {
                                d = (int) i(byteArrayInputStream);
                                if (sparseArray != null) {
                                    sparseArray.put(129, Integer.valueOf(d));
                                }
                            } else {
                                byte[] a3 = a(byteArrayInputStream, 0);
                                try {
                                    sparseArray.put(129, Integer.valueOf(aib.a(new String(a3))));
                                } catch (Throwable e) {
                                    Log.e("PduParser", Arrays.toString(a3), e);
                                    sparseArray.put(129, Integer.valueOf(0));
                                }
                            }
                            d = valueOf.intValue() - (available2 - byteArrayInputStream.available());
                            break;
                        case 131:
                        case 137:
                            byteArrayInputStream.mark(1);
                            d = f(byteArrayInputStream);
                            byteArrayInputStream.reset();
                            if (d > 127) {
                                d = g(byteArrayInputStream);
                                if (d < ail.a.length) {
                                    sparseArray.put(131, ail.a[d].getBytes());
                                }
                            } else {
                                a2 = a(byteArrayInputStream, 0);
                                if (!(a2 == null || sparseArray == null)) {
                                    sparseArray.put(131, a2);
                                }
                            }
                            d = valueOf.intValue() - (available2 - byteArrayInputStream.available());
                            break;
                        case 133:
                        case 151:
                            a2 = a(byteArrayInputStream, 0);
                            if (!(a2 == null || sparseArray == null)) {
                                sparseArray.put(151, a2);
                            }
                            d = valueOf.intValue() - (available2 - byteArrayInputStream.available());
                            break;
                        case 138:
                        case 153:
                            a2 = a(byteArrayInputStream, 0);
                            if (!(a2 == null || sparseArray == null)) {
                                sparseArray.put(153, a2);
                            }
                            d = valueOf.intValue() - (available2 - byteArrayInputStream.available());
                            break;
                        default:
                            if (-1 != b(byteArrayInputStream, d)) {
                                d = 0;
                                break;
                            }
                            Log.e("PduParser", "Corrupt Content-Type");
                            break;
                    }
                }
                if (d != 0) {
                    Log.e("PduParser", "Corrupt Content-Type");
                }
            }
            if (available >= 0) {
                return a;
            }
            Log.e("PduParser", "Corrupt MMS message");
            return ail.a[0].getBytes();
        } else if (read <= 127) {
            return a(byteArrayInputStream, 0);
        } else {
            return ail.a[g(byteArrayInputStream)].getBytes();
        }
    }

    private static boolean a(ByteArrayInputStream byteArrayInputStream, aio aio, int i) {
        int available = byteArrayInputStream.available();
        int i2 = i;
        while (i2 > 0) {
            int read = byteArrayInputStream.read();
            i2--;
            byte[] a;
            if (read > 127) {
                switch (read) {
                    case 142:
                        a = a(byteArrayInputStream, 0);
                        if (a != null) {
                            aio.c(a);
                        }
                        i2 = i - (available - byteArrayInputStream.available());
                        break;
                    case 174:
                    case 197:
                        if (!ajf.a().u()) {
                            break;
                        }
                        i2 = d(byteArrayInputStream);
                        byteArrayInputStream.mark(1);
                        read = byteArrayInputStream.available();
                        int read2 = byteArrayInputStream.read();
                        if (read2 == 128) {
                            aio.d(aio.a);
                        } else if (read2 == 129) {
                            aio.d(aio.b);
                        } else if (read2 == 130) {
                            aio.d(aio.c);
                        } else {
                            byteArrayInputStream.reset();
                            aio.d(a(byteArrayInputStream, 0));
                        }
                        if (read - byteArrayInputStream.available() < i2) {
                            if (byteArrayInputStream.read() == 152) {
                                aio.h(a(byteArrayInputStream, 0));
                            }
                            read2 = byteArrayInputStream.available();
                            if (read - read2 < i2) {
                                i2 -= read - read2;
                                byteArrayInputStream.read(new byte[i2], 0, i2);
                            }
                        }
                        i2 = i - (available - byteArrayInputStream.available());
                        break;
                    case 192:
                        a = a(byteArrayInputStream, 1);
                        if (a != null) {
                            aio.b(a);
                        }
                        i2 = i - (available - byteArrayInputStream.available());
                        break;
                    default:
                        if (-1 != b(byteArrayInputStream, i2)) {
                            i2 = 0;
                            break;
                        }
                        Log.e("PduParser", "Corrupt Part headers");
                        return false;
                }
            } else if (read >= 32 && read <= 127) {
                a = a(byteArrayInputStream, 0);
                byte[] a2 = a(byteArrayInputStream, 0);
                if (true == "Content-Transfer-Encoding".equalsIgnoreCase(new String(a))) {
                    aio.f(a2);
                }
                i2 = i - (available - byteArrayInputStream.available());
            } else if (-1 == b(byteArrayInputStream, i2)) {
                Log.e("PduParser", "Corrupt Part headers");
                return false;
            } else {
                i2 = 0;
            }
        }
        if (i2 == 0) {
            return true;
        }
        Log.e("PduParser", "Corrupt Part headers");
        return false;
    }
}
