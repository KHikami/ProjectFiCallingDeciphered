package p000;

import android.database.Cursor;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class cpx implements gpi {
    public void mo1378a(bko bko, MessageListItemView messageListItemView, Cursor cursor) {
        int i;
        if (fdq.f12805u.m14370b(bko.m5638g()) && messageListItemView.m9496r() == -1) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            cpw cpz = new cpz(messageListItemView, bko.m5638g(), cursor);
            messageListItemView.m9471a(cpz);
            if (cpz.mo734n()) {
                cpz.mo733m().setVisibility(0);
                cpz.mo733m().setOnClickListener(new cpy(this, cpz));
                return;
            }
            cpz.mo733m().setVisibility(8);
            cpz.mo733m().setOnClickListener(null);
        }
    }
}
