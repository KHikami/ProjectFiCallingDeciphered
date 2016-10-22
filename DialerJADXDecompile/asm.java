import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
public final class asm implements Runnable {
    public final ScheduledExecutorService a;
    public final Object b;
    int c;
    public ScheduledFuture d;
    final /* synthetic */ VoicemailPlaybackLayout e;
    private Runnable f;

    public asm(VoicemailPlaybackLayout voicemailPlaybackLayout, int i, ScheduledExecutorService scheduledExecutorService) {
        this.e = voicemailPlaybackLayout;
        this.b = new Object();
        this.f = new asn(this);
        this.c = i;
        this.a = scheduledExecutorService;
    }

    public final void run() {
        this.e.post(this.f);
    }

    public final void a() {
        synchronized (this.b) {
            b();
        }
    }

    public final void b() {
        if (this.d != null) {
            this.d.cancel(true);
            this.d = null;
        }
        this.e.removeCallbacks(this.f);
    }
}
