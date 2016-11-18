package p000;

import android.content.Context;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class ciw extends erm {
    final /* synthetic */ TransportSpinner f5410a;

    public ciw(TransportSpinner transportSpinner, Context context, kbu kbu, int i) {
        this.f5410a = transportSpinner;
        super(context, kbu, i, etx.REACHABLE.f12271l);
    }

    protected void mo983c() {
        TransportSpinner transportSpinner = this.f5410a;
        if (transportSpinner.f6088c) {
            transportSpinner.f6088c = false;
            transportSpinner.f6087b.notifyDataSetChanged();
            transportSpinner.m8355b();
        }
    }

    public void mo982a(etu etu) {
        TransportSpinner transportSpinner = this.f5410a;
        boolean a = etu.m14516a(false);
        if (transportSpinner.f6088c != a) {
            transportSpinner.f6088c = a;
            transportSpinner.f6087b.notifyDataSetChanged();
            transportSpinner.m8355b();
        }
    }
}
