package p000;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;

public final class jee implements SpinnerAdapter {
    final SpinnerAdapter f19927a;
    final /* synthetic */ ActionBarSpinner f19928b;
    private int f19929c = -1;

    public jee(ActionBarSpinner actionBarSpinner, SpinnerAdapter spinnerAdapter) {
        this.f19928b = actionBarSpinner;
        this.f19927a = spinnerAdapter;
    }

    public void m24023a(int i) {
        this.f19929c = i;
    }

    public void m24022a() {
        this.f19929c = -1;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.f19927a.getDropDownView(i, view, viewGroup);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f19927a.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f19927a.unregisterDataSetObserver(dataSetObserver);
    }

    public int getCount() {
        return this.f19927a.getCount();
    }

    public Object getItem(int i) {
        if (this.f19929c != -1) {
            i = this.f19929c;
        }
        return this.f19927a.getItem(i);
    }

    public long getItemId(int i) {
        if (this.f19929c != -1) {
            i = this.f19929c;
        }
        return this.f19927a.getItemId(i);
    }

    public boolean hasStableIds() {
        return this.f19927a.hasStableIds();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f19929c != -1) {
            i = this.f19929c;
        }
        return this.f19927a.getView(i, view, viewGroup);
    }

    public int getItemViewType(int i) {
        if (this.f19929c != -1) {
            i = this.f19929c;
        }
        return this.f19927a.getItemViewType(i);
    }

    public int getViewTypeCount() {
        return this.f19927a.getViewTypeCount();
    }

    public boolean isEmpty() {
        return this.f19927a.isEmpty();
    }
}
