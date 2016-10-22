package defpackage;

/* compiled from: PG */
/* renamed from: dkb */
final class dkb {
    private static final String[] a;
    private static final String[] b;
    private static final String[] c;

    dkb() {
    }

    static String a(boolean z, int i, int i2, byte b, byte b2) {
        Object obj;
        String str;
        if (b < a.length) {
            obj = a[b];
        } else {
            String format = String.format("0x%02x", new Object[]{Byte.valueOf(b)});
        }
        if (b2 != null) {
            switch (b) {
                case rq.c /*2*/:
                case rl.e /*3*/:
                case rl.h /*7*/:
                case rl.j /*8*/:
                    str = c[b2];
                    break;
                case rl.f /*4*/:
                case rl.i /*6*/:
                    if (b2 != (byte) 1) {
                        str = c[b2];
                        break;
                    }
                    str = "ACK";
                    break;
                default:
                    str = b2 < b.length ? b[b2] : c[b2];
                    if (b != (byte) 5 || (b2 & 4) == 0) {
                        if (b == null && (b2 & 32) != 0) {
                            str = str.replace("PRIORITY", "COMPRESSED");
                            break;
                        }
                    }
                    str = str.replace("HEADERS", "PUSH_PROMISE");
                    break;
                    break;
            }
        }
        str = "";
        String str2 = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = obj;
        objArr[4] = str;
        return String.format(str2, objArr);
    }

    static {
        int i;
        int i2 = 0;
        a = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        b = new String[64];
        c = new String[256];
        for (i = 0; i < c.length; i++) {
            c[i] = String.format("%8s", new Object[]{Integer.toBinaryString(i)}).replace(' ', '0');
        }
        b[0] = "";
        b[1] = "END_STREAM";
        int[] iArr = new int[]{1};
        b[8] = "PADDED";
        for (i = 0; i <= 0; i++) {
            int i3 = iArr[i];
            b[i3 | 8] = String.valueOf(b[i3]).concat("|PADDED");
        }
        b[4] = "END_HEADERS";
        b[32] = "PRIORITY";
        b[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = new int[]{4, 32, 36};
        for (i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            for (i = 0; i <= 0; i++) {
                int i5 = iArr[i];
                String[] strArr = b;
                int i6 = i5 | i4;
                String valueOf = String.valueOf(b[i5]);
                String valueOf2 = String.valueOf(b[i4]);
                strArr[i6] = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("|").append(valueOf2).toString();
                strArr = b;
                i6 = (i5 | i4) | 8;
                String valueOf3 = String.valueOf(b[i5]);
                valueOf = String.valueOf(b[i4]);
                strArr[i6] = new StringBuilder((String.valueOf(valueOf3).length() + 8) + String.valueOf(valueOf).length()).append(valueOf3).append("|").append(valueOf).append("|PADDED").toString();
            }
        }
        while (i2 < b.length) {
            if (b[i2] == null) {
                b[i2] = c[i2];
            }
            i2++;
        }
    }
}
