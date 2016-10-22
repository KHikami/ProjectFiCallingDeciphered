import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOutlineProvider;
import android.widget.ListView;

/* compiled from: PG */
public final class aix {
    private static final ViewOutlineProvider a;

    static {
        if (abw.h()) {
            a = new aiy();
        } else {
            a = null;
        }
        if (abw.h()) {
            aiz aiz = new aiz();
        }
    }

    public static int a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width >= 0) {
            return layoutParams.width;
        }
        throw new IllegalStateException("Expecting view's width to be a constant rather than a result of the layout pass");
    }

    public static boolean b(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static void a(View view, Resources resources) {
        if (abw.h()) {
            view.setOutlineProvider(a);
            view.setTranslationZ((float) resources.getDimensionPixelSize(buf.cT));
        }
    }

    public static void a(ListView listView, Resources resources) {
        listView.setPaddingRelative(listView.getPaddingStart(), listView.getPaddingTop(), listView.getPaddingEnd(), resources.getDimensionPixelSize(buf.cR) + listView.getPaddingBottom());
        listView.setClipToPadding(false);
    }
}
