package defpackage;

import java.io.OutputStream;

public abstract class otj {
    final String a;
    final String b;
    final String c;

    public abstract void a(OutputStream outputStream);

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract String e();

    public String a() {
        return this.a;
    }

    public otj(String str) {
        if (str == null) {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        this.a = str;
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            this.b = str.substring(0, indexOf);
            this.c = str.substring(indexOf + 1);
            return;
        }
        this.b = str;
        this.c = null;
    }
}
