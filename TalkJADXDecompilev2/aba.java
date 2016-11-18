package defpackage;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

final class aba implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter a;
    private ListAdapter b;

    public aba(SpinnerAdapter spinnerAdapter, Theme theme) {
        this.a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.b = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && aay.a && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public int getCount() {
        return this.a == null ? 0 : this.a.getCount();
    }

    public Object getItem(int i) {
        return this.a == null ? null : this.a.getItem(i);
    }

    public long getItemId(int i) {
        return this.a == null ? -1 : this.a.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.a == null) {
            return null;
        }
        return this.a.getDropDownView(i, view, viewGroup);
    }

    public boolean hasStableIds() {
        return this.a != null && this.a.hasStableIds();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.registerDataSetObserver(dataSetObserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public boolean isEnabled(int i) {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }
}
