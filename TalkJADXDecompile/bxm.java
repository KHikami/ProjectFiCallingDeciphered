import android.view.View;
import android.view.View.OnClickListener;

final class bxm implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ bxl b;

    bxm(bxl bxl, String str) {
        this.b = bxl;
        this.a = str;
    }

    public void onClick(View view) {
        this.b.getContext().startActivity(gwb.C(this.a));
    }
}
