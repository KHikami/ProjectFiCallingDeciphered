package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class dma implements OnClickListener {
    final /* synthetic */ dhu a;
    final /* synthetic */ itl b;
    final /* synthetic */ dlu c;

    dma(dlu dlu, dhu dhu, itl itl) {
        this.c = dlu;
        this.a = dhu;
        this.b = itl;
    }

    public void onClick(View view) {
        dhu dhu = this.a;
        String a = this.b.a();
        dhc dhc = new dhc();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", a);
        dhc.setArguments(bundle);
        dhc.a(dhu.e(), null);
    }
}
