package p000;

import android.database.Cursor;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;
import android.widget.ListAdapter;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.listui.SwipeableListView;

public class era {
    public final eqy f12098a = new eqy(this);
    public final /* synthetic */ ConversationListFragment f12099b;

    public boolean m14299a(eqy eqy, Menu menu) {
        this.f12099b.am = eqy;
        this.f12099b.getActivity().getMenuInflater().inflate(gwb.hJ, menu);
        this.f12099b.f6261g.B_();
        this.f12099b.getActivity().findViewById(ba.cm).setVisibility(4);
        return true;
    }

    public boolean m14301b(eqy eqy, Menu menu) {
        int i;
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        int i3;
        for (i = 0; i < menu.size(); i++) {
            menu.getItem(i).setVisible(false);
        }
        Object obj4 = null;
        Object obj5 = 1;
        Object obj6 = 1;
        Object obj7 = 1;
        Object obj8 = 1;
        Object obj9 = null;
        SparseBooleanArray checkedItemPositions = ((SwipeableListView) this.f12099b.bI).getCheckedItemPositions();
        int size = checkedItemPositions.size();
        ListAdapter b = this.f12099b.m8499b();
        if (b == null) {
            i2 = 0;
        } else {
            i2 = b.getCount();
        }
        i = 0;
        Object obj10 = 1;
        int i4;
        if ((i2 - ((SwipeableListView) this.f12099b.bI).getHeaderViewsCount()) - ((SwipeableListView) this.f12099b.bI).getFooterViewsCount() > 0) {
            Object obj11;
            Object obj12;
            int i5 = 0;
            obj = null;
            obj2 = null;
            while (i5 < size) {
                if (checkedItemPositions.valueAt(i5)) {
                    int i6 = i + 1;
                    Cursor a = this.f12099b.m8489a(checkedItemPositions.keyAt(i5));
                    if (a != null) {
                        long j = a.getLong(3);
                        obj3 = a.getInt(2) == 10 ? 1 : null;
                        boolean i7 = gwb.m2254i(a.getInt(29));
                        if (i7) {
                            obj7 = obj10;
                        } else {
                            obj7 = null;
                        }
                        if (j != 2 || i7) {
                            obj5 = null;
                        }
                        if (!(j == 1 || i7)) {
                            obj8 = null;
                        }
                        if (obj3 != null) {
                            obj = 1;
                        } else {
                            i4 = 1;
                        }
                        obj6 = a.getInt(15) == 2 ? 1 : null;
                        if (obj6 == null) {
                            obj10 = 1;
                        } else {
                            obj10 = null;
                        }
                        i = ((dbh) this.f12099b.bH).getItemViewType(a.getPosition());
                        if (i == 1 || i == 2) {
                            obj9 = obj5;
                            int i8 = i6;
                            obj4 = obj10;
                            obj10 = obj8;
                            obj8 = obj;
                            i2 = i8;
                            obj11 = obj6;
                            obj6 = obj2;
                            obj2 = 1;
                            obj3 = obj7;
                            obj7 = obj11;
                        } else {
                            obj3 = obj7;
                            obj7 = obj6;
                            obj6 = obj2;
                            obj2 = obj9;
                            obj9 = obj5;
                            obj12 = obj10;
                            obj10 = obj8;
                            obj8 = obj;
                            i2 = i6;
                            obj4 = obj12;
                        }
                    } else {
                        obj3 = obj10;
                        obj10 = obj8;
                        obj8 = obj;
                        i2 = i6;
                        obj4 = obj6;
                        obj6 = obj2;
                        obj2 = obj9;
                        obj9 = obj5;
                    }
                } else {
                    obj4 = obj6;
                    obj6 = obj2;
                    obj2 = obj9;
                    obj9 = obj5;
                    obj12 = obj10;
                    obj10 = obj8;
                    obj8 = obj;
                    i2 = i;
                    obj3 = obj12;
                }
                i5++;
                obj5 = obj9;
                obj9 = obj2;
                obj2 = obj6;
                obj6 = obj4;
                obj12 = obj10;
                obj10 = obj3;
                i = i2;
                obj = obj8;
                obj8 = obj12;
            }
            obj4 = obj2;
            obj2 = obj6;
            obj6 = obj9;
            obj12 = obj7;
            obj7 = obj;
            obj = obj12;
            obj11 = obj8;
            i3 = i;
            obj3 = obj11;
        } else {
            i2 = 1;
            obj7 = null;
            i4 = 1;
            obj6 = null;
            i3 = 0;
            i = 1;
        }
        if (obj3 == null || i3 <= 1 || r5 != null) {
            obj9 = obj3;
        } else {
            obj9 = null;
        }
        boolean z = obj4 != null && obj6 == null;
        boolean z2 = obj7 != null && obj6 == null;
        boolean z3 = obj2 != null && obj6 == null;
        boolean z4 = obj != null && obj6 == null;
        boolean z5 = obj5 != null && obj6 == null;
        boolean z6 = obj9 != null && obj6 == null;
        eqy.m14293a(this.f12099b.getResources().getString(bc.ay, new Object[]{Integer.valueOf(i3)}));
        menu.findItem(ba.et).setVisible(z3);
        menu.findItem(ba.eB).setVisible(z4);
        menu.findItem(ba.ex).setVisible(z5);
        menu.findItem(ba.ey).setVisible(z);
        menu.findItem(ba.eC).setVisible(z2);
        menu.findItem(ba.eu).setVisible(z6);
        menu.findItem(ba.eA).setVisible(gld.m17936a());
        return false;
    }

    public boolean m14298a(MenuItem menuItem) {
        long[] checkedItemIds = ((SwipeableListView) this.f12099b.bI).getCheckedItemIds();
        if (checkedItemIds.length > 0) {
            this.f12099b.m8495a(this.f12099b.bH, menuItem.getItemId(), checkedItemIds);
        }
        return true;
    }

    public void m14296a() {
        this.f12099b.am = null;
        this.f12099b.f6261g.mo1085j();
        this.f12099b.getActivity().findViewById(ba.cm).setVisibility(0);
    }

    public void m14297a(eqy eqy, int i, boolean z) {
        int i2 = 0;
        SparseBooleanArray checkedItemPositions = ((SwipeableListView) this.f12099b.bI).getCheckedItemPositions();
        checkedItemPositions.put(i, z);
        int size = checkedItemPositions.size();
        int i3 = 0;
        while (i2 < size) {
            if (checkedItemPositions.valueAt(i2)) {
                i3++;
            }
            i2++;
        }
        if (i3 == 0) {
            this.f12099b.am.m14295c();
        }
        eqy.m14294b();
    }

    public era(ConversationListFragment conversationListFragment) {
        this.f12099b = conversationListFragment;
    }

    public MultiChoiceModeListener m14300b() {
        return this.f12098a.m14292a();
    }
}
