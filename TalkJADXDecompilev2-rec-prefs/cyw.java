package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.hangouts.fragments.BlockedContactsFragment;

public final class cyw extends rw {
    final /* synthetic */ BlockedContactsFragment f9361j;

    public cyw(BlockedContactsFragment blockedContactsFragment, Context context, Cursor cursor) {
        this.f9361j = blockedContactsFragment;
        super(context, null);
        this.d = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (i < super.getCount() || i < getCount()) {
            View view2 = super.getView(i, view, viewGroup);
            if (gnh.class.isInstance(view2)) {
                boolean z2;
                int i2;
                gnh gnh = (gnh) view2;
                Button button = (Button) gnh.findViewById(ba.gb);
                for (int i3 = 0; i3 < this.f9361j.f6239e.size(); i3++) {
                    if (((cyy) this.f9361j.f6239e.m28018c(i3)).f9363a.m13608a(gnh.m18156a())) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                if (z2) {
                    i2 = bc.tu;
                } else {
                    i2 = bc.tt;
                }
                if (!z2) {
                    z = true;
                }
                button.setText(i2);
                button.setClickable(z);
            }
            return view2;
        } else if (view == null) {
            return m11316a(this.d, a(), viewGroup);
        } else {
            return view;
        }
    }

    public boolean isEnabled(int i) {
        return false;
    }

    public Cursor m11318b(Cursor cursor) {
        return super.b(cursor);
    }

    public void m11317a(View view, Cursor cursor) {
        gnh gnh = (gnh) view;
        String d = gld.m17947d(cursor.getString(3));
        gnh.m18159a(d);
        gnh.m18160a(cursor.getString(4), d, this.f9361j.f6235a);
        gnh.m18157a(new edo(cursor.getString(2), cursor.getString(1)));
    }

    public boolean isEmpty() {
        if (a() == null) {
            return true;
        }
        return super.isEmpty();
    }

    public View m11316a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View gnh = new gnh(context);
        gnh.m18158a(this.f9361j.f6240f);
        return gnh;
    }
}
