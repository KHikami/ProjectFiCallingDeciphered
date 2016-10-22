import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class ads implements OnClickListener {
    private /* synthetic */ adr a;

    ads(adr adr) {
        this.a = adr;
    }

    public final void onClick(View view) {
        if (this.a.f != null) {
            this.a.f.a(this.a.x);
        }
    }
}
