package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class rz extends Filter {
    sa a;

    rz(sa saVar) {
        this.a = saVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.a.a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.a.a();
        if (filterResults.values != null && filterResults.values != a) {
            this.a.a((Cursor) filterResults.values);
        }
    }
}
