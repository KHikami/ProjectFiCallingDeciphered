package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

public final class dcu extends rw {
    final /* synthetic */ HiddenContactsFragment f9521j;

    public dcu(HiddenContactsFragment hiddenContactsFragment, Context context, Cursor cursor) {
        this.f9521j = hiddenContactsFragment;
        super(context, null);
        this.d = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i < getCount()) {
            int i2;
            View view2 = super.getView(i, view, viewGroup);
            Button button = (Button) view2.findViewById(ba.gc);
            boolean containsKey = this.f9521j.f6266c.containsKey(((gpa) view2).m18251a().f11244a);
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
            return m11459a(this.d, a(), viewGroup);
        } else {
            return view;
        }
    }

    public boolean isEnabled(int i) {
        return false;
    }

    public Cursor m11461b(Cursor cursor) {
        return super.b(cursor);
    }

    public void m11460a(View view, Cursor cursor) {
        gpa gpa = (gpa) view;
        gpa.m18254a(cursor.getString(3));
        gpa.m18255a(cursor.getString(4), cursor.getString(3), fde.m15018e(this.f9521j.f6264a.mo2317a()));
        gpa.m18252a(new edo(cursor.getString(2), cursor.getString(1)));
    }

    public boolean isEmpty() {
        if (a() == null) {
            return true;
        }
        return super.isEmpty();
    }

    public View m11459a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View gpa = new gpa(context);
        gpa.m18253a(this.f9521j.f6267d);
        return gpa;
    }
}
