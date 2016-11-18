package p000;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class rz extends Filter {
    sa f35094a;

    rz(sa saVar) {
        this.f35094a = saVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f35094a.mo4352c((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f35094a.mo4350a(charSequence);
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
        Cursor a = this.f35094a.mo4349a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f35094a.mo4351a((Cursor) filterResults.values);
        }
    }
}
