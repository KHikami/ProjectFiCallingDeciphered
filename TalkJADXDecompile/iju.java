import com.google.android.libraries.hangouts.video.internal.Libjingle;

final class iju implements Runnable {
    final /* synthetic */ ijt a;

    iju(ijt ijt) {
        this.a = ijt;
    }

    public void run() {
        itx.a(6, "vclib", "Call termination timed out");
        Libjingle.nativeAbort("Call termination timed out");
    }
}
