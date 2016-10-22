package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: dw */
public class dw extends dp implements cs, ct {
    final Handler c;
    final eb d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    int l;
    lp<String> m;

    public dw() {
        this.c = new dx(this);
        this.d = new eb(new dy(this));
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.d.c();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.m.a(i4);
            this.m.b(i4);
            if (str != null) {
                dr a = this.d.a(str);
                if (a == null) {
                    new StringBuilder("Activity result no fragment exists for who: ").append(str);
                    return;
                } else {
                    a.onActivityResult(65535 & i, i2, intent);
                    return;
                }
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.d.a().c()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.d.a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.d.b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.d.a(null);
        super.onCreate(bundle);
        dz dzVar = (dz) getLastNonConfigurationInstance();
        if (dzVar != null) {
            this.d.a(dzVar.c);
        }
        if (bundle != null) {
            this.d.a(bundle.getParcelable("android:support:fragments"), dzVar != null ? dzVar.b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.m = new lp(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.m.a(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.m == null) {
            this.m = new lp();
            this.l = 0;
        }
        this.d.f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.d.a(menu, getMenuInflater());
        if (VERSION.SDK_INT >= 11) {
            return onCreatePanelMenu;
        }
        return true;
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.d.a(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        a(false);
        this.d.m();
        this.d.q();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.d.n();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case wi.w /*0*/:
                return this.d.a(menuItem);
            case wi.s /*6*/:
                return this.d.b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case wi.w /*0*/:
                this.d.b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f = false;
        if (this.c.hasMessages(2)) {
            this.c.removeMessages(2);
            f_();
        }
        this.d.j();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.d.c();
    }

    public void onStateNotSaved() {
        this.d.c();
    }

    public void onResume() {
        super.onResume();
        this.c.sendEmptyMessage(2);
        this.f = true;
        this.d.o();
    }

    public void onPostResume() {
        super.onPostResume();
        this.c.removeMessages(2);
        f_();
        this.d.o();
    }

    public void f_() {
        this.d.i();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.j) {
            this.j = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return a(view, menu) | this.d.a(menu);
    }

    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.g) {
            a(true);
        }
        Object g_ = g_();
        el e = this.d.e();
        lo s = this.d.s();
        if (e == null && s == null && g_ == null) {
            return null;
        }
        Object dzVar = new dz();
        dzVar.a = g_;
        dzVar.b = e;
        dzVar.c = s;
        return dzVar;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable d = this.d.d();
        if (d != null) {
            bundle.putParcelable("android:support:fragments", d);
        }
        if (this.m.a() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] iArr = new int[this.m.a()];
            String[] strArr = new String[this.m.a()];
            for (int i = 0; i < this.m.a(); i++) {
                iArr[i] = this.m.d(i);
                strArr[i] = (String) this.m.e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.g = false;
        this.h = false;
        this.c.removeMessages(1);
        if (!this.e) {
            this.e = true;
            this.d.g();
        }
        this.d.c();
        this.d.o();
        this.d.p();
        this.d.h();
        this.d.r();
    }

    public void onStop() {
        super.onStop();
        this.g = true;
        this.c.sendEmptyMessage(1);
        this.d.k();
    }

    public Object g_() {
        return null;
    }

    public void F_() {
        if (VERSION.SDK_INT >= 11) {
            gwb.a((Activity) this);
        } else {
            this.j = true;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = VERSION.SDK_INT;
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.e);
        printWriter.print("mResumed=");
        printWriter.print(this.f);
        printWriter.print(" mStopped=");
        printWriter.print(this.g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.h);
        this.d.a(str2, fileDescriptor, printWriter, strArr);
        this.d.a().a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(str + "  ", printWriter, getWindow().getDecorView());
    }

    private static String a(View view) {
        char c;
        char c2 = 'F';
        char c3 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case wi.w /*0*/:
                stringBuilder.append('V');
                break;
            case wi.h /*4*/:
                stringBuilder.append('I');
                break;
            case wi.m /*8*/:
                stringBuilder.append('G');
                break;
            default:
                stringBuilder.append('.');
                break;
        }
        if (view.isFocusable()) {
            c = 'F';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isEnabled()) {
            c = 'E';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(view.willNotDraw() ? '.' : 'D');
        if (view.isHorizontalScrollBarEnabled()) {
            c = 'H';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isVerticalScrollBarEnabled()) {
            c = 'V';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isClickable()) {
            c = 'C';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isLongClickable()) {
            c = 'L';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(' ');
        if (!view.isFocused()) {
            c2 = '.';
        }
        stringBuilder.append(c2);
        if (view.isSelected()) {
            c = 'S';
        } else {
            c = '.';
        }
        stringBuilder.append(c);
        if (view.isPressed()) {
            c3 = 'P';
        }
        stringBuilder.append(c3);
        stringBuilder.append(' ');
        stringBuilder.append(view.getLeft());
        stringBuilder.append(',');
        stringBuilder.append(view.getTop());
        stringBuilder.append('-');
        stringBuilder.append(view.getRight());
        stringBuilder.append(',');
        stringBuilder.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            stringBuilder.append(" #");
            stringBuilder.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                String str;
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(resourceTypeName);
                stringBuilder.append("/");
                stringBuilder.append(resourceEntryName);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(dw.a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    void a(boolean z) {
        if (!this.h) {
            this.h = true;
            this.i = z;
            this.c.removeMessages(1);
            I_();
        } else if (z) {
            this.d.p();
            this.d.c(true);
        }
    }

    void I_() {
        this.d.c(this.i);
        this.d.l();
    }

    public void a(dr drVar) {
    }

    public ed J_() {
        return this.d.a();
    }

    public fg f() {
        return this.d.b();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            dn.b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public final void b_(int i) {
        if (!this.k && i != -1) {
            dn.b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.m.a(i3);
            this.m.b(i3);
            if (str != null) {
                dr a = this.d.a(str);
                if (a == null) {
                    new StringBuilder("Activity result no fragment exists for who: ").append(str);
                } else {
                    a.onRequestPermissionsResult(i & 65535, strArr, iArr);
                }
            }
        }
    }

    public void a(dr drVar, Intent intent, int i, Bundle bundle) {
        this.b = true;
        if (i == -1) {
            try {
                cq.a(this, intent, -1, bundle);
            } finally {
                this.b = false;
            }
        } else {
            dn.b(i);
            cq.a(this, intent, ((b(drVar) + 1) << 16) + (65535 & i), bundle);
            this.b = false;
        }
    }

    public void a(dr drVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.a = true;
        if (i == -1) {
            try {
                cq.a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.a = false;
            }
        } else {
            dn.b(i);
            cq.a(this, intentSender, ((b(drVar) + 1) << 16) + (65535 & i), intent, i2, i3, i4, bundle);
            this.a = false;
        }
    }

    private int b(dr drVar) {
        if (this.m.a() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.m.f(this.l) >= 0) {
            this.l = (this.l + 1) % 65534;
        }
        int i = this.l;
        this.m.a(i, drVar.q);
        this.l = (this.l + 1) % 65534;
        return i;
    }

    void a(dr drVar, String[] strArr, int i) {
        if (i == -1) {
            cq.a(this, strArr, i);
            return;
        }
        dn.b(i);
        try {
            this.k = true;
            cq.a(this, strArr, ((b(drVar) + 1) << 16) + (65535 & i));
        } finally {
            this.k = false;
        }
    }
}
