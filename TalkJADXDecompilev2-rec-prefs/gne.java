package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.BalanceView;
import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;

public final class gne implements OnClickListener {
    final /* synthetic */ BalanceView f15697a;

    public gne(BalanceView balanceView) {
        this.f15697a = balanceView;
    }

    public void onClick(View view) {
        bko e = fde.m15018e(this.f15697a.f6865b.mo2317a());
        if (e.m5622I() == 2) {
            this.f15697a.getContext().startActivity(gwb.m1543a(e, null));
        } else {
            VoiceRatesAndBalanceView.m9618a(this.f15697a.getContext());
        }
    }
}
