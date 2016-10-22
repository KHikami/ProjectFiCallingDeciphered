import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class dwb extends jxy {
    private jmo aj;

    static void a(Context context, ed edVar, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("title", context.getString(i));
        bundle.putString("message", context.getString(i2));
        bundle.putString("positive", context.getString(bc.hW));
        bundle.putString("negative", context.getString(bc.hX));
        dwb dwb = new dwb();
        dwb.setArguments(bundle);
        dwb.a(edVar, "error");
    }

    protected void f(Bundle bundle) {
        super.f(bundle);
        this.aj = (jmo) this.an.a(jmo.class);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                this.aj.c();
            case -1:
                this.aj.b();
            default:
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.aj.c();
    }
}
