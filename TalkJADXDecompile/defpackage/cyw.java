package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.hangouts.fragments.BlockedContactsFragment;
import rw;

/* renamed from: cyw */
public final class cyw extends rw {
    final /* synthetic */ BlockedContactsFragment j;

    public cyw(BlockedContactsFragment blockedContactsFragment, Context context, Cursor cursor) {
        this.j = blockedContactsFragment;
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
                for (int i3 = 0; i3 < this.j.e.size(); i3++) {
                    if (((cyy) this.j.e.c(i3)).a.a(gnh.a())) {
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
            return a(this.d, a(), viewGroup);
        } else {
            return view;
        }
    }

    public boolean isEnabled(int i) {
        return false;
    }

    public Cursor b(Cursor cursor) {
        return super.b(cursor);
    }

    public void a(View view, Cursor cursor) {
        gnh gnh = (gnh) view;
        String d = gld.d(cursor.getString(3));
        gnh.a(d);
        gnh.a(cursor.getString(4), d, this.j.a);
        gnh.a(new edo(cursor.getString(2), cursor.getString(1)));
    }

    public boolean isEmpty() {
        if (a() == null) {
            return true;
        }
        return super.isEmpty();
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View gnh = new gnh(context);
        gnh.a(this.j.f);
        return gnh;
    }
}
