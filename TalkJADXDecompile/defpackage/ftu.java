package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.hangouts.views.AvatarView;

/* renamed from: ftu */
public final class ftu extends jwi {
    private String a;
    private bko c;

    public ftu(Context context) {
        super(context, null);
        e(gwb.hp);
    }

    public void a(View view) {
        super.a(view);
        AvatarView avatarView = (AvatarView) view.findViewById(ba.A);
        if (this.a != null) {
            avatarView.a(this.a, this.c.c(), this.c);
        } else {
            avatarView.a(null, null, null);
        }
    }

    public void a(String str, bko bko) {
        if (!TextUtils.equals(str, this.a)) {
            this.a = str;
            this.c = bko;
            z();
        }
    }
}
