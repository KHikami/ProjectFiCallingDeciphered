package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class ghx implements OnItemClickListener {
    final /* synthetic */ ghw f15285a;

    ghx(ghw ghw) {
        this.f15285a = ghw;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            ((ghy) ((ghp) this.f15285a.getActivity()).mo1056g()).mo2243f();
        } else {
            ((ghy) ((ghp) this.f15285a.getActivity()).mo1056g()).mo2244g();
        }
    }
}
