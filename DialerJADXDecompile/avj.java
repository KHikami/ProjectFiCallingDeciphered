import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class avj implements OnClickListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ avh b;

    avj(avh avh, AlertDialog alertDialog) {
        this.b = avh;
        this.a = alertDialog;
    }

    public final void onClick(View view) {
        this.a.getButton(-1).setEnabled(false);
        this.a.getButton(-2).setEnabled(false);
        this.b.a.a(new avk(this));
    }
}
