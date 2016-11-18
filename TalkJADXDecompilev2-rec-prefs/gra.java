package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class gra implements OnClickListener {
    final /* synthetic */ MessageListItemView f15943a;
    final /* synthetic */ gph f15944b;
    final /* synthetic */ gqz f15945c;

    gra(gqz gqz, MessageListItemView messageListItemView, gph gph) {
        this.f15945c = gqz;
        this.f15943a = messageListItemView;
        this.f15944b = gph;
    }

    public void onClick(View view) {
        if (this.f15943a != null) {
            if (!this.f15943a.m9481c()) {
                if (this.f15943a.mo1273h()) {
                    if (this.f15944b != null) {
                        this.f15944b.mo854c(this.f15943a.m9499u());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (TextUtils.isEmpty(this.f15945c.f4704c)) {
            if (glk.m17973a("Babel", 3)) {
                glk.m17976b("Babel", "VideoAttachmentHandler could not load video", new Object[0]);
            }
            this.f15945c.m6858j();
        }
        if (!TextUtils.isEmpty(this.f15945c.f4704c)) {
            if (glk.m17973a("Babel", 3)) {
                String str = "Babel";
                String str2 = "VideoAttachmentHandler loaded urlString: ";
                String valueOf = String.valueOf(this.f15945c.f4704c);
                glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            }
            this.f15945c.getContext().startActivity(gwb.m2126d(this.f15945c.f4704c, "video/mp4"));
        }
    }
}
