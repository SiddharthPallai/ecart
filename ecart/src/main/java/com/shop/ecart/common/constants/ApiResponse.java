package com.shop.ecart.common.constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sidharth
 */
@Data
@NoArgsConstructor
public class ApiResponse<T> {
    private int status;
    private String message;
    private T result;

    public ApiResponse(int status, String message, T result){
        this.status = status;
        this.message = message;
        this.result = result;
    }
}
