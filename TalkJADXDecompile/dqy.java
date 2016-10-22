import android.view.View;
import android.view.View.OnClickListener;

final class dqy implements OnClickListener {
    final /* synthetic */ dqs a;
    final /* synthetic */ dqw b;

    dqy(dqw dqw, dqs dqs) {
        this.b = dqw;
        this.a = dqs;
    }

    public void onClick(View view) {
        this.a.b("dismiss_high_affinity");
    }
}
