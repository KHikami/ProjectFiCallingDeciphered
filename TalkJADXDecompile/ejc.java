import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class ejc extends czj<eux, exj> {
    final /* synthetic */ BabelGatewayActivity d;

    public ejc(BabelGatewayActivity babelGatewayActivity) {
        this.d = babelGatewayActivity;
    }

    public String a() {
        return null;
    }

    public void a(fme fme) {
        ArrayList arrayList = new ArrayList();
        for (String a : this.d.t) {
            arrayList.add(fbt.a(a));
        }
        RealTimeChatService.a(fme, this.d.s, arrayList, null, true);
    }

    protected void a(fiu fiu) {
        super.a(fiu);
        List k = ((exj) fiu.c()).k();
        int size = k != null ? k.size() : 0;
        if (size != this.d.t.length) {
            glk.e("Babel_GatewayActivity", "BabelGatewayActivity: Entity lookup returned wrong number of entities", new Object[0]);
            this.d.d(bc.cI);
            return;
        }
        this.d.u = new String[size];
        for (int i = 0; i < size; i++) {
            edk[] edkArr;
            edk edk;
            gkv gkv = (gkv) k.get(i);
            if (gkv == null) {
                edkArr = null;
            } else {
                edkArr = (edk[]) gkv.b;
            }
            if (edkArr != null) {
                edk = edkArr[0];
            } else {
                edk = null;
            }
            if (edk == null) {
                glk.d("Babel_GatewayActivity", "BabelGatewayActivity: Could not resolve some gaiaId's", new Object[0]);
                this.d.d(bc.cI);
                return;
            }
            iil.a(Integer.valueOf(1), Integer.valueOf(edkArr.length));
            String[] strArr = this.d.u;
            String str = !TextUtils.isEmpty(edk.e) ? edk.e : !TextUtils.isEmpty(edk.f) ? edk.f : null;
            strArr[i] = str;
        }
        this.d.j();
    }

    protected void a(Exception exception) {
        super.a(exception);
        this.d.d(bc.cI);
    }

    public Class<eux> d() {
        return eux.class;
    }

    public Class<exj> e() {
        return exj.class;
    }
}
