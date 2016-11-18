package defpackage;

import java.nio.ByteBuffer;

final class ouu implements ovn {
    final /* synthetic */ out a;

    ouu(out out) {
        this.a = out;
    }

    public void a() {
        int read = this.a.b.m.read(this.a.a);
        oup oup = this.a.b;
        ByteBuffer byteBuffer = this.a.a;
        if (read != -1) {
            oup.a.a(oup.n, byteBuffer);
            return;
        }
        oup.m.close();
        if (oup.f.compareAndSet(ovw.READING, ovw.COMPLETE)) {
            oup.d();
            oup.a.b(oup.n);
        }
    }
}
