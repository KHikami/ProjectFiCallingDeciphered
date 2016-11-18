package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Method;

final class vu implements OnClickListener {
    private final View f35402a;
    private final String f35403b;
    private Method f35404c;
    private Context f35405d;

    public vu(View view, String str) {
        this.f35402a = view;
        this.f35403b = str;
    }

    public void onClick(View view) {
        if (this.f35404c == null) {
            String str;
            Context context = this.f35402a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f35403b, new Class[]{View.class});
                        if (method != null) {
                            this.f35404c = method;
                            this.f35405d = context;
                        }
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f35402a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f35402a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f35403b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f35402a.getClass() + str);
        }
        try {
            this.f35404c.invoke(this.f35405d, new Object[]{view});
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (Throwable e22) {
            throw new IllegalStateException("Could not execute method for android:onClick", e22);
        }
    }
}
