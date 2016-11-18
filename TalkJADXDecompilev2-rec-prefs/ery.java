package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import com.google.android.apps.hangouts.promo.AnnouncingRelativeLayout;

public abstract class ery extends jzn {
    private int f3129a;
    private int[] f3130b;
    private OnClickListener f3131c = new esa(this);

    public abstract String mo495a();

    public ery(int i, int[] iArr) {
        this.f3129a = i;
        this.f3130b = iArr;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(gwb.tW, viewGroup, false);
        ((AnnouncingRelativeLayout) inflate.findViewById(gwb.tV)).m8966a(mo495a());
        ViewStub viewStub = (ViewStub) inflate.findViewById(gwb.tU);
        viewStub.setLayoutResource(this.f3129a);
        viewStub.inflate();
        if (this.f3130b != null) {
            viewStub = (ViewStub) inflate.findViewById(gwb.tT);
            if (this.f3130b.length == 1) {
                viewStub.setLayoutResource(gwb.tX);
            } else {
                viewStub.setLayoutResource(gwb.tY);
            }
            View inflate2 = viewStub.inflate();
            int[] iArr = this.f3130b;
            int length = iArr.length;
            while (i < length) {
                Button button = (Button) inflate2.findViewById(iArr[i]);
                button.setOnClickListener(this.f3131c);
                button.setAllCaps(true);
                i++;
            }
        }
        oa.c(inflate, 1);
        inflate.addOnAttachStateChangeListener(new erz(this));
        return inflate;
    }

    public void mo517a(int i) {
        ((esb) getActivity()).mo1056g();
    }
}
