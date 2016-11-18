package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class gb extends gl {
    CharSequence f14574a;
    CharSequence f14575b;
    List<gc> f14576c = new ArrayList();

    gb() {
    }

    public gb(CharSequence charSequence) {
        this.f14574a = charSequence;
    }

    public gb m16835a(CharSequence charSequence) {
        this.f14575b = charSequence;
        return this;
    }

    public gb m16834a(gc gcVar) {
        this.f14576c.add(gcVar);
        if (this.f14576c.size() > 25) {
            this.f14576c.remove(0);
        }
        return this;
    }

    public void mo2176a(Bundle bundle) {
        super.mo2176a(bundle);
        if (this.f14574a != null) {
            bundle.putCharSequence("android.selfDisplayName", this.f14574a);
        }
        if (this.f14575b != null) {
            bundle.putCharSequence("android.conversationTitle", this.f14575b);
        }
        if (!this.f14576c.isEmpty()) {
            String str = "android.messages";
            List list = this.f14576c;
            Parcelable[] parcelableArr = new Bundle[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                gc gcVar = (gc) list.get(i);
                Bundle bundle2 = new Bundle();
                if (gcVar.f14633a != null) {
                    bundle2.putCharSequence("text", gcVar.f14633a);
                }
                bundle2.putLong("time", gcVar.f14634b);
                if (gcVar.f14635c != null) {
                    bundle2.putCharSequence("sender", gcVar.f14635c);
                }
                if (gcVar.f14636d != null) {
                    bundle2.putString("type", gcVar.f14636d);
                }
                if (gcVar.f14637e != null) {
                    bundle2.putParcelable("uri", gcVar.f14637e);
                }
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(str, parcelableArr);
        }
    }
}
