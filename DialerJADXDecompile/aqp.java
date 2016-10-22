import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class aqp implements OnClickListener {
    private /* synthetic */ aqn a;

    aqp(aqn aqn) {
        this.a = aqn;
    }

    public final void onClick(View view) {
        if (this.a.b != null) {
            if (TextUtils.isEmpty(this.a.h)) {
                adz adz = this.a.b;
                Uri uri = this.a.c;
                abn.a(this.a);
                adz.a(uri);
                return;
            }
            this.a.b.a(this.a.h);
        }
    }
}
