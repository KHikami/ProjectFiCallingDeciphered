package p000;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;

final class dsq implements OnClickListener {
    final /* synthetic */ String f10462a;
    final /* synthetic */ dso f10463b;

    dsq(dso dso, String str) {
        this.f10463b = dso;
        this.f10462a = str;
    }

    public void onClick(View view) {
        Intent a;
        if (this.f10463b.m7009c() != null) {
            this.f10463b.m7009c().dismiss();
        }
        bbm bbm = (bbm) this.f10463b.an.m25443a(bbm.class);
        int a2 = this.f10463b.aj.mo2317a();
        if (bbm.mo444d(a2)) {
            a = BabelGatewayActivity.m8797a(a2, null, this.f10462a, "", false, null);
        } else {
            a = gwb.m2123d(this.f10463b.getContext(), "", this.f10462a);
        }
        this.f10463b.getContext().startActivity(a);
    }
}
