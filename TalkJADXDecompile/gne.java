import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.BalanceView;
import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;

public final class gne implements OnClickListener {
    final /* synthetic */ BalanceView a;

    public gne(BalanceView balanceView) {
        this.a = balanceView;
    }

    public void onClick(View view) {
        bko e = fde.e(this.a.b.a());
        if (e.I() == 2) {
            this.a.getContext().startActivity(gwb.a(e, null));
        } else {
            VoiceRatesAndBalanceView.a(this.a.getContext());
        }
    }
}
