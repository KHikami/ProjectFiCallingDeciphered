import java.io.Writer;

/* compiled from: PG */
public final class hy extends Writer {
    private final String a;
    private StringBuilder b;

    public hy(String str) {
        this.b = new StringBuilder(128);
        this.a = str;
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.b.append(c);
            }
        }
    }

    private final void a() {
        if (this.b.length() > 0) {
            StringBuilder stringBuilder = this.b;
            this.b.delete(0, this.b.length());
        }
    }
}
