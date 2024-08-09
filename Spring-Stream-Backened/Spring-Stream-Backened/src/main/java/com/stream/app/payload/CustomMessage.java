package com.stream.app.payload;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomMessage {
    private String message;
    private boolean succes =false;
}
