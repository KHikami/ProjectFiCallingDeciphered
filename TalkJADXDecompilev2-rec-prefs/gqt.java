package p000;

import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.apps.hangouts.views.RichStatusView;

public final class gqt {
    public boolean f15929a;
    public final View f15930b;
    public final ImageView f15931c;
    public int f15932d;
    final /* synthetic */ RichStatusView f15933e;

    public gqt(RichStatusView richStatusView, int i, int i2, int i3) {
        this.f15933e = richStatusView;
        this.f15930b = richStatusView.findViewById(i);
        iil.m21875b("Expected non-null", this.f15930b);
        this.f15931c = (ImageView) richStatusView.findViewById(i2);
        iil.m21875b("Expected non-null", this.f15931c);
        this.f15932d = i3;
    }

    public void m18311a(int i) {
        this.f15930b.getLayoutParams().width = i;
        this.f15930b.requestLayout();
    }

    public void m18314b(int i) {
        this.f15930b.getBackground().setColorFilter(i, Mode.SRC_IN);
    }

    public boolean m18313a(int i, int i2) {
        this.f15931c.setImageResource(i);
        this.f15931c.setColorFilter(i2, Mode.SRC_IN);
        boolean z = i != 0;
        m18312a(z);
        return z;
    }

    public void m18312a(boolean z) {
        if (this.f15929a != z) {
            int i;
            Animation gqv = new gqv(this, this.f15932d, z);
            gqv.setDuration(250);
            gqv.setAnimationListener(new gqu(this, z));
            this.f15930b.startAnimation(gqv);
            RichStatusView richStatusView = this.f15933e;
            for (i = 0; i < 3; i++) {
                if (richStatusView.f7184a[i].f15930b.getVisibility() == 0) {
                    i = 1;
                    break;
                }
            }
            i = 0;
            if (i != 0) {
                richStatusView.setVisibility(0);
            } else {
                richStatusView.setVisibility(8);
            }
            this.f15929a = z;
        }
    }
}
