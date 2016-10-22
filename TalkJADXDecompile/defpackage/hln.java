package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* renamed from: hln */
public interface hln extends IInterface {
    CameraPosition a();

    hpx a(PolylineOptions polylineOptions);

    hqd a(CircleOptions circleOptions);

    hqg a(GroundOverlayOptions groundOverlayOptions);

    hqm a(MarkerOptions markerOptions);

    hqp a(PolygonOptions polygonOptions);

    hqs a(TileOverlayOptions tileOverlayOptions);

    void a(int i);

    void a(int i, int i2, int i3, int i4);

    void a(Bundle bundle);

    void a(gyj gyj);

    void a(gyj gyj, int i, hmv hmv);

    void a(gyj gyj, hmv hmv);

    void a(hlq hlq);

    void a(hmr hmr, gyj gyj);

    void a(hnb hnb);

    void a(hne hne);

    void a(hnh hnh);

    void a(hnk hnk);

    void a(hnn hnn);

    void a(hnq hnq);

    void a(hnt hnt);

    void a(hnz hnz);

    void a(hoc hoc);

    void a(hof hof);

    void a(hoi hoi);

    void a(hol hol);

    void a(hoo hoo);

    void a(hor hor);

    void a(hou hou);

    void a(hox hox);

    void a(hpa hpa);

    void a(hpd hpd);

    void a(String str);

    void a(boolean z);

    float b();

    void b(Bundle bundle);

    void b(gyj gyj);

    boolean b(boolean z);

    float c();

    void c(Bundle bundle);

    void c(boolean z);

    void d();

    void d(boolean z);

    void e();

    int f();

    boolean g();

    boolean h();

    boolean i();

    Location j();

    hml k();

    hlz l();

    boolean m();

    hqj n();

    void o();

    void p();

    void q();

    void r();

    boolean s();

    void t();
}
