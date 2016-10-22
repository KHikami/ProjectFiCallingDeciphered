public final class kgt extends kgw {
    private static final char[] a;
    private static final char[] b;
    private final boolean c;
    private final boolean[] d;

    static {
        a = new char[]{'+'};
        b = "0123456789ABCDEF".toCharArray();
    }

    public kgt(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        } else {
            this.c = z;
            this.d = b(str);
        }
    }

    private static boolean[] b(String str) {
        int i;
        int i2 = 0;
        char[] toCharArray = str.toCharArray();
        int i3 = 122;
        for (char max : toCharArray) {
            i3 = Math.max(max, i3);
        }
        boolean[] zArr = new boolean[(i3 + 1)];
        for (i = 48; i <= 57; i++) {
            zArr[i] = true;
        }
        for (i = 65; i <= 90; i++) {
            zArr[i] = true;
        }
        for (i = 97; i <= 122; i++) {
            zArr[i] = true;
        }
        i = toCharArray.length;
        while (i2 < i) {
            zArr[toCharArray[i2]] = true;
            i2++;
        }
        return zArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int a(java.lang.CharSequence r3, int r4, int r5) {
        /*
        r2 = this;
    L_0x0000:
        if (r4 >= r5) goto L_0x0014;
    L_0x0002:
        r0 = r3.charAt(r4);
        r1 = r2.d;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0014;
    L_0x000b:
        r1 = r2.d;
        r0 = r1[r0];
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r4 = r4 + 1;
        goto L_0x0000;
    L_0x0014:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: kgt.a(java.lang.CharSequence, int, int):int");
    }

    public String a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= this.d.length || !this.d[charAt]) {
                int length2 = str.length();
                int i2 = 0;
                char[] cArr = (char[]) kgu.a.get();
                int i3 = i;
                length = 0;
                while (i3 < length2) {
                    if (i3 < length2) {
                        int i4 = i3 + 1;
                        i = str.charAt(i3);
                        if (i >= 55296 && i <= 57343) {
                            if (i > 56319) {
                                throw new IllegalArgumentException("Unexpected low surrogate character '" + i + "' with value " + i + " at index " + (i4 - 1));
                            } else if (i4 == length2) {
                                i = -i;
                            } else {
                                char charAt2 = str.charAt(i4);
                                if (Character.isLowSurrogate(charAt2)) {
                                    i = Character.toCodePoint(i, charAt2);
                                } else {
                                    throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + charAt2 + " at index " + i4);
                                }
                            }
                        }
                        if (i < 0) {
                            throw new IllegalArgumentException("Trailing high surrogate at end of input");
                        }
                        int i5;
                        Object a = a(i);
                        i = (Character.isSupplementaryCodePoint(i) ? 2 : 1) + i3;
                        if (a != null) {
                            int i6 = i3 - i2;
                            int length3 = (length + i6) + a.length;
                            if (cArr.length < length3) {
                                cArr = kgw.a(cArr, length, ((length3 + length2) - i3) + 32);
                            }
                            if (i6 > 0) {
                                str.getChars(i2, i3, cArr, length);
                                length += i6;
                            }
                            if (a.length > 0) {
                                System.arraycopy(a, 0, cArr, length, a.length);
                                length += a.length;
                            }
                            i2 = length;
                            length = i;
                        } else {
                            i5 = i2;
                            i2 = length;
                            length = i5;
                        }
                        i3 = a((CharSequence) str, i, length2);
                        i5 = i2;
                        i2 = length;
                        length = i5;
                    } else {
                        throw new IndexOutOfBoundsException("Index exceeds specified range");
                    }
                }
                i = length2 - i2;
                if (i > 0) {
                    i += length;
                    if (cArr.length < i) {
                        cArr = kgw.a(cArr, length, i);
                    }
                    str.getChars(i2, length2, cArr, length);
                    length = i;
                }
                return new String(cArr, 0, length);
            }
        }
        return str;
    }

    protected char[] a(int i) {
        if (i < this.d.length && this.d[i]) {
            return null;
        }
        if (i == 32 && this.c) {
            return a;
        }
        if (i <= 127) {
            return new char[]{'%', b[i & 15], b[i >>> 4]};
        } else if (i <= 2047) {
            r0 = new char[6];
            r0[0] = '%';
            r0[3] = '%';
            r0[5] = b[i & 15];
            r1 = i >>> 4;
            r0[4] = b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[2] = b[r1 & 15];
            r0[1] = b[(r1 >>> 4) | 12];
            return r0;
        } else if (i <= 65535) {
            r0 = new char[9];
            r1 = i >>> 4;
            r0[7] = b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[5] = b[r1 & 15];
            r1 >>>= 4;
            r0[4] = b[(r1 & 3) | 8];
            r0[2] = b[r1 >>> 2];
            return r0;
        } else if (i <= 1114111) {
            r0 = new char[12];
            r1 = i >>> 4;
            r0[10] = b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[8] = b[r1 & 15];
            r1 >>>= 4;
            r0[7] = b[(r1 & 3) | 8];
            r1 >>>= 2;
            r0[5] = b[r1 & 15];
            r1 >>>= 4;
            r0[4] = b[(r1 & 3) | 8];
            r0[2] = b[(r1 >>> 2) & 7];
            return r0;
        } else {
            throw new IllegalArgumentException("Invalid unicode character value " + i);
        }
    }
}
