package p000;

import java.io.OutputStream;

public abstract class otj {
    final String f34252a;
    final String f34253b;
    final String f34254c;

    public abstract void mo4220a(OutputStream outputStream);

    public abstract String mo4221b();

    public abstract String mo4222c();

    public abstract long mo4223d();

    public abstract String mo4224e();

    public String m39687a() {
        return this.f34252a;
    }

    public otj(String str) {
        if (str == null) {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        this.f34252a = str;
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            this.f34253b = str.substring(0, indexOf);
            this.f34254c = str.substring(indexOf + 1);
            return;
        }
        this.f34253b = str;
        this.f34254c = null;
    }
}
