package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class civ extends ciy implements OnClickListener {
    private final TransportSpinner f5401a;

    public String mo980a() {
        return gwb.m1400H().getResources().getString(bc.ha);
    }

    public int mo981b() {
        return R$drawable.bt;
    }

    public void onClick(View view) {
        this.f5401a.m8350a();
    }

    public civ(TransportSpinner transportSpinner) {
        this.f5401a = transportSpinner;
    }
}
