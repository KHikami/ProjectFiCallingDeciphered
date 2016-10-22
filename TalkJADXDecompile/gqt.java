import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.apps.hangouts.views.RichStatusView;

public final class gqt {
    public boolean a;
    public final View b;
    public final ImageView c;
    public int d;
    final /* synthetic */ RichStatusView e;

    public gqt(RichStatusView richStatusView, int i, int i2, int i3) {
        this.e = richStatusView;
        this.b = richStatusView.findViewById(i);
        iil.b("Expected non-null", this.b);
        this.c = (ImageView) richStatusView.findViewById(i2);
        iil.b("Expected non-null", this.c);
        this.d = i3;
    }

    public void a(int i) {
        this.b.getLayoutParams().width = i;
        this.b.requestLayout();
    }

    public void b(int i) {
        this.b.getBackground().setColorFilter(i, Mode.SRC_IN);
    }

    public boolean a(int i, int i2) {
        this.c.setImageResource(i);
        this.c.setColorFilter(i2, Mode.SRC_IN);
        boolean z = i != 0;
        a(z);
        return z;
    }

    public void a(boolean z) {
        if (this.a != z) {
            int i;
            Animation gqv = new gqv(this, this.d, z);
            gqv.setDuration(250);
            gqv.setAnimationListener(new gqu(this, z));
            this.b.startAnimation(gqv);
            RichStatusView richStatusView = this.e;
            for (i = 0; i < 3; i++) {
                if (richStatusView.a[i].b.getVisibility() == 0) {
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
            this.a = z;
        }
    }
}
