package p000;

final class kg {
    private static final byte[] f21628a = new byte[1792];
    private final String f21629b;
    private final boolean f21630c = false;
    private final int f21631d;
    private int f21632e;
    private char f21633f;

    static {
        for (int i = 0; i < 1792; i++) {
            f21628a[i] = Character.getDirectionality(i);
        }
    }

    kg(String str, boolean z) {
        this.f21629b = str;
        this.f21631d = str.length();
    }

    int m25764a() {
        this.f21632e = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (this.f21632e < this.f21631d && i == 0) {
            switch (m25762c()) {
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
        while (this.f21632e > 0) {
            switch (m25763d()) {
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

    int m25765b() {
        this.f21632e = this.f21631d;
        int i = 0;
        int i2 = 0;
        while (this.f21632e > 0) {
            switch (m25763d()) {
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

    private static byte m25761a(char c) {
        return c < '܀' ? f21628a[c] : Character.getDirectionality(c);
    }

    private byte m25762c() {
        this.f21633f = this.f21629b.charAt(this.f21632e);
        if (Character.isHighSurrogate(this.f21633f)) {
            int codePointAt = Character.codePointAt(this.f21629b, this.f21632e);
            this.f21632e += Character.charCount(codePointAt);
            return Character.getDirectionality(codePointAt);
        }
        this.f21632e++;
        byte a = kg.m25761a(this.f21633f);
        if (this.f21630c) {
            if (this.f21633f == '<') {
                int i = this.f21632e;
                while (this.f21632e < this.f21631d) {
                    String str = this.f21629b;
                    int i2 = this.f21632e;
                    this.f21632e = i2 + 1;
                    this.f21633f = str.charAt(i2);
                    if (this.f21633f == '>') {
                        return (byte) 12;
                    }
                    if (this.f21633f == '\"' || this.f21633f == '\'') {
                        char c = this.f21633f;
                        while (this.f21632e < this.f21631d) {
                            String str2 = this.f21629b;
                            int i3 = this.f21632e;
                            this.f21632e = i3 + 1;
                            char charAt = str2.charAt(i3);
                            this.f21633f = charAt;
                            if (charAt == c) {
                                break;
                            }
                        }
                    }
                }
                this.f21632e = i;
                this.f21633f = '<';
                return (byte) 13;
            } else if (this.f21633f == '&') {
                while (this.f21632e < this.f21631d) {
                    String str3 = this.f21629b;
                    int i4 = this.f21632e;
                    this.f21632e = i4 + 1;
                    char charAt2 = str3.charAt(i4);
                    this.f21633f = charAt2;
                    if (charAt2 == ';') {
                        return (byte) 12;
                    }
                }
                return (byte) 12;
            }
        }
        return a;
    }

    private byte m25763d() {
        this.f21633f = this.f21629b.charAt(this.f21632e - 1);
        if (Character.isLowSurrogate(this.f21633f)) {
            int codePointBefore = Character.codePointBefore(this.f21629b, this.f21632e);
            this.f21632e -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f21632e--;
        byte a = kg.m25761a(this.f21633f);
        if (this.f21630c) {
            int i;
            String str;
            int i2;
            if (this.f21633f == '>') {
                i = this.f21632e;
                while (this.f21632e > 0) {
                    str = this.f21629b;
                    i2 = this.f21632e - 1;
                    this.f21632e = i2;
                    this.f21633f = str.charAt(i2);
                    if (this.f21633f != '<') {
                        if (this.f21633f == '>') {
                            break;
                        } else if (this.f21633f == '\"' || this.f21633f == '\'') {
                            char c = this.f21633f;
                            while (this.f21632e > 0) {
                                String str2 = this.f21629b;
                                int i3 = this.f21632e - 1;
                                this.f21632e = i3;
                                char charAt = str2.charAt(i3);
                                this.f21633f = charAt;
                                if (charAt == c) {
                                    break;
                                }
                            }
                        }
                    } else {
                        return (byte) 12;
                    }
                }
                this.f21632e = i;
                this.f21633f = '>';
                return (byte) 13;
            } else if (this.f21633f == ';') {
                i = this.f21632e;
                while (this.f21632e > 0) {
                    str = this.f21629b;
                    i2 = this.f21632e - 1;
                    this.f21632e = i2;
                    this.f21633f = str.charAt(i2);
                    if (this.f21633f != '&') {
                        if (this.f21633f == ';') {
                            break;
                        }
                    }
                    return (byte) 12;
                }
                this.f21632e = i;
                this.f21633f = ';';
                return (byte) 13;
            }
        }
        return a;
    }
}
