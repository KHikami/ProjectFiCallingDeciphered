package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

final class grd implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ dr c;
    final /* synthetic */ grc d;

    grd(grc grc, String str, String str2, dr drVar) {
        this.d = grc;
        this.a = str;
        this.b = str2;
        this.c = drVar;
    }

    public void onClick(View view) {
        if (glk.a("Babel", 3)) {
            String str = this.a;
            String str2 = this.b;
            glk.b("Babel", new StringBuilder((String.valueOf(str).length() + 48) + String.valueOf(str2).length()).append("VideoSmSAttachmentView urlString: ").append(str).append(" contentType: ").append(str2).toString(), new Object[0]);
        }
        this.c.startActivity(gwb.d(this.d.a, this.b));
    }
}
