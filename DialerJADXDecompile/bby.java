import android.os.Handler;
import android.os.Message;
import com.android.incallui.GlowPadWrapper;

/* compiled from: PG */
public final class bby extends Handler {
    private /* synthetic */ GlowPadWrapper a;

    public bby(GlowPadWrapper glowPadWrapper) {
        this.a = glowPadWrapper;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 101:
                this.a.c();
            default:
        }
    }
}
