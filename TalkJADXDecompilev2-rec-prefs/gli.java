package p000;

import android.view.Choreographer.FrameCallback;
import java.util.concurrent.TimeUnit;

final class gli implements FrameCallback {
    final /* synthetic */ glh f15546a;

    gli(glh glh) {
        this.f15546a = glh;
    }

    public void doFrame(long j) {
        long toSeconds = TimeUnit.NANOSECONDS.toSeconds(j);
        if (toSeconds != this.f15546a.f15543b) {
            if (this.f15546a.f15543b != 0) {
                String str = this.f15546a.f15542a;
                new StringBuilder(String.valueOf(str).length() + 16).append(str).append(" FPS ").append(this.f15546a.f15544c);
            }
            this.f15546a.f15544c = 0;
            this.f15546a.f15543b = toSeconds;
        }
        glh glh = this.f15546a;
        glh.f15544c++;
        this.f15546a.m17955c();
    }
}
