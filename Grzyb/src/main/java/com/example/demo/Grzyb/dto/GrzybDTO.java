package com.example.demo.Grzyb.dto;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GrzybDTO {
    private String name;
    private String description;
    private String imageURL;
}
