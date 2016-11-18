package p000;

import android.graphics.RectF;

final class jpq {
    private static final char[] f20710a = "http://".toCharArray();
    private static final char[] f20711b = "https://".toCharArray();
    private static final char[] f20712c = "lh".toCharArray();
    private static final char[] f20713d = "ap".toCharArray();
    private static final char[] f20714e = "sp".toCharArray();
    private static final char[] f20715f = "bp".toCharArray();
    private static final char[] f20716g = ".googleusercontent.com/".toCharArray();
    private static final char[] f20717h = "www.google.com/visualsearch/lh/".toCharArray();
    private static final char[] f20718i = ".google.com/".toCharArray();
    private static final char[] f20719j = ".blogger.com/".toCharArray();
    private static final char[] f20720k = ".bp.blogspot.com/".toCharArray();
    private static final char[] f20721l = ".ggpht.com/".toCharArray();
    private static final char[] f20722m = "image".toCharArray();
    private static final char[] f20723n = "%3D".toCharArray();
    private static final char[] f20724o = "%3d".toCharArray();
    private static final char[][] f20725p;
    private boolean f20726A;
    private boolean f20727B = true;
    private int f20728C;
    private int f20729D;
    private int f20730E;
    private int[] f20731F = new int[8];
    private int[] f20732G = new int[8];
    private char[] f20733q = new char[2000];
    private int f20734r;
    private int f20735s;
    private int f20736t;
    private int f20737u;
    private int f20738v;
    private boolean f20739w;
    private boolean f20740x;
    private boolean f20741y;
    private boolean f20742z;

    jpq() {
    }

    static {
        r0 = new char[5][];
        r0[0] = new char[]{'O'};
        r0[1] = new char[]{'J'};
        r0[2] = new char[]{'U', 't'};
        r0[3] = new char[]{'U'};
        r0[4] = new char[]{'I'};
        f20725p = r0;
    }

    synchronized boolean m24950a(String str) {
        m24947b(str);
        return this.f20739w;
    }

    synchronized String m24949a(String str, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF, int i7, int i8) {
        String stringBuilder;
        m24947b(str);
        if (this.f20727B) {
            StringBuilder stringBuilder2 = new StringBuilder(this.f20734r + 50);
            int i9 = 0;
            Object obj = (i & 8192) != 0 ? 1 : null;
            Object obj2 = (i & 128) != 0 ? 1 : null;
            if (this.f20741y && !(i7 <= 0 && obj == null && obj2 == null)) {
                stringBuilder2.append(this.f20733q, 0, this.f20736t);
                if (!this.f20742z && obj2 != null && !this.f20740x) {
                    stringBuilder2.append(f20714e);
                    stringBuilder2.append((char) ((i7 % 3) + 49));
                } else if (obj == null || this.f20740x) {
                    stringBuilder2.append(f20712c);
                    stringBuilder2.append((char) ((i7 % 4) + 51));
                } else {
                    stringBuilder2.append(f20713d).append('2');
                }
                i9 = this.f20736t + 3;
                stringBuilder2.append(this.f20733q, i9, this.f20729D - i9);
                i9 = this.f20729D;
            }
            if (this.f20726A) {
                stringBuilder2.append(this.f20733q, i9, this.f20737u - i9);
            } else {
                stringBuilder2.append(this.f20733q, i9, this.f20738v - i9);
                stringBuilder2.append('=');
            }
            i9 = stringBuilder2.length();
            if (i2 != 0 || (i3 == 0 && i4 == 0)) {
                stringBuilder2.append('s').append(i2).append('-');
            }
            if (i3 != 0) {
                stringBuilder2.append('w').append(i3).append('-');
            }
            if (i4 != 0) {
                stringBuilder2.append('h').append(i4).append('-');
            }
            if ((i & 32) != 0) {
                stringBuilder2.append("rw-");
            }
            if ((524288 & i) != 0) {
                stringBuilder2.append("mo-");
            }
            if ((1048576 & i) != 0) {
                stringBuilder2.append("pa-");
            }
            if ((i & 16384) != 0) {
                stringBuilder2.append("rwa-");
            }
            if ((i & 1) != 0) {
                stringBuilder2.append("c-");
            }
            if ((i & 2) != 0) {
                stringBuilder2.append("d-");
            }
            if ((i & 16) != 0) {
                stringBuilder2.append("k-");
            }
            if ((i & 4) != 0) {
                stringBuilder2.append("no-");
            }
            if ((i & 64) != 0) {
                stringBuilder2.append("nu-");
            }
            if ((i & 8) != 0) {
                stringBuilder2.append("p-");
            }
            if ((i & 4096) != 0) {
                stringBuilder2.append("lf-");
            }
            if ((i & 256) != 0) {
                stringBuilder2.append("fSoften=0,25,0-");
            }
            if ((i & 512) != 0) {
                stringBuilder2.append("ip-");
            }
            if ((i & 2048) != 0) {
                stringBuilder2.append("rj-");
            }
            if ((32768 & i) != 0) {
                stringBuilder2.append("fBoxBlur=2,24,24-");
            }
            if ((65536 & i) != 0) {
                stringBuilder2.append("al-");
            }
            if ((131072 & i) != 0) {
                stringBuilder2.append("rh-");
            }
            if ((2097152 & i) != 0) {
                stringBuilder2.append("m18-");
            }
            if ((262144 & i) != 0) {
                stringBuilder2.append("ns-");
            }
            if (!(i5 == -1 || i6 == -1)) {
                switch (i5) {
                    case 0:
                        stringBuilder2.append('v');
                        break;
                    case 1:
                        stringBuilder2.append('l');
                        break;
                }
                stringBuilder2.append(i6).append('-');
            }
            if (!((i & 1024) == 0 || rectF == null)) {
                stringBuilder2.append("fcrop64=1,");
                stringBuilder2.append(jpq.m24942a(rectF.left));
                stringBuilder2.append(jpq.m24942a(rectF.top));
                stringBuilder2.append(jpq.m24942a(rectF.right));
                stringBuilder2.append(jpq.m24942a(rectF.bottom));
                stringBuilder2.append('-');
            }
            if (i8 >= 0) {
                stringBuilder2.append('a').append(i8).append('-');
            }
            m24943a(stringBuilder2);
            m24948b(stringBuilder2);
            if (stringBuilder2.length() > i9) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            if (this.f20726A && this.f20728C == 0) {
                stringBuilder2.append('/');
            }
            stringBuilder2.append(this.f20733q, this.f20737u + this.f20728C, this.f20734r - (this.f20737u + this.f20728C));
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = null;
        }
        return stringBuilder;
    }

    private static String m24942a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Cropping requires values between 0 and 1");
        }
        String str = "0000";
        String valueOf = String.valueOf(Integer.toHexString((int) Math.floor((double) (65535.0f * f))));
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        return valueOf.substring(valueOf.length() - 4, valueOf.length());
    }

    private void m24943a(StringBuilder stringBuilder) {
        int i = this.f20737u;
        int i2 = this.f20737u + this.f20728C;
        while (i < i2) {
            for (int i3 = 0; i3 < f20725p.length; i3++) {
                int i4;
                char[] cArr = f20725p[i3];
                int i5 = 0;
                int i6 = i;
                while (i5 < cArr.length && i6 < i2) {
                    i4 = i5 + 1;
                    char c = cArr[i5];
                    i5 = i6 + 1;
                    if (c != this.f20733q[i6]) {
                        i6 = i5;
                        Object obj = null;
                        break;
                    }
                    i6 = i5;
                    i5 = i4;
                }
                i4 = i5;
                i5 = 1;
                if (!(obj == null || (r3 == cArr.length && (r4 == i2 || this.f20733q[r4] == '-')))) {
                    obj = null;
                }
                if (obj != null) {
                    stringBuilder.append(f20725p[i3]).append('-');
                    break;
                }
            }
            while (i < i2 && this.f20733q[i] != '-') {
                i++;
            }
            i++;
        }
    }

    private void m24948b(StringBuilder stringBuilder) {
        int i = this.f20737u;
        int i2 = this.f20728C + this.f20737u;
        while (i < i2) {
            Object obj = this.f20733q[i] == 'f' ? 1 : null;
            while (i < i2 && this.f20733q[i] != '-') {
                if (obj != null) {
                    stringBuilder.append(this.f20733q[i]);
                }
                i++;
            }
            if (obj != null) {
                stringBuilder.append('-');
            }
            i++;
        }
    }

    private void m24947b(String str) {
        this.f20734r = str.length();
        if (this.f20734r >= 2000) {
            this.f20727B = false;
            return;
        }
        boolean z;
        str.getChars(0, this.f20734r, this.f20733q, 0);
        this.f20735s = 0;
        this.f20741y = false;
        this.f20742z = false;
        this.f20726A = false;
        if (m24945a(f20710a) || m24945a(f20711b)) {
            this.f20736t = this.f20735s;
            if (m24945a(f20712c)) {
                this.f20741y = true;
                if (this.f20733q[this.f20735s] < '3' || this.f20733q[this.f20735s] > '6') {
                    z = false;
                } else {
                    this.f20735s++;
                    if (this.f20733q[this.f20735s] == '-' && this.f20733q[this.f20735s + 1] == 'd') {
                        this.f20740x = true;
                        this.f20735s += 2;
                        if ((this.f20733q[this.f20735s] < 'a' || this.f20733q[this.f20735s] > 'g') && this.f20733q[this.f20735s] != 'z') {
                            z = false;
                        } else {
                            this.f20735s++;
                            if (!m24945a(f20716g)) {
                                z = false;
                            }
                        }
                    } else if (this.f20733q[this.f20735s] == '-' && this.f20733q[this.f20735s + 1] == 't' && this.f20733q[this.f20735s + 2] == 't') {
                        this.f20740x = true;
                        this.f20735s += 3;
                        if (!m24945a(f20716g)) {
                            z = false;
                        }
                    } else if (m24945a(f20718i)) {
                        this.f20742z = true;
                    } else if (!(m24945a(f20716g) || m24945a(f20721l))) {
                        z = false;
                    }
                }
            } else if (m24945a(f20714e)) {
                this.f20741y = true;
                if (this.f20733q[this.f20735s] < '1' || this.f20733q[this.f20735s] > '3') {
                    z = false;
                } else {
                    this.f20735s++;
                    if (!(m24945a(f20716g) || m24945a(f20721l))) {
                        z = false;
                    }
                }
            } else if (m24945a(f20713d)) {
                this.f20741y = true;
                if (this.f20733q[this.f20735s] == '2') {
                    this.f20735s++;
                    if (!(m24945a(f20716g) || m24945a(f20721l))) {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                this.f20741y = false;
                if (m24945a(f20715f)) {
                    if (this.f20733q[this.f20735s] < '0' || this.f20733q[this.f20735s] > '3') {
                        z = false;
                    } else {
                        this.f20735s++;
                        if (!m24945a(f20719j)) {
                            z = false;
                        }
                    }
                } else if (!m24945a(f20717h)) {
                    if (this.f20733q[this.f20735s] < '1' || this.f20733q[this.f20735s] > '4') {
                        z = false;
                    } else {
                        this.f20735s++;
                        if (!m24945a(f20720k)) {
                            z = false;
                        }
                    }
                }
            }
            this.f20729D = this.f20735s - 1;
            z = true;
        } else {
            z = false;
        }
        this.f20739w = z;
        if (this.f20739w) {
            int i;
            int i2 = this.f20735s;
            int i3 = this.f20735s;
            this.f20730E = 0;
            while (true) {
                if (i2 == this.f20734r || this.f20733q[i2] == '/') {
                    if (i2 == i3 && i2 != this.f20734r) {
                        i3 = i2 + 1;
                    } else if (this.f20730E >= 8) {
                        this.f20727B = false;
                        return;
                    } else {
                        this.f20731F[this.f20730E] = i3;
                        this.f20732G[this.f20730E] = i2 - i3;
                        i3 = i2 + 1;
                        this.f20730E++;
                    }
                }
                if (i2 == this.f20734r) {
                    break;
                }
                i2++;
            }
            if (this.f20730E > 1 && this.f20732G[0] == f20722m.length && m24944a(this.f20731F[0], f20722m)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f20730E == 5) {
                this.f20737u = this.f20731F[4];
                this.f20728C = 0;
            } else if (z && this.f20730E == 6) {
                this.f20737u = this.f20731F[5];
                this.f20728C = 0;
            } else if (!z && this.f20730E == 6) {
                this.f20737u = this.f20731F[4];
                this.f20728C = this.f20732G[4];
            } else if (z && this.f20730E == 7) {
                this.f20737u = this.f20731F[5];
                this.f20728C = this.f20732G[5];
            } else {
                z = false;
                if (z) {
                    if (this.f20730E > 0) {
                        z = false;
                    } else {
                        if (this.f20732G[0] == f20722m.length || !m24944a(this.f20731F[0], f20722m)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (this.f20730E != 1 && !r0) {
                            i2 = this.f20731F[0];
                            i3 = this.f20732G[0];
                        } else if (this.f20730E != 2) {
                            i2 = this.f20731F[1];
                            i3 = this.f20732G[1];
                        } else if (this.f20730E == 3 || !r0) {
                            z = false;
                        } else {
                            i2 = this.f20731F[2];
                            i3 = this.f20732G[2];
                        }
                        i = i2;
                        while (i < this.f20734r) {
                            if (this.f20733q[i] == '=') {
                                break;
                            }
                            i++;
                        }
                        i = -1;
                        this.f20738v = i;
                        if (this.f20738v == -1) {
                            this.f20737u = this.f20738v + 1;
                        } else {
                            this.f20738v = m24946b(i2, f20723n);
                            if (this.f20738v == -1) {
                                this.f20738v = m24946b(i2, f20724o);
                            }
                            if (this.f20738v != -1) {
                                this.f20737u = this.f20738v + 3;
                            }
                        }
                        if (this.f20738v == -1) {
                            this.f20728C = i3 - (this.f20737u - i2);
                        } else {
                            this.f20738v = i3 + i2;
                            this.f20737u = this.f20738v;
                            this.f20728C = 0;
                        }
                        z = true;
                    }
                    if (z) {
                        this.f20727B = false;
                        return;
                    }
                    this.f20726A = false;
                    this.f20727B = true;
                    return;
                }
                this.f20726A = true;
                this.f20727B = true;
                return;
            }
            z = true;
            if (z) {
                if (this.f20730E > 0) {
                    if (this.f20732G[0] == f20722m.length) {
                    }
                    z = false;
                    if (this.f20730E != 1) {
                    }
                    if (this.f20730E != 2) {
                        if (this.f20730E == 3) {
                        }
                        z = false;
                    } else {
                        i2 = this.f20731F[1];
                        i3 = this.f20732G[1];
                    }
                    i = i2;
                    while (i < this.f20734r) {
                        if (this.f20733q[i] == '=') {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    this.f20738v = i;
                    if (this.f20738v == -1) {
                        this.f20738v = m24946b(i2, f20723n);
                        if (this.f20738v == -1) {
                            this.f20738v = m24946b(i2, f20724o);
                        }
                        if (this.f20738v != -1) {
                            this.f20737u = this.f20738v + 3;
                        }
                    } else {
                        this.f20737u = this.f20738v + 1;
                    }
                    if (this.f20738v == -1) {
                        this.f20738v = i3 + i2;
                        this.f20737u = this.f20738v;
                        this.f20728C = 0;
                    } else {
                        this.f20728C = i3 - (this.f20737u - i2);
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f20727B = false;
                    return;
                }
                this.f20726A = false;
                this.f20727B = true;
                return;
            }
            this.f20726A = true;
            this.f20727B = true;
            return;
        }
        this.f20727B = false;
    }

    private boolean m24945a(char[] cArr) {
        int i = this.f20735s;
        int length = cArr.length;
        if (i + length > this.f20734r) {
            return false;
        }
        int i2 = i;
        i = 0;
        while (i < length) {
            int i3 = i2 + 1;
            char c = this.f20733q[i2];
            i2 = i + 1;
            if (c != cArr[i]) {
                return false;
            }
            i = i2;
            i2 = i3;
        }
        this.f20735s = i2;
        return true;
    }

    private boolean m24944a(int i, char[] cArr) {
        int length = cArr.length;
        if (i + length > this.f20734r) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f20733q[i + i2] != cArr[i2]) {
                return false;
            }
        }
        return true;
    }

    private int m24946b(int i, char[] cArr) {
        int length = cArr.length;
        int i2 = this.f20734r - length;
        int i3 = i;
        while (i3 <= i2) {
            int i4 = 0;
            while (i4 < length) {
                if (this.f20733q[i3 + i4] == cArr[i4]) {
                    i4++;
                } else {
                    i3++;
                }
            }
            return i3;
        }
        return -1;
    }
}
