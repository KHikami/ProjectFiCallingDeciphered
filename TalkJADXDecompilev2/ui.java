package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

final class ui extends ArrayAdapter<CharSequence> {
    final /* synthetic */ ListView a;
    final /* synthetic */ uh b;

    ui(uh uhVar, Context context, int i, int i2, CharSequence[] charSequenceArr, ListView listView) {
        this.b = uhVar;
        this.a = listView;
        super(context, i, 16908308, charSequenceArr);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.b.C != null && this.b.C[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
