package defpackage;

import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

final class gjp extends HandlerThread implements Callback {
    public gjp() {
        super("GifDecoder");
    }

    public boolean handleMessage(Message message) {
        gjo gjo = (gjo) message.obj;
        if (gjo == null || gjo.z == null || gjo.C) {
            return true;
        }
        switch (message.what) {
            case 10:
                break;
            case 12:
                gjo.L = gjo.I;
                gjo.w = false;
                gjo.y = 0;
                gjo.p = 0;
                return true;
            default:
                return false;
        }
        do {
            try {
                int i;
                int i2;
                int i3;
                int i4;
                switch (gjo.p) {
                    case 0:
                    case 1:
                        gjo.w = false;
                        break;
                    case 2:
                        gjo.w = false;
                        i = 0;
                        if (!gjo.q) {
                            i = gjo.d;
                        }
                        for (i2 = 0; i2 < gjo.m; i2++) {
                            i3 = ((gjo.k + i2) * gjo.F) + gjo.j;
                            i4 = gjo.l + i3;
                            while (i3 < i4) {
                                gjo.H[i3] = i;
                                i3++;
                            }
                        }
                        break;
                    case 3:
                        if (gjo.w) {
                            System.arraycopy(gjo.x, 0, gjo.H, 0, gjo.x.length);
                            break;
                        }
                        break;
                }
                gjo.p = 0;
                gjo.q = false;
                gjo.D = false;
                gjo.A = 100;
                gjo.g = null;
                while (true) {
                    byte[] bArr = gjo.E;
                    i3 = gjo.L;
                    gjo.L = i3 + 1;
                    switch (bArr[i3] & 255) {
                        case 0:
                            break;
                        case 33:
                            bArr = gjo.E;
                            i3 = gjo.L;
                            gjo.L = i3 + 1;
                            switch (bArr[i3] & 255) {
                                case 1:
                                    gjo.m();
                                    break;
                                case 249:
                                    gjo.L++;
                                    bArr = gjo.E;
                                    i3 = gjo.L;
                                    gjo.L = i3 + 1;
                                    i = bArr[i3] & 255;
                                    gjo.p = (i & 28) >> 2;
                                    gjo.q = (i & 1) != 0;
                                    gjo.A = gjo.l() * 10;
                                    if (gjo.A <= 10) {
                                        gjo.A = 100;
                                    }
                                    bArr = gjo.E;
                                    i3 = gjo.L;
                                    gjo.L = i3 + 1;
                                    gjo.r = bArr[i3] & 255;
                                    gjo.L++;
                                    break;
                                case 254:
                                    gjo.m();
                                    break;
                                case 255:
                                    gjo.k();
                                    Object obj = 1;
                                    for (i3 = 0; i3 < gjo.a.length; i3++) {
                                        if (gjo.o[i3] != gjo.a[i3]) {
                                            obj = null;
                                            if (obj != null) {
                                                gjo.m();
                                                break;
                                            }
                                            while (gjo.k() > 0) {
                                                if (gjo.b) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    if (obj != null) {
                                        gjo.m();
                                    } else {
                                        while (gjo.k() > 0) {
                                            if (gjo.b) {
                                            }
                                        }
                                    }
                                default:
                                    gjo.m();
                                    break;
                            }
                        case 44:
                            gjo.j = gjo.l();
                            gjo.k = gjo.l();
                            i = gjo.l();
                            i3 = gjo.l();
                            gjo.l = Math.min(i, gjo.F - gjo.j);
                            gjo.m = Math.min(i3, gjo.G - gjo.k);
                            gjo.n = i;
                            i *= i3;
                            if (i > gjo.v.length) {
                                gjo.v = new byte[i];
                            }
                            bArr = gjo.E;
                            i3 = gjo.L;
                            gjo.L = i3 + 1;
                            i3 = bArr[i3] & 255;
                            gjo.i = (i3 & 64) != 0;
                            gjo.e = (i3 & 128) != 0;
                            gjo.f = (int) Math.pow(2.0d, (double) ((i3 & 7) + 1));
                            if (gjo.e) {
                                if (gjo.g == null) {
                                    gjo.g = new int[256];
                                }
                                gjo.L = gjo.a(gjo.E, gjo.g, gjo.f, gjo.L);
                                gjo.h = gjo.g;
                            } else {
                                gjo.h = gjo.J;
                                if (gjo.K == gjo.r) {
                                    gjo.d = 0;
                                }
                            }
                            i = 0;
                            if (gjo.q) {
                                i = gjo.h[gjo.r];
                                gjo.h[gjo.r] = 0;
                            }
                            int i5 = i;
                            if (gjo.h == null) {
                                gjo.b = true;
                                glk.d("Babel", "Could not read color table from the gif. Abort.", new Object[0]);
                            }
                            if (!gjo.b) {
                                int i6 = gjo.l * gjo.m;
                                bArr = gjo.E;
                                i3 = gjo.L;
                                gjo.L = i3 + 1;
                                int i7 = bArr[i3] & 255;
                                short s = 1 << i7;
                                short s2 = s + 1;
                                int i8 = s + 2;
                                int i9 = -1;
                                i3 = i7 + 1;
                                i2 = (1 << i3) - 1;
                                for (short s3 = (short) 0; s3 < s; s3++) {
                                    gjo.s[s3] = (short) 0;
                                    gjo.t[s3] = (byte) s3;
                                }
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                int i13 = 0;
                                i = 0;
                                while (i < i6) {
                                    byte[] bArr2 = gjo.E;
                                    int i14 = gjo.L;
                                    gjo.L = i14 + 1;
                                    i4 = bArr2[i14] & 255;
                                    if (i4 != 0) {
                                        int i15 = gjo.L + i4;
                                        i4 = i;
                                        i = i11;
                                        i11 = i3;
                                        while (gjo.L < i15) {
                                            byte[] bArr3 = gjo.E;
                                            i14 = gjo.L;
                                            gjo.L = i14 + 1;
                                            i10 = ((bArr3[i14] & 255) << i) + i10;
                                            i3 = i11;
                                            i11 = i + 8;
                                            i = i2;
                                            i2 = i8;
                                            i8 = i12;
                                            while (i11 >= i3) {
                                                short s4 = i10 & i;
                                                i14 = i10 >> i3;
                                                i10 = i11 - i3;
                                                if (s4 != s) {
                                                    if (s4 == s2) {
                                                        gjo.L = i15;
                                                    } else if (r8 == -1) {
                                                        i11 = i4 + 1;
                                                        gjo.v[i4] = gjo.t[s4];
                                                        i4 = i11;
                                                        i8 = s4;
                                                        i9 = s4;
                                                        i11 = i10;
                                                        i10 = i14;
                                                    } else {
                                                        short s5;
                                                        if (s4 >= i2) {
                                                            i11 = i13 + 1;
                                                            gjo.u[i13] = (byte) i8;
                                                            if (i11 == 4097) {
                                                                gjo.b = true;
                                                                glk.d("Babel", "Error while decoding Gif.", new Object[0]);
                                                            } else {
                                                                i13 = i11;
                                                                s5 = r8;
                                                            }
                                                        } else {
                                                            s5 = s4;
                                                        }
                                                        while (s5 >= s) {
                                                            if (s5 >= (short) 4097 || s5 == gjo.s[s5]) {
                                                                gjo.b = true;
                                                                glk.d("Babel", "Error while decoding Gif.", new Object[0]);
                                                            } else {
                                                                i8 = i13 + 1;
                                                                gjo.u[i13] = gjo.t[s5];
                                                                s5 = gjo.s[s5];
                                                                if (i8 == 4097) {
                                                                    gjo.b = true;
                                                                    glk.d("Babel", "Error while decoding Gif.", new Object[0]);
                                                                } else {
                                                                    i13 = i8;
                                                                }
                                                            }
                                                        }
                                                        i8 = gjo.t[s5];
                                                        i11 = i13 + 1;
                                                        gjo.u[i13] = (byte) i8;
                                                        if (i2 < (short) 4096) {
                                                            gjo.s[i2] = (short) r8;
                                                            gjo.t[i2] = (byte) i8;
                                                            i2++;
                                                            if ((i2 & i) == 0 && i2 < 4096) {
                                                                i3++;
                                                                i += i2;
                                                            }
                                                        }
                                                        i9 = i11;
                                                        while (true) {
                                                            i11 = i4 + 1;
                                                            i9--;
                                                            gjo.v[i4] = gjo.u[i9];
                                                            if (i9 <= 0) {
                                                                i4 = i11;
                                                                i13 = i9;
                                                                i11 = i10;
                                                                i9 = s4;
                                                                i10 = i14;
                                                            } else {
                                                                i4 = i11;
                                                            }
                                                        }
                                                    }
                                                    gjo.m();
                                                    if (!gjo.b) {
                                                        if (gjo.p == 3) {
                                                            gjo.i();
                                                        }
                                                        i2 = 1;
                                                        i3 = 8;
                                                        i = 0;
                                                        i4 = 0;
                                                        while (i4 < gjo.m) {
                                                            if (gjo.i) {
                                                                if (i >= gjo.m) {
                                                                    i2++;
                                                                    switch (i2) {
                                                                        case 2:
                                                                            i = 4;
                                                                            break;
                                                                        case 3:
                                                                            i = 2;
                                                                            i3 = 4;
                                                                            break;
                                                                        case 4:
                                                                            i = 1;
                                                                            i3 = 2;
                                                                            break;
                                                                    }
                                                                }
                                                                i11 = i + i3;
                                                                i9 = i3;
                                                                i12 = i2;
                                                            } else {
                                                                i11 = i;
                                                                i9 = i3;
                                                                i12 = i2;
                                                                i = i4;
                                                            }
                                                            i += gjo.k;
                                                            if (i >= gjo.G) {
                                                                i3 = gjo.j + (i * gjo.F);
                                                                i13 = i3 + gjo.l;
                                                                i = gjo.n * i4;
                                                                i2 = i3;
                                                                while (i2 < i13) {
                                                                    i3 = i + 1;
                                                                    i = gjo.h[gjo.v[i] & 255];
                                                                    if (i == 0) {
                                                                        gjo.H[i2] = i;
                                                                    }
                                                                    i2++;
                                                                    i = i3;
                                                                }
                                                            }
                                                            i4++;
                                                            i = i11;
                                                            i3 = i9;
                                                            i2 = i12;
                                                        }
                                                        if (gjo.q) {
                                                            gjo.h[gjo.r] = i5;
                                                        }
                                                        gjo.y++;
                                                        break;
                                                    }
                                                }
                                                i3 = i7 + 1;
                                                i = (1 << i3) - 1;
                                                i2 = s + 2;
                                                i11 = i10;
                                                i9 = -1;
                                                i10 = i14;
                                            }
                                            i12 = i8;
                                            i8 = i2;
                                            i2 = i;
                                            i = i11;
                                            i11 = i3;
                                        }
                                        i3 = i11;
                                        i11 = i;
                                        i = i4;
                                    } else {
                                        while (i < i6) {
                                            i3 = i + 1;
                                            gjo.v[i] = (byte) 0;
                                            i = i3;
                                        }
                                        gjo.m();
                                        if (gjo.b) {
                                            if (gjo.p == 3) {
                                                gjo.i();
                                            }
                                            i2 = 1;
                                            i3 = 8;
                                            i = 0;
                                            i4 = 0;
                                            while (i4 < gjo.m) {
                                                if (gjo.i) {
                                                    i11 = i;
                                                    i9 = i3;
                                                    i12 = i2;
                                                    i = i4;
                                                } else {
                                                    if (i >= gjo.m) {
                                                        i2++;
                                                        switch (i2) {
                                                            case 2:
                                                                i = 4;
                                                                break;
                                                            case 3:
                                                                i = 2;
                                                                i3 = 4;
                                                                break;
                                                            case 4:
                                                                i = 1;
                                                                i3 = 2;
                                                                break;
                                                        }
                                                    }
                                                    i11 = i + i3;
                                                    i9 = i3;
                                                    i12 = i2;
                                                }
                                                i += gjo.k;
                                                if (i >= gjo.G) {
                                                    i3 = gjo.j + (i * gjo.F);
                                                    i13 = i3 + gjo.l;
                                                    i = gjo.n * i4;
                                                    i2 = i3;
                                                    while (i2 < i13) {
                                                        i3 = i + 1;
                                                        i = gjo.h[gjo.v[i] & 255];
                                                        if (i == 0) {
                                                            gjo.H[i2] = i;
                                                        }
                                                        i2++;
                                                        i = i3;
                                                    }
                                                }
                                                i4++;
                                                i = i11;
                                                i3 = i9;
                                                i2 = i12;
                                            }
                                            if (gjo.q) {
                                                gjo.h[gjo.r] = i5;
                                            }
                                            gjo.y++;
                                        }
                                    }
                                }
                                while (i < i6) {
                                    i3 = i + 1;
                                    gjo.v[i] = (byte) 0;
                                    i = i3;
                                }
                                gjo.m();
                                if (gjo.b) {
                                    if (gjo.p == 3) {
                                        gjo.i();
                                    }
                                    i2 = 1;
                                    i3 = 8;
                                    i = 0;
                                    i4 = 0;
                                    while (i4 < gjo.m) {
                                        if (gjo.i) {
                                            if (i >= gjo.m) {
                                                i2++;
                                                switch (i2) {
                                                    case 2:
                                                        i = 4;
                                                        break;
                                                    case 3:
                                                        i = 2;
                                                        i3 = 4;
                                                        break;
                                                    case 4:
                                                        i = 1;
                                                        i3 = 2;
                                                        break;
                                                }
                                            }
                                            i11 = i + i3;
                                            i9 = i3;
                                            i12 = i2;
                                        } else {
                                            i11 = i;
                                            i9 = i3;
                                            i12 = i2;
                                            i = i4;
                                        }
                                        i += gjo.k;
                                        if (i >= gjo.G) {
                                            i3 = gjo.j + (i * gjo.F);
                                            i13 = i3 + gjo.l;
                                            i = gjo.n * i4;
                                            i2 = i3;
                                            while (i2 < i13) {
                                                i3 = i + 1;
                                                i = gjo.h[gjo.v[i] & 255];
                                                if (i == 0) {
                                                    gjo.H[i2] = i;
                                                }
                                                i2++;
                                                i = i3;
                                            }
                                        }
                                        i4++;
                                        i = i11;
                                        i3 = i9;
                                        i2 = i12;
                                    }
                                    if (gjo.q) {
                                        gjo.h[gjo.r] = i5;
                                    }
                                    gjo.y++;
                                }
                            }
                            break;
                        case 59:
                            gjo.D = true;
                            break;
                        default:
                            break;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                gjo.D = true;
            }
        } while (gjo.c);
        gjo.B.sendMessage(gjo.B.obtainMessage(11, gjo.A, 0));
        return true;
        if (gjo.D) {
            if (gjo.y == 0) {
                gjo.b = true;
                glk.d("Babel", "Could not read first frame of the gif.", new Object[0]);
            } else if (gjo.y <= 1 || !gjo.M) {
                gjo.c = true;
            } else {
                gjo.L = gjo.I;
                gjo.w = false;
                gjo.y = 0;
                gjo.p = 0;
            }
        }
        if (!gjo.D || gjo.b) {
            gjo.B.sendMessage(gjo.B.obtainMessage(11, gjo.A, 0));
            return true;
        } else if (gjo.c) {
            gjo.B.sendMessage(gjo.B.obtainMessage(11, gjo.A, 0));
            return true;
        }
    }
}
