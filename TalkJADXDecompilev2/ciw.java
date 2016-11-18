package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class ciw extends erm {
    final /* synthetic */ TransportSpinner a;

    public ciw(TransportSpinner transportSpinner, Context context, kbu kbu, int i) {
        this.a = transportSpinner;
        super(context, kbu, i, etx.REACHABLE.l);
    }

    protected void c() {
        TransportSpinner transportSpinner = this.a;
        if (transportSpinner.c) {
            transportSpinner.c = false;
            transportSpinner.b.notifyDataSetChanged();
            transportSpinner.b();
        }
    }

    public void a(etu etu) {
        TransportSpinner transportSpinner = this.a;
        boolean a = etu.a(false);
        if (transportSpinner.c != a) {
            transportSpinner.c = a;
            transportSpinner.b.notifyDataSetChanged();
            transportSpinner.b();
        }
    }
}
