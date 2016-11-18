package p000;

import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ain {
    private static byte[] f938d = null;
    private static byte[] f939e = null;
    private ByteArrayInputStream f940a = null;
    private aim f941b = null;
    private aig f942c = null;

    public ain(byte[] bArr) {
        this.f940a = new ByteArrayInputStream(bArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aid m2518a() {
        if (this.f940a == null) {
            return null;
        }
        this.f941b = m2519a(this.f940a);
        if (this.f941b == null) {
            return null;
        }
        char c;
        int a = this.f941b.m2495a(140);
        aim aim = this.f941b;
        if (aim != null) {
            int a2 = aim.m2495a(140);
            if (aim.m2495a(141) != 0) {
                switch (a2) {
                    case 128:
                        if (aim.m2502b(132) != null) {
                            if (aim.m2503c(137) != null) {
                                if (aim.m2502b(152) == null) {
                                    c = '\u0000';
                                    break;
                                }
                            }
                            c = '\u0000';
                            break;
                        }
                        c = '\u0000';
                        break;
                    case 129:
                        if (aim.m2495a(146) != 0) {
                            if (aim.m2502b(152) == null) {
                                c = '\u0000';
                                break;
                            }
                        }
                        c = '\u0000';
                        break;
                    case 130:
                        if (aim.m2502b(131) != null) {
                            if (-1 != aim.m2505e(136)) {
                                if (aim.m2502b(138) != null) {
                                    if (-1 != aim.m2505e(142)) {
                                        if (aim.m2502b(152) == null) {
                                            c = '\u0000';
                                            break;
                                        }
                                    }
                                    c = '\u0000';
                                    break;
                                }
                                c = '\u0000';
                                break;
                            }
                            c = '\u0000';
                            break;
                        }
                        c = '\u0000';
                        break;
                    case 131:
                        if (aim.m2495a(149) != 0) {
                            if (aim.m2502b(152) == null) {
                                c = '\u0000';
                                break;
                            }
                        }
                        c = '\u0000';
                        break;
                    case 132:
                        if (aim.m2502b(132) != null) {
                            if (-1 == aim.m2505e(133)) {
                                c = '\u0000';
                                break;
                            }
                        }
                        c = '\u0000';
                        break;
                    case 133:
                        if (aim.m2502b(152) == null) {
                            c = '\u0000';
                            break;
                        }
                    case 134:
                        if (-1 != aim.m2505e(133)) {
                            if (aim.m2502b(139) != null) {
                                if (aim.m2495a(149) != 0) {
                                    if (aim.m2504d(151) == null) {
                                        c = '\u0000';
                                        break;
                                    }
                                }
                                c = '\u0000';
                                break;
                            }
                            c = '\u0000';
                            break;
                        }
                        c = '\u0000';
                        break;
                    case 135:
                        if (aim.m2503c(137) != null) {
                            if (aim.m2502b(139) != null) {
                                if (aim.m2495a(155) != 0) {
                                    if (aim.m2504d(151) == null) {
                                        c = '\u0000';
                                        break;
                                    }
                                }
                                c = '\u0000';
                                break;
                            }
                            c = '\u0000';
                            break;
                        }
                        c = '\u0000';
                        break;
                    case 136:
                        if (-1 != aim.m2505e(133)) {
                            if (aim.m2503c(137) != null) {
                                if (aim.m2502b(139) != null) {
                                    if (aim.m2495a(155) != 0) {
                                        if (aim.m2504d(151) == null) {
                                            c = '\u0000';
                                            break;
                                        }
                                    }
                                    c = '\u0000';
                                    break;
                                }
                                c = '\u0000';
                                break;
                            }
                            c = '\u0000';
                            break;
                        }
                        c = '\u0000';
                        break;
                    default:
                        c = '\u0000';
                        break;
                }
            }
            c = '\u0000';
        } else {
            c = '\u0000';
        }
        if (c == '\u0000') {
            return null;
        }
        if (128 == a || 132 == a) {
            this.f942c = ain.m2510b(this.f940a);
            if (this.f942c == null) {
                return null;
            }
        }
        switch (a) {
            case 128:
                return new aiv(this.f941b, this.f942c);
            case 129:
                return new aiu(this.f941b);
            case 130:
                return new aif(this.f941b);
            case 131:
                return new aid(this.f941b, (short) 0);
            case 132:
                aid ait = new ait(this.f941b, this.f942c);
                byte[] g = ait.m2565g();
                if (g == null) {
                    return null;
                }
                String str = new String(g);
                if (str.equals("application/vnd.wap.multipart.mixed") || str.equals("application/vnd.wap.multipart.related") || str.equals("application/vnd.wap.multipart.alternative")) {
                    return ait;
                }
                if (!str.equals("application/vnd.wap.multipart.alternative")) {
                    return null;
                }
                aio a3 = this.f942c.m2467a(0);
                this.f942c.m2468a();
                this.f942c.m2469a(0, a3);
                return ait;
            case 133:
                return new aid(this.f941b, (byte) 0);
            case 134:
                return new aid(this.f941b, '\u0000');
            case 135:
                return new aid(this.f941b, 0);
            case 136:
                return new ais(this.f941b);
            default:
                return null;
        }
    }

    protected aim m2519a(ByteArrayInputStream byteArrayInputStream) {
        int f;
        if (byteArrayInputStream == null) {
            return null;
        }
        int i = 1;
        aim aim = new aim();
        while (i != 0 && byteArrayInputStream.available() > 0) {
            byteArrayInputStream.mark(1);
            int f2 = ain.m2514f(byteArrayInputStream);
            if (f2 < 32 || f2 > 127) {
                byte[] b;
                int indexOf;
                byte[] a;
                aic e;
                switch (f2) {
                    case 129:
                    case 130:
                    case 151:
                        aic e2 = ain.m2513e(byteArrayInputStream);
                        if (e2 != null) {
                            b = e2.m2443b();
                            if (b != null) {
                                String str = new String(b);
                                indexOf = str.indexOf("/");
                                if (indexOf > 0) {
                                    str = str.substring(0, indexOf);
                                }
                                try {
                                    e2.m2441a(str.getBytes());
                                } catch (NullPointerException e3) {
                                    return null;
                                }
                            }
                            try {
                                aim.m2501b(e2, f2);
                                break;
                            } catch (NullPointerException e4) {
                                break;
                            } catch (RuntimeException e5) {
                                new StringBuilder(52).append(f2).append("is not Encoded-String-Value header field!");
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
                        a = ain.m2507a(byteArrayInputStream, 0);
                        if (a != null) {
                            try {
                                aim.m2499a(a, f2);
                                break;
                            } catch (NullPointerException e6) {
                                break;
                            } catch (RuntimeException e7) {
                                new StringBuilder(43).append(f2).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        continue;
                    case 132:
                        SparseArray sparseArray = new SparseArray();
                        byte[] a2 = ain.m2508a(byteArrayInputStream, sparseArray);
                        if (a2 != null) {
                            try {
                                aim.m2499a(a2, 132);
                            } catch (NullPointerException e8) {
                            } catch (RuntimeException e9) {
                                new StringBuilder(43).append(f2).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        f939e = (byte[]) sparseArray.get(153);
                        f938d = (byte[]) sparseArray.get(131);
                        i = 0;
                        break;
                    case 133:
                    case 142:
                    case 159:
                        try {
                            aim.m2497a(ain.m2516h(byteArrayInputStream), f2);
                            break;
                        } catch (RuntimeException e10) {
                            new StringBuilder(44).append(f2).append("is not Long-Integer header field!");
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
                        f = ain.m2514f(byteArrayInputStream);
                        try {
                            aim.m2496a(f, f2);
                            break;
                        } catch (ahy e11) {
                            new StringBuilder(71).append("Set invalid Octet value: ").append(f).append(" into the header filed: ").append(f2);
                            return null;
                        } catch (RuntimeException e12) {
                            new StringBuilder(37).append(f2).append("is not Octet header field!");
                            return null;
                        }
                    case 135:
                    case 136:
                    case 157:
                        ain.m2512d(byteArrayInputStream);
                        indexOf = ain.m2514f(byteArrayInputStream);
                        try {
                            long h = ain.m2516h(byteArrayInputStream);
                            if (129 == indexOf) {
                                h += System.currentTimeMillis() / 1000;
                            }
                            try {
                                aim.m2497a(h, f2);
                                break;
                            } catch (RuntimeException e13) {
                                new StringBuilder(44).append(f2).append("is not Long-Integer header field!");
                                return null;
                            }
                        } catch (RuntimeException e14) {
                            new StringBuilder(44).append(f2).append("is not Long-Integer header field!");
                            return null;
                        }
                    case 137:
                        ain.m2512d(byteArrayInputStream);
                        if (128 == ain.m2514f(byteArrayInputStream)) {
                            e = ain.m2513e(byteArrayInputStream);
                            if (e != null) {
                                b = e.m2443b();
                                if (b != null) {
                                    String str2 = new String(b);
                                    indexOf = str2.indexOf("/");
                                    if (indexOf > 0) {
                                        str2 = str2.substring(0, indexOf);
                                    }
                                    try {
                                        e.m2441a(str2.getBytes());
                                    } catch (NullPointerException e15) {
                                        return null;
                                    }
                                }
                            }
                        }
                        try {
                            e = new aic("insert-address-token".getBytes());
                        } catch (NullPointerException e16) {
                            new StringBuilder(52).append(f2).append("is not Encoded-String-Value header field!");
                            return null;
                        }
                        try {
                            aim.m2498a(e, 137);
                            break;
                        } catch (NullPointerException e17) {
                            break;
                        } catch (RuntimeException e18) {
                            new StringBuilder(52).append(f2).append("is not Encoded-String-Value header field!");
                            return null;
                        }
                    case 138:
                        byteArrayInputStream.mark(1);
                        f = ain.m2514f(byteArrayInputStream);
                        if (f >= 128) {
                            if (128 != f) {
                                if (129 != f) {
                                    if (130 != f) {
                                        if (131 != f) {
                                            break;
                                        }
                                        aim.m2499a("auto".getBytes(), 138);
                                        break;
                                    }
                                    aim.m2499a("informational".getBytes(), 138);
                                    break;
                                }
                                aim.m2499a("advertisement".getBytes(), 138);
                                break;
                            }
                            try {
                                aim.m2499a("personal".getBytes(), 138);
                                break;
                            } catch (NullPointerException e19) {
                                break;
                            } catch (RuntimeException e20) {
                                new StringBuilder(43).append(f2).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        byteArrayInputStream.reset();
                        a = ain.m2507a(byteArrayInputStream, 0);
                        if (a != null) {
                            try {
                                aim.m2499a(a, 138);
                                break;
                            } catch (NullPointerException e21) {
                                break;
                            } catch (RuntimeException e22) {
                                new StringBuilder(43).append(f2).append("is not Text-String header field!");
                                return null;
                            }
                        }
                        continue;
                    case 140:
                        f = ain.m2514f(byteArrayInputStream);
                        switch (f) {
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
                                    aim.m2496a(f, f2);
                                    break;
                                } catch (ahy e23) {
                                    new StringBuilder(71).append("Set invalid Octet value: ").append(f).append(" into the header filed: ").append(f2);
                                    return null;
                                } catch (RuntimeException e24) {
                                    new StringBuilder(37).append(f2).append("is not Octet header field!");
                                    return null;
                                }
                        }
                    case 141:
                        f = ain.m2515g(byteArrayInputStream);
                        try {
                            aim.m2496a(f, 141);
                            break;
                        } catch (ahy e25) {
                            new StringBuilder(71).append("Set invalid Octet value: ").append(f).append(" into the header filed: ").append(f2);
                            return null;
                        } catch (RuntimeException e26) {
                            new StringBuilder(37).append(f2).append("is not Octet header field!");
                            return null;
                        }
                    case 147:
                    case 150:
                    case 154:
                    case 166:
                    case 181:
                    case 182:
                        e = ain.m2513e(byteArrayInputStream);
                        if (e != null) {
                            try {
                                aim.m2498a(e, f2);
                                break;
                            } catch (NullPointerException e27) {
                                break;
                            } catch (RuntimeException e28) {
                                new StringBuilder(52).append(f2).append("is not Encoded-String-Value header field!");
                                return null;
                            }
                        }
                        continue;
                    case 160:
                        ain.m2512d(byteArrayInputStream);
                        try {
                            ain.m2517i(byteArrayInputStream);
                            e = ain.m2513e(byteArrayInputStream);
                            if (e != null) {
                                try {
                                    aim.m2498a(e, 160);
                                    break;
                                } catch (NullPointerException e29) {
                                    break;
                                } catch (RuntimeException e30) {
                                    new StringBuilder(52).append(f2).append("is not Encoded-String-Value header field!");
                                    return null;
                                }
                            }
                            continue;
                        } catch (RuntimeException e31) {
                            new StringBuilder(32).append(f2).append(" is not Integer-Value");
                            return null;
                        }
                    case 161:
                        ain.m2512d(byteArrayInputStream);
                        try {
                            ain.m2517i(byteArrayInputStream);
                            try {
                                aim.m2497a(ain.m2516h(byteArrayInputStream), 161);
                                break;
                            } catch (RuntimeException e32) {
                                new StringBuilder(44).append(f2).append("is not Long-Integer header field!");
                                return null;
                            }
                        } catch (RuntimeException e33) {
                            new StringBuilder(32).append(f2).append(" is not Integer-Value");
                            return null;
                        }
                    case 164:
                        ain.m2512d(byteArrayInputStream);
                        ain.m2514f(byteArrayInputStream);
                        ain.m2513e(byteArrayInputStream);
                        break;
                    case 170:
                    case 172:
                        ain.m2512d(byteArrayInputStream);
                        ain.m2514f(byteArrayInputStream);
                        try {
                            ain.m2517i(byteArrayInputStream);
                            break;
                        } catch (RuntimeException e34) {
                            new StringBuilder(32).append(f2).append(" is not Integer-Value");
                            return null;
                        }
                    case 173:
                    case 175:
                    case 179:
                        try {
                            aim.m2497a(ain.m2517i(byteArrayInputStream), f2);
                            break;
                        } catch (RuntimeException e35) {
                            new StringBuilder(44).append(f2).append("is not Long-Integer header field!");
                            return null;
                        }
                    case 178:
                        ain.m2508a(byteArrayInputStream, null);
                        break;
                    default:
                        break;
                }
            }
            byteArrayInputStream.reset();
            ain.m2507a(byteArrayInputStream, 0);
        }
        return aim;
    }

    private static aig m2510b(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream == null) {
            return null;
        }
        int c = ain.m2511c(byteArrayInputStream);
        aig aig = new aig();
        for (int i = 0; i < c; i++) {
            int c2 = ain.m2511c(byteArrayInputStream);
            int c3 = ain.m2511c(byteArrayInputStream);
            aio aio = new aio();
            int available = byteArrayInputStream.available();
            if (available <= 0) {
                return null;
            }
            aio a;
            byte[] c4;
            int i2;
            SparseArray sparseArray = new SparseArray();
            byte[] a2 = ain.m2508a(byteArrayInputStream, sparseArray);
            if (a2 != null) {
                aio.m2530e(a2);
            } else {
                aio.m2530e(ail.f936a[0].getBytes());
            }
            a2 = (byte[]) sparseArray.get(151);
            if (a2 != null) {
                aio.m2534g(a2);
            }
            Integer num = (Integer) sparseArray.get(129);
            if (num != null) {
                aio.m2520a(num.intValue());
            }
            int available2 = c2 - (available - byteArrayInputStream.available());
            if (available2 > 0) {
                if (!ain.m2506a(byteArrayInputStream, aio, available2)) {
                    return null;
                }
            } else if (available2 < 0) {
                return null;
            }
            if (aio.m2531e() == null && aio.m2538i() == null && aio.m2539j() == null && aio.m2527c() == null) {
                aio.m2526c(Long.toOctalString(System.currentTimeMillis()).getBytes());
            }
            if (c3 > 0) {
                a2 = new byte[c3];
                String str = new String(aio.m2535g());
                byteArrayInputStream.read(a2, 0, c3);
                if (str.equalsIgnoreCase("application/vnd.wap.multipart.alternative")) {
                    a = ain.m2510b(new ByteArrayInputStream(a2)).m2467a(0);
                    if (!(f938d == null && f939e == null)) {
                        if (f939e == null) {
                            c4 = a.m2527c();
                            if (c4 == null && true == Arrays.equals(f939e, c4)) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                        } else if (f938d != null) {
                            c4 = a.m2535g();
                            if (c4 != null && true == Arrays.equals(f938d, c4)) {
                                i2 = 0;
                            }
                        }
                        if (i2 == 0) {
                            aig.m2469a(0, a);
                        } else {
                            aig.m2470a(a);
                        }
                    }
                    i2 = 1;
                    if (i2 == 0) {
                        aig.m2470a(a);
                    } else {
                        aig.m2469a(0, a);
                    }
                } else {
                    byte[] h = aio.m2537h();
                    if (h != null) {
                        String str2 = new String(h);
                        if (str2.equalsIgnoreCase("base64")) {
                            a2 = aia.m2436a(a2);
                        } else if (str2.equalsIgnoreCase("quoted-printable")) {
                            a2 = air.m2560a(a2);
                        }
                    }
                    if (a2 == null) {
                        return null;
                    }
                    aio.m2522a(a2);
                }
            }
            a = aio;
            if (f939e == null) {
                if (f938d != null) {
                    c4 = a.m2535g();
                    i2 = 0;
                }
                i2 = 1;
            } else {
                c4 = a.m2527c();
                if (c4 == null) {
                }
                i2 = 1;
            }
            if (i2 == 0) {
                aig.m2469a(0, a);
            } else {
                aig.m2470a(a);
            }
        }
        return aig;
    }

    private static int m2511c(ByteArrayInputStream byteArrayInputStream) {
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

    private static int m2512d(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & 255;
        if (read <= 30) {
            return read;
        }
        if (read == 31) {
            return ain.m2511c(byteArrayInputStream);
        }
        throw new RuntimeException("Value length > LENGTH_QUOTE!");
    }

    private static aic m2513e(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read() & 255;
        if (read == 0) {
            return null;
        }
        byteArrayInputStream.reset();
        if (read < 32) {
            ain.m2512d(byteArrayInputStream);
            read = ain.m2515g(byteArrayInputStream);
        } else {
            read = 0;
        }
        byte[] a = ain.m2507a(byteArrayInputStream, 0);
        if (read == 0) {
            return new aic(a);
        }
        try {
            return new aic(read, a);
        } catch (Exception e) {
            return null;
        }
    }

    private static byte[] m2507a(ByteArrayInputStream byteArrayInputStream, int i) {
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
                        case 9:
                        case 10:
                        case 13:
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

    private static int m2514f(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 255;
    }

    private static int m2515g(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 127;
    }

    private static long m2516h(ByteArrayInputStream byteArrayInputStream) {
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

    private static long m2517i(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        if (read > 127) {
            return (long) ain.m2515g(byteArrayInputStream);
        }
        return ain.m2516h(byteArrayInputStream);
    }

    private static int m2509b(ByteArrayInputStream byteArrayInputStream, int i) {
        int read = byteArrayInputStream.read(new byte[i], 0, i);
        if (read < i) {
            return -1;
        }
        return read;
    }

    private static byte[] m2508a(ByteArrayInputStream byteArrayInputStream, SparseArray<Object> sparseArray) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        read &= 255;
        if (read < 32) {
            byte[] a;
            int d = ain.m2512d(byteArrayInputStream);
            int available = byteArrayInputStream.available();
            byteArrayInputStream.mark(1);
            read = byteArrayInputStream.read();
            byteArrayInputStream.reset();
            read &= 255;
            if (read >= 32 && read <= 127) {
                a = ain.m2507a(byteArrayInputStream, 0);
            } else if (read > 127) {
                read = ain.m2515g(byteArrayInputStream);
                if (read < ail.f936a.length) {
                    a = ail.f936a[read].getBytes();
                } else {
                    byteArrayInputStream.reset();
                    a = ain.m2507a(byteArrayInputStream, 0);
                }
            } else {
                Log.e("PduParser", "Corrupt content-type");
                return ail.f936a[0].getBytes();
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
                            d = ain.m2514f(byteArrayInputStream);
                            byteArrayInputStream.reset();
                            if ((d <= 32 || d >= 127) && d != 0) {
                                d = (int) ain.m2517i(byteArrayInputStream);
                                if (sparseArray != null) {
                                    sparseArray.put(129, Integer.valueOf(d));
                                }
                            } else {
                                byte[] a3 = ain.m2507a(byteArrayInputStream, 0);
                                try {
                                    sparseArray.put(129, Integer.valueOf(aib.m2437a(new String(a3))));
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
                            d = ain.m2514f(byteArrayInputStream);
                            byteArrayInputStream.reset();
                            if (d > 127) {
                                d = ain.m2515g(byteArrayInputStream);
                                if (d < ail.f936a.length) {
                                    sparseArray.put(131, ail.f936a[d].getBytes());
                                }
                            } else {
                                a2 = ain.m2507a(byteArrayInputStream, 0);
                                if (!(a2 == null || sparseArray == null)) {
                                    sparseArray.put(131, a2);
                                }
                            }
                            d = valueOf.intValue() - (available2 - byteArrayInputStream.available());
                            break;
                        case 133:
                        case 151:
                            a2 = ain.m2507a(byteArrayInputStream, 0);
                            if (!(a2 == null || sparseArray == null)) {
                                sparseArray.put(151, a2);
                            }
                            d = valueOf.intValue() - (available2 - byteArrayInputStream.available());
                            break;
                        case 138:
                        case 153:
                            a2 = ain.m2507a(byteArrayInputStream, 0);
                            if (!(a2 == null || sparseArray == null)) {
                                sparseArray.put(153, a2);
                            }
                            d = valueOf.intValue() - (available2 - byteArrayInputStream.available());
                            break;
                        default:
                            if (-1 != ain.m2509b(byteArrayInputStream, d)) {
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
            return ail.f936a[0].getBytes();
        } else if (read <= 127) {
            return ain.m2507a(byteArrayInputStream, 0);
        } else {
            return ail.f936a[ain.m2515g(byteArrayInputStream)].getBytes();
        }
    }

    private static boolean m2506a(ByteArrayInputStream byteArrayInputStream, aio aio, int i) {
        int available = byteArrayInputStream.available();
        int i2 = i;
        while (i2 > 0) {
            int read = byteArrayInputStream.read();
            i2--;
            byte[] a;
            if (read > 127) {
                switch (read) {
                    case 142:
                        a = ain.m2507a(byteArrayInputStream, 0);
                        if (a != null) {
                            aio.m2526c(a);
                        }
                        i2 = i - (available - byteArrayInputStream.available());
                        break;
                    case 174:
                    case 197:
                        if (!ajf.m2609a().mo2137u()) {
                            break;
                        }
                        i2 = ain.m2512d(byteArrayInputStream);
                        byteArrayInputStream.mark(1);
                        read = byteArrayInputStream.available();
                        int read2 = byteArrayInputStream.read();
                        if (read2 == 128) {
                            aio.m2529d(aio.f943a);
                        } else if (read2 == 129) {
                            aio.m2529d(aio.f944b);
                        } else if (read2 == 130) {
                            aio.m2529d(aio.f945c);
                        } else {
                            byteArrayInputStream.reset();
                            aio.m2529d(ain.m2507a(byteArrayInputStream, 0));
                        }
                        if (read - byteArrayInputStream.available() < i2) {
                            if (byteArrayInputStream.read() == 152) {
                                aio.m2536h(ain.m2507a(byteArrayInputStream, 0));
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
                        a = ain.m2507a(byteArrayInputStream, 1);
                        if (a != null) {
                            aio.m2525b(a);
                        }
                        i2 = i - (available - byteArrayInputStream.available());
                        break;
                    default:
                        if (-1 != ain.m2509b(byteArrayInputStream, i2)) {
                            i2 = 0;
                            break;
                        }
                        Log.e("PduParser", "Corrupt Part headers");
                        return false;
                }
            } else if (read >= 32 && read <= 127) {
                a = ain.m2507a(byteArrayInputStream, 0);
                byte[] a2 = ain.m2507a(byteArrayInputStream, 0);
                if (true == "Content-Transfer-Encoding".equalsIgnoreCase(new String(a))) {
                    aio.m2532f(a2);
                }
                i2 = i - (available - byteArrayInputStream.available());
            } else if (-1 == ain.m2509b(byteArrayInputStream, i2)) {
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
