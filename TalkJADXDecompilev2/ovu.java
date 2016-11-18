package defpackage;

import android.os.Build.VERSION;
import java.nio.ByteBuffer;

final class ovu implements ovn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ovo b;

    ovu(ovo ovo, boolean z) {
        this.b = ovo;
        this.a = z;
    }

    public void a() {
        this.b.h = this.b.f.a();
        if (this.b.h == 0) {
            this.b.c();
            return;
        }
        if (this.b.h <= 0 || this.b.h >= 8192) {
            this.b.g = ByteBuffer.allocateDirect(8192);
        } else {
            this.b.g = ByteBuffer.allocateDirect(((int) this.b.h) + 1);
        }
        if (this.b.h > 0 && this.b.h <= 2147483647L) {
            this.b.d.setFixedLengthStreamingMode((int) this.b.h);
        } else if (this.b.h <= 2147483647L || VERSION.SDK_INT < 19) {
            this.b.d.setChunkedStreamingMode(8192);
        } else {
            this.b.d.setFixedLengthStreamingMode(this.b.h);
        }
        if (this.a) {
            this.b.b();
            return;
        }
        this.b.a.set(ovv.AWAITING_REWIND_RESULT);
        this.b.f.a(this.b);
    }
}
