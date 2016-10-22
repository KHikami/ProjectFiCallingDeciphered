import android.view.animation.Animation;
import com.android.incallui.InCallActivity;

/* compiled from: PG */
public final class bbz extends akl {
    private /* synthetic */ InCallActivity a;

    public bbz(InCallActivity inCallActivity) {
        this.a = inCallActivity;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.a("tag_dialpad_fragment", false, true);
    }
}
