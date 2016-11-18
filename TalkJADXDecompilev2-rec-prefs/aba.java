package p000;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

final class aba implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter f101a;
    private ListAdapter f102b;

    public aba(SpinnerAdapter spinnerAdapter, Theme theme) {
        this.f101a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f102b = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && aay.f75a && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public int getCount() {
        return this.f101a == null ? 0 : this.f101a.getCount();
    }

    public Object getItem(int i) {
        return this.f101a == null ? null : this.f101a.getItem(i);
    }

    public long getItemId(int i) {
        return this.f101a == null ? -1 : this.f101a.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f101a == null) {
            return null;
        }
        return this.f101a.getDropDownView(i, view, viewGroup);
    }

    public boolean hasStableIds() {
        return this.f101a != null && this.f101a.hasStableIds();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f101a != null) {
            this.f101a.registerDataSetObserver(dataSetObserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f101a != null) {
            this.f101a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f102b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f102b;
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
