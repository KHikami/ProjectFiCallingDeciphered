package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class ejc extends czj<eux, exj> {
    final /* synthetic */ BabelGatewayActivity f11637d;

    public ejc(BabelGatewayActivity babelGatewayActivity) {
        this.f11637d = babelGatewayActivity;
    }

    public String mo1479a() {
        return null;
    }

    public void mo1480a(fme fme) {
        ArrayList arrayList = new ArrayList();
        for (String a : this.f11637d.f6587t) {
            arrayList.add(fbt.m14917a(a));
        }
        RealTimeChatService.m9055a(fme, this.f11637d.f6586s, arrayList, null, true);
    }

    protected void mo1887a(fiu fiu) {
        super.mo1887a(fiu);
        List k = ((exj) fiu.m15392c()).m14747k();
        int size = k != null ? k.size() : 0;
        if (size != this.f11637d.f6587t.length) {
            glk.m17982e("Babel_GatewayActivity", "BabelGatewayActivity: Entity lookup returned wrong number of entities", new Object[0]);
            this.f11637d.m8811d(bc.cI);
            return;
        }
        this.f11637d.f6588u = new String[size];
        for (int i = 0; i < size; i++) {
            edk[] edkArr;
            edk edk;
            gkv gkv = (gkv) k.get(i);
            if (gkv == null) {
                edkArr = null;
            } else {
                edkArr = (edk[]) gkv.f15525b;
            }
            if (edkArr != null) {
                edk = edkArr[0];
            } else {
                edk = null;
            }
            if (edk == null) {
                glk.m17981d("Babel_GatewayActivity", "BabelGatewayActivity: Could not resolve some gaiaId's", new Object[0]);
                this.f11637d.m8811d(bc.cI);
                return;
            }
            iil.m21869a(Integer.valueOf(1), Integer.valueOf(edkArr.length));
            String[] strArr = this.f11637d.f6588u;
            String str = !TextUtils.isEmpty(edk.f11216e) ? edk.f11216e : !TextUtils.isEmpty(edk.f11217f) ? edk.f11217f : null;
            strArr[i] = str;
        }
        this.f11637d.mo1085j();
    }

    protected void mo1888a(Exception exception) {
        super.mo1888a(exception);
        this.f11637d.m8811d(bc.cI);
    }

    public Class<eux> mo1481d() {
        return eux.class;
    }

    public Class<exj> mo1482e() {
        return exj.class;
    }
}
