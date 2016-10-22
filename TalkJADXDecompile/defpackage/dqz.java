package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;
import java.util.ArrayList;

/* renamed from: dqz */
public final class dqz extends BaseAdapter implements WrapperListAdapter {
    final dqq a;
    private final ArrayList<dqw> b;
    private final int c;
    private final InviteListFragment d;

    dqz(dqq dqq, int i, InviteListFragment inviteListFragment) {
        this.b = new ArrayList();
        this.a = dqq;
        this.c = i;
        this.d = inviteListFragment;
        a(dqq.a());
        this.a.registerDataSetObserver(new dra(this));
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return this.a.getCount() + this.b.size();
    }

    public Object getItem(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.a == i3) {
                return dqw;
            }
            int i4;
            if (dqw.a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.a.getItem(i3);
    }

    public int getViewTypeCount() {
        return this.a.getViewTypeCount() + 1;
    }

    public int getItemViewType(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.a == i3) {
                return this.a.getViewTypeCount();
            }
            int i4;
            if (dqw.a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.a.getItemViewType(i3);
    }

    public long getItemId(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.a == i3) {
                return -1;
            }
            int i4;
            if (dqw.a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.a.getItemId(i3);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.a == i3) {
                return dqw.a(viewGroup, this.d.e);
            }
            int i4;
            if (dqw.a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.a.getView(i3, view, viewGroup);
    }

    void a(Cursor cursor) {
        this.b.clear();
        if (cursor != null && cursor.getCount() > 0) {
            this.b.add(new dqw(ba.lA, gwb.qN, 0));
            if (cursor.moveToFirst()) {
                while (cursor.getInt(27) != 2) {
                    if (!cursor.moveToNext()) {
                        return;
                    }
                }
                if (cursor.getPosition() == 0) {
                    this.b.remove(0);
                }
                this.b.add(new dqw(ba.lI, gwb.qR, cursor.getPosition()));
            }
        }
    }

    public ListAdapter getWrappedAdapter() {
        return this.a;
    }
}
