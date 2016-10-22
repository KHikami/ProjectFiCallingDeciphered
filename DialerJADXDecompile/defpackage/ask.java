package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.voicemail.VoicemailArchiveActivity;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;

/* compiled from: PG */
/* renamed from: ask */
public final class ask implements OnClickListener {
    private /* synthetic */ VoicemailPlaybackLayout a;

    public ask(VoicemailPlaybackLayout voicemailPlaybackLayout) {
        this.a = voicemailPlaybackLayout;
    }

    public final void onClick(View view) {
        this.a.b.startActivity(new Intent(this.a.b, VoicemailArchiveActivity.class));
    }
}
