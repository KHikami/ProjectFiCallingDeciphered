package p000;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;
import java.util.ArrayList;

public final class dqz extends BaseAdapter implements WrapperListAdapter {
    final dqq f10378a;
    private final ArrayList<dqw> f10379b = new ArrayList();
    private final int f10380c;
    private final InviteListFragment f10381d;

    dqz(dqq dqq, int i, InviteListFragment inviteListFragment) {
        this.f10378a = dqq;
        this.f10380c = i;
        this.f10381d = inviteListFragment;
        m12525a(dqq.a());
        this.f10378a.registerDataSetObserver(new dra(this));
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return this.f10378a.getCount() + this.f10379b.size();
    }

    public Object getItem(int i) {
        ArrayList arrayList = this.f10379b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.f10371a == i3) {
                return dqw;
            }
            int i4;
            if (dqw.f10371a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.f10378a.getItem(i3);
    }

    public int getViewTypeCount() {
        return this.f10378a.getViewTypeCount() + 1;
    }

    public int getItemViewType(int i) {
        ArrayList arrayList = this.f10379b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.f10371a == i3) {
                return this.f10378a.getViewTypeCount();
            }
            int i4;
            if (dqw.f10371a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.f10378a.getItemViewType(i3);
    }

    public long getItemId(int i) {
        ArrayList arrayList = this.f10379b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.f10371a == i3) {
                return -1;
            }
            int i4;
            if (dqw.f10371a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.f10378a.getItemId(i3);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ArrayList arrayList = this.f10379b;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dqw dqw = (dqw) obj;
            if (dqw.f10371a == i3) {
                return dqw.m12524a(viewGroup, this.f10381d.f6479e);
            }
            int i4;
            if (dqw.f10371a < i3) {
                i4 = i3 - 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        return this.f10378a.getView(i3, view, viewGroup);
    }

    void m12525a(Cursor cursor) {
        this.f10379b.clear();
        if (cursor != null && cursor.getCount() > 0) {
            this.f10379b.add(new dqw(ba.lA, gwb.qN, 0));
            if (cursor.moveToFirst()) {
                while (cursor.getInt(27) != 2) {
                    if (!cursor.moveToNext()) {
                        return;
                    }
                }
                if (cursor.getPosition() == 0) {
                    this.f10379b.remove(0);
                }
                this.f10379b.add(new dqw(ba.lI, gwb.qR, cursor.getPosition()));
            }
        }
    }

    public ListAdapter getWrappedAdapter() {
        return this.f10378a;
    }
}
