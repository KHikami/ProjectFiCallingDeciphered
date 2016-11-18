package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

final class ul implements OnItemClickListener {
    final /* synthetic */ ListView f35293a;
    final /* synthetic */ uc f35294b;
    final /* synthetic */ uh f35295c;

    ul(uh uhVar, ListView listView, uc ucVar) {
        this.f35295c = uhVar;
        this.f35293a = listView;
        this.f35294b = ucVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f35295c.f35248C != null) {
            this.f35295c.f35248C[i] = this.f35293a.isItemChecked(i);
        }
        this.f35295c.f35252G.onClick(this.f35294b.f35210a, i, this.f35293a.isItemChecked(i));
    }
}
