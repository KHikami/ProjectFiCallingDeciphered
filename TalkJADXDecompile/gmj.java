import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gmj extends gme implements OnClickListener {
    private gmk aj;
    private gmf ak;

    public static gme a(String str, List<gmh> list) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        if (list instanceof Serializable) {
            bundle.putSerializable("list", (Serializable) Collections.unmodifiableList(list));
        } else {
            bundle.putSerializable("list", new ArrayList(list));
        }
        gme gmj = new gmj();
        gmj.setArguments(bundle);
        return gmj;
    }

    public Dialog a(Bundle bundle) {
        Bundle arguments = getArguments();
        this.aj = new gmk(this.am, (List) arguments.getSerializable("list"));
        Builder builder = new Builder(this.am);
        builder.setTitle(arguments.getString("title"));
        builder.setAdapter(this.aj, this);
        return builder.create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.ak.a(i);
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.ak.a();
    }

    public void a(gmf gmf) {
        iil.a("Listener should be set only once", this.ak);
        this.ak = gmf;
    }
}
