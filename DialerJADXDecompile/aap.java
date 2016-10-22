import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class aap implements OnClickListener {
    private sg a;
    private /* synthetic */ aao b;

    aap(aao aao) {
        this.b = aao;
        this.a = new sg(this.b.a.getContext(), 0, 16908332, 0, 0, this.b.b);
    }

    public final void onClick(View view) {
        if (this.b.c != null && this.b.d) {
            this.b.c.onMenuItemSelected(0, this.a);
        }
    }
}
