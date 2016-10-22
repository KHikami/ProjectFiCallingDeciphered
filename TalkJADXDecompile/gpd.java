import android.view.View;
import android.view.View.OnClickListener;

final class gpd implements OnClickListener {
    final /* synthetic */ gpc a;

    gpd(gpc gpc) {
        this.a = gpc;
    }

    public void onClick(View view) {
        if (!this.a.d.c()) {
            if (this.a.d.h()) {
                this.a.c.c(this.a.d.u());
            } else {
                this.a.c.a((gpc) view, this.a.a, this.a.b);
            }
        }
    }
}
