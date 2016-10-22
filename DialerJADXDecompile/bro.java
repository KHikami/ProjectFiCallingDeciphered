import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.ConnectionResult;

public class bro extends brs {
    protected final void a(int i, ConnectionResult connectionResult) {
        bqs.a(connectionResult.c, e(), this, 2, this);
    }

    protected final void b(int i, ConnectionResult connectionResult) {
        bqo bqo = bqo.a;
        this.X = btd.a(e().getApplicationContext(), new brp(this, bqo.a(e(), (OnCancelListener) this)), bqp.c);
    }

    protected final /* synthetic */ bqp q() {
        return bqo.a;
    }
}
