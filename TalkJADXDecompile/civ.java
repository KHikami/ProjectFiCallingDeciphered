import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class civ extends ciy implements OnClickListener {
    private final TransportSpinner a;

    public String a() {
        return gwb.H().getResources().getString(bc.ha);
    }

    public int b() {
        return R$drawable.bt;
    }

    public void onClick(View view) {
        this.a.a();
    }

    public civ(TransportSpinner transportSpinner) {
        this.a = transportSpinner;
    }
}
