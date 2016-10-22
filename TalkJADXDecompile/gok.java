import android.view.View;
import android.view.View.OnClickListener;

final class gok implements OnClickListener {
    final /* synthetic */ dr a;
    final /* synthetic */ String b;
    final /* synthetic */ goj c;

    gok(goj goj, dr drVar, String str) {
        this.c = goj;
        this.a = drVar;
        this.b = str;
    }

    public void onClick(View view) {
        this.a.startActivity(gwb.C(this.b));
    }
}
