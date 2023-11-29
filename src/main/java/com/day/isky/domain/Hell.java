package com.day.isky.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Hell", title = "e恶魔")
public class Hell {
    @Schema(title = "恶魔名称")
    private String hellName;
    @Schema(title = "恶魔电话")
    private String hellPhone;
}
