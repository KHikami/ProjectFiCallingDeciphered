package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import com.google.android.apps.hangouts.promo.AnnouncingRelativeLayout;
import oa;

/* renamed from: ery */
public abstract class ery extends jzn {
    private int a;
    private int[] b;
    private OnClickListener c;

    public abstract String a();

    public ery(int i, int[] iArr) {
        this.c = new esa(this);
        this.a = i;
        this.b = iArr;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(gwb.tW, viewGroup, false);
        ((AnnouncingRelativeLayout) inflate.findViewById(gwb.tV)).a(a());
        ViewStub viewStub = (ViewStub) inflate.findViewById(gwb.tU);
        viewStub.setLayoutResource(this.a);
        viewStub.inflate();
        if (this.b != null) {
            viewStub = (ViewStub) inflate.findViewById(gwb.tT);
            if (this.b.length == 1) {
                viewStub.setLayoutResource(gwb.tX);
            } else {
                viewStub.setLayoutResource(gwb.tY);
            }
            View inflate2 = viewStub.inflate();
            int[] iArr = this.b;
            int length = iArr.length;
            while (i < length) {
                Button button = (Button) inflate2.findViewById(iArr[i]);
                button.setOnClickListener(this.c);
                button.setAllCaps(true);
                i++;
            }
        }
        oa.c(inflate, 1);
        inflate.addOnAttachStateChangeListener(new erz(this));
        return inflate;
    }

    public void a(int i) {
        ((esb) getActivity()).g();
    }
}
