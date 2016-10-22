import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.voicemail.VoicemailPlaybackLayout;

/* compiled from: PG */
public final class asd implements OnClickListener {
    final /* synthetic */ VoicemailPlaybackLayout a;

    public asd(VoicemailPlaybackLayout voicemailPlaybackLayout) {
        this.a = voicemailPlaybackLayout;
    }

    public final void onClick(View view) {
        if (this.a.c != null) {
            this.a.c.f();
            asp asp = this.a.c;
            if (asp.p != null) {
                asp.p.a(asp.f);
            }
            Runnable ase = new ase(this, this.a.d);
            Handler handler = new Handler();
            handler.postDelayed(ase, 3050);
            Snackbar a = Snackbar.a(this.a, cob.cV, 0);
            a.d = 3000;
            a.a(cob.cW, new asf(this, handler, ase)).a(this.a.b.getResources().getColor(cob.ac)).a();
        }
    }
}
