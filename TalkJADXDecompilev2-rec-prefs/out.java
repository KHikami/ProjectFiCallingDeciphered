package p000;

import java.nio.ByteBuffer;

final class out implements Runnable {
    final /* synthetic */ ByteBuffer f34341a;
    final /* synthetic */ oup f34342b;

    out(oup oup, ByteBuffer byteBuffer) {
        this.f34342b = oup;
        this.f34341a = byteBuffer;
    }

    public void run() {
        this.f34342b.f34319b.execute(this.f34342b.m39741a(ovw.READING, new ouu(this)));
    }
}
