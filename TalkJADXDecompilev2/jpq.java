package defpackage;

import android.graphics.RectF;

final class jpq {
    private static final char[] a = "http://".toCharArray();
    private static final char[] b = "https://".toCharArray();
    private static final char[] c = "lh".toCharArray();
    private static final char[] d = "ap".toCharArray();
    private static final char[] e = "sp".toCharArray();
    private static final char[] f = "bp".toCharArray();
    private static final char[] g = ".googleusercontent.com/".toCharArray();
    private static final char[] h = "www.google.com/visualsearch/lh/".toCharArray();
    private static final char[] i = ".google.com/".toCharArray();
    private static final char[] j = ".blogger.com/".toCharArray();
    private static final char[] k = ".bp.blogspot.com/".toCharArray();
    private static final char[] l = ".ggpht.com/".toCharArray();
    private static final char[] m = "image".toCharArray();
    private static final char[] n = "%3D".toCharArray();
    private static final char[] o = "%3d".toCharArray();
    private static final char[][] p;
    private boolean A;
    private boolean B = true;
    private int C;
    private int D;
    private int E;
    private int[] F = new int[8];
    private int[] G = new int[8];
    private char[] q = new char[2000];
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    jpq() {
    }

    static {
        r0 = new char[5][];
        r0[0] = new char[]{'O'};
        r0[1] = new char[]{'J'};
        r0[2] = new char[]{'U', 't'};
        r0[3] = new char[]{'U'};
        r0[4] = new char[]{'I'};
        p = r0;
    }

    synchronized boolean a(String str) {
        b(str);
        return this.w;
    }

    synchronized String a(String str, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF, int i7, int i8) {
        String stringBuilder;
        b(str);
        if (this.B) {
            StringBuilder stringBuilder2 = new StringBuilder(this.r + 50);
            int i9 = 0;
            Object obj = (i & 8192) != 0 ? 1 : null;
            Object obj2 = (i & 128) != 0 ? 1 : null;
            if (this.y && !(i7 <= 0 && obj == null && obj2 == null)) {
                stringBuilder2.append(this.q, 0, this.t);
                if (!this.z && obj2 != null && !this.x) {
                    stringBuilder2.append(e);
                    stringBuilder2.append((char) ((i7 % 3) + 49));
                } else if (obj == null || this.x) {
                    stringBuilder2.append(c);
                    stringBuilder2.append((char) ((i7 % 4) + 51));
                } else {
                    stringBuilder2.append(d).append('2');
                }
                i9 = this.t + 3;
                stringBuilder2.append(this.q, i9, this.D - i9);
                i9 = this.D;
            }
            if (this.A) {
                stringBuilder2.append(this.q, i9, this.u - i9);
            } else {
                stringBuilder2.append(this.q, i9, this.v - i9);
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
                stringBuilder2.append(jpq.a(rectF.left));
                stringBuilder2.append(jpq.a(rectF.top));
                stringBuilder2.append(jpq.a(rectF.right));
                stringBuilder2.append(jpq.a(rectF.bottom));
                stringBuilder2.append('-');
            }
            if (i8 >= 0) {
                stringBuilder2.append('a').append(i8).append('-');
            }
            a(stringBuilder2);
            b(stringBuilder2);
            if (stringBuilder2.length() > i9) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            if (this.A && this.C == 0) {
                stringBuilder2.append('/');
            }
            stringBuilder2.append(this.q, this.u + this.C, this.r - (this.u + this.C));
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = null;
        }
        return stringBuilder;
    }

    private static String a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Cropping requires values between 0 and 1");
        }
        String str = "0000";
        String valueOf = String.valueOf(Integer.toHexString((int) Math.floor((double) (65535.0f * f))));
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        return valueOf.substring(valueOf.length() - 4, valueOf.length());
    }

    private void a(StringBuilder stringBuilder) {
        int i = this.u;
        int i2 = this.u + this.C;
        while (i < i2) {
            for (int i3 = 0; i3 < p.length; i3++) {
                int i4;
                char[] cArr = p[i3];
                int i5 = 0;
                int i6 = i;
                while (i5 < cArr.length && i6 < i2) {
                    i4 = i5 + 1;
                    char c = cArr[i5];
                    i5 = i6 + 1;
                    if (c != this.q[i6]) {
                        i6 = i5;
                        Object obj = null;
                        break;
                    }
                    i6 = i5;
                    i5 = i4;
                }
                i4 = i5;
                i5 = 1;
                if (!(obj == null || (r3 == cArr.length && (r4 == i2 || this.q[r4] == '-')))) {
                    obj = null;
                }
                if (obj != null) {
                    stringBuilder.append(p[i3]).append('-');
                    break;
                }
            }
            while (i < i2 && this.q[i] != '-') {
                i++;
            }
            i++;
        }
    }

    private void b(StringBuilder stringBuilder) {
        int i = this.u;
        int i2 = this.C + this.u;
        while (i < i2) {
            Object obj = this.q[i] == 'f' ? 1 : null;
            while (i < i2 && this.q[i] != '-') {
                if (obj != null) {
                    stringBuilder.append(this.q[i]);
                }
                i++;
            }
            if (obj != null) {
                stringBuilder.append('-');
            }
            i++;
        }
    }

    private void b(String str) {
        this.r = str.length();
        if (this.r >= 2000) {
            this.B = false;
            return;
        }
        boolean z;
        str.getChars(0, this.r, this.q, 0);
        this.s = 0;
        this.y = false;
        this.z = false;
        this.A = false;
        if (a(a) || a(b)) {
            this.t = this.s;
            if (a(c)) {
                this.y = true;
                if (this.q[this.s] < '3' || this.q[this.s] > '6') {
                    z = false;
                } else {
                    this.s++;
                    if (this.q[this.s] == '-' && this.q[this.s + 1] == 'd') {
                        this.x = true;
                        this.s += 2;
                        if ((this.q[this.s] < 'a' || this.q[this.s] > 'g') && this.q[this.s] != 'z') {
                            z = false;
                        } else {
                            this.s++;
                            if (!a(g)) {
                                z = false;
                            }
                        }
                    } else if (this.q[this.s] == '-' && this.q[this.s + 1] == 't' && this.q[this.s + 2] == 't') {
                        this.x = true;
                        this.s += 3;
                        if (!a(g)) {
                            z = false;
                        }
                    } else if (a(i)) {
                        this.z = true;
                    } else if (!(a(g) || a(l))) {
                        z = false;
                    }
                }
            } else if (a(e)) {
                this.y = true;
                if (this.q[this.s] < '1' || this.q[this.s] > '3') {
                    z = false;
                } else {
                    this.s++;
                    if (!(a(g) || a(l))) {
                        z = false;
                    }
                }
            } else if (a(d)) {
                this.y = true;
                if (this.q[this.s] == '2') {
                    this.s++;
                    if (!(a(g) || a(l))) {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                this.y = false;
                if (a(f)) {
                    if (this.q[this.s] < '0' || this.q[this.s] > '3') {
                        z = false;
                    } else {
                        this.s++;
                        if (!a(j)) {
                            z = false;
                        }
                    }
                } else if (!a(h)) {
                    if (this.q[this.s] < '1' || this.q[this.s] > '4') {
                        z = false;
                    } else {
                        this.s++;
                        if (!a(k)) {
                            z = false;
                        }
                    }
                }
            }
            this.D = this.s - 1;
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        if (this.w) {
            int i;
            int i2 = this.s;
            int i3 = this.s;
            this.E = 0;
            while (true) {
                if (i2 == this.r || this.q[i2] == '/') {
                    if (i2 == i3 && i2 != this.r) {
                        i3 = i2 + 1;
                    } else if (this.E >= 8) {
                        this.B = false;
                        return;
                    } else {
                        this.F[this.E] = i3;
                        this.G[this.E] = i2 - i3;
                        i3 = i2 + 1;
                        this.E++;
                    }
                }
                if (i2 == this.r) {
                    break;
                }
                i2++;
            }
            if (this.E > 1 && this.G[0] == m.length && a(this.F[0], m)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.E == 5) {
                this.u = this.F[4];
                this.C = 0;
            } else if (z && this.E == 6) {
                this.u = this.F[5];
                this.C = 0;
            } else if (!z && this.E == 6) {
                this.u = this.F[4];
                this.C = this.G[4];
            } else if (z && this.E == 7) {
                this.u = this.F[5];
                this.C = this.G[5];
            } else {
                z = false;
                if (z) {
                    if (this.E > 0) {
                        z = false;
                    } else {
                        if (this.G[0] == m.length || !a(this.F[0], m)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (this.E != 1 && !r0) {
                            i2 = this.F[0];
                            i3 = this.G[0];
                        } else if (this.E != 2) {
                            i2 = this.F[1];
                            i3 = this.G[1];
                        } else if (this.E == 3 || !r0) {
                            z = false;
                        } else {
                            i2 = this.F[2];
                            i3 = this.G[2];
                        }
                        i = i2;
                        while (i < this.r) {
                            if (this.q[i] == '=') {
                                break;
                            }
                            i++;
                        }
                        i = -1;
                        this.v = i;
                        if (this.v == -1) {
                            this.u = this.v + 1;
                        } else {
                            this.v = b(i2, n);
                            if (this.v == -1) {
                                this.v = b(i2, o);
                            }
                            if (this.v != -1) {
                                this.u = this.v + 3;
                            }
                        }
                        if (this.v == -1) {
                            this.C = i3 - (this.u - i2);
                        } else {
                            this.v = i3 + i2;
                            this.u = this.v;
                            this.C = 0;
                        }
                        z = true;
                    }
                    if (z) {
                        this.B = false;
                        return;
                    }
                    this.A = false;
                    this.B = true;
                    return;
                }
                this.A = true;
                this.B = true;
                return;
            }
            z = true;
            if (z) {
                if (this.E > 0) {
                    if (this.G[0] == m.length) {
                    }
                    z = false;
                    if (this.E != 1) {
                    }
                    if (this.E != 2) {
                        if (this.E == 3) {
                        }
                        z = false;
                    } else {
                        i2 = this.F[1];
                        i3 = this.G[1];
                    }
                    i = i2;
                    while (i < this.r) {
                        if (this.q[i] == '=') {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    this.v = i;
                    if (this.v == -1) {
                        this.v = b(i2, n);
                        if (this.v == -1) {
                            this.v = b(i2, o);
                        }
                        if (this.v != -1) {
                            this.u = this.v + 3;
                        }
                    } else {
                        this.u = this.v + 1;
                    }
                    if (this.v == -1) {
                        this.v = i3 + i2;
                        this.u = this.v;
                        this.C = 0;
                    } else {
                        this.C = i3 - (this.u - i2);
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.B = false;
                    return;
                }
                this.A = false;
                this.B = true;
                return;
            }
            this.A = true;
            this.B = true;
            return;
        }
        this.B = false;
    }

    private boolean a(char[] cArr) {
        int i = this.s;
        int length = cArr.length;
        if (i + length > this.r) {
            return false;
        }
        int i2 = i;
        i = 0;
        while (i < length) {
            int i3 = i2 + 1;
            char c = this.q[i2];
            i2 = i + 1;
            if (c != cArr[i]) {
                return false;
            }
            i = i2;
            i2 = i3;
        }
        this.s = i2;
        return true;
    }

    private boolean a(int i, char[] cArr) {
        int length = cArr.length;
        if (i + length > this.r) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (this.q[i + i2] != cArr[i2]) {
                return false;
            }
        }
        return true;
    }

    private int b(int i, char[] cArr) {
        int length = cArr.length;
        int i2 = this.r - length;
        int i3 = i;
        while (i3 <= i2) {
            int i4 = 0;
            while (i4 < length) {
                if (this.q[i3 + i4] == cArr[i4]) {
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
