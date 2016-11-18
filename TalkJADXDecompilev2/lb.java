package defpackage;

import java.io.Writer;

public final class lb extends Writer {
    private final String a;
    private StringBuilder b = new StringBuilder(128);

    public lb(String str) {
        this.a = str;
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.b.append(c);
            }
        }
    }

    private void a() {
        if (this.b.length() > 0) {
            StringBuilder stringBuilder = this.b;
            this.b.delete(0, this.b.length());
        }
    }
}
