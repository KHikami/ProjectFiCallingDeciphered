package p000;

import java.util.Map;

public interface iji<Resource extends nzf, AddRequest extends nzf, AddResponse extends nzf, ModifyRequest extends nzf, ModifyResponse extends nzf, RemoveRequest extends nzf, RemoveResponse extends nzf> {
    void mo3363a(ijj<Resource> ijj_Resource);

    void mo3364a(AddRequest addRequest, ijl<AddResponse> ijl_AddResponse);

    Map<String, Resource> mo3365b();

    void mo3366b(ijj<Resource> ijj_Resource);

    void mo3367b(ModifyRequest modifyRequest, ijl<ModifyResponse> ijl_ModifyResponse);

    void mo3368c(RemoveRequest removeRequest, ijl<RemoveResponse> ijl_RemoveResponse);
}
