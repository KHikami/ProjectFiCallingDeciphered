import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

public final class btv extends aer implements bxi {
    private final bxj p;

    public void a(List<edo> list) {
        this.p.a(list, true, "FocusGallery");
        this.a.setContentDescription(this.p.a());
    }

    public ViewGroup v() {
        return this.p.v();
    }

    public btv(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(ba.hD, viewGroup, false));
        this.p = new bxj(context, this.a);
    }
}
