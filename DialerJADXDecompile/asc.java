import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;

/* compiled from: PG */
public final class asc implements OnClickListener {
    private /* synthetic */ VoicemailPlaybackLayout a;

    public asc(VoicemailPlaybackLayout voicemailPlaybackLayout) {
        this.a = voicemailPlaybackLayout;
    }

    public final void onClick(View view) {
        boolean z = true;
        if (this.a.c != null) {
            asp asp = this.a.c;
            asp.o.a(!asp.m);
            if (asp.m) {
                z = false;
            }
            asp.a(z);
        }
    }
}
