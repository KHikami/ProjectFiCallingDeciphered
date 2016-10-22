import android.view.View;
import android.view.View.OnClickListener;

final class dtw implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ dtv b;

    dtw(dtv dtv, String str) {
        this.b = dtv;
        this.a = str;
    }

    public void onClick(View view) {
        this.b.getContext().startActivity(gwb.C(this.a));
    }
}
