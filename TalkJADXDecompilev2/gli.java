package defpackage;

import android.view.Choreographer.FrameCallback;
import java.util.concurrent.TimeUnit;

final class gli implements FrameCallback {
    final /* synthetic */ glh a;

    gli(glh glh) {
        this.a = glh;
    }

    public void doFrame(long j) {
        long toSeconds = TimeUnit.NANOSECONDS.toSeconds(j);
        if (toSeconds != this.a.b) {
            if (this.a.b != 0) {
                String str = this.a.a;
                new StringBuilder(String.valueOf(str).length() + 16).append(str).append(" FPS ").append(this.a.c);
            }
            this.a.c = 0;
            this.a.b = toSeconds;
        }
        glh glh = this.a;
        glh.c++;
        this.a.c();
    }
}
