package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

final class ui extends ArrayAdapter<CharSequence> {
    final /* synthetic */ ListView f35284a;
    final /* synthetic */ uh f35285b;

    ui(uh uhVar, Context context, int i, int i2, CharSequence[] charSequenceArr, ListView listView) {
        this.f35285b = uhVar;
        this.f35284a = listView;
        super(context, i, 16908308, charSequenceArr);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f35285b.f35248C != null && this.f35285b.f35248C[i]) {
            this.f35284a.setItemChecked(i, true);
        }
        return view2;
    }
}
