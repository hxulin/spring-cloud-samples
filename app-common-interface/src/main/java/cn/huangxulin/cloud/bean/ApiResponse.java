package cn.huangxulin.cloud.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

/**
 * 功能描述: 统一的 Response 返回对象
 *
 * @author hxulin
 */
@Getter
@Setter
public class ApiResponse implements Serializable {

    private static final long serialVersionUID = -8096072645793561971L;

    private int code;

    private String msg;

    private Integer count;

    private Object data;

    public ApiResponse() {

    }
	
	private ApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
	}
	
	private ApiResponse(int code, String msg, Object data) {
		this(code, msg);
		this.data = data;
	}

    private ApiResponse(int code, String msg, Integer count, Collection data) {
        this(code, msg, data);
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static ApiResponse success() {
		return create(Status.SUCCESS);
	}
	
	public static ApiResponse success(Object data) {
		return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), data);
	}

    public static ApiResponse success(int count, Collection data) {
        return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), count, data);
    }
	
	public static ApiResponse fail() {
		return create(Status.INTERNAL_SERVER_ERROR);
	}
	
	public static ApiResponse fail(String msg) {
		return create(Status.INTERNAL_SERVER_ERROR.getCode(), msg);
	}

    public static ApiResponse notValidParam() {
        return create(Status.NOT_VALID_PARAM);
    }

    public static ApiResponse forbidden() {
        return create(Status.FORBIDDEN);
    }

	public static ApiResponse notFound() {
        return create(Status.NOT_FOUND);
    }

    public static ApiResponse notLogin() {
        return create(Status.NOT_LOGIN);
    }

	public static ApiResponse create(int code, String msg) {
        return new ApiResponse(code, msg);
    }

	private static ApiResponse create(Status status) {
		return create(status.getCode(), status.getMsg());
	}

}
