import android.database.Cursor;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class cpx implements gpi {
    public void a(bko bko, MessageListItemView messageListItemView, Cursor cursor) {
        int i;
        if (fdq.u.b(bko.g()) && messageListItemView.r() == -1) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            cpw cpz = new cpz(messageListItemView, bko.g(), cursor);
            messageListItemView.a(cpz);
            if (cpz.n()) {
                cpz.m().setVisibility(0);
                cpz.m().setOnClickListener(new cpy(this, cpz));
                return;
            }
            cpz.m().setVisibility(8);
            cpz.m().setOnClickListener(null);
        }
    }
}
