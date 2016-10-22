import android.view.View;
import android.view.View.OnClickListener;

final class gqy implements OnClickListener {
    final /* synthetic */ bko a;
    final /* synthetic */ dr b;
    final /* synthetic */ gqx c;

    gqy(gqx gqx, bko bko, dr drVar) {
        this.c = gqx;
        this.a = bko;
        this.b = drVar;
    }

    public void onClick(View view) {
        this.b.startActivity(gwb.e(this.a, this.c.a));
    }
}
