package defpackage;

import android.graphics.Outline;
import android.support.v7.widget.ActionBarContainer;

public final class za extends yz {
    public za(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        if (this.a.d) {
            if (this.a.c != null) {
                this.a.c.getOutline(outline);
            }
        } else if (this.a.a != null) {
            this.a.a.getOutline(outline);
        }
    }
}
