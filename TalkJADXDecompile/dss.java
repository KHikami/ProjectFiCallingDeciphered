import android.view.View;
import android.view.View.OnClickListener;

final class dss implements OnClickListener {
    final /* synthetic */ dso a;

    dss(dso dso) {
        this.a = dso;
    }

    public void onClick(View view) {
        if (this.a.c() != null) {
            this.a.c().dismiss();
        }
    }
}
