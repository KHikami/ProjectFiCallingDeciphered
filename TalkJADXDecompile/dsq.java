import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;

final class dsq implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ dso b;

    dsq(dso dso, String str) {
        this.b = dso;
        this.a = str;
    }

    public void onClick(View view) {
        Intent a;
        if (this.b.c() != null) {
            this.b.c().dismiss();
        }
        bbm bbm = (bbm) this.b.an.a(bbm.class);
        int a2 = this.b.aj.a();
        if (bbm.d(a2)) {
            a = BabelGatewayActivity.a(a2, null, this.a, "", false, null);
        } else {
            a = gwb.d(this.b.getContext(), "", this.a);
        }
        this.b.getContext().startActivity(a);
    }
}
