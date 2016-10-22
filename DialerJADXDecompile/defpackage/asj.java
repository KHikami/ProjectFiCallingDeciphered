package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;

/* compiled from: PG */
/* renamed from: asj */
public final class asj implements OnClickListener {
    private /* synthetic */ VoicemailPlaybackLayout a;

    public asj(VoicemailPlaybackLayout voicemailPlaybackLayout) {
        this.a = voicemailPlaybackLayout;
    }

    public final void onClick(View view) {
        if (this.a.c != null) {
            VoicemailPlaybackLayout voicemailPlaybackLayout = this.a;
            if (!VoicemailPlaybackLayout.c(this.a.d)) {
                this.a.i();
                this.a.c.c(this.a.d, false);
            }
        }
    }
}
