package p000;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugBitmapsActivity;

public final class eli implements ExpandableListAdapter {
    final /* synthetic */ DebugBitmapsActivity f11805a;
    private giy f11806b;
    private gjd f11807c;
    private elj f11808d;

    public eli(DebugBitmapsActivity debugBitmapsActivity) {
        this.f11805a = debugBitmapsActivity;
        this.f11806b = new giy(debugBitmapsActivity.getLayoutInflater());
        if (giz.m17780a((Context) debugBitmapsActivity)) {
            this.f11807c = new gjd(debugBitmapsActivity.getLayoutInflater());
        }
        this.f11808d = new elj(debugBitmapsActivity);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public int getGroupCount() {
        return 3;
    }

    public int getChildrenCount(int i) {
        switch (i) {
            case 0:
                return this.f11806b.getCount();
            case 1:
                if (this.f11807c != null) {
                    return this.f11807c.getCount();
                }
                return 0;
            case 2:
                return this.f11808d.getCount();
            default:
                return 0;
        }
    }

    public Object getGroup(int i) {
        switch (i) {
            case 0:
                return this.f11806b;
            case 1:
                return this.f11807c;
            case 2:
                return this.f11808d;
            default:
                return null;
        }
    }

    public Object getChild(int i, int i2) {
        switch (i) {
            case 0:
                return this.f11806b.getItem(i2);
            case 1:
                if (this.f11807c != null) {
                    return this.f11807c.getItem(i2);
                }
                return null;
            case 2:
                return this.f11808d.getItem(i2);
            default:
                return null;
        }
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public boolean hasStableIds() {
        return false;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        view = (TextView) view;
        if (view == null) {
            view = new TextView(this.f11805a);
            view.setTextSize(2, 36.0f);
        }
        switch (i) {
            case 0:
                view.setText("   Cached Bitmaps");
                break;
            case 1:
                view.setText("   Pooled Bitmaps");
                break;
            case 2:
                view.setText("   Default Bitmaps");
                break;
        }
        return view;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        switch (i) {
            case 0:
                return this.f11806b.getView(i2, view, viewGroup);
            case 1:
                if (this.f11807c != null) {
                    return this.f11807c.getView(i2, view, viewGroup);
                }
                return null;
            case 2:
                return this.f11808d.getView(i2, view, viewGroup);
            default:
                return null;
        }
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }

    public void onGroupExpanded(int i) {
    }

    public void onGroupCollapsed(int i) {
    }

    public long getCombinedChildId(long j, long j2) {
        return (1000 * j) + j2;
    }

    public long getCombinedGroupId(long j) {
        return j;
    }
}
