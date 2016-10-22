import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class eho implements eev {
    final /* synthetic */ ehm a;

    eho(ehm ehm) {
        this.a = ehm;
    }

    public int B() {
        return gwb.tb;
    }

    public int C() {
        return bc.vp;
    }

    public void a(Context context) {
        gwb.a(ehm.a(context), 2501);
        Intent a = gwb.a(ehm.a(context), null, Collections.emptyList(), bcj.CREATE_NEW_GROUP_CONVERSATION, bxt.SMS_MESSAGE);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
