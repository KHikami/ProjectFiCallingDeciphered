package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class dsp implements OnClickListener {
    final /* synthetic */ boolean f10456a;
    final /* synthetic */ dsk f10457b;
    final /* synthetic */ String f10458c;
    final /* synthetic */ String f10459d;
    final /* synthetic */ int f10460e;
    final /* synthetic */ dso f10461f;

    dsp(dso dso, boolean z, dsk dsk, String str, String str2, int i) {
        this.f10461f = dso;
        this.f10456a = z;
        this.f10457b = dsk;
        this.f10458c = str;
        this.f10459d = str2;
        this.f10460e = i;
    }

    public void onClick(View view) {
        dso.m12623a(this.f10461f, this.f10456a, this.f10457b, this.f10458c, this.f10459d, this.f10460e);
    }
}
