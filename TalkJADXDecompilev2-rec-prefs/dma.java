package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class dma implements OnClickListener {
    final /* synthetic */ dhu f10106a;
    final /* synthetic */ itl f10107b;
    final /* synthetic */ dlu f10108c;

    dma(dlu dlu, dhu dhu, itl itl) {
        this.f10108c = dlu;
        this.f10106a = dhu;
        this.f10107b = itl;
    }

    public void onClick(View view) {
        dhu dhu = this.f10106a;
        String a = this.f10107b.m23229a();
        dhc dhc = new dhc();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", a);
        dhc.setArguments(bundle);
        dhc.mo2341a(dhu.m11855e(), null);
    }
}
