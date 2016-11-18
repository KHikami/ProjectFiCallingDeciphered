package p000;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class jxl implements OnCheckedChangeListener {
    final /* synthetic */ jxk f21254a;

    jxl(jxk jxk) {
        this.f21254a = jxk;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f21254a.m5125a((Object) Boolean.valueOf(z))) {
            this.f21254a.mo534a(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
