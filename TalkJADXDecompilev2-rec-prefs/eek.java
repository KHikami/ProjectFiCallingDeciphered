package p000;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

final class eek implements OnClickListener {
    final /* synthetic */ Uri f11311a;
    final /* synthetic */ eej f11312b;

    eek(eej eej, Uri uri) {
        this.f11312b = eej;
        this.f11311a = uri;
    }

    public void onClick(View view) {
        this.f11312b.startActivity(gwb.m2397z(this.f11311a.toString()));
    }
}
