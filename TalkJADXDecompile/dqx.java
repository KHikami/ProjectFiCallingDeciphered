import android.view.View;
import android.view.View.OnClickListener;

final class dqx implements OnClickListener {
    final /* synthetic */ dqs a;
    final /* synthetic */ dqw b;

    dqx(dqw dqw, dqs dqs) {
        this.b = dqw;
        this.a = dqs;
    }

    public void onClick(View view) {
        this.a.b("dismiss_low_affinity");
    }
}
