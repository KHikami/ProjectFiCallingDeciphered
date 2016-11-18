package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class gra implements OnClickListener {
    final /* synthetic */ MessageListItemView a;
    final /* synthetic */ gph b;
    final /* synthetic */ gqz c;

    gra(gqz gqz, MessageListItemView messageListItemView, gph gph) {
        this.c = gqz;
        this.a = messageListItemView;
        this.b = gph;
    }

    public void onClick(View view) {
        if (this.a != null) {
            if (!this.a.c()) {
                if (this.a.h()) {
                    if (this.b != null) {
                        this.b.c(this.a.u());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (TextUtils.isEmpty(this.c.c)) {
            if (glk.a("Babel", 3)) {
                glk.b("Babel", "VideoAttachmentHandler could not load video", new Object[0]);
            }
            this.c.j();
        }
        if (!TextUtils.isEmpty(this.c.c)) {
            if (glk.a("Babel", 3)) {
                String str = "Babel";
                String str2 = "VideoAttachmentHandler loaded urlString: ";
                String valueOf = String.valueOf(this.c.c);
                glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            }
            this.c.getContext().startActivity(gwb.d(this.c.c, "video/mp4"));
        }
    }
}
