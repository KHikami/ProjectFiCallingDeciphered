import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;

/* compiled from: PG */
public final class ash implements OnSeekBarChangeListener {
    private /* synthetic */ VoicemailPlaybackLayout a;

    public ash(VoicemailPlaybackLayout voicemailPlaybackLayout) {
        this.a = voicemailPlaybackLayout;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.a.c != null) {
            asp asp = this.a.c;
            if (asp.g != null) {
                asp.n = asp.g.isPlaying();
            }
            asp.f();
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.a.c != null) {
            asp asp = this.a.c;
            asp.j = seekBar.getProgress();
            if (asp.n) {
                asp.n = false;
                asp.e();
            }
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.a(i, seekBar.getMax());
        if (z) {
            this.a.c.j = i;
        }
    }
}
