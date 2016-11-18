package p000;

import java.nio.ByteBuffer;

final class ouu implements ovn {
    final /* synthetic */ out f34343a;

    ouu(out out) {
        this.f34343a = out;
    }

    public void mo4235a() {
        int read = this.f34343a.f34342b.f34330m.read(this.f34343a.f34341a);
        oup oup = this.f34343a.f34342b;
        ByteBuffer byteBuffer = this.f34343a.f34341a;
        if (read != -1) {
            oup.f34318a.m39764a(oup.f34331n, byteBuffer);
            return;
        }
        oup.f34330m.close();
        if (oup.f34323f.compareAndSet(ovw.READING, ovw.COMPLETE)) {
            oup.m39753d();
            oup.f34318a.m39766b(oup.f34331n);
        }
    }
}
