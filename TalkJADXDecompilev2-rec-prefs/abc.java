package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class abc implements OnItemClickListener {
    final /* synthetic */ aay f141a;
    final /* synthetic */ abb f142b;

    abc(abb abb, aay aay) {
        this.f142b = abb;
        this.f141a = aay;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f142b.f139c.setSelection(i);
        if (this.f142b.f139c.getOnItemClickListener() != null) {
            this.f142b.f139c.performItemClick(view, i, this.f142b.f137a.getItemId(i));
        }
        this.f142b.m154c();
    }
}
