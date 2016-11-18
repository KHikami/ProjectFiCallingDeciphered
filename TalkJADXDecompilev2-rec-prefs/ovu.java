package p000;

import android.os.Build.VERSION;
import java.nio.ByteBuffer;

final class ovu implements ovn {
    final /* synthetic */ boolean f34396a;
    final /* synthetic */ ovo f34397b;

    ovu(ovo ovo, boolean z) {
        this.f34397b = ovo;
        this.f34396a = z;
    }

    public void mo4235a() {
        this.f34397b.f34385h = this.f34397b.f34383f.mo4188a();
        if (this.f34397b.f34385h == 0) {
            this.f34397b.m39774c();
            return;
        }
        if (this.f34397b.f34385h <= 0 || this.f34397b.f34385h >= 8192) {
            this.f34397b.f34384g = ByteBuffer.allocateDirect(8192);
        } else {
            this.f34397b.f34384g = ByteBuffer.allocateDirect(((int) this.f34397b.f34385h) + 1);
        }
        if (this.f34397b.f34385h > 0 && this.f34397b.f34385h <= 2147483647L) {
            this.f34397b.f34381d.setFixedLengthStreamingMode((int) this.f34397b.f34385h);
        } else if (this.f34397b.f34385h <= 2147483647L || VERSION.SDK_INT < 19) {
            this.f34397b.f34381d.setChunkedStreamingMode(8192);
        } else {
            this.f34397b.f34381d.setFixedLengthStreamingMode(this.f34397b.f34385h);
        }
        if (this.f34396a) {
            this.f34397b.m39772b();
            return;
        }
        this.f34397b.f34378a.set(ovv.AWAITING_REWIND_RESULT);
        this.f34397b.f34383f.mo4189a(this.f34397b);
    }
}
