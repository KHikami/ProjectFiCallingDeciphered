package p000;

import android.content.Context;
import java.util.Set;

public class jyt {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25461a(Context context, jyn jyn) {
        Set set;
        Set set2 = null;
        try {
            jyw jyw = (jyx) Class.forName("gen_binder.root.RootModule$Generated").newInstance();
            set2 = jyw.mo2231a();
            jyn.m25449a(jyw);
            jyw.mo2232a(jyn);
            set = set2;
        } catch (Throwable e) {
            throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", e);
        } catch (Throwable e2) {
            throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", e2);
        } catch (ClassNotFoundException e3) {
            set = set2;
        }
        jyn.m25449a(new jym(context, set));
    }
}
