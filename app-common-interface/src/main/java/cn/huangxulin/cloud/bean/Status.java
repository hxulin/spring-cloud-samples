package cn.huangxulin.cloud.bean;

/**
 * 功能描述: 统一 Response 状态码
 *
 * @author hxulin
 */
public enum Status {
	
	SUCCESS(0, "success"),
	NOT_VALID_PARAM(400, "提交的参数有误，数据加载失败。"),
    NOT_LOGIN(401, "用户尚未登录。"),
	FORBIDDEN(403, "权限不足，拒绝访问。"),
    NOT_FOUND(404, "请求的资源不存在或者已经被删除。"),
    INTERNAL_SERVER_ERROR(500, "发生未知错误，请求失败。");

    private int code;
    
    private String msg;

    Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
