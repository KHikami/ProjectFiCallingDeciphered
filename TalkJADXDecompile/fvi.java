import android.net.Uri;
import android.text.TextUtils;

final class fvi implements jwm {
    final /* synthetic */ ftv a;
    final /* synthetic */ int b;
    final /* synthetic */ jca c;
    final /* synthetic */ String d;

    fvi(ftv ftv, int i, jca jca, String str) {
        this.a = ftv;
        this.b = i;
        this.c = jca;
        this.d = str;
    }

    public boolean a(jwi jwi, Object obj) {
        String str = (String) obj;
        Uri b = this.a.b();
        boolean z = b == null;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (this.b == 1 && !(z == isEmpty && (b == null || b.equals(Uri.parse(str))))) {
            gwb.a(fde.e(this.c.a()), 1599);
        }
        ((jcf) jyn.a(this.a.x(), jcf.class)).b(this.c.a()).b(this.d, str).d();
        this.a.a(str);
        return true;
    }
}
