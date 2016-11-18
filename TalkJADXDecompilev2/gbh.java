package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

final class gbh implements OnClickListener {
    final /* synthetic */ gbg a;

    gbh(gbg gbg) {
        this.a = gbg;
    }

    public void onClick(View view) {
        int i;
        String obj = this.a.e.getText().toString();
        gbg gbg = this.a;
        int codePointCount = obj.codePointCount(0, obj.length());
        if (codePointCount > 140) {
            String valueOf = String.valueOf("The status message cannot exceed the maximum character count of 140. Was ");
            iil.a(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(codePointCount).toString());
        }
        String replace = obj.replace('\n', ' ').replace('\r', ' ');
        if (replace.isEmpty()) {
            i = 1936;
        } else {
            i = 1935;
        }
        gwb.a(this.a.c, i);
        czc.a(new gbk(this.a, this.a.a, replace), new cze(this.a.b.getFragmentManager())).a();
    }
}
