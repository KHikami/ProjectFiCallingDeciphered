package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;

/* compiled from: PG */
/* renamed from: asg */
public final class asg implements OnClickListener {
    private /* synthetic */ VoicemailPlaybackLayout a;

    public asg(VoicemailPlaybackLayout voicemailPlaybackLayout) {
        this.a = voicemailPlaybackLayout;
    }

    public final void onClick(View view) {
        if (this.a.c != null) {
            if (this.a.e) {
                this.a.c.f();
            } else {
                this.a.c.e();
            }
        }
    }
}
