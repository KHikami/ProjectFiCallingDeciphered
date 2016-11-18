package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class gbh implements OnClickListener {
    final /* synthetic */ gbg f14594a;

    gbh(gbg gbg) {
        this.f14594a = gbg;
    }

    public void onClick(View view) {
        int i;
        String obj = this.f14594a.f14588e.getText().toString();
        gbg gbg = this.f14594a;
        int codePointCount = obj.codePointCount(0, obj.length());
        if (codePointCount > 140) {
            String valueOf = String.valueOf("The status message cannot exceed the maximum character count of 140. Was ");
            iil.m21870a(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(codePointCount).toString());
        }
        String replace = obj.replace('\n', ' ').replace('\r', ' ');
        if (replace.isEmpty()) {
            i = 1936;
        } else {
            i = 1935;
        }
        gwb.m1823a(this.f14594a.f14586c, i);
        czc.m11324a(new gbk(this.f14594a, this.f14594a.f14584a, replace), new cze(this.f14594a.f14585b.getFragmentManager())).m11327a();
    }
}
