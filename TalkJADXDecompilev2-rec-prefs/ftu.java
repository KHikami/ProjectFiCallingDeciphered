package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.hangouts.views.AvatarView;

public final class ftu extends jwi {
    private String f13987a;
    private bko f13988c;

    public ftu(Context context) {
        super(context, null);
        m5139e(gwb.hp);
    }

    public void mo533a(View view) {
        super.mo533a(view);
        AvatarView avatarView = (AvatarView) view.findViewById(ba.f2662A);
        if (this.f13987a != null) {
            avatarView.m9238a(this.f13987a, this.f13988c.m5634c(), this.f13988c);
        } else {
            avatarView.m9238a(null, null, null);
        }
    }

    public void m16218a(String str, bko bko) {
        if (!TextUtils.equals(str, this.f13987a)) {
            this.f13987a = str;
            this.f13988c = bko;
            m5168z();
        }
    }
}
