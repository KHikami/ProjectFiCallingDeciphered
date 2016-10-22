package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;
import rw;

/* renamed from: dcu */
public final class dcu extends rw {
    final /* synthetic */ HiddenContactsFragment j;

    public dcu(HiddenContactsFragment hiddenContactsFragment, Context context, Cursor cursor) {
        this.j = hiddenContactsFragment;
        super(context, null);
        this.d = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i < getCount()) {
            int i2;
            View view2 = super.getView(i, view, viewGroup);
            Button button = (Button) view2.findViewById(ba.gc);
            boolean containsKey = this.j.c.containsKey(((gpa) view2).a().a);
            if (containsKey) {
                i2 = bc.tw;
            } else {
                i2 = bc.tv;
            }
            boolean z = !containsKey;
            button.setText(i2);
            button.setClickable(z);
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
        gpa gpa = (gpa) view;
        gpa.a(cursor.getString(3));
        gpa.a(cursor.getString(4), cursor.getString(3), fde.e(this.j.a.a()));
        gpa.a(new edo(cursor.getString(2), cursor.getString(1)));
    }

    public boolean isEmpty() {
        if (a() == null) {
            return true;
        }
        return super.isEmpty();
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View gpa = new gpa(context);
        gpa.a(this.j.d);
        return gpa;
    }
}
