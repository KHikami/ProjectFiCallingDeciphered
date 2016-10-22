package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.List;

/* renamed from: efs */
public class efs {
    final /* synthetic */ EditParticipantsView a;

    public void a() {
        if (this.a.d.getChildCount() > 1) {
            View childAt = this.a.d.getChildAt(this.a.d.getChildCount() - 2);
            bcn bcn = (bcn) childAt.getTag();
            if (bcn != null) {
                boolean z;
                childAt.setTag(null);
                this.a.b.b(bcn);
                ViewGroup viewGroup = this.a;
                if (viewGroup.g == null || gwb.a(viewGroup.g, bnc.GROUP_CONVERSATIONS)) {
                    z = true;
                } else {
                    z = false;
                }
                List c = viewGroup.b.c();
                List d;
                if (viewGroup.b.f() == bcj.UPGRADE_TO_GROUPCHAT) {
                    d = viewGroup.b.d();
                } else {
                    d = c;
                }
                int i = 0;
                while (i < viewGroup.d.getChildCount() - 1) {
                    View childAt2 = viewGroup.d.getChildAt(i);
                    Object tag = childAt2.getTag();
                    if (r5.contains(tag)) {
                        viewGroup.a(childAt2, (bcn) tag);
                        r5.remove(tag);
                    } else if (z) {
                        childAt2.setOnClickListener(null);
                        TextView textView = (TextView) childAt2.findViewById(bm.af);
                        ((AvatarView) childAt2.findViewById(bm.ac)).setVisibility(4);
                        textView.setVisibility(4);
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(EditParticipantsView.SCALE_X, new float[]{1.0f, 0.0f});
                        ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(childAt2, new PropertyValuesHolder[]{ofFloat});
                        ofPropertyValuesHolder.setInterpolator(new bbx(bcb.a));
                        ofPropertyValuesHolder.setDuration(200);
                        ofPropertyValuesHolder.addListener(viewGroup.i);
                        ofPropertyValuesHolder.start();
                    } else {
                        viewGroup.d.removeView(childAt2);
                        i--;
                    }
                    i++;
                }
                if (!r5.isEmpty()) {
                    viewGroup.e.setText("");
                }
                for (bcn bcn2 : r5) {
                    OnClickListener egb = new egb(viewGroup, bcn2);
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(gwb.sD, viewGroup, false);
                    inflate.setOnClickListener(new egc(viewGroup, egb));
                    inflate.setScaleX(0.0f);
                    viewGroup.d.addView(inflate, viewGroup.d.getChildCount() - 1);
                    viewGroup.a(inflate, bcn2);
                    EditParticipantsView.a(inflate);
                }
                if (gld.a(viewGroup.getContext()) || viewGroup.d.getChildCount() <= 1) {
                    viewGroup.e.setHint(gwb.tj);
                } else {
                    viewGroup.e.setHint("");
                }
                viewGroup.requestLayout();
            }
        }
    }

    public efs(EditParticipantsView editParticipantsView) {
        this.a = editParticipantsView;
    }
}
