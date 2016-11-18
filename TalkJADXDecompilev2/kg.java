package defpackage;

final class kg {
    private static final byte[] a = new byte[1792];
    private final String b;
    private final boolean c = false;
    private final int d;
    private int e;
    private char f;

    static {
        for (int i = 0; i < 1792; i++) {
            a[i] = Character.getDirectionality(i);
        }
    }

    kg(String str, boolean z) {
        this.b = str;
        this.d = str.length();
    }

    int a() {
        this.e = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (this.e < this.d && i == 0) {
            switch (c()) {
                case (byte) 0:
                    if (i3 != 0) {
                        i = i3;
                        break;
                    }
                    return -1;
                case (byte) 1:
                case (byte) 2:
                    if (i3 != 0) {
                        i = i3;
                        break;
                    }
                    return 1;
                case (byte) 9:
                    break;
                case (byte) 14:
                case (byte) 15:
                    i3++;
                    i2 = -1;
                    break;
                case (byte) 16:
                case wi.dK /*17*/:
                    i3++;
                    i2 = 1;
                    break;
                case wi.dH /*18*/:
                    i3--;
                    i2 = 0;
                    break;
                default:
                    i = i3;
                    break;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (this.e > 0) {
            switch (d()) {
                case (byte) 14:
                case (byte) 15:
                    if (i != i3) {
                        i3--;
                        break;
                    }
                    return -1;
                case (byte) 16:
                case wi.dK /*17*/:
                    if (i != i3) {
                        i3--;
                        break;
                    }
                    return 1;
                case wi.dH /*18*/:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    int b() {
        this.e = this.d;
        int i = 0;
        int i2 = 0;
        while (this.e > 0) {
            switch (d()) {
                case (byte) 0:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return -1;
                case (byte) 1:
                case (byte) 2:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return 1;
                case (byte) 9:
                    break;
                case (byte) 14:
                case (byte) 15:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return -1;
                case (byte) 16:
                case wi.dK /*17*/:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return 1;
                case wi.dH /*18*/:
                    i2++;
                    break;
                default:
                    if (i != 0) {
                        break;
                    }
                    i = i2;
                    break;
            }
        }
        return 0;
    }

    private static byte a(char c) {
        return c < '܀' ? a[c] : Character.getDirectionality(c);
    }

    private byte c() {
        this.f = this.b.charAt(this.e);
        if (Character.isHighSurrogate(this.f)) {
            int codePointAt = Character.codePointAt(this.b, this.e);
            this.e += Character.charCount(codePointAt);
            return Character.getDirectionality(codePointAt);
        }
        this.e++;
        byte a = kg.a(this.f);
        if (this.c) {
            if (this.f == '<') {
                int i = this.e;
                while (this.e < this.d) {
                    String str = this.b;
                    int i2 = this.e;
                    this.e = i2 + 1;
                    this.f = str.charAt(i2);
                    if (this.f == '>') {
                        return (byte) 12;
                    }
                    if (this.f == '\"' || this.f == '\'') {
                        char c = this.f;
                        while (this.e < this.d) {
                            String str2 = this.b;
                            int i3 = this.e;
                            this.e = i3 + 1;
                            char charAt = str2.charAt(i3);
                            this.f = charAt;
                            if (charAt == c) {
                                break;
                            }
                        }
                    }
                }
                this.e = i;
                this.f = '<';
                return (byte) 13;
            } else if (this.f == '&') {
                while (this.e < this.d) {
                    String str3 = this.b;
                    int i4 = this.e;
                    this.e = i4 + 1;
                    char charAt2 = str3.charAt(i4);
                    this.f = charAt2;
                    if (charAt2 == ';') {
                        return (byte) 12;
                    }
                }
                return (byte) 12;
            }
        }
        return a;
    }

    private byte d() {
        this.f = this.b.charAt(this.e - 1);
        if (Character.isLowSurrogate(this.f)) {
            int codePointBefore = Character.codePointBefore(this.b, this.e);
            this.e -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.e--;
        byte a = kg.a(this.f);
        if (this.c) {
            int i;
            String str;
            int i2;
            if (this.f == '>') {
                i = this.e;
                while (this.e > 0) {
                    str = this.b;
                    i2 = this.e - 1;
                    this.e = i2;
                    this.f = str.charAt(i2);
                    if (this.f != '<') {
                        if (this.f == '>') {
                            break;
                        } else if (this.f == '\"' || this.f == '\'') {
                            char c = this.f;
                            while (this.e > 0) {
                                String str2 = this.b;
                                int i3 = this.e - 1;
                                this.e = i3;
                                char charAt = str2.charAt(i3);
                                this.f = charAt;
                                if (charAt == c) {
                                    break;
                                }
                            }
                        }
                    } else {
                        return (byte) 12;
                    }
                }
                this.e = i;
                this.f = '>';
                return (byte) 13;
            } else if (this.f == ';') {
                i = this.e;
                while (this.e > 0) {
                    str = this.b;
                    i2 = this.e - 1;
                    this.e = i2;
                    this.f = str.charAt(i2);
                    if (this.f != '&') {
                        if (this.f == ';') {
                            break;
                        }
                    }
                    return (byte) 12;
                }
                this.e = i;
                this.f = ';';
                return (byte) 13;
            }
        }
        return a;
    }
}
