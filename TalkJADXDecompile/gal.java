import android.view.View;
import android.view.View.OnClickListener;

final class gal implements OnClickListener {
    boolean a;
    final /* synthetic */ gag b;
    final /* synthetic */ gan c;
    final /* synthetic */ gai d;

    gal(gai gai, gag gag, gan gan) {
        this.d = gai;
        this.b = gag;
        this.c = gan;
        this.a = false;
    }

    public void onClick(View view) {
        if (!this.a) {
            this.d.b(this.b);
            this.c.onClick(view);
            this.a = true;
        }
    }
}
