package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class grd implements OnClickListener {
    final /* synthetic */ String f15948a;
    final /* synthetic */ String f15949b;
    final /* synthetic */ dr f15950c;
    final /* synthetic */ grc f15951d;

    grd(grc grc, String str, String str2, dr drVar) {
        this.f15951d = grc;
        this.f15948a = str;
        this.f15949b = str2;
        this.f15950c = drVar;
    }

    public void onClick(View view) {
        if (glk.m17973a("Babel", 3)) {
            String str = this.f15948a;
            String str2 = this.f15949b;
            glk.m17976b("Babel", new StringBuilder((String.valueOf(str).length() + 48) + String.valueOf(str2).length()).append("VideoSmSAttachmentView urlString: ").append(str).append(" contentType: ").append(str2).toString(), new Object[0]);
        }
        this.f15950c.startActivity(gwb.m2126d(this.f15951d.f15947a, this.f15949b));
    }
}
