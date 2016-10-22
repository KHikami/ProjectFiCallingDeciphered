import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

public final class ex extends EpicenterCallback {
    final /* synthetic */ Rect a;

    public ex(Rect rect) {
        this.a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
