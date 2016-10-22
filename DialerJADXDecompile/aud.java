import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* compiled from: PG */
final class aud implements OnCheckedChangeListener {
    private /* synthetic */ auc a;

    aud(auc auc) {
        this.a = auc;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b = z;
    }
}
