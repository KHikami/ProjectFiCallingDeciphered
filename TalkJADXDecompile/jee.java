import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;

public final class jee implements SpinnerAdapter {
    final SpinnerAdapter a;
    final /* synthetic */ ActionBarSpinner b;
    private int c;

    public jee(ActionBarSpinner actionBarSpinner, SpinnerAdapter spinnerAdapter) {
        this.b = actionBarSpinner;
        this.c = -1;
        this.a = spinnerAdapter;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a() {
        this.c = -1;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.a.getDropDownView(i, view, viewGroup);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }

    public int getCount() {
        return this.a.getCount();
    }

    public Object getItem(int i) {
        if (this.c != -1) {
            i = this.c;
        }
        return this.a.getItem(i);
    }

    public long getItemId(int i) {
        if (this.c != -1) {
            i = this.c;
        }
        return this.a.getItemId(i);
    }

    public boolean hasStableIds() {
        return this.a.hasStableIds();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.c != -1) {
            i = this.c;
        }
        return this.a.getView(i, view, viewGroup);
    }

    public int getItemViewType(int i) {
        if (this.c != -1) {
            i = this.c;
        }
        return this.a.getItemViewType(i);
    }

    public int getViewTypeCount() {
        return this.a.getViewTypeCount();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }
}
