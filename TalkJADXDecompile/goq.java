import android.view.View;
import android.view.View.OnClickListener;

final class goq implements OnClickListener {
    final /* synthetic */ gos a;
    final /* synthetic */ gon b;

    goq(gon gon, gos gos) {
        this.b = gon;
        this.a = gos;
    }

    public void onClick(View view) {
        this.a.a(this.b);
    }
}
