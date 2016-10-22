import android.view.View;

final class ds extends ea {
    final /* synthetic */ dr a;

    ds(dr drVar) {
        this.a = drVar;
    }

    public View a(int i) {
        if (this.a.S != null) {
            return this.a.S.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    public boolean a() {
        return this.a.S != null;
    }
}
