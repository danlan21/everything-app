package cc.danhomelab.everything.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class APIResponse {

    private Object content;
    private String message;
    private Integer code;

    public APIResponse(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public APIResponse(Object content) {
        this.content = content;
    }
}
