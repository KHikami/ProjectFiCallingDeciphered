package defpackage;

import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* renamed from: djg */
final class djg {
    final String a;
    final int b;
    int c;
    int d;
    int e;
    int f;
    char[] g;

    public djg(X500Principal x500Principal) {
        this.a = x500Principal.getName("RFC2253");
        this.b = this.a.length();
    }

    final String a() {
        while (this.c < this.b && this.g[this.c] == ' ') {
            this.c++;
        }
        if (this.c == this.b) {
            return null;
        }
        this.d = this.c;
        this.c++;
        while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] != ' ') {
            this.c++;
        }
        if (this.c >= this.b) {
            String str = "Unexpected end of DN: ";
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        this.e = this.c;
        if (this.g[this.c] == ' ') {
            while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] == ' ') {
                this.c++;
            }
            if (this.g[this.c] != '=' || this.c == this.b) {
                str = "Unexpected end of DN: ";
                valueOf = String.valueOf(this.a);
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        do {
            this.c++;
            if (this.c >= this.b) {
                break;
            }
        } while (this.g[this.c] == ' ');
        if (this.e - this.d > 4 && this.g[this.d + 3] == '.' && ((this.g[this.d] == 'O' || this.g[this.d] == 'o') && ((this.g[this.d + 1] == 'I' || this.g[this.d + 1] == 'i') && (this.g[this.d + 2] == 'D' || this.g[this.d + 2] == 'd')))) {
            this.d += 4;
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    final String b() {
        if (this.c + 4 >= this.b) {
            String str = "Unexpected end of DN: ";
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        int i;
        this.d = this.c;
        this.c++;
        while (this.c != this.b && this.g[this.c] != '+' && this.g[this.c] != ',' && this.g[this.c] != ';') {
            int i2;
            if (this.g[this.c] == ' ') {
                this.e = this.c;
                this.c++;
                while (this.c < this.b && this.g[this.c] == ' ') {
                    this.c++;
                }
                i = this.e - this.d;
                if (i >= 5 || (i & 1) == 0) {
                    str = "Unexpected end of DN: ";
                    valueOf = String.valueOf(this.a);
                    if (valueOf.length() == 0) {
                        valueOf = str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                    throw new IllegalStateException(valueOf);
                }
                byte[] bArr = new byte[(i / 2)];
                int i3 = this.d + 1;
                for (i2 = 0; i2 < bArr.length; i2++) {
                    bArr[i2] = (byte) a(i3);
                    i3 += 2;
                }
                return new String(this.g, this.d, i);
            }
            if (this.g[this.c] >= 'A' && this.g[this.c] <= 'F') {
                char[] cArr = this.g;
                i2 = this.c;
                cArr[i2] = (char) (cArr[i2] + 32);
            }
            this.c++;
        }
        this.e = this.c;
        i = this.e - this.d;
        if (i >= 5) {
        }
        str = "Unexpected end of DN: ";
        valueOf = String.valueOf(this.a);
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        throw new IllegalStateException(valueOf);
    }

    final String c() {
        this.d = this.c;
        this.e = this.c;
        while (this.c < this.b) {
            char[] cArr;
            int i;
            switch (this.g[this.c]) {
                case ' ':
                    this.f = this.e;
                    this.c++;
                    cArr = this.g;
                    i = this.e;
                    this.e = i + 1;
                    cArr[i] = ' ';
                    while (this.c < this.b && this.g[this.c] == ' ') {
                        cArr = this.g;
                        i = this.e;
                        this.e = i + 1;
                        cArr[i] = ' ';
                        this.c++;
                    }
                    if (this.c != this.b && this.g[this.c] != ',' && this.g[this.c] != '+' && this.g[this.c] != ';') {
                        break;
                    }
                    return new String(this.g, this.d, this.f - this.d);
                    break;
                case '+':
                case ',':
                case ';':
                    return new String(this.g, this.d, this.e - this.d);
                case '\\':
                    cArr = this.g;
                    i = this.e;
                    this.e = i + 1;
                    cArr[i] = d();
                    this.c++;
                    break;
                default:
                    cArr = this.g;
                    i = this.e;
                    this.e = i + 1;
                    cArr[i] = this.g[this.c];
                    this.c++;
                    break;
            }
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    final char d() {
        this.c++;
        if (this.c == this.b) {
            String str = "Unexpected end of DN: ";
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        switch (this.g[this.c]) {
            case ' ':
            case '\"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_':
                return this.g[this.c];
            default:
                return e();
        }
    }

    private final char e() {
        int a = a(this.c);
        this.c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        int i;
        if (a <= 223) {
            i = 1;
            a &= 31;
        } else if (a <= 239) {
            i = 2;
            a &= 15;
        } else {
            i = 3;
            a &= 7;
        }
        int i2 = a;
        for (a = 0; a < i; a++) {
            this.c++;
            if (this.c == this.b || this.g[this.c] != '\\') {
                return '?';
            }
            this.c++;
            int a2 = a(this.c);
            this.c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a2 & 63);
        }
        return (char) i2;
    }

    private final int a(int i) {
        if (i + 1 >= this.b) {
            String str = "Malformed DN: ";
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        int i2;
        int i3;
        char c = this.g[i];
        if (c >= '0' && c <= '9') {
            i2 = c - 48;
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 87;
        } else if (c < 'A' || c > 'F') {
            str = "Malformed DN: ";
            valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else {
            i2 = c - 55;
        }
        char c2 = this.g[i + 1];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - 48;
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 87;
        } else if (c2 < 'A' || c2 > 'F') {
            str = "Malformed DN: ";
            valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else {
            i3 = c2 - 55;
        }
        return (i2 << 4) + i3;
    }
}
