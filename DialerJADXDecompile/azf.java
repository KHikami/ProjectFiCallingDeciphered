import android.view.View;
import android.view.View.OnClickListener;
import com.android.incallui.InCallActivity;

/* compiled from: PG */
final class azf implements OnClickListener {
    private /* synthetic */ ayv a;

    azf(ayv ayv) {
        this.a = ayv;
    }

    public final void onClick(View view) {
        ((InCallActivity) this.a.getActivity()).c(true);
    }
}
