import android.text.style.URLSpan;
import android.view.View;

final class cpo extends URLSpan {
    private final cph a;

    cpo(cph cph, String str) {
        super(str);
        this.a = cph;
    }

    public void onClick(View view) {
        this.a.a(view.getContext(), getURL());
    }
}
