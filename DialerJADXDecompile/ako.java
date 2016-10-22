import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dialer.app.CallDetailActivity;

/* compiled from: PG */
public final class ako implements OnClickListener {
    private /* synthetic */ CallDetailActivity a;

    public ako(CallDetailActivity callDetailActivity) {
        this.a = callDetailActivity;
    }

    public final void onClick(View view) {
        if (!TextUtils.isEmpty(this.a.h)) {
            Context context = this.a.i;
            arq arq = new arq(this.a.g());
            arq.a = 10;
            context.startActivity(arq.a());
        }
    }
}
