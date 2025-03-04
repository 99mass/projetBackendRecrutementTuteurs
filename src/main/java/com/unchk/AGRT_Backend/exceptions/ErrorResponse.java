package com.unchk.AGRT_Backend.exceptions;

// public class ErrorResponse {
//     private int status;
//     private String message;
//     private String error;

//     public ErrorResponse(int status, String message, String error) {
//         this.status = status;
//         this.message = message;
//         this.error = error;
//     }

//     public int getStatus() {
//         return status;
//     }

//     public void setStatus(int status) {
//         this.status = status;
//     }

//     public String getMessage() {
//         return message;
//     }

//     public void setMessage(String message) {
//         this.message = message;
//     }

//     public String getError() {
//         return error;
//     }

//     public void setError(String error) {
//         this.error = error;
//     }

// }

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {
    private int status;
    private String message;
    private String error;
}