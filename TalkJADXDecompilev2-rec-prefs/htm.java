package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import com.google.api.client.http.HttpStatusCodes;

public final class htm implements OnClickListener {
    final /* synthetic */ SelectedAccountNavigationView f17257a;

    public htm(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.f17257a = selectedAccountNavigationView;
    }

    public void onClick(View view) {
        if (!(this.f17257a.f7779h == null || this.f17257a.f7772a == null || this.f17257a.f7772a.isEmpty())) {
            C0000a c0000a = this.f17257a.f7779h;
            this.f17257a.f7772a.get(0);
            if (c0000a.m16m()) {
                return;
            }
        }
        SelectedAccountNavigationView selectedAccountNavigationView = this.f17257a;
        if (selectedAccountNavigationView.f7772a != null && selectedAccountNavigationView.f7772a.size() != 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            View view2 = selectedAccountNavigationView.f7775d.f10863s;
            View view3 = selectedAccountNavigationView.f7775d.f10867w;
            view2.bringToFront();
            hwn hwn = (hwn) selectedAccountNavigationView.f7772a.get(0);
            if (selectedAccountNavigationView.f7777f == 0.0f) {
                selectedAccountNavigationView.f7777f = (float) selectedAccountNavigationView.f7775d.f10867w.getWidth();
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view3.getLayoutParams();
            Animator ofFloat = ObjectAnimator.ofFloat(selectedAccountNavigationView.f7775d.f10860p, "alpha", new float[]{1.0f, 0.0f});
            int marginStart = selectedAccountNavigationView.f7780i ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
            float f = selectedAccountNavigationView.f7776e / selectedAccountNavigationView.f7777f;
            float f2 = (selectedAccountNavigationView.f7776e - (selectedAccountNavigationView.f7777f - ((float) marginLayoutParams.bottomMargin))) * 0.5f;
            float left = ((float) (selectedAccountNavigationView.f7775d.f10860p.getLeft() - (marginStart + view2.getLeft()))) - ((selectedAccountNavigationView.f7777f - selectedAccountNavigationView.f7776e) * 0.5f);
            Builder play = animatorSet.play(ofFloat);
            Animator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{left});
            ofFloat2.setDuration(450);
            Animator ofFloat3 = ObjectAnimator.ofFloat(view2, "translationY", new float[]{f2});
            ofFloat3.setDuration(450);
            Animator ofFloat4 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{f});
            ofFloat4.setDuration(300);
            Animator ofFloat5 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{f});
            ofFloat5.setDuration(300);
            play.with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
            View view4 = selectedAccountNavigationView.f7775d.f10849D;
            ImageView imageView = selectedAccountNavigationView.f7775d.f10852G;
            if (imageView != null) {
                imageView.setImageDrawable(selectedAccountNavigationView.f7775d.f10866v.getDrawable());
            }
            if (view4 != null) {
                view4.setVisibility(0);
                ofFloat3 = ObjectAnimator.ofFloat(view4, "alpha", new float[]{1.0f});
                ofFloat3.setDuration(450);
                ofFloat5 = ObjectAnimator.ofFloat(view4, "scaleY", new float[]{1.0f});
                ofFloat5.setDuration(450);
                ofFloat2 = ObjectAnimator.ofFloat(view4, "scaleX", new float[]{1.0f});
                ofFloat2.setDuration(450);
                play.with(ofFloat3).with(ofFloat2).with(ofFloat5);
            }
            if (!(selectedAccountNavigationView.f7775d.f10869y == null || selectedAccountNavigationView.f7775d.f10857m == null)) {
                selectedAccountNavigationView.f7775d.f10869y.setAlpha(0.0f);
                selectedAccountNavigationView.f7775d.f10869y.setTranslationX(0.0f);
                selectedAccountNavigationView.m9969a(hwn, play, 150, 0);
            }
            if (selectedAccountNavigationView.f7775d.f10865u != null) {
                ofFloat3 = ObjectAnimator.ofFloat(selectedAccountNavigationView.f7775d.f10865u, "alpha", new float[]{0.0f});
                ofFloat3.setDuration(300);
                play.with(ofFloat3);
            }
            if (selectedAccountNavigationView.f7775d.f10848C != null) {
                selectedAccountNavigationView.m9967a(selectedAccountNavigationView.f7775d, selectedAccountNavigationView.f7775d.f10848C, hwn);
                selectedAccountNavigationView.f7775d.f10848C.setVisibility(0);
                Animator ofFloat6 = ObjectAnimator.ofFloat(selectedAccountNavigationView.f7775d.f10848C, "alpha", new float[]{1.0f});
                ofFloat6.setDuration(300);
                play.with(ofFloat6);
            }
            animatorSet.addListener(new htj(selectedAccountNavigationView));
            hwn hwn2 = selectedAccountNavigationView.f7773b;
            selectedAccountNavigationView.f7773b = (hwn) selectedAccountNavigationView.f7772a.get(0);
            selectedAccountNavigationView.f7772a.add(0, hwn2);
            selectedAccountNavigationView.f7772a.remove(1);
            selectedAccountNavigationView.m9973b(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
            animatorSet.setInterpolator(selectedAccountNavigationView.f7781j);
            selectedAccountNavigationView.f7782k = animatorSet;
            selectedAccountNavigationView.f7782k.start();
        }
    }
}
