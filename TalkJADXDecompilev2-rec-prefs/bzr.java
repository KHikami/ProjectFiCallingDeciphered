package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class bzr implements OnClickListener {
    final /* synthetic */ bzq f4842a;

    bzr(bzq bzq) {
        this.f4842a = bzq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4842a.m7026h();
        for (String a : this.f4842a.f4835b.m6933b()) {
            this.f4842a.f4837d.mo1655a(this.f4842a.f4834a.mo2317a(), a, 1);
        }
        this.f4842a.f4838e.mo1979a(this.f4842a.f4834a.mo2317a()).mo1693b().mo1714c(3186);
        if (this.f4842a.f4835b.m6956p() != null && this.f4842a.f4835b.m6956p().m5596d()) {
            this.f4842a.f4838e.mo1979a(this.f4842a.f4834a.mo2317a()).mo1693b().mo1714c(3335);
        }
        this.f4842a.f4835b.m6939d(1);
    }
}
