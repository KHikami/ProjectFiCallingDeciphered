package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class iqh<Resource extends nzf, AddRequest extends nzf, AddResponse extends nzf, ModifyRequest extends nzf, ModifyResponse extends nzf, RemoveRequest extends nzf, RemoveResponse extends nzf> implements iji<Resource, AddRequest, AddResponse, ModifyRequest, ModifyResponse, RemoveRequest, RemoveResponse> {
    final ipu a_;
    final ipp<AddResponse, ModifyResponse, RemoveRequest, RemoveResponse> f18685b;
    public final Map<String, Resource> f18686c = new ConcurrentHashMap();
    final List<ijj<Resource>> f18687d = new CopyOnWriteArrayList();
    public volatile boolean f18688e = false;
    private final ijm<Resource> f18689f;
    private final ipq<AddRequest, AddResponse, ModifyRequest, ModifyResponse, RemoveRequest, RemoveResponse> f18690g;

    public iqh(ipu ipu, ijm<Resource> ijm_Resource, ipq<AddRequest, AddResponse, ModifyRequest, ModifyResponse, RemoveRequest, RemoveResponse> ipq_AddRequest__AddResponse__ModifyRequest__ModifyResponse__RemoveRequest__RemoveResponse, ipp<AddResponse, ModifyResponse, RemoveRequest, RemoveResponse> ipp_AddResponse__ModifyResponse__RemoveRequest__RemoveResponse) {
        this.a_ = ipu;
        this.f18689f = ijm_Resource;
        this.f18690g = ipq_AddRequest__AddResponse__ModifyRequest__ModifyResponse__RemoveRequest__RemoveResponse;
        this.f18685b = ipp_AddResponse__ModifyResponse__RemoveRequest__RemoveResponse;
    }

    public Map<String, Resource> mo3365b() {
        return this.f18686c;
    }

    public void mo3363a(ijj<Resource> ijj_Resource) {
        iil.m21867a();
        if (this.f18687d.contains(ijj_Resource)) {
            itx.m23277a(6, "vclib", "Registered the same listener twice!");
        }
        this.f18687d.add(ijj_Resource);
        if (this.f18688e) {
            gwb.m1863a(new iqi(this, ijj_Resource));
        }
    }

    public void mo3366b(ijj<Resource> ijj_Resource) {
        iil.m21867a();
        this.f18687d.remove(ijj_Resource);
    }

    public void mo3364a(AddRequest addRequest, ijl<AddResponse> ijl_AddResponse) {
        this.f18690g.mo3372a(addRequest, new iqj(this, ijl_AddResponse));
    }

    public void mo3367b(ModifyRequest modifyRequest, ijl<ModifyResponse> ijl_ModifyResponse) {
        this.f18690g.mo3373b(modifyRequest, new iqk(this, ijl_ModifyResponse));
    }

    public void mo3368c(RemoveRequest removeRequest, ijl<RemoveResponse> ijl_RemoveResponse) {
        this.f18690g.mo3374c(removeRequest, new iql(this, removeRequest, ijl_RemoveResponse));
    }

    public void m22864a(int i, Resource resource) {
        iil.m21867a();
        switch (i) {
            case 0:
                iil.m21872a("Expected null", this.f18686c.put(this.f18689f.mo3211a(resource), resource));
                for (ijj a : this.f18687d) {
                    a.mo1389a(resource);
                }
                return;
            case 1:
                iil.m21875b("Expected non-null", (nzf) this.f18686c.remove(this.f18689f.mo3211a(resource)));
                for (ijj a2 : this.f18687d) {
                    a2.mo1426b(resource);
                }
                return;
            case 2:
                Object obj = (nzf) this.f18686c.put(this.f18689f.mo3211a(resource), resource);
                iil.m21875b("Expected non-null", obj);
                for (ijj a3 : this.f18687d) {
                    a3.mo1390a(obj, resource);
                }
                return;
            case 3:
                this.f18688e = true;
                for (ijj a22 : this.f18687d) {
                    a22.mo1425a();
                }
                return;
            default:
                itx.m23280a("vclib", "Operation " + i + " is not found.");
                return;
        }
    }
}
