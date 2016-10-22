import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.hangouts.elane.FilmstripParticipantView;
import com.google.android.apps.hangouts.elane.FilmstripViewController;
import java.util.HashMap;
import java.util.Map;

public final class ctf extends LinearLayout {
    public final Map<String, FilmstripParticipantView> a;
    public final FilmstripParticipantView b;
    public final /* synthetic */ FilmstripViewController c;
    private int d;

    public ctf(FilmstripViewController filmstripViewController, Context context) {
        String str = null;
        this.c = filmstripViewController;
        super(context);
        this.a = new HashMap();
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        setChildrenDrawingOrderEnabled(true);
        FilmstripParticipantView filmstripParticipantView = (FilmstripParticipantView) LayoutInflater.from(getContext()).inflate(gwb.pm, null);
        bko c = filmstripParticipantView.c.c();
        if (c != null) {
            str = c.p();
        }
        filmstripParticipantView.setContentDescription(filmstripParticipantView.getResources().getString(ba.jN));
        filmstripParticipantView.setFocusable(true);
        filmstripParticipantView.a("localParticipant", str, true);
        filmstripParticipantView.f.setText(filmstripParticipantView.getResources().getString(ba.jO));
        this.b = filmstripParticipantView;
        addView(this.b);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c.setScrollX((i - i3) + this.c.getScrollX());
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (i2 == i - 1) {
            return this.d;
        }
        return i2 >= this.d ? i2 + 1 : i2;
    }

    public void a() {
        int i;
        int childCount = this.c.a.getChildCount();
        int i2 = childCount - 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (((FilmstripParticipantView) this.c.a.getChildAt(i3)).e()) {
                i = i3;
                break;
            }
        }
        i = i2;
        if (i != this.d) {
            this.d = i;
            invalidate();
        }
    }
}
