package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.hangouts.elane.FilmstripParticipantView;
import com.google.android.apps.hangouts.elane.FilmstripViewController;
import java.util.HashMap;
import java.util.Map;

public final class ctf extends LinearLayout {
    public final Map<String, FilmstripParticipantView> f9025a = new HashMap();
    public final FilmstripParticipantView f9026b;
    public final /* synthetic */ FilmstripViewController f9027c;
    private int f9028d;

    public ctf(FilmstripViewController filmstripViewController, Context context) {
        String str = null;
        this.f9027c = filmstripViewController;
        super(context);
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        setChildrenDrawingOrderEnabled(true);
        FilmstripParticipantView filmstripParticipantView = (FilmstripParticipantView) LayoutInflater.from(getContext()).inflate(gwb.pm, null);
        bko c = filmstripParticipantView.f6140c.m10971c();
        if (c != null) {
            str = c.m5647p();
        }
        filmstripParticipantView.setContentDescription(filmstripParticipantView.getResources().getString(ba.jN));
        filmstripParticipantView.setFocusable(true);
        filmstripParticipantView.m8396a("localParticipant", str, true);
        filmstripParticipantView.f6143f.setText(filmstripParticipantView.getResources().getString(ba.jO));
        this.f9026b = filmstripParticipantView;
        addView(this.f9026b);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9027c.setScrollX((i - i3) + this.f9027c.getScrollX());
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (i2 == i - 1) {
            return this.f9028d;
        }
        return i2 >= this.f9028d ? i2 + 1 : i2;
    }

    public void m10934a() {
        int i;
        int childCount = this.f9027c.f6161a.getChildCount();
        int i2 = childCount - 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (((FilmstripParticipantView) this.f9027c.f6161a.getChildAt(i3)).m8402e()) {
                i = i3;
                break;
            }
        }
        i = i2;
        if (i != this.f9028d) {
            this.f9028d = i;
            invalidate();
        }
    }
}
