package p000;

import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

final class gjp extends HandlerThread implements Callback {
    public gjp() {
        super("GifDecoder");
    }

    public boolean handleMessage(Message message) {
        gjo gjo = (gjo) message.obj;
        if (gjo == null || gjo.f15437z == null || gjo.f15392C) {
            return true;
        }
        switch (message.what) {
            case 10:
                break;
            case 12:
                gjo.f15401L = gjo.f15398I;
                gjo.f15434w = false;
                gjo.f15436y = 0;
                gjo.f15427p = 0;
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
                switch (gjo.f15427p) {
                    case 0:
                    case 1:
                        gjo.f15434w = false;
                        break;
                    case 2:
                        gjo.f15434w = false;
                        i = 0;
                        if (!gjo.f15428q) {
                            i = gjo.f15415d;
                        }
                        for (i2 = 0; i2 < gjo.f15424m; i2++) {
                            i3 = ((gjo.f15422k + i2) * gjo.f15395F) + gjo.f15421j;
                            i4 = gjo.f15423l + i3;
                            while (i3 < i4) {
                                gjo.f15397H[i3] = i;
                                i3++;
                            }
                        }
                        break;
                    case 3:
                        if (gjo.f15434w) {
                            System.arraycopy(gjo.f15435x, 0, gjo.f15397H, 0, gjo.f15435x.length);
                            break;
                        }
                        break;
                }
                gjo.f15427p = 0;
                gjo.f15428q = false;
                gjo.f15393D = false;
                gjo.f15390A = 100;
                gjo.f15418g = null;
                while (true) {
                    byte[] bArr = gjo.f15394E;
                    i3 = gjo.f15401L;
                    gjo.f15401L = i3 + 1;
                    switch (bArr[i3] & 255) {
                        case 0:
                            break;
                        case 33:
                            bArr = gjo.f15394E;
                            i3 = gjo.f15401L;
                            gjo.f15401L = i3 + 1;
                            switch (bArr[i3] & 255) {
                                case 1:
                                    gjo.m17849m();
                                    break;
                                case 249:
                                    gjo.f15401L++;
                                    bArr = gjo.f15394E;
                                    i3 = gjo.f15401L;
                                    gjo.f15401L = i3 + 1;
                                    i = bArr[i3] & 255;
                                    gjo.f15427p = (i & 28) >> 2;
                                    gjo.f15428q = (i & 1) != 0;
                                    gjo.f15390A = gjo.m17848l() * 10;
                                    if (gjo.f15390A <= 10) {
                                        gjo.f15390A = 100;
                                    }
                                    bArr = gjo.f15394E;
                                    i3 = gjo.f15401L;
                                    gjo.f15401L = i3 + 1;
                                    gjo.f15429r = bArr[i3] & 255;
                                    gjo.f15401L++;
                                    break;
                                case 254:
                                    gjo.m17849m();
                                    break;
                                case 255:
                                    gjo.m17847k();
                                    Object obj = 1;
                                    for (i3 = 0; i3 < gjo.f15389a.length; i3++) {
                                        if (gjo.f15426o[i3] != gjo.f15389a[i3]) {
                                            obj = null;
                                            if (obj != null) {
                                                gjo.m17849m();
                                                break;
                                            }
                                            while (gjo.m17847k() > 0) {
                                                if (gjo.f15413b) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    if (obj != null) {
                                        gjo.m17849m();
                                    } else {
                                        while (gjo.m17847k() > 0) {
                                            if (gjo.f15413b) {
                                            }
                                        }
                                    }
                                default:
                                    gjo.m17849m();
                                    break;
                            }
                        case 44:
                            gjo.f15421j = gjo.m17848l();
                            gjo.f15422k = gjo.m17848l();
                            i = gjo.m17848l();
                            i3 = gjo.m17848l();
                            gjo.f15423l = Math.min(i, gjo.f15395F - gjo.f15421j);
                            gjo.f15424m = Math.min(i3, gjo.f15396G - gjo.f15422k);
                            gjo.f15425n = i;
                            i *= i3;
                            if (i > gjo.f15433v.length) {
                                gjo.f15433v = new byte[i];
                            }
                            bArr = gjo.f15394E;
                            i3 = gjo.f15401L;
                            gjo.f15401L = i3 + 1;
                            i3 = bArr[i3] & 255;
                            gjo.f15420i = (i3 & 64) != 0;
                            gjo.f15416e = (i3 & 128) != 0;
                            gjo.f15417f = (int) Math.pow(2.0d, (double) ((i3 & 7) + 1));
                            if (gjo.f15416e) {
                                if (gjo.f15418g == null) {
                                    gjo.f15418g = new int[256];
                                }
                                gjo.f15401L = gjo.m17829a(gjo.f15394E, gjo.f15418g, gjo.f15417f, gjo.f15401L);
                                gjo.f15419h = gjo.f15418g;
                            } else {
                                gjo.f15419h = gjo.f15399J;
                                if (gjo.f15400K == gjo.f15429r) {
                                    gjo.f15415d = 0;
                                }
                            }
                            i = 0;
                            if (gjo.f15428q) {
                                i = gjo.f15419h[gjo.f15429r];
                                gjo.f15419h[gjo.f15429r] = 0;
                            }
                            int i5 = i;
                            if (gjo.f15419h == null) {
                                gjo.f15413b = true;
                                glk.m17981d("Babel", "Could not read color table from the gif. Abort.", new Object[0]);
                            }
                            if (!gjo.f15413b) {
                                int i6 = gjo.f15423l * gjo.f15424m;
                                bArr = gjo.f15394E;
                                i3 = gjo.f15401L;
                                gjo.f15401L = i3 + 1;
                                int i7 = bArr[i3] & 255;
                                short s = 1 << i7;
                                short s2 = s + 1;
                                int i8 = s + 2;
                                int i9 = -1;
                                i3 = i7 + 1;
                                i2 = (1 << i3) - 1;
                                for (short s3 = (short) 0; s3 < s; s3++) {
                                    gjo.f15430s[s3] = (short) 0;
                                    gjo.f15431t[s3] = (byte) s3;
                                }
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                int i13 = 0;
                                i = 0;
                                while (i < i6) {
                                    byte[] bArr2 = gjo.f15394E;
                                    int i14 = gjo.f15401L;
                                    gjo.f15401L = i14 + 1;
                                    i4 = bArr2[i14] & 255;
                                    if (i4 != 0) {
                                        int i15 = gjo.f15401L + i4;
                                        i4 = i;
                                        i = i11;
                                        i11 = i3;
                                        while (gjo.f15401L < i15) {
                                            byte[] bArr3 = gjo.f15394E;
                                            i14 = gjo.f15401L;
                                            gjo.f15401L = i14 + 1;
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
                                                        gjo.f15401L = i15;
                                                    } else if (r8 == -1) {
                                                        i11 = i4 + 1;
                                                        gjo.f15433v[i4] = gjo.f15431t[s4];
                                                        i4 = i11;
                                                        i8 = s4;
                                                        i9 = s4;
                                                        i11 = i10;
                                                        i10 = i14;
                                                    } else {
                                                        short s5;
                                                        if (s4 >= i2) {
                                                            i11 = i13 + 1;
                                                            gjo.f15432u[i13] = (byte) i8;
                                                            if (i11 == 4097) {
                                                                gjo.f15413b = true;
                                                                glk.m17981d("Babel", "Error while decoding Gif.", new Object[0]);
                                                            } else {
                                                                i13 = i11;
                                                                s5 = r8;
                                                            }
                                                        } else {
                                                            s5 = s4;
                                                        }
                                                        while (s5 >= s) {
                                                            if (s5 >= (short) 4097 || s5 == gjo.f15430s[s5]) {
                                                                gjo.f15413b = true;
                                                                glk.m17981d("Babel", "Error while decoding Gif.", new Object[0]);
                                                            } else {
                                                                i8 = i13 + 1;
                                                                gjo.f15432u[i13] = gjo.f15431t[s5];
                                                                s5 = gjo.f15430s[s5];
                                                                if (i8 == 4097) {
                                                                    gjo.f15413b = true;
                                                                    glk.m17981d("Babel", "Error while decoding Gif.", new Object[0]);
                                                                } else {
                                                                    i13 = i8;
                                                                }
                                                            }
                                                        }
                                                        i8 = gjo.f15431t[s5];
                                                        i11 = i13 + 1;
                                                        gjo.f15432u[i13] = (byte) i8;
                                                        if (i2 < (short) 4096) {
                                                            gjo.f15430s[i2] = (short) r8;
                                                            gjo.f15431t[i2] = (byte) i8;
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
                                                            gjo.f15433v[i4] = gjo.f15432u[i9];
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
                                                    gjo.m17849m();
                                                    if (!gjo.f15413b) {
                                                        if (gjo.f15427p == 3) {
                                                            gjo.m17845i();
                                                        }
                                                        i2 = 1;
                                                        i3 = 8;
                                                        i = 0;
                                                        i4 = 0;
                                                        while (i4 < gjo.f15424m) {
                                                            if (gjo.f15420i) {
                                                                if (i >= gjo.f15424m) {
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
                                                            i += gjo.f15422k;
                                                            if (i >= gjo.f15396G) {
                                                                i3 = gjo.f15421j + (i * gjo.f15395F);
                                                                i13 = i3 + gjo.f15423l;
                                                                i = gjo.f15425n * i4;
                                                                i2 = i3;
                                                                while (i2 < i13) {
                                                                    i3 = i + 1;
                                                                    i = gjo.f15419h[gjo.f15433v[i] & 255];
                                                                    if (i == 0) {
                                                                        gjo.f15397H[i2] = i;
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
                                                        if (gjo.f15428q) {
                                                            gjo.f15419h[gjo.f15429r] = i5;
                                                        }
                                                        gjo.f15436y++;
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
                                            gjo.f15433v[i] = (byte) 0;
                                            i = i3;
                                        }
                                        gjo.m17849m();
                                        if (gjo.f15413b) {
                                            if (gjo.f15427p == 3) {
                                                gjo.m17845i();
                                            }
                                            i2 = 1;
                                            i3 = 8;
                                            i = 0;
                                            i4 = 0;
                                            while (i4 < gjo.f15424m) {
                                                if (gjo.f15420i) {
                                                    i11 = i;
                                                    i9 = i3;
                                                    i12 = i2;
                                                    i = i4;
                                                } else {
                                                    if (i >= gjo.f15424m) {
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
                                                i += gjo.f15422k;
                                                if (i >= gjo.f15396G) {
                                                    i3 = gjo.f15421j + (i * gjo.f15395F);
                                                    i13 = i3 + gjo.f15423l;
                                                    i = gjo.f15425n * i4;
                                                    i2 = i3;
                                                    while (i2 < i13) {
                                                        i3 = i + 1;
                                                        i = gjo.f15419h[gjo.f15433v[i] & 255];
                                                        if (i == 0) {
                                                            gjo.f15397H[i2] = i;
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
                                            if (gjo.f15428q) {
                                                gjo.f15419h[gjo.f15429r] = i5;
                                            }
                                            gjo.f15436y++;
                                        }
                                    }
                                }
                                while (i < i6) {
                                    i3 = i + 1;
                                    gjo.f15433v[i] = (byte) 0;
                                    i = i3;
                                }
                                gjo.m17849m();
                                if (gjo.f15413b) {
                                    if (gjo.f15427p == 3) {
                                        gjo.m17845i();
                                    }
                                    i2 = 1;
                                    i3 = 8;
                                    i = 0;
                                    i4 = 0;
                                    while (i4 < gjo.f15424m) {
                                        if (gjo.f15420i) {
                                            if (i >= gjo.f15424m) {
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
                                        i += gjo.f15422k;
                                        if (i >= gjo.f15396G) {
                                            i3 = gjo.f15421j + (i * gjo.f15395F);
                                            i13 = i3 + gjo.f15423l;
                                            i = gjo.f15425n * i4;
                                            i2 = i3;
                                            while (i2 < i13) {
                                                i3 = i + 1;
                                                i = gjo.f15419h[gjo.f15433v[i] & 255];
                                                if (i == 0) {
                                                    gjo.f15397H[i2] = i;
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
                                    if (gjo.f15428q) {
                                        gjo.f15419h[gjo.f15429r] = i5;
                                    }
                                    gjo.f15436y++;
                                }
                            }
                            break;
                        case 59:
                            gjo.f15393D = true;
                            break;
                        default:
                            break;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                gjo.f15393D = true;
            }
        } while (gjo.f15414c);
        gjo.f15391B.sendMessage(gjo.f15391B.obtainMessage(11, gjo.f15390A, 0));
        return true;
        if (gjo.f15393D) {
            if (gjo.f15436y == 0) {
                gjo.f15413b = true;
                glk.m17981d("Babel", "Could not read first frame of the gif.", new Object[0]);
            } else if (gjo.f15436y <= 1 || !gjo.f15402M) {
                gjo.f15414c = true;
            } else {
                gjo.f15401L = gjo.f15398I;
                gjo.f15434w = false;
                gjo.f15436y = 0;
                gjo.f15427p = 0;
            }
        }
        if (!gjo.f15393D || gjo.f15413b) {
            gjo.f15391B.sendMessage(gjo.f15391B.obtainMessage(11, gjo.f15390A, 0));
            return true;
        } else if (gjo.f15414c) {
            gjo.f15391B.sendMessage(gjo.f15391B.obtainMessage(11, gjo.f15390A, 0));
            return true;
        }
    }
}
