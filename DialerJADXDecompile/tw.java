import android.graphics.Outline;
import android.support.v7.widget.ActionBarContainer;

/* compiled from: PG */
public final class tw extends tv {
    public tw(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public final void getOutline(Outline outline) {
        if (this.a.f) {
            if (this.a.e != null) {
                this.a.e.getOutline(outline);
            }
        } else if (this.a.c != null) {
            this.a.c.getOutline(outline);
        }
    }
}
