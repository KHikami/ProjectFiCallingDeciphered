import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class gb extends gl {
    CharSequence a;
    CharSequence b;
    List<gc> c;

    gb() {
        this.c = new ArrayList();
    }

    public gb(CharSequence charSequence) {
        this.c = new ArrayList();
        this.a = charSequence;
    }

    public gb a(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public gb a(gc gcVar) {
        this.c.add(gcVar);
        if (this.c.size() > 25) {
            this.c.remove(0);
        }
        return this;
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        if (this.a != null) {
            bundle.putCharSequence("android.selfDisplayName", this.a);
        }
        if (this.b != null) {
            bundle.putCharSequence("android.conversationTitle", this.b);
        }
        if (!this.c.isEmpty()) {
            String str = "android.messages";
            List list = this.c;
            Parcelable[] parcelableArr = new Bundle[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                gc gcVar = (gc) list.get(i);
                Bundle bundle2 = new Bundle();
                if (gcVar.a != null) {
                    bundle2.putCharSequence("text", gcVar.a);
                }
                bundle2.putLong("time", gcVar.b);
                if (gcVar.c != null) {
                    bundle2.putCharSequence("sender", gcVar.c);
                }
                if (gcVar.d != null) {
                    bundle2.putString("type", gcVar.d);
                }
                if (gcVar.e != null) {
                    bundle2.putParcelable("uri", gcVar.e);
                }
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(str, parcelableArr);
        }
    }
}
