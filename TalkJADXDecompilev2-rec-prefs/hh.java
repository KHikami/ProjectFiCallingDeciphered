package p000;

import android.os.Bundle;

public final class hh {
    private final String f16942a;
    private CharSequence f16943b;
    private CharSequence[] f16944c;
    private boolean f16945d = true;
    private Bundle f16946e = new Bundle();

    public hh(String str) {
        this.f16942a = str;
    }

    public hh m19778a(CharSequence charSequence) {
        this.f16943b = charSequence;
        return this;
    }

    public hh m19780a(CharSequence[] charSequenceArr) {
        this.f16944c = charSequenceArr;
        return this;
    }

    public hh m19779a(boolean z) {
        this.f16945d = false;
        return this;
    }

    public hg m19777a() {
        return new hg(this.f16942a, this.f16943b, this.f16944c, this.f16945d, this.f16946e);
    }
}
