package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class uk implements OnItemClickListener {
    final /* synthetic */ uc f35291a;
    final /* synthetic */ uh f35292b;

    uk(uh uhVar, uc ucVar) {
        this.f35292b = uhVar;
        this.f35291a = ucVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f35292b.f35278u.onClick(this.f35291a.f35210a, i);
        if (!this.f35292b.f35250E) {
            this.f35291a.f35210a.dismiss();
        }
    }
}
