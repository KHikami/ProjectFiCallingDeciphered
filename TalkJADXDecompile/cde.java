import android.view.View;
import android.view.View.OnClickListener;

final class cde implements OnClickListener {
    final /* synthetic */ ccz a;
    private final int b;

    cde(ccz ccz, int i) {
        this.a = ccz;
        this.b = i;
    }

    public void onClick(View view) {
        this.a.b(this.b);
    }
}
