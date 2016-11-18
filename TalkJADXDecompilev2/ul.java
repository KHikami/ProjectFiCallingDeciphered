package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

final class ul implements OnItemClickListener {
    final /* synthetic */ ListView a;
    final /* synthetic */ uc b;
    final /* synthetic */ uh c;

    ul(uh uhVar, ListView listView, uc ucVar) {
        this.c = uhVar;
        this.a = listView;
        this.b = ucVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.c.C != null) {
            this.c.C[i] = this.a.isItemChecked(i);
        }
        this.c.G.onClick(this.b.a, i, this.a.isItemChecked(i));
    }
}
