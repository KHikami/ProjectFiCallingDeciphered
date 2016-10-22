package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: eek */
final class eek implements OnClickListener {
    final /* synthetic */ Uri a;
    final /* synthetic */ eej b;

    eek(eej eej, Uri uri) {
        this.b = eej;
        this.a = uri;
    }

    public void onClick(View view) {
        this.b.startActivity(gwb.z(this.a.toString()));
    }
}
