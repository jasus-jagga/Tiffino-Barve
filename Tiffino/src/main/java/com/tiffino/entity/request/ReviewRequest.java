package com.tiffino.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequest {
    private Long orderId;
    private String comment;
    private Integer rating;
}