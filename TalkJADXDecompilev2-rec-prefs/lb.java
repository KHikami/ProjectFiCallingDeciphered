package p000;

import java.io.Writer;

public final class lb extends Writer {
    private final String f24447a;
    private StringBuilder f24448b = new StringBuilder(128);

    public lb(String str) {
        this.f24447a = str;
    }

    public void close() {
        m28433a();
    }

    public void flush() {
        m28433a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m28433a();
            } else {
                this.f24448b.append(c);
            }
        }
    }

    private void m28433a() {
        if (this.f24448b.length() > 0) {
            StringBuilder stringBuilder = this.f24448b;
            this.f24448b.delete(0, this.f24448b.length());
        }
    }
}
