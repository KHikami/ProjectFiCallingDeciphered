import android.app.Activity;
import android.content.Context;

public final class jzg extends jzj<jze> {
    private final Activity b;

    public jzg(Activity activity, kbu kbu) {
        super(kbu, jzf.class);
        this.b = activity;
    }

    private void a(jze jze, kbu kbu, jyn jyn) {
        jze.a(this.b, kbu, jyn);
    }

    protected jzi<jze> a(Context context) {
        return new jzf(context);
    }
}
